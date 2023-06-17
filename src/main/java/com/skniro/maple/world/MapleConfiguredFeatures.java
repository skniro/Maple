package com.skniro.maple.world;

import com.skniro.maple.Maple;
import com.skniro.maple.block.Maple_block;
import net.minecraft.block.Block;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.RegistryWorldView;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;


public class MapleConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> Maple_TREE;
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> Maple_TREE_SPAWN;
    public static final RegistryEntry<PlacedFeature> Maple_TREE_CHECKED;
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_TREE;
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CHERRY_TREE_SPAWN;
    public static final RegistryEntry<PlacedFeature> CHERRY_TREE_CHECKED;

    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static TreeFeatureConfig.Builder maple() {
        return MapleConfiguredFeatures.builder(Maple_block.MAPLE_LOG, Maple_block.MAPLE_LEAVES, 5, 6, 3, 2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder cherry() {
        return MapleConfiguredFeatures.builder(Maple_block.CHERRY_LOG,Maple_block.CHERRY_LEAVES,5,5,3,2).ignoreVines();
    }

    static{
        Maple_TREE = ConfiguredFeatures.register("maple_tree", Feature.TREE, MapleConfiguredFeatures.maple().build());
        Maple_TREE_CHECKED = PlacedFeatures.register("maple_tree_checked", MapleConfiguredFeatures.Maple_TREE,
                List.of(PlacedFeatures.wouldSurvive(Maple_block.MAPLE_SAPLING)));
        Maple_TREE_SPAWN = ConfiguredFeatures.register("maple_tree_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(Maple_TREE_CHECKED,
                        0.00000005f)), Maple_TREE_CHECKED));

        CHERRY_TREE = ConfiguredFeatures.register(
                "cherry_tree", Feature.TREE, MapleConfiguredFeatures.cherry().build());
        CHERRY_TREE_CHECKED = PlacedFeatures.register("cherry_tree_checked", MapleConfiguredFeatures.CHERRY_TREE,
                List.of(PlacedFeatures.wouldSurvive(Maple_block.CHERRY_SAPLING)));
        CHERRY_TREE_SPAWN = ConfiguredFeatures.register("cherry_tree_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_TREE_CHECKED,
                        0.00000001f)), CHERRY_TREE_CHECKED));
    }
    public static void registerConfiguredFeatures() {
        Maple.LOGGER.debug("Registering the ModConfiguredFeatures for " + Maple.MOD_ID);
    }

}
