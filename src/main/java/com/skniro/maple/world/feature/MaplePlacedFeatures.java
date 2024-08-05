package com.skniro.maple.world.feature;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;



public class MaplePlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Maple.MODID);
    public static final RegistryObject<PlacedFeature> Maple_TREE_PLACED;
    public static final RegistryObject<PlacedFeature> CHERRY_TREE_PLACED;
    public static final RegistryObject<PlacedFeature> SAKURA_TREE_PLACED;
    public static final RegistryObject<PlacedFeature> Maple_TREE_CHECKED;
    public static final RegistryObject<PlacedFeature> CHERRY_TREE_CHECKED;
    public static final RegistryObject<PlacedFeature> SAKURA_TREE_CHECKED;
    public static final RegistryObject<PlacedFeature> Red_Maple_TREE_CHECKED;
    public static final RegistryObject<PlacedFeature> GINKGO_TREE_CHECKED;
    public static final RegistryObject<PlacedFeature> Red_Maple_TREE_PLACED;
    public static final RegistryObject<PlacedFeature> LAKE_HOT_SPRING_SURFACE;
    public static final RegistryObject<PlacedFeature> Coal_ORE_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Nether_Copper_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Nether_Diamond_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Nether_Emerald_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Nether_Gold_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Nether_Iron_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Nether_Lapis_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Nether_Redstone_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Sakura_carpet_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Maple_carpet_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> Red_Maple_carpet_PLACED_KEY;
    public static final RegistryObject<PlacedFeature> SALT_ORE_PLACED;

    static{
        SALT_ORE_PLACED = PLACED_FEATURES.register("ore_salt_overworld",
                () -> new PlacedFeature(MapleConfiguredFeatures.SALT_ORE.getHolder().get(), commonOrePlacement(5,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(30)))));
        Maple_TREE_PLACED = PLACED_FEATURES.register("maple_tree_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Maple_TREE_SPAWN.getHolder().get(),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1))));
        CHERRY_TREE_PLACED = PLACED_FEATURES.register("cherry_tree_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.CHERRY_TREE_SPAWN.getHolder().get(),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1))));
        SAKURA_TREE_PLACED = PLACED_FEATURES.register("sakura_tree_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.SAKURA_TREE_SPAWN.getHolder().get(),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1))));

        GINKGO_TREE_CHECKED = PLACED_FEATURES.register("ginkgo_tree_checked",
                () -> new PlacedFeature(MapleConfiguredFeatures.GINKGO_TREE.getHolder().get(),
                        List.of(PlacementUtils.filteredByBlockSurvival(MapleBlocks.GINKGO_SAPLING.get()))));
        Red_Maple_TREE_CHECKED = PLACED_FEATURES.register("red_maple_tree_checked",
                () -> new PlacedFeature(MapleConfiguredFeatures.Red_Maple_TREE.getHolder().get(),
                List.of(PlacementUtils.filteredByBlockSurvival(MapleBlocks.RED_MAPLE_SAPLING.get()))));
        Maple_TREE_CHECKED = PLACED_FEATURES.register("maple_tree_checked",
                () -> new PlacedFeature(MapleConfiguredFeatures.Maple_TREE.getHolder().get(),
                List.of(PlacementUtils.filteredByBlockSurvival(MapleBlocks.MAPLE_SAPLING.get()))));
        CHERRY_TREE_CHECKED = PLACED_FEATURES.register("cherry_tree_checked",
                () -> new PlacedFeature(MapleConfiguredFeatures.CHERRY_TREE.getHolder().get(),
                List.of(PlacementUtils.filteredByBlockSurvival(MapleBlocks.CHERRY_SAPLING.get()))));
        SAKURA_TREE_CHECKED = PLACED_FEATURES.register("sakura_tree_checked",
                () -> new PlacedFeature(MapleConfiguredFeatures.SAKURA_TREE.getHolder().get(),
                List.of(PlacementUtils.filteredByBlockSurvival(MapleBlocks.SAKURA_SAPLING.get()))));

        Red_Maple_TREE_PLACED = PLACED_FEATURES.register("red_maple_tree_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Red_Maple_TREE_SPAWN.getHolder().get(),
                        VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1))));

        LAKE_HOT_SPRING_SURFACE= PLACED_FEATURES.register("lake_hot_spring_surface",
                () -> new PlacedFeature(MapleConfiguredFeatures.LAKE_HOT_SPRING.getHolder().get(),
                RarityFilterPlacementModifier.of(100), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP));

        Coal_ORE_PLACED_KEY = PLACED_FEATURES.register("coal_ore_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Nether_Coal_ORE_KEY.getHolder().get(),
                commonOrePlacement(40, // Veins per Chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))));

        Nether_Copper_PLACED_KEY = PLACED_FEATURES.register("copper_ore_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Nether_Copper_ORE_KEY.getHolder().get(),
                commonOrePlacement(32, // Veins per Chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))));

        Nether_Diamond_PLACED_KEY = PLACED_FEATURES.register("diamond_ore_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Nether_Diamond_ORE_KEY.getHolder().get(),
                commonOrePlacement(17, // Veins per Chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))));

        Nether_Emerald_PLACED_KEY= PLACED_FEATURES.register("emerald_ore_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Nether_Emerald_ORE_KEY.getHolder().get(),
                commonOrePlacement(17, // Veins per Chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))));

        Nether_Gold_PLACED_KEY= PLACED_FEATURES.register("gold_ore_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Nether_Gold_ORE_KEY.getHolder().get(),
                commonOrePlacement(20, // Veins per Chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))));

        Nether_Iron_PLACED_KEY= PLACED_FEATURES.register("iron_ore_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Nether_Iron_ORE_KEY.getHolder().get(),
                commonOrePlacement(32, // Veins per Chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))));

        Nether_Lapis_PLACED_KEY= PLACED_FEATURES.register("lapis_ore_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Nether_Lapis_ORE_KEY.getHolder().get(),
                commonOrePlacement(25, // Veins per Chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))));

        Nether_Redstone_PLACED_KEY= PLACED_FEATURES.register("redstone_ore_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Nether_Redstone_ORE_KEY.getHolder().get(),
                commonOrePlacement(20, // Veins per Chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(256)))));

        Sakura_carpet_PLACED_KEY= PLACED_FEATURES.register("sakura_carpet_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Sakura_Carpet_KEY.getHolder().get(),
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

        Maple_carpet_PLACED_KEY= PLACED_FEATURES.register("maple_carpet_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Maple_Carpet_KEY,
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

        Red_Maple_carpet_PLACED_KEY= PLACED_FEATURES.register("red_maple_carpet_placed",
                () -> new PlacedFeature(MapleConfiguredFeatures.Red_Maple_Carpet_KEY,
                NoiseThresholdCountPlacementModifier.of(-0.8, 4, 8),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }
    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }
    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
    public static void registerMaplePlacedFeatures(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
