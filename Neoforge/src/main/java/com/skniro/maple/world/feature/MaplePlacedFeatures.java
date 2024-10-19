package com.skniro.maple.world.feature;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;



public class MaplePlacedFeatures {
    public static final ResourceKey<PlacedFeature> Maple_TREE_PLACED = registerKey("maple_tree_placed");
    public static final ResourceKey<PlacedFeature> Red_Maple_TREE_PLACED = registerKey("red_maple_tree_placed");
    public static final ResourceKey<PlacedFeature> CHERRY_TREE_PLACED= registerKey("cherry_tree_placed");;
    public static final ResourceKey<PlacedFeature> SAKURA_TREE_PLACED= registerKey("sakura_tree_placed");;
    public static final ResourceKey<PlacedFeature> MAGE_SAKURA_TREE_PLACED= registerKey("mage_sakura_tree_placed");;
    public static final ResourceKey<PlacedFeature> SALT_ORE_PLACED = registerKey("ore_salt_overworld");
    public static final ResourceKey<PlacedFeature> LAKE_HOT_SPRING_SURFACE = registerKey("lake_hot_spring_surface");
    public static final ResourceKey<PlacedFeature> Coal_ORE_PLACED_KEY = registerKey("coal_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Copper_PLACED_KEY = registerKey("copper_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Diamond_PLACED_KEY = registerKey("diamond_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Emerald_PLACED_KEY = registerKey("emerald_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Gold_PLACED_KEY = registerKey("gold_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Iron_PLACED_KEY = registerKey("iron_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Lapis_PLACED_KEY = registerKey("lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Redstone_PLACED_KEY = registerKey("redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> Sakura_carpet_PLACED_KEY = registerKey("sakura_carpet_placed");
    public static final ResourceKey<PlacedFeature> Maple_carpet_PLACED_KEY = registerKey("maple_carpet_placed");
    public static final ResourceKey<PlacedFeature> Red_Maple_carpet_PLACED_KEY = registerKey("red_maple_carpet_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder<ConfiguredFeature<?, ?>> registryEntry1 = configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.LAKE_HOT_SPRING);

        register(context, SALT_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.SALT_ORE),
                modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(30))));

        register(context, Maple_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Maple_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1), MapleBlocks.MAPLE_SAPLING.get()));

        register(context, Red_Maple_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Red_Maple_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1), MapleBlocks.MAPLE_SAPLING.get()));

        register(context, CHERRY_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.CHERRY_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1), MapleBlocks.CHERRY_SAPLING.get()));

        register(context, SAKURA_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.SAKURA_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1), MapleBlocks.SAKURA_SAPLING.get()));

        register(context, MAGE_SAKURA_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.MAGE_SAKURA_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.00001f, 1), MapleBlocks.SAKURA_SAPLING.get()));

        register(context, LAKE_HOT_SPRING_SURFACE, registryEntry1, RarityFilter.onAverageOnceEvery(100), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP);
        register(context, Coal_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Nether_Coal_ORE_KEY),
                modifiersWithCount(40, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context,Nether_Copper_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Nether_Copper_KEY),
                modifiersWithCount(32, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Diamond_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Nether_Diamond_KEY),
                modifiersWithCount(17, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Emerald_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Nether_Emerald_KEY),
                modifiersWithCount(17, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Gold_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Nether_Gold_KEY),
                modifiersWithCount(20, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Iron_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures. Nether_Iron_KEY),
                modifiersWithCount(32, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Lapis_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Nether_Lapis_KEY),
                modifiersWithCount(25, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Redstone_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Nether_Redstone_ORE_KEY),
                modifiersWithCount(20, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Sakura_carpet_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Sakura_Carpet_KEY),
                NoiseThresholdCountPlacement.of(-0.8, 4, 8),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());

        register(context, Maple_carpet_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(com.skniro.maple.world.feature.MapleConfiguredFeatures.Maple_Carpet_KEY),
                NoiseThresholdCountPlacement.of(-0.8, 4, 8),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());

        register(context, Red_Maple_carpet_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MapleConfiguredFeatures.Red_Maple_Carpet_KEY),
                NoiseThresholdCountPlacement.of(-0.8, 4, 8),
                InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());

    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Maple.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                                                                          Holder<ConfiguredFeature<?, ?>> configuration,
                                                                                          PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    // Used here because the vanilla ones are private
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, InSquarePlacement.spread(), heightModifier, BiomeFilter.biome());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacement.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilter.onAverageOnceEvery(chance), heightModifier);
    }
}
