package com.skniro.maple.world.feature;

import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class MapleBiomeFeatures {
    public static void addMapleGroveFeatures(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.Maple_TREE_PLACED);
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.Red_Maple_TREE_PLACED);
    }

    public static void addSakuraFeatures(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.SAKURA_TREE_PLACED);
    }
}
