package com.skniro.maple.world.biome;

import com.skniro.maple.world.feature.MapleBiomeFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.attribute.BackgroundMusic;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.jetbrains.annotations.Nullable;


public class MapleOverworldBiomes {
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
        BiomeDefaultFeatures.addDefaultExtraVegetation(lookupBackedBuilder, false);
        BiomeDefaultFeatures.addExtraEmeralds(lookupBackedBuilder);
        BiomeDefaultFeatures.addInfestedStone(lookupBackedBuilder);
        BiomeDefaultFeatures.farmAnimals(builder);
        Music musicSound = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_MEADOW);
        BiomeSpecialEffects.Builder builder2 = (new BiomeSpecialEffects.Builder()).waterColor(4159204).grassColorOverride(13408563).foliageColorOverride(11983713);
        return biome( 0.5F, 0.8F).setAttribute(EnvironmentAttributes.BACKGROUND_MUSIC, new BackgroundMusic(SoundEvents.MUSIC_BIOME_MEADOW)).specialEffects(builder2.build()).mobSpawnSettings(builder.build()).generationSettings(lookupBackedBuilder.build()).build();
    }

    public static Biome createSakura(HolderGetter<PlacedFeature> featureLookup, HolderGetter<ConfiguredWorldCarver<?>> carverLookup) {
        BiomeGenerationSettings.Builder lookupBackedBuilder = new BiomeGenerationSettings.Builder(featureLookup, carverLookup);
        MobSpawnSettings.Builder builder = new MobSpawnSettings.Builder();
        builder.addSpawn(MobCategory.CREATURE, 1, new MobSpawnSettings.SpawnerData(EntityType.PIG, 1, 2)).addSpawn(MobCategory.CREATURE, 2, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 2, 6)).addSpawn(MobCategory.CREATURE, 2, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 2, 4));
        addBasicFeatures(lookupBackedBuilder);
        BiomeDefaultFeatures.addPlainGrass(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultOres(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultSoftDisks(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(lookupBackedBuilder);
        lookupBackedBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.FLOWER_FLOWER_FOREST);
        MapleBiomeFeatures.addSakuraFeatures(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(lookupBackedBuilder, false);
        BiomeDefaultFeatures.addExtraEmeralds(lookupBackedBuilder);
        BiomeDefaultFeatures.addInfestedStone(lookupBackedBuilder);
        Music musicSound = Musics.createGameMusic(SoundEvents.MUSIC_BIOME_MEADOW);
        BiomeSpecialEffects.Builder builder2 = (new BiomeSpecialEffects.Builder()).waterColor(6141935).grassColorOverride(11983713).foliageColorOverride(11983713);
        return biome(0.5F, 0.8F).setAttribute(EnvironmentAttributes.WATER_FOG_COLOR, 6141935).setAttribute(EnvironmentAttributes.BACKGROUND_MUSIC, new BackgroundMusic(SoundEvents.MUSIC_BIOME_CHERRY_GROVE)).specialEffects(builder2.build()).mobSpawnSettings(builder.build()).generationSettings(lookupBackedBuilder.build()).build();
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

    private static Biome.BiomeBuilder biome(float temperature, float downfall) {
        return (new Biome.BiomeBuilder()).hasPrecipitation(true).temperature(temperature).downfall(downfall).setAttribute(EnvironmentAttributes.SKY_COLOR, getSkyColor(temperature)).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(4159204).build());
    }
}
