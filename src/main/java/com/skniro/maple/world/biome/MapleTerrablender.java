package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class MapleTerrablender {
    public static void registerBiomes() {
        Regions.register(new MapleOverworldBiomes(new ResourceLocation(Maple.MODID, "overworld"), 2));
    }
}
