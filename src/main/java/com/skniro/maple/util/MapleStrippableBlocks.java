package com.skniro.maple.util;

import com.skniro.maple.block.MapleBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MapleStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(MapleBlocks.MAPLE_LOG, MapleBlocks.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(MapleBlocks.MAPLE_WOOD, MapleBlocks.STRIPPED_MAPLE_WOOD);
        StrippableBlockRegistry.register(MapleBlocks.CHERRY_LOG, MapleBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(MapleBlocks.CHERRY_WOOD, MapleBlocks.STRIPPED_CHERRY_WOOD);
    }
}
