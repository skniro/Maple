package com.skniro.maple.util;

import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class MapleFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(Maple_block.CHERRY_WOOD, 5, 5);
        registry.add(Maple_block.CHERRY_LOG, 5, 5);
        registry.add(Maple_block.STRIPPED_CHERRY_LOG, 5, 5);
        registry.add(Maple_block.STRIPPED_CHERRY_WOOD, 5, 5);

        registry.add(Maple_block.MAPLE_LOG, 5, 5);
        registry.add(Maple_block.MAPLE_WOOD, 5, 5);
        registry.add(Maple_block.STRIPPED_MAPLE_LOG, 5, 5);
        registry.add(Maple_block.STRIPPED_MAPLE_WOOD, 5, 5);

        registry.add(Maple_block.CHERRY_PLANKS, 5, 20);
        registry.add(Maple_block.CHERRY_LEAVES, 30, 60);

        registry.add(Maple_block.MAPLE_PLANKS, 5, 20);
        registry.add(Maple_block.MAPLE_LEAVES, 30, 60);


    }
}
