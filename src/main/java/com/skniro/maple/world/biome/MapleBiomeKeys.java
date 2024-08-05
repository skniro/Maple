package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import static net.minecraft.core.Registry.BIOME_REGISTRY;


public class MapleBiomeKeys {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> Biome =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Maple.MODID);
    public static final ResourceKey<Biome> CHERRY_GROVE = register("cherry_grove");
    public static final ResourceKey<Biome> Maple_Grove = register("maple_grove");
    public static final ResourceKey<Biome> Sakura = register("sakura");


    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }


    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(BIOME_REGISTRY, new ResourceLocation(Maple.MODID,name));
    }


    public static void registerBiome(IEventBus eventBus) {
        registerBuiltinBiome(CHERRY_GROVE, OverworldBiomes.meadow());
        registerBuiltinBiome(Sakura, MapleOverworldBiomes.createSakura());
        registerBuiltinBiome(Maple_Grove, MapleOverworldBiomes.createMapleGrove());
        Biome.register(eventBus);
    }

    private static void registerBuiltinBiome(ResourceKey<Biome> key, Biome biome) {
        BuiltinRegistries.register(BuiltinRegistries.BIOME, key, biome);
    }
}
