package com.skniro.maple.block.init;

import com.skniro.maple.state.property.MapleProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.swing.text.html.BlockView;

public class MapleFlowerbedBlock extends BushBlock implements BonemealableBlock {
    public static final int field_42762 = 1;
    public static final int field_42763 = 4;
    public static final DirectionProperty FACING;
    public static final IntegerProperty FLOWER_AMOUNT;

    public MapleFlowerbedBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FLOWER_AMOUNT, Integer.valueOf(1)));
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return (BlockState)state.setValue(FACING, rotation.rotate((Direction)state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.getValue(FACING)));
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return !context.isSecondaryUseActive() && context.getItemInHand().is(this.asItem()) && (Integer)state.getValue(FLOWER_AMOUNT) < 4 ? true : super.canBeReplaced(state, context);
    }

    public VoxelShape getShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {
        return Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
    }

    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockState blockState = ctx.getLevel().getBlockState(ctx.getClickedPos());
        return blockState.is(this) ? (BlockState)blockState.setValue(FLOWER_AMOUNT, Math.min(4, (Integer)blockState.getValue(FLOWER_AMOUNT) + 1)) : (BlockState)this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FLOWER_AMOUNT);
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        int i = (Integer)state.getValue(FLOWER_AMOUNT);
        if (i < 4) {
            world.setBlock(pos, (BlockState)state.setValue(FLOWER_AMOUNT, i + 1), 2);
        } else {
            popResource(world, pos, new ItemStack(this));
        }

    }

    static {
        FACING = BlockStateProperties.HORIZONTAL_FACING;
        FLOWER_AMOUNT = MapleProperties.FLOWER_AMOUNT;
    }
}