package com.skniro.maple.world.feature;

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
    public static final RegistryEntry<PlacedFeature> MAGE_SAKURA_TREE_PLACED;
    public static final RegistryEntry<PlacedFeature> SALT_ORE_PLACED;
    public static final RegistryEntry<PlacedFeature> Red_Maple_TREE_PLACED;
    public static final RegistryEntry<PlacedFeature> LAKE_HOT_SPRING_SURFACE;
    public static final RegistryEntry<PlacedFeature> Coal_ORE_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Nether_Copper_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Nether_Diamond_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Nether_Emerald_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Nether_Gold_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Nether_Iron_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Nether_Lapis_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Nether_Redstone_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Sakura_carpet_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Maple_carpet_PLACED_KEY;
    public static final RegistryEntry<PlacedFeature> Red_Maple_carpet_PLACED_KEY;

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
        MAGE_SAKURA_TREE_PLACED = PlacedFeatures.register("mage_sakura_tree_placed", MapleConfiguredFeatures.MAGE_SAKURA_TREE_SPAWN,
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1)));

        Red_Maple_TREE_PLACED = PlacedFeatures.register("red_maple_tree_placed", MapleConfiguredFeatures.Red_Maple_TREE_SPAWN,
                VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(3, 0.1f, 1)));

        LAKE_HOT_SPRING_SURFACE= PlacedFeatures.register("lake_hot_spring_surface", MapleConfiguredFeatures.LAKE_HOT_SPRING,
                RarityFilterPlacementModifier.of(100), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);

        Coal_ORE_PLACED_KEY = PlacedFeatures.register("coal_ore_placed", MapleConfiguredFeatures.Nether_Coal_ORE_KEY,
                modifiersWithCount(40, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        Nether_Copper_PLACED_KEY = PlacedFeatures.register("copper_ore_placed", MapleConfiguredFeatures.Nether_Copper_ORE_KEY,
                modifiersWithCount(32, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        Nether_Diamond_PLACED_KEY = PlacedFeatures.register("diamond_ore_placed",MapleConfiguredFeatures.Nether_Diamond_ORE_KEY,
                modifiersWithCount(17, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        Nether_Emerald_PLACED_KEY= PlacedFeatures.register("emerald_ore_placed", MapleConfiguredFeatures.Nether_Emerald_ORE_KEY,
                modifiersWithCount(17, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        Nether_Gold_PLACED_KEY= PlacedFeatures.register("gold_ore_placed",MapleConfiguredFeatures.Nether_Gold_ORE_KEY,
                modifiersWithCount(20, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        Nether_Iron_PLACED_KEY= PlacedFeatures.register("iron_ore_placed",MapleConfiguredFeatures.Nether_Iron_ORE_KEY,
                modifiersWithCount(32, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        Nether_Lapis_PLACED_KEY= PlacedFeatures.register("lapis_ore_placed",MapleConfiguredFeatures.Nether_Lapis_ORE_KEY,
                modifiersWithCount(25, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        Nether_Redstone_PLACED_KEY= PlacedFeatures.register("redstone_ore_placed", MapleConfiguredFeatures.Nether_Redstone_ORE_KEY,
                modifiersWithCount(20, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        Sakura_carpet_PLACED_KEY= PlacedFeatures.register("sakura_carpet_placed", MapleConfiguredFeatures.Sakura_Carpet_KEY,
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

        Maple_carpet_PLACED_KEY= PlacedFeatures.register("maple_carpet_placed", MapleConfiguredFeatures.Maple_Carpet_KEY,
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

        Red_Maple_carpet_PLACED_KEY= PlacedFeatures.register("red_maple_carpet_placed",MapleConfiguredFeatures.Red_Maple_Carpet_KEY,
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

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
