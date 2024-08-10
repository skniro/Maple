package com.skniro.maple.block.init;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MapleGlassStairsBlock extends StairBlock {
    public MapleGlassStairsBlock(BlockState baseBlockState, Properties properties) {
        super(baseBlockState, properties);
    }

    public float getShadeBrightness(BlockState state, BlockGetter world, BlockPos pos) {
        return 1.0F;
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos) {
        return true;
    }
}
