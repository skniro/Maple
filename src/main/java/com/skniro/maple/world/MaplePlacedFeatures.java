package com.skniro.maple.world;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;



public class MaplePlacedFeatures {
    public static final RegistryEntry<PlacedFeature> Maple_TREE_PLACED;
    public static final RegistryEntry<PlacedFeature> CHERRY_TREE_PLACED;
    public static final RegistryEntry<PlacedFeature> SAKURA_TREE_PLACED;
    public static final RegistryEntry<PlacedFeature> SALT_ORE_PLACED;
    static{
        SALT_ORE_PLACED = PlacedFeatures.register("ore_salt_overworld",
                MapleConfiguredFeatures.SALT_ORE, modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(30))));
        Maple_TREE_PLACED = PlacedFeatures.register("maple_tree_placed", MapleConfiguredFeatures.Maple_TREE_SPAWN,
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1)));
        CHERRY_TREE_PLACED = PlacedFeatures.register("cherry_tree_placed", MapleConfiguredFeatures.CHERRY_TREE_SPAWN,
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1)));
        SAKURA_TREE_PLACED = PlacedFeatures.register("sakura_tree_placed", MapleConfiguredFeatures.SAKURA_TREE_SPAWN,
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1)));
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
