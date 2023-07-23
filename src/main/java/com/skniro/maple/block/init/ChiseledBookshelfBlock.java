package com.skniro.maple.block.init;

import com.skniro.maple.block.entity.ChiseledBookshelfBlockEntity;
import com.skniro.maple.state.property.MapleProperties;
import com.skniro.maple.tag.MapleItemTags;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ChiseledBookshelfBlock extends BlockWithEntity {
    private static final int MAX_BOOK_COUNT = 6;
    public static final int BOOK_HEIGHT = 3;
    public static final List<BooleanProperty> SLOT_OCCUPIED_PROPERTIES;

    public ChiseledBookshelfBlock(Settings settings) {
        super(settings);
        BlockState blockState = (BlockState)((BlockState)this.stateManager.getDefaultState()).with(HorizontalFacingBlock.FACING, Direction.NORTH);

        BooleanProperty booleanProperty;
        for(Iterator var3 = SLOT_OCCUPIED_PROPERTIES.iterator(); var3.hasNext(); blockState = (BlockState)blockState.with(booleanProperty, false)) {
            booleanProperty = (BooleanProperty)var3.next();
        }

        this.setDefaultState(blockState);
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        BlockEntity var8 = world.getBlockEntity(pos);
        if (var8 instanceof ChiseledBookshelfBlockEntity) {
            ChiseledBookshelfBlockEntity chiseledBookshelfBlockEntity = (ChiseledBookshelfBlockEntity)var8;
            Optional optional = getHitPos(hit, (Direction)state.get(HorizontalFacingBlock.FACING));
            if (optional.isEmpty()) {
                return ActionResult.PASS;
            } else {
                int i = getSlotForHitPos((Vec2f)optional.get());
                if ((Boolean)state.get((Property)SLOT_OCCUPIED_PROPERTIES.get(i))) {
                    tryRemoveBook(world, pos, player, chiseledBookshelfBlockEntity, i);
                    return ActionResult.success(world.isClient);
                } else {
                    ItemStack itemStack = player.getStackInHand(hand);
                    if (itemStack.isIn(MapleItemTags.BOOKSHELF_BOOKS)) {
                        tryAddBook(world, pos, player, chiseledBookshelfBlockEntity, itemStack, i);
                        return ActionResult.success(world.isClient);
                    } else {
                        return ActionResult.CONSUME;
                    }
                }
            }
        } else {
            return ActionResult.PASS;
        }
    }

    private static Optional<Vec2f> getHitPos(BlockHitResult hit, Direction facing) {
        Direction direction = hit.getSide();
        if (facing != direction) {
            return Optional.empty();
        } else {
            BlockPos blockPos = hit.getBlockPos().offset(direction);
            Vec3d vec3d = hit.getPos().subtract((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ());
            double d = vec3d.getX();
            double e = vec3d.getY();
            double f = vec3d.getZ();
            Optional var10000;
            switch(direction) {
                case NORTH:
                    var10000 = Optional.of(new Vec2f((float)(1.0D - d), (float)e));
                    break;
                case SOUTH:
                    var10000 = Optional.of(new Vec2f((float)d, (float)e));
                    break;
                case WEST:
                    var10000 = Optional.of(new Vec2f((float)f, (float)e));
                    break;
                case EAST:
                    var10000 = Optional.of(new Vec2f((float)(1.0D - f), (float)e));
                    break;
                case DOWN:
                case UP:
                    var10000 = Optional.empty();
                    break;
                default:
                    throw new IncompatibleClassChangeError();
            }

            return var10000;
        }
    }

    private static int getSlotForHitPos(Vec2f hitPos) {
        int i = hitPos.y >= 0.5F ? 0 : 1;
        int j = getColumn(hitPos.x);
        return j + i * 3;
    }

    private static int getColumn(float x) {
        float f = 0.0625F;
        float g = 0.375F;
        if (x < 0.375F) {
            return 0;
        } else {
            float h = 0.6875F;
            return x < 0.6875F ? 1 : 2;
        }
    }

    private static void tryAddBook(World world, BlockPos pos, PlayerEntity player, ChiseledBookshelfBlockEntity blockEntity, ItemStack stack, int slot) {
        if (!world.isClient) {
            player.incrementStat(Stats.USED.getOrCreateStat(stack.getItem()));
            blockEntity.setStack(slot, stack.split(1));
            if (player.isCreative()) {
                stack.increment(1);
            }

            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
        }
    }

    private static void tryRemoveBook(World world, BlockPos pos, PlayerEntity player, ChiseledBookshelfBlockEntity blockEntity, int slot) {
        if (!world.isClient) {
            ItemStack itemStack = blockEntity.removeStack(slot, 1);
            if (!player.getInventory().insertStack(itemStack)) {
                player.dropItem(itemStack, false);
            }

            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
        }
    }

    @Nullable
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ChiseledBookshelfBlockEntity(pos, state);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{HorizontalFacingBlock.FACING});
        List var10000 = SLOT_OCCUPIED_PROPERTIES;
        Objects.requireNonNull(builder);
        var10000.forEach((property) -> {
            builder.add(new Property[]{(Property) property});
        });
    }

    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof ChiseledBookshelfBlockEntity) {
                ChiseledBookshelfBlockEntity chiseledBookshelfBlockEntity = (ChiseledBookshelfBlockEntity)blockEntity;
                if (!chiseledBookshelfBlockEntity.isEmpty()) {
                    for(int i = 0; i < 6; ++i) {
                        ItemStack itemStack = chiseledBookshelfBlockEntity.getStack(i);
                        if (!itemStack.isEmpty()) {
                            ItemScatterer.spawn(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), itemStack);
                        }
                    }

                    chiseledBookshelfBlockEntity.clear();
                    world.updateComparators(pos, this);
                }
            }

            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(HorizontalFacingBlock.FACING, ctx.getPlayerFacing().getOpposite());
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(HorizontalFacingBlock.FACING, rotation.rotate((Direction)state.get(HorizontalFacingBlock.FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.get(HorizontalFacingBlock.FACING)));
    }

    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        if (world.isClient()) {
            return 0;
        } else {
            BlockEntity var5 = world.getBlockEntity(pos);
            if (var5 instanceof ChiseledBookshelfBlockEntity) {
                ChiseledBookshelfBlockEntity chiseledBookshelfBlockEntity = (ChiseledBookshelfBlockEntity)var5;
                return chiseledBookshelfBlockEntity.getLastInteractedSlot() + 1;
            } else {
                return 0;
            }
        }
    }

    static {
        SLOT_OCCUPIED_PROPERTIES = List.of(MapleProperties.SLOT_0_OCCUPIED, MapleProperties.SLOT_1_OCCUPIED, MapleProperties.SLOT_2_OCCUPIED, MapleProperties.SLOT_3_OCCUPIED, MapleProperties.SLOT_4_OCCUPIED, MapleProperties.SLOT_5_OCCUPIED);
    }
}
