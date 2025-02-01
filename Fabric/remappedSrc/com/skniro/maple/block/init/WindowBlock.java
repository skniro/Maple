package com.skniro.maple.block.init;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class WindowBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<WindowBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(propertiesCodec(),BlockSetType.CODEC.fieldOf("block_set_type").forGetter((block) -> {
            return block.blockSetType;
        })).apply(instance, WindowBlock::new);
    });
    public static final EnumProperty<Direction> FACING;
    public static final EnumProperty<DoorHingeSide> HINGE;
    public static final BooleanProperty OPEN;
    public static final BooleanProperty POWERED;
    public static final VoxelShape WEST_OPEN_SHAPE;
    public static final VoxelShape EAST_OPEN_SHAPE;
    public static final VoxelShape NORTH_OPEN_SHAPE;
    public static final VoxelShape SOUTH_OPEN_SHAPE;

    public static final VoxelShape WEST_CLOSED_SHAPE;
    public static final VoxelShape EAST_CLOSED_SHAPE;
    public static final VoxelShape NORTH_CLOSED_SHAPE;
    public static final VoxelShape SOUTH_CLOSED_SHAPE;
    private final BlockSetType blockSetType;

    public WindowBlock(Properties settings, BlockSetType blockSetType) {
        super(settings.sound(blockSetType.soundType()));
        this.blockSetType = blockSetType;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(OPEN, false)
                .setValue(HINGE, DoorHingeSide.LEFT)
                .setValue(POWERED, false));
    }


    public BlockSetType getBlockSetType() {
        return this.blockSetType;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        boolean closed = !state.getValue(OPEN);

        switch (direction) {
            case EAST:
                return closed ? EAST_CLOSED_SHAPE : EAST_OPEN_SHAPE;
            case SOUTH:
                return closed ? SOUTH_CLOSED_SHAPE : SOUTH_OPEN_SHAPE;
            case WEST:
                return closed ? WEST_CLOSED_SHAPE : WEST_OPEN_SHAPE;
            case NORTH:
            default:
                return closed ? NORTH_CLOSED_SHAPE : NORTH_OPEN_SHAPE;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockPos blockPos = ctx.getClickedPos();
        Level world = ctx.getLevel();
        boolean powered = world.hasNeighborSignal(blockPos);
        return this.defaultBlockState()
                .setValue(FACING, ctx.getHorizontalDirection())
                .setValue(POWERED, powered)
                .setValue(OPEN, powered);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (!this.blockSetType.canOpenByHand()) {
            return InteractionResult.PASS;
        }

        state = state.cycle(OPEN);
        world.setBlock(pos, state, 10);
        this.playOpenCloseSound(player, world, pos, state.getValue(OPEN));
        world.gameEvent(player, state.getValue(OPEN) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);

        return InteractionResult.SUCCESS;
    }

    private void playOpenCloseSound(@Nullable Entity entity, Level world, BlockPos pos, boolean open) {
        world.playSound(entity, pos, open ? this.blockSetType.doorOpen() : this.blockSetType.doorClose(), SoundSource.BLOCKS, 1.0F, world.getRandom().nextFloat() * 0.1F + 0.9F);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, HINGE, POWERED);
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        OPEN = BlockStateProperties.OPEN;
        HINGE = BlockStateProperties.DOOR_HINGE;
        POWERED = BlockStateProperties.POWERED;


        WEST_CLOSED_SHAPE = Block.box(7.0, 0.0, 0.0, 8.5, 16.0, 16.0);
        EAST_CLOSED_SHAPE = Block.box(7.5, 0.0, 0.0, 9.0, 16.0, 16.0);
        NORTH_CLOSED_SHAPE = Block.box(0.0, 0.0, 7.0, 16.0, 16.0, 8.5);
        SOUTH_CLOSED_SHAPE = Block.box(0.0, 0.0, 7.5, 16.0, 16.0, 9.0);

        WEST_OPEN_SHAPE = Block.box(0.0, 0.0, 14.5, 16.0, 16.0, 16.0);
        EAST_OPEN_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 1.5);
        NORTH_OPEN_SHAPE = Block.box(0.0, 0.0, 0.0, 1.5, 16.0, 16.0);
        SOUTH_OPEN_SHAPE = Block.box(14.5, 0.0, 0.0, 16.0, 16.0, 16.0);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }
}

