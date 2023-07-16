package com.skniro.maple.world;

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

        Maple_TREE_CHECKED = PLACED_FEATURES.register("maple_tree_checked",
                () -> new PlacedFeature(MapleConfiguredFeatures.Maple_TREE.getHolder().get(),
                List.of(PlacementUtils.filteredByBlockSurvival(MapleBlocks.MAPLE_SAPLING.get()))));
        CHERRY_TREE_CHECKED = PLACED_FEATURES.register("cherry_tree_checked",
                () -> new PlacedFeature(MapleConfiguredFeatures.CHERRY_TREE.getHolder().get(),
                List.of(PlacementUtils.filteredByBlockSurvival(MapleBlocks.CHERRY_SAPLING.get()))));
        SAKURA_TREE_CHECKED = PLACED_FEATURES.register("sakura_tree_checked",
                () -> new PlacedFeature(MapleConfiguredFeatures.SAKURA_TREE.getHolder().get(),
                List.of(PlacementUtils.filteredByBlockSurvival(MapleBlocks.SAKURA_SAPLING.get()))));
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
