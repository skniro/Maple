package com.skniro.maple.world.gen;

import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.feature.MaplePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class MapleTreeGeneration {

    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Sakura),
                GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.Sakura_carpet_PLACED_KEY.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Maple_Grove),
                GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.Maple_carpet_PLACED_KEY.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Maple_Grove),
                GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.Red_Maple_carpet_PLACED_KEY.getKey().get());
    }
}
