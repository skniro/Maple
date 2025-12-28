package com.skniro.maple.world.feature;

import com.skniro.maple.Maple;
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

    public static void addTeaSnowy(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.PATCH_TEA_RARE);
    }

    public static void addTea(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.PATCH_TEA_COMMON);
    }

    public static void registerBiomesFeatures() {
        Maple.LOGGER.debug("Registering the ModBiomesFeatures for " + Maple.MOD_ID);
    }
}
