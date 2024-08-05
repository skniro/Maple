package com.skniro.maple.world.biome;

import com.mojang.datafixers.util.Pair;
import com.skniro.maple.world.feature.MapleBiomeFeatures;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
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

    public static Biome createCherryGrove() {
        BiomeGenerationSettings.Builder builder = new BiomeGenerationSettings.Builder();
        MobSpawnSettings.Builder builder2 = new MobSpawnSettings.Builder();
        builder2.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnEntry(EntityType.PIG, 1, 1, 2)).spawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 2, 6)).spawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnEntry(EntityType.SHEEP, 2, 2, 4));
        BiomeDefaultFeatures.addBatsAndMonsters(builder2);
        addBasicFeatures(builder.build());
        BiomeDefaultFeatures.addPlainsTallGrass(builder);
        BiomeDefaultFeatures.addDefaultOres(builder);
        BiomeDefaultFeatures.addDefaultDisks(builder);
        BiomeDefaultFeatures.addMeadowFlowers(builder);
        BiomeDefaultFeatures.addEmeraldOre(builder);
        BiomeDefaultFeatures.addInfestedStone(builder);
        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_MEADOW);
        return createBiome(Biome.Precipitation.RAIN, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, builder2, builder, musicSound);
    }

    public static Biome createMapleGrove() {
        BiomeGenerationSettings.Builder lookupBackedBuilder = new BiomeGenerationSettings.Builder();
        MobSpawnSettings.Builder builder = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.addBatsAndMonsters(builder);
        addBasicFeatures(lookupBackedBuilder.build());
        BiomeDefaultFeatures.addPlainsTallGrass(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultOres(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultDisks(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_FLOWER_FOREST);
        BiomeDefaultFeatures.addDefaultGrass(lookupBackedBuilder);
        MapleBiomeFeatures.addMapleGroveFeatures(lookupBackedBuilder);
        BiomeDefaultFeatures.addForestGrass(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultVegetation(lookupBackedBuilder);
        BiomeDefaultFeatures.addEmeraldOre(lookupBackedBuilder);
        BiomeDefaultFeatures.addInfestedStone(lookupBackedBuilder);
        BiomeDefaultFeatures.addFarmAnimals(builder);
        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_BIOME_MEADOW);
        return createBiome(Biome.Precipitation.RAIN, 0.5F, 0.8F, 4159204, 329011, 13408563, 11983713, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome createSakura() {
        BiomeGenerationSettings.Builder lookupBackedBuilder = new BiomeGenerationSettings.Builder();
        MobSpawnSettings.Builder builder = new MobSpawnSettings.Builder();
        builder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnEntry(EntityType.PIG, 1, 1, 2)).spawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 2, 6)).spawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnEntry(EntityType.SHEEP, 2, 2, 4));
        addBasicFeatures(lookupBackedBuilder.build());
        BiomeDefaultFeatures.addPlainsTallGrass(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultOres(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultDisks(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_FLOWER_FOREST);
        MapleBiomeFeatures.addSakuraFeatures(lookupBackedBuilder);
        BiomeDefaultFeatures.addDefaultVegetation(lookupBackedBuilder);
        BiomeDefaultFeatures.addEmeraldOre(lookupBackedBuilder);
        BiomeDefaultFeatures.addInfestedStone(lookupBackedBuilder);
        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_MEADOW);
        return createBiome(Biome.Precipitation.RAIN, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, builder, lookupBackedBuilder, musicSound);
    }

    private static void addBasicFeatures(BiomeGenerationSettings generationSettings) {
        BiomeDefaultFeatures.addLandCarvers(generationSettings);
        BiomeDefaultFeatures.addAmethystGeodes(generationSettings);
        BiomeDefaultFeatures.addDungeons(generationSettings);
        BiomeDefaultFeatures.addMineables(generationSettings);
        BiomeDefaultFeatures.addSprings(generationSettings);
        BiomeDefaultFeatures.addFrozenTopLayer(generationSettings);
    }


    private static Biome createBiome(Biome.Precipitation precipitation, float temperature, float downfall, int waterColor, int waterFogColor, @Nullable Integer grassColor, @Nullable Integer foliageColor, SpawnSettings.Builder spawnSettings, net.minecraft.world.biome.GenerationSettings.Builder generationSettings, @Nullable MusicSound music) {
        net.minecraft.world.biome.BiomeEffects.Builder builder = (new net.minecraft.world.biome.BiomeEffects.Builder()).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(getSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(music);
        if (grassColor != null) {
            builder.grassColor(grassColor);
        }

        if (foliageColor != null) {
            builder.foliageColor(foliageColor);
        }

        return (new net.minecraft.world.biome.Biome.Builder()).precipitation(precipitation).temperature(temperature).downfall(downfall).effects(builder.build()).spawnSettings(spawnSettings.build()).generationSettings(generationSettings.build()).build();
    }

        @Override
        public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
            this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
                // Simple example:
                // Replace the Vanilla desert with our hot_red biome
                builder.replaceBiome(Biomes.MEADOW, MapleBiomeKeys.CHERRY_GROVE);

                // More complex example:
                // Replace specific parameter points for the frozen peaks with our cold_blue biome
                List<Climate.ParameterPoint> MapleCherryPoints = new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.WARM, ParameterUtils.Temperature.NEUTRAL)
                        .humidity(ParameterUtils.Humidity.HUMID, ParameterUtils.Humidity.NEUTRAL, ParameterUtils.Humidity.WET)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.COAST, ParameterUtils.Continentalness.INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_0, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE, ParameterUtils.Depth.FLOOR)
                        .build();
                MapleCherryPoints.forEach(point -> builder.replaceBiome(point, MapleBiomeKeys.CHERRY_GROVE));
            });
        }
    }
