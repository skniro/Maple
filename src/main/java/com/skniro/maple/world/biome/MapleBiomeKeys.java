package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.PlacedFeature;


public class MapleBiomeKeys {
    public static final RegistryKey<Biome> Maple_Grove = register("maple_grove");
    public static final RegistryKey<Biome> Sakura = register("sakura");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(Maple.MOD_ID,name));
    }


   public static void bootstrap(Registerable<Biome> biomeRegisterable) {
        RegistryEntryLookup<PlacedFeature> registryEntryLookup = biomeRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        RegistryEntryLookup<ConfiguredCarver<?>> registryEntryLookup2 = biomeRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER);
        biomeRegisterable.register(Maple_Grove, MapleOverworldBiomes.createMapleGrove(registryEntryLookup,registryEntryLookup2));
        biomeRegisterable.register(Sakura, MapleOverworldBiomes.createSakura(registryEntryLookup,registryEntryLookup2));
    }

    public static void registerBiome() {
        Maple.LOGGER.debug("Registering the MapleBiomeKeysFeatures for " + Maple.MOD_ID);
    }
}
