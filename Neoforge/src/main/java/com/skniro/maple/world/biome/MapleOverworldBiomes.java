package com.skniro.maple.world.biome;

import com.mojang.datafixers.util.Pair;
import com.skniro.maple.world.feature.MapleBiomeFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.jetbrains.annotations.Nullable;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.List;
import java.util.function.Consumer;

public class MapleOverworldBiomes extends Region {
        public MapleOverworldBiomes(ResourceLocation name, int weight) {
            super(name, RegionType.OVERWORLD, weight);
        }

    public static Biome createCherryGrove(HolderGetter<PlacedFeature> featureLookup, HolderGetter<ConfiguredWorldCarver<?>> carverLookup) {
        BiomeGenerationSettings.Builder builder = new BiomeGenerationSettings.Builder(featureLookup, carverLookup);
        MobSpawnSettings.Builder builder2 = new MobSpawnSettings.Builder();
        builder2.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 1, 1, 2)).addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 2, 2, 6)).addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 2, 2, 4));
        BiomeDefaultFeatures.commonSpawns(builder2);
        addBasicFeatures(builder);
        BiomeDefaultFeatures.addPlainGrass(builder);
        BiomeDefaultFeatures.addDefaultOres(builder);
        BiomeDefaultFeatures.addDefaultSoftDisks(builder);
        BiomeDefaultFeatures.addMeadowVegetation(builder);
        BiomeDefaultFeatures.addExtraEmeralds(builder);
        BiomeDefaultFeatures.addInfestedStone(builder);
        Music musicSound = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_MEADOW);
        return createBiome(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, builder2, builder, musicSound);
    }

    public static Biome createMapleGrove(HolderGetter<PlacedFeature> featureLookup, HolderGetter<ConfiguredWorldCarver<?>> carverLookup) {
        BiomeGenerationSettings.Builder lookupBackedBuilder = new BiomeGenerationSettings.Builder(featureLookup, carverLookup);
        MobSpawnSettings.Builder builder = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.commonSpawns(builder);
        addBasicFeatures(lookupBackedBuilder);
        BiomeDefaultFeatures.addPlainGrass(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultOres(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultSoftDisks(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(lookupBackedBuilder);
        lookupBackedBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.FLOWER_FLOWER_FOREST);
        BiomeDefaultFeatures.addDefaultGrass(lookupBackedBuilder);
        MapleBiomeFeatures.addMapleGroveFeatures(lookupBackedBuilder);
        BiomeDefaultFeatures.addForestGrass(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(lookupBackedBuilder);
        BiomeDefaultFeatures.addExtraEmeralds(lookupBackedBuilder);
        BiomeDefaultFeatures.addInfestedStone(lookupBackedBuilder);
        BiomeDefaultFeatures.farmAnimals(builder);
        Music musicSound = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_MEADOW);
        return createBiome(true, 0.5F, 0.8F, 4159204, 329011, 13408563, 11983713, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome createSakura(HolderGetter<PlacedFeature> featureLookup, HolderGetter<ConfiguredWorldCarver<?>> carverLookup) {
        BiomeGenerationSettings.Builder lookupBackedBuilder = new BiomeGenerationSettings.Builder(featureLookup, carverLookup);
        MobSpawnSettings.Builder builder = new MobSpawnSettings.Builder();
        builder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 1, 1, 2)).addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 2, 2, 6)).addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 2, 2, 4));
        addBasicFeatures(lookupBackedBuilder);
        BiomeDefaultFeatures.addPlainGrass(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultOres(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultSoftDisks(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(lookupBackedBuilder);
        lookupBackedBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.FLOWER_FLOWER_FOREST);
        MapleBiomeFeatures.addSakuraFeatures(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(lookupBackedBuilder);
        BiomeDefaultFeatures.addExtraEmeralds(lookupBackedBuilder);
        BiomeDefaultFeatures.addInfestedStone(lookupBackedBuilder);
        Music musicSound = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_MEADOW);
        return createBiome(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, builder, lookupBackedBuilder, musicSound);
    }

    private static void addBasicFeatures(BiomeGenerationSettings.Builder generationSettings) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generationSettings);
        BiomeDefaultFeatures.addDefaultCrystalFormations(generationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generationSettings);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(generationSettings);
    }

    protected static int getSkyColor(float temperature) {
        float f = temperature / 3.0F;
        f = Mth.clamp(f, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1.0F);
    }


    private static Biome createBiome(boolean precipitation, float temperature, float downfall, int waterColor, int waterFogColor, @Nullable Integer grassColor, @Nullable Integer foliageColor, MobSpawnSettings.Builder spawnSettings, BiomeGenerationSettings.Builder generationSettings, @Nullable Music music) {
        BiomeSpecialEffects.Builder builder = (new BiomeSpecialEffects.Builder()).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(getSkyColor(temperature)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).backgroundMusic(music);
        if (grassColor != null) {
            builder.grassColorOverride(grassColor);
        }

        if (foliageColor != null) {
            builder.foliageColorOverride(foliageColor);
        }

        return (new Biome.BiomeBuilder()).hasPrecipitation(precipitation).temperature(temperature).downfall(downfall).specialEffects(builder.build()).mobSpawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }
}
