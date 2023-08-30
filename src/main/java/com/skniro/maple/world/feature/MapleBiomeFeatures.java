package com.skniro.maple.world.feature;

import com.skniro.maple.Maple;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class MapleBiomeFeatures {
    public static void addMapleGroveFeatures(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.Maple_TREE_PLACED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.Red_Maple_TREE_PLACED);
    }

    public static void addSakuraFeatures(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.SAKURA_TREE_PLACED);
    }

    public static void registerBiomesFeatures() {
        Maple.LOGGER.debug("Registering the ModBiomesFeatures for " + Maple.MOD_ID);
    }
}
