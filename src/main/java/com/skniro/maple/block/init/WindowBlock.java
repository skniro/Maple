package com.skniro.maple.block.init;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class WindowBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING;
    public static final EnumProperty<DoorHinge> HINGE;
    public static final BooleanProperty OPEN;
    public static final BooleanProperty POWERED;
    public static final VoxelShape NORTH_SHAPE;
    public static final VoxelShape SOUTH_SHAPE;
    public static final VoxelShape EAST_SHAPE;
    public static final VoxelShape WEST_SHAPE;
    private final BlockSetType blockSetType;

    public WindowBlock(AbstractBlock.Settings settings, BlockSetType blockSetType) {
        super(settings.sounds(blockSetType.soundType()));
        this.blockSetType = blockSetType;
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(OPEN, false)
                .with(HINGE, DoorHinge.LEFT)
                .with(POWERED, false));
    }

    public BlockSetType getBlockSetType() {
        return this.blockSetType;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        boolean closed = !state.get(OPEN);
        boolean hingeRight = state.get(HINGE) == DoorHinge.RIGHT;

        switch (direction) {
            case EAST:
            default:
                return closed ? WEST_SHAPE : (hingeRight ? SOUTH_SHAPE : NORTH_SHAPE);
            case SOUTH:
                return closed ? NORTH_SHAPE : (hingeRight ? WEST_SHAPE : EAST_SHAPE);
            case WEST:
                return closed ? EAST_SHAPE : (hingeRight ? NORTH_SHAPE : SOUTH_SHAPE);
            case NORTH:
                return closed ? SOUTH_SHAPE : (hingeRight ? EAST_SHAPE : WEST_SHAPE);
        }
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World world = ctx.getWorld();
        boolean powered = world.isReceivingRedstonePower(blockPos);
        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing())
                .with(HINGE, this.getHinge(ctx))
                .with(POWERED, powered)
                .with(OPEN, powered);
    }

    private DoorHinge getHinge(ItemPlacementContext ctx) {
        BlockView blockView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        Direction direction = ctx.getHorizontalPlayerFacing();
        Direction left = direction.rotateYCounterclockwise();
        Direction right = direction.rotateYClockwise();

        int offset = 0;
        if (blockView.getBlockState(blockPos.offset(left)).isFullCube(blockView, blockPos.offset(left))) {
            offset--;
        }
        if (blockView.getBlockState(blockPos.offset(right)).isFullCube(blockView, blockPos.offset(right))) {
            offset++;
        }

        return offset <= 0 ? DoorHinge.LEFT : DoorHinge.RIGHT;
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!this.blockSetType.canOpenByHand()) {
            return ActionResult.PASS;
        }

        state = state.cycle(OPEN);
        world.setBlockState(pos, state, 10);
        this.playOpenCloseSound(player, world, pos, state.get(OPEN));
        world.emitGameEvent(player, state.get(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);

        return ActionResult.success(world.isClient);
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        return blockState.isSideSolidFullSquare(world, blockPos, Direction.UP);
    }

    private void playOpenCloseSound(@Nullable Entity entity, World world, BlockPos pos, boolean open) {
        world.playSound(entity, pos, open ? this.blockSetType.doorOpen() : this.blockSetType.doorClose(), SoundCategory.BLOCKS, 1.0F, world.getRandom().nextFloat() * 0.1F + 0.9F);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, HINGE, POWERED);
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
        OPEN = Properties.OPEN;
        HINGE = Properties.DOOR_HINGE;
        POWERED = Properties.POWERED;

        NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
        SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
        EAST_SHAPE = Block.createCuboidShape(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    }
}

