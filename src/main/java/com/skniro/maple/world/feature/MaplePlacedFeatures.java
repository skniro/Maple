package com.skniro.maple.world.feature;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;



public class MaplePlacedFeatures {
    public static final RegistryKey<PlacedFeature> Maple_TREE_PLACED = registerKey("maple_tree_placed");
    public static final RegistryKey<PlacedFeature> Red_Maple_TREE_PLACED = registerKey("red_maple_tree_placed");
    public static final RegistryKey<PlacedFeature> CHERRY_TREE_PLACED= registerKey("cherry_tree_placed");;
    public static final RegistryKey<PlacedFeature> SAKURA_TREE_PLACED= registerKey("sakura_tree_placed");;
    public static final RegistryKey<PlacedFeature> MAGE_SAKURA_TREE_PLACED= registerKey("mage_sakura_tree_placed");;
    public static final RegistryKey<PlacedFeature> SALT_ORE_PLACED = registerKey("ore_salt_overworld");
    public static final RegistryKey<PlacedFeature> LAKE_HOT_SPRING_SURFACE = registerKey("lake_hot_spring_surface");
    public static final RegistryKey<PlacedFeature> Coal_ORE_PLACED_KEY = registerKey("coal_ore_placed");
    public static final RegistryKey<PlacedFeature> Nether_Copper_PLACED_KEY = registerKey("copper_ore_placed");
    public static final RegistryKey<PlacedFeature> Nether_Diamond_PLACED_KEY = registerKey("diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> Nether_Emerald_PLACED_KEY = registerKey("emerald_ore_placed");
    public static final RegistryKey<PlacedFeature> Nether_Gold_PLACED_KEY = registerKey("gold_ore_placed");
    public static final RegistryKey<PlacedFeature> Nether_Iron_PLACED_KEY = registerKey("iron_ore_placed");
    public static final RegistryKey<PlacedFeature> Nether_Lapis_PLACED_KEY = registerKey("lapis_ore_placed");
    public static final RegistryKey<PlacedFeature> Nether_Redstone_PLACED_KEY = registerKey("redstone_ore_placed");
    public static final RegistryKey<PlacedFeature> Sakura_carpet_PLACED_KEY = registerKey("sakura_carpet_placed");
    public static final RegistryKey<PlacedFeature> Maple_carpet_PLACED_KEY = registerKey("maple_carpet_placed");
    public static final RegistryKey<PlacedFeature> Red_Maple_carpet_PLACED_KEY = registerKey("red_maple_carpet_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry1 = configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.LAKE_HOT_SPRING);

        register(context, SALT_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.SALT_ORE),
                modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(30))));

        register(context, Maple_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Maple_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(3, 0.1f, 1), MapleBlocks.MAPLE_SAPLING));

        register(context, Red_Maple_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Red_Maple_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(3, 0.1f, 1), MapleBlocks.MAPLE_SAPLING));

        register(context, CHERRY_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.CHERRY_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleBlocks.CHERRY_SAPLING));

        register(context, SAKURA_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.SAKURA_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), MapleBlocks.SAKURA_SAPLING));

        register(context, MAGE_SAKURA_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.MAGE_SAKURA_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.00001f, 1), MapleBlocks.SAKURA_SAPLING));

        register(context, LAKE_HOT_SPRING_SURFACE, registryEntry1, RarityFilterPlacementModifier.of(100), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP);
        register(context, Coal_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Nether_Coal_ORE_KEY),
                modifiersWithCount(40, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        register(context,Nether_Copper_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Nether_Copper_KEY),
                modifiersWithCount(32, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        register(context, Nether_Diamond_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Nether_Diamond_KEY),
                modifiersWithCount(17, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        register(context, Nether_Emerald_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Nether_Emerald_KEY),
                modifiersWithCount(17, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        register(context, Nether_Gold_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Nether_Gold_KEY),
                modifiersWithCount(20, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        register(context, Nether_Iron_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures. Nether_Iron_KEY),
                modifiersWithCount(32, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        register(context, Nether_Lapis_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Nether_Lapis_KEY),
                modifiersWithCount(25, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        register(context, Nether_Redstone_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Nether_Redstone_ORE_KEY),
                modifiersWithCount(20, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(256))));

        register(context, Sakura_carpet_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Sakura_Carpet_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, Maple_carpet_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Maple_Carpet_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, Red_Maple_carpet_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Red_Maple_Carpet_KEY),
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Maple.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    // Used here because the vanilla ones are private
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

    public static void registerPlacedFeatures() {
        Maple.LOGGER.debug("Registering the ModPlacedFeatures for " + Maple.MOD_ID);
    }
}
