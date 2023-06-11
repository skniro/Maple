package com.skniro.maple.util;

import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MapleStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(Maple_block.MAPLE_LOG, Maple_block.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(Maple_block.MAPLE_WOOD, Maple_block.STRIPPED_MAPLE_WOOD);
        StrippableBlockRegistry.register(Maple_block.CHERRY_LOG, Maple_block.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(Maple_block.CHERRY_WOOD, Maple_block.STRIPPED_CHERRY_WOOD);
    }
}
