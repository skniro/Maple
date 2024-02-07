package com.skniro.maple.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.List;
import java.util.function.Consumer;

public class MapleOverworldBiomes extends Region {
        public MapleOverworldBiomes(ResourceLocation name, int weight) {
            super(name, RegionType.OVERWORLD, weight);
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
