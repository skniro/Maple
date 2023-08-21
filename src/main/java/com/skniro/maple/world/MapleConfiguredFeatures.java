package com.skniro.maple.world;

import com.google.common.collect.ImmutableList;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import net.minecraft.block.Block;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;


public class MapleConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> Maple_TREE;
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> Maple_TREE_SPAWN;
    public static final RegistryEntry<PlacedFeature> Maple_TREE_CHECKED;
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_TREE;
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CHERRY_TREE_SPAWN;
    public static final RegistryEntry<PlacedFeature> CHERRY_TREE_CHECKED;
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SAKURA_TREE;
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SAKURA_TREE_SPAWN;
    public static final RegistryEntry<PlacedFeature> SAKURA_TREE_CHECKED;

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MAGE_SAKURA_TREE;
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MAGE_SAKURA_TREE_SPAWN;
    public static final RegistryEntry<PlacedFeature> MAGE_SAKURA_TREE_CHECKED;
    public static final List<OreFeatureConfig.Target> OVERWORLD_SALT_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, MapleOreBlocks.Salt_Ore.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, MapleOreBlocks.DEEPSLATE_Salt_Ore.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SALT_ORE;


    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static TreeFeatureConfig.Builder maple() {
        return MapleConfiguredFeatures.builder(MapleBlocks.MAPLE_LOG, MapleBlocks.MAPLE_LEAVES, 5, 6, 3, 2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder cherry() {
        return MapleConfiguredFeatures.builder(MapleBlocks.CHERRY_LOG, MapleBlocks.CHERRY_LEAVES,5,5,3,2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder sakura() {
        return MapleConfiguredFeatures.builder(MapleBlocks.CHERRY_LOG, MapleBlocks.SAKURA_LEAVES,4,2,0,2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder sakura2() {
        return (new TreeFeatureConfig.Builder(BlockStateProvider.of(MapleBlocks.CHERRY_LOG), new LargeOakTrunkPlacer(8, 20, 0), BlockStateProvider.of(MapleBlocks.SAKURA_LEAVES), new LargeOakFoliagePlacer(ConstantIntProvider.create(2),ConstantIntProvider.create(3), 3), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(1)))).ignoreVines();
    }

    static{
        SALT_ORE = ConfiguredFeatures.register("salt_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SALT_ORES, 9));
        Maple_TREE = ConfiguredFeatures.register("maple_tree", Feature.TREE, MapleConfiguredFeatures.maple().build());
        Maple_TREE_CHECKED = PlacedFeatures.register("maple_tree_checked", MapleConfiguredFeatures.Maple_TREE,
                List.of(PlacedFeatures.wouldSurvive(MapleBlocks.MAPLE_SAPLING)));
        Maple_TREE_SPAWN = ConfiguredFeatures.register("maple_tree_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(Maple_TREE_CHECKED,
                        0.00000005f)), Maple_TREE_CHECKED));

        CHERRY_TREE = ConfiguredFeatures.register(
                "cherry_tree", Feature.TREE, MapleConfiguredFeatures.cherry().build());
        CHERRY_TREE_CHECKED = PlacedFeatures.register("cherry_tree_checked", MapleConfiguredFeatures.CHERRY_TREE,
                List.of(PlacedFeatures.wouldSurvive(MapleBlocks.CHERRY_SAPLING)));
        CHERRY_TREE_SPAWN = ConfiguredFeatures.register("cherry_tree_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_TREE_CHECKED,
                        0.00000001f)), CHERRY_TREE_CHECKED));

        SAKURA_TREE = ConfiguredFeatures.register(
                "sakura_tree", Feature.TREE, MapleConfiguredFeatures.sakura().build());
        SAKURA_TREE_CHECKED = PlacedFeatures.register("sakura_tree_checked", MapleConfiguredFeatures.SAKURA_TREE,
                List.of(PlacedFeatures.wouldSurvive(MapleBlocks.SAKURA_SAPLING)));
        SAKURA_TREE_SPAWN = ConfiguredFeatures.register("sakura_tree_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(SAKURA_TREE_CHECKED,
                        0.00000001f)), SAKURA_TREE_CHECKED));

        MAGE_SAKURA_TREE = ConfiguredFeatures.register(
                "mage_sakura_tree", Feature.TREE, MapleConfiguredFeatures.sakura2().build());
        MAGE_SAKURA_TREE_CHECKED = PlacedFeatures.register("mage_sakura_tree_checked", MapleConfiguredFeatures.MAGE_SAKURA_TREE,
                List.of(PlacedFeatures.wouldSurvive(MapleBlocks.SAKURA_SAPLING)));
        MAGE_SAKURA_TREE_SPAWN = ConfiguredFeatures.register("mage_sakura_tree_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(MAGE_SAKURA_TREE_CHECKED,
                        0.00000001f)), MAGE_SAKURA_TREE_CHECKED));
    }
    public static void registerConfiguredFeatures() {
        Maple.LOGGER.debug("Registering the ModConfiguredFeatures for " + Maple.MOD_ID);
    }

}
