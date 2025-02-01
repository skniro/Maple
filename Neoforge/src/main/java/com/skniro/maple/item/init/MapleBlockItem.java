package com.skniro.maple.item.init;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class MapleBlockItem extends BlockItem {

    public MapleBlockItem(Supplier<Block> p_40565_, Properties p_40566_) {
        super(p_40565_.get(), p_40566_);
    }
}