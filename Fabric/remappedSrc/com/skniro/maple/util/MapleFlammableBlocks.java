package com.skniro.maple.util;

import com.skniro.maple.block.MapleBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

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

        registry.add(MapleBlocks.RED_MAPLE_LEAVES, 30, 60);

        registry.add(MapleBlocks.SAKURA_LEAVES, 30, 60);

        registry.add(MapleBlocks.GINKGO_LOG, 5, 5);
        registry.add(MapleBlocks.GINKGO_WOOD, 5, 5);
        registry.add(MapleBlocks.STRIPPED_GINKGO_LOG, 5, 5);
        registry.add(MapleBlocks.STRIPPED_GINKGO_WOOD, 5, 5);

        registry.add(MapleBlocks.GINKGO_PLANKS, 5, 20);
        registry.add(MapleBlocks.GINKGO_LEAVES, 30, 60);

    }
}
