package com.skniro.maple.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.sound.MusicType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.jetbrains.annotations.Nullable;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.List;
import java.util.function.Consumer;


public class MapleOverworldBiomes extends Region {
    public MapleOverworldBiomes(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    public static Biome createCherryGrove() {
        net.minecraft.world.biome.GenerationSettings.Builder builder = new net.minecraft.world.biome.GenerationSettings.Builder();
        SpawnSettings.Builder builder2 = new SpawnSettings.Builder();
        builder2.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 1, 1, 2)).spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 2, 6)).spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.SHEEP, 2, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder2);
        addBasicFeatures(builder);
        DefaultBiomeFeatures.addPlainsTallGrass(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        DefaultBiomeFeatures.addMeadowFlowers(builder);
        DefaultBiomeFeatures.addEmeraldOre(builder);
        DefaultBiomeFeatures.addInfestedStone(builder);
        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_MEADOW);
        return createBiome(Biome.Precipitation.RAIN, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, builder2, builder, musicSound);
    }

    private static void addBasicFeatures(net.minecraft.world.biome.GenerationSettings.Builder generationSettings) {
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


    private static Biome createBiome(Biome.Precipitation precipitation, float temperature, float downfall, SpawnSettings.Builder spawnSettings, net.minecraft.world.biome.GenerationSettings.Builder generationSettings, @Nullable MusicSound music) {
        return createBiome(precipitation, temperature, downfall, 4159204, 329011, (Integer) null, (Integer) null, spawnSettings, generationSettings, music);
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
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            // Simple example:
            // Replace the Vanilla desert with our hot_red biome
            builder.replaceBiome(BiomeKeys.MEADOW, MapleBiomeKeys.CHERRY_GROVE);

            // More complex example:
            // Replace specific parameter points for the frozen peaks with our cold_blue biome
            List<MultiNoiseUtil.NoiseHypercube> MapleCherryPoints = new ParameterUtils.ParameterPointListBuilder()
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
