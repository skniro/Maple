package com.skniro.maple.world.gen;

import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.feature.MaplePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class MapleTreeGeneration {

    public static void generateTrees() {

/*        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Sakura),
                GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.MAGE_SAKURA_TREE_PLACED);*/
/*        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Maple_Grove),
                GenerationStep.Feature.VEGETAL_DECORATION, MaplePlacedFeatures.Red_Maple_TREE_PLACED);*/
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Sakura),
                GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.Sakura_carpet_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Maple_Grove),
                GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.Maple_carpet_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MapleBiomeKeys.Maple_Grove),
                GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.Red_Maple_carpet_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.PATCH_TEA_COMMON);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_PINE_TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.PATCH_TEA_COMMON);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.OLD_GROWTH_PINE_TAIGA),
                GenerationStep.Decoration.VEGETAL_DECORATION, MaplePlacedFeatures.PATCH_TEA_RARE);
    }
}
