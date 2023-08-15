package com.skniro.maple.world.gen;

import com.skniro.maple.world.MaplePlacedFeatures;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class MapleTreeGeneration {

    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.Maple_TREE_PLACED);

    }
}
