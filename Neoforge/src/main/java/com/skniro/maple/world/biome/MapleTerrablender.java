package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.resources.Identifier;
import terrablender.api.Regions;

public class MapleTerrablender {
    public static void registerBiomes() {
        Regions.register(new MapleGroveBiome(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "overworld_1"), 2));
        Regions.register(new MapleSakuraBiome(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "overworld_2"), 2));
    }
}
