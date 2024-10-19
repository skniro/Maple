package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class MapleTerrablender {
    public static void registerBiomes() {
        Regions.register(new MapleOverworldBiomes(ResourceLocation.fromNamespaceAndPath(Maple.MODID, "overworld"), 2));
        Regions.register(new MapleGroveBiome(ResourceLocation.fromNamespaceAndPath(Maple.MODID, "overworld_1"), 2));
        Regions.register(new MapleSakuraBiome(ResourceLocation.fromNamespaceAndPath(Maple.MODID, "overworld_2"), 2));
    }
}
