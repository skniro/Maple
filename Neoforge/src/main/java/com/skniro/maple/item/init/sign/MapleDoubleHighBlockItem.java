package com.skniro.maple.item.init.sign;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class MapleDoubleHighBlockItem extends BlockItem {
    public MapleDoubleHighBlockItem(Supplier<Block> p_41010_, Item.Properties p_41011_) {
        super(p_41010_.get(), p_41011_);
    }

    protected boolean placeBlock(BlockPlaceContext p_41013_, BlockState p_41014_) {
        Level level = p_41013_.getLevel();
        BlockPos blockpos = p_41013_.getClickedPos().above();
        BlockState blockstate = level.isWaterAt(blockpos) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
        level.setBlock(blockpos, blockstate, 27);
        return super.placeBlock(p_41013_, p_41014_);
    }
}
