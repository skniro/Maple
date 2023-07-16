package com.skniro.maple.util;

import com.skniro.maple.block.MapleBlocks;

public class MapleFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(MapleBlocks.CHERRY_WOOD, 5, 5);
        registry.add(MapleBlocks.CHERRY_LOG, 5, 5);
        registry.add(MapleBlocks.STRIPPED_CHERRY_LOG, 5, 5);
        registry.add(MapleBlocks.STRIPPED_CHERRY_WOOD, 5, 5);

        registry.add(MapleBlocks.MAPLE_LOG, 5, 5);
        registry.add(MapleBlocks.MAPLE_WOOD, 5, 5);
        registry.add(MapleBlocks.STRIPPED_MAPLE_LOG, 5, 5);
        registry.add(MapleBlocks.STRIPPED_MAPLE_WOOD, 5, 5);

        registry.add(MapleBlocks.CHERRY_PLANKS, 5, 20);
        registry.add(MapleBlocks.CHERRY_LEAVES, 30, 60);

        registry.add(MapleBlocks.MAPLE_PLANKS, 5, 20);
        registry.add(MapleBlocks.MAPLE_LEAVES, 30, 60);


    }
}
