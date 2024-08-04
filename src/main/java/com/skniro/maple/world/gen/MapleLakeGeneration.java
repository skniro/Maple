package com.skniro.maple.world.gen;

import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.feature.MaplePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class MapleLakeGeneration {
    public static void generateHotSpringLake() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Sakura),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, MaplePlacedFeatures.LAKE_HOT_SPRING_SURFACE.getKey().get());
    }
}
