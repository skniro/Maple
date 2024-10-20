package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.registry.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;


public class MapleBiomeKeys {
    public static final ResourceKey<Biome> Maple_Grove = register("maple_grove");
    public static final ResourceKey<Biome> Sakura = register("sakura");

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,name));
    }


   public static void bootstrap(BootstrapContext<Biome> biomeRegisterable) {
        HolderGetter<PlacedFeature> registryEntryLookup = biomeRegisterable.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> registryEntryLookup2 = biomeRegisterable.lookup(Registries.CONFIGURED_CARVER);
        biomeRegisterable.register(Maple_Grove, MapleOverworldBiomes.createMapleGrove(registryEntryLookup,registryEntryLookup2));
        biomeRegisterable.register(Sakura, MapleOverworldBiomes.createSakura(registryEntryLookup,registryEntryLookup2));
    }

    public static void registerBiome() {
        Maple.LOGGER.debug("Registering the MapleBiomeKeysFeatures for " + Maple.MOD_ID);
    }
}
