package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.PlacedFeature;


public class MapleBiomeKeys {
    public static final RegistryKey<Biome> CHERRY_GROVE = register("cherry_grove");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(Maple.MOD_ID,name));
    }


    public static void registerBiome(Registerable<Biome> biomeRegisterable, RegistryEntryLookup<PlacedFeature> placedFeatureLookup, RegistryEntryLookup<ConfiguredCarver<?>> configuredCarverLookup) {
        Maple.LOGGER.debug("Registering the MapleBiomeKeysFeatures for " + Maple.MOD_ID);
        biomeRegisterable.register(CHERRY_GROVE, MapleOverworldBiomes.createCherryGrove(placedFeatureLookup,configuredCarverLookup));
    }
}
