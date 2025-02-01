package com.skniro.maple.item.init.sign;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class MapleHangingSignItem extends MapleSignItem {
    public MapleHangingSignItem(Supplier<Block> p_251582_, Supplier<Block> p_250734_, Item.Properties p_250266_) {
        super(p_250266_, p_251582_.get(), p_250734_.get(), Direction.UP);
    }

    protected boolean canPlace(LevelReader p_252032_, BlockState p_252230_, BlockPos p_252075_) {
        Block var5 = p_252230_.getBlock();
        if (var5 instanceof WallHangingSignBlock wallhangingsignblock) {
            if (!wallhangingsignblock.canPlace(p_252230_, p_252032_, p_252075_)) {
                return false;
            }
        }

        return super.canPlace(p_252032_, p_252230_, p_252075_);
    }
}
