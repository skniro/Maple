package com.skniro.maple.world.biome;

import com.skniro.maple.world.feature.MapleBiomeFeatures;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicSound;
import net.minecraft.sound.MusicType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import org.jetbrains.annotations.Nullable;


public class MapleOverworldBiomes {
    public static Biome createMapleGrove(RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup) {
        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultOres(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultDisks(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_FLOWER_FOREST);
        DefaultBiomeFeatures.addDefaultGrass(lookupBackedBuilder);
        MapleBiomeFeatures.addMapleGroveFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addEmeraldOre(lookupBackedBuilder);
        DefaultBiomeFeatures.addInfestedStone(lookupBackedBuilder);
        DefaultBiomeFeatures.addFarmAnimals(builder);
        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_MEADOW);
        return createBiome(true, 0.5F, 0.8F, 4159204, 329011, 13408563, 11983713, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome createSakura(RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup) {
        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 1, 1, 2)).spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 2, 6)).spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.SHEEP, 2, 2, 4));
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultOres(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultDisks(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_FLOWER_FOREST);
        MapleBiomeFeatures.addSakuraFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addEmeraldOre(lookupBackedBuilder);
        DefaultBiomeFeatures.addInfestedStone(lookupBackedBuilder);
        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_MEADOW);
        return createBiome(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, builder, lookupBackedBuilder, musicSound);
    }

    private static void addBasicFeatures(GenerationSettings.LookupBackedBuilder generationSettings) {
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addAmethystGeodes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
    }

    protected static int getSkyColor(float temperature) {
        float f = temperature / 3.0F;
        f = MathHelper.clamp(f, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1.0F);
    }


    private static Biome createBiome(boolean precipitation, float temperature, float downfall, SpawnSettings.Builder spawnSettings, net.minecraft.world.biome.GenerationSettings.Builder generationSettings, @Nullable MusicSound music) {
        return createBiome(precipitation, temperature, downfall, 4159204, 329011, (Integer)null, (Integer)null, spawnSettings, generationSettings, music);
    }

    private static Biome createBiome(boolean precipitation, float temperature, float downfall, int waterColor, int waterFogColor, @Nullable Integer grassColor, @Nullable Integer foliageColor, SpawnSettings.Builder spawnSettings, net.minecraft.world.biome.GenerationSettings.Builder generationSettings, @Nullable MusicSound music) {
        net.minecraft.world.biome.BiomeEffects.Builder builder = (new net.minecraft.world.biome.BiomeEffects.Builder()).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(getSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(music);
        if (grassColor != null) {
            builder.grassColor(grassColor);
        }

        if (foliageColor != null) {
            builder.foliageColor(foliageColor);
        }

        return (new net.minecraft.world.biome.Biome.Builder()).precipitation(true).temperature(temperature).downfall(downfall).effects(builder.build()).spawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }
}
