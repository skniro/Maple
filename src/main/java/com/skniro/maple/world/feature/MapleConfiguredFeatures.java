package com.skniro.maple.world.feature;

import com.google.common.base.Suppliers;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

import static com.skniro.maple.world.feature.MaplePlacedFeatures.GINKGO_TREE_CHECKED;
import static com.skniro.maple.world.feature.MaplePlacedFeatures.Red_Maple_TREE_CHECKED;


public class MapleConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Maple.MODID);

    public static final RegistryObject<ConfiguredFeature<?, ?>> Maple_TREE;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Maple_TREE_SPAWN;

    public static final RegistryObject<ConfiguredFeature<?, ?>> CHERRY_TREE;
    public static final RegistryObject<ConfiguredFeature<?, ?>> CHERRY_TREE_SPAWN;

    public static final RegistryObject<ConfiguredFeature<?, ?>> SAKURA_TREE;
    public static final RegistryObject<ConfiguredFeature<?, ?>> SAKURA_TREE_SPAWN;

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SALT_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, MapleOreBlocks.Salt_Ore.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, MapleOreBlocks.DEEPSLATE_Salt_Ore.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SALT_ORE;

    public static final Supplier<List<OreConfiguration.TargetBlockState>> Nether_Coal_ORES_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, MapleOreBlocks.Nether_Coal_Ore.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> Nether_Copper_ORES_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, MapleOreBlocks.Nether_Copper_Ore.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> Nether_Diamond_ORES_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, MapleOreBlocks.Nether_Diamond_Ore.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> Nether_Emerald_ORES_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, MapleOreBlocks.Nether_Emerald_Ore.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> Nether_Gold_ORES_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, MapleOreBlocks.Nether_Gold_Ore.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> Nether_Iron_ORES_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, MapleOreBlocks.Nether_Iron_Ore.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> Nether_Lapis_ORES_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, MapleOreBlocks.Nether_Lapis_Ore.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> Nether_Redstone_ORES_LIST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, MapleOreBlocks.Nether_Redstone_Ore.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> Nether_Coal_ORE_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Nether_Copper_ORE_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Nether_Diamond_ORE_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Nether_Emerald_ORE_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Nether_Gold_ORE_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Nether_Iron_ORE_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Nether_Lapis_ORE_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Nether_Redstone_ORE_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> LAKE_HOT_SPRING;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Sakura_Carpet_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Maple_Carpet_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Red_Maple_Carpet_KEY;
    public static final RegistryObject<ConfiguredFeature<?, ?>> GINKGO_TREE;
    public static final RegistryObject<ConfiguredFeature<?, ?>> GINKGO_TREE_SPAWN;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Red_Maple_TREE;
    public static final RegistryObject<ConfiguredFeature<?, ?>> Red_Maple_TREE_SPAWN;



    private static TreeConfiguration.TreeConfigurationBuilder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple((log)), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.simple(leaves), new BlobFoliagePlacer(ConstantInt.of(radius), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static TreeConfiguration.TreeConfigurationBuilder maple() {
        return MapleConfiguredFeatures.builder(MapleBlocks.MAPLE_LOG.get(), MapleBlocks.MAPLE_LEAVES.get(), 5, 6, 3, 2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder cherry() {
        return MapleConfiguredFeatures.builder(MapleBlocks.CHERRY_LOG.get(), MapleBlocks.CHERRY_LEAVES.get(),5,5,3,2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder sakura() {
        return MapleConfiguredFeatures.builder(MapleBlocks.CHERRY_LOG.get(), MapleBlocks.SAKURA_LEAVES.get(),4,2,0,2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder ginkgo() {
        return MapleConfiguredFeatures.builder(MapleBlocks.GINKGO_LOG.get(), MapleBlocks.GINKGO_LEAVES.get(),5,2,0,2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder redmaple() {
        return MapleConfiguredFeatures.builder(MapleBlocks.MAPLE_LOG.get(), MapleBlocks.RED_MAPLE_LEAVES.get(), 4, 3, 0, 2).ignoreVines();
    }

    static{
        SALT_ORE = CONFIGURED_FEATURES.register("salt_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SALT_ORES.get(), 9)));
        Maple_TREE = CONFIGURED_FEATURES.register("maple_tree",
                () -> new ConfiguredFeature<>(Feature.TREE, MapleConfiguredFeatures.maple().build()));
        Maple_TREE_SPAWN = CONFIGURED_FEATURES.register("maple_tree_spawn",
                () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MaplePlacedFeatures.Maple_TREE_CHECKED.getHolder().get(), 0.05f)), MaplePlacedFeatures.Maple_TREE_CHECKED.getHolder().get())));

        CHERRY_TREE = CONFIGURED_FEATURES.register("cherry_tree",
                () -> new ConfiguredFeature<>(Feature.TREE, MapleConfiguredFeatures.cherry().build()));
        CHERRY_TREE_SPAWN = CONFIGURED_FEATURES.register("cherry_tree_spawn",
                () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MaplePlacedFeatures.CHERRY_TREE_CHECKED.getHolder().get(), 0.00000001f)), MaplePlacedFeatures.CHERRY_TREE_CHECKED.getHolder().get())));

        SAKURA_TREE = CONFIGURED_FEATURES.register("sakura_tree",
                () -> new ConfiguredFeature<>(Feature.TREE, MapleConfiguredFeatures.sakura().build()));
        SAKURA_TREE_SPAWN = CONFIGURED_FEATURES.register("sakura_tree_spawn",
                () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MaplePlacedFeatures.SAKURA_TREE_CHECKED.getHolder().get(),
                        0.00000001f)), MaplePlacedFeatures.SAKURA_TREE_CHECKED.getHolder().get())));

        GINKGO_TREE = CONFIGURED_FEATURES.register("ginkgo_tree",
                () -> new ConfiguredFeature<>(Feature.TREE, MapleConfiguredFeatures.ginkgo().build()));

        GINKGO_TREE_SPAWN = CONFIGURED_FEATURES.register("ginkgo_tree_spawn",
                () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(GINKGO_TREE_CHECKED.getHolder().get(),
                        0.00000001f)), GINKGO_TREE_CHECKED.getHolder().get())));

        Red_Maple_TREE = CONFIGURED_FEATURES.register("red_maple_tree",
                () -> new ConfiguredFeature<>(Feature.TREE, MapleConfiguredFeatures.redmaple().build()));

        Red_Maple_TREE_SPAWN = CONFIGURED_FEATURES.register("red_maple_tree_spawn",
                () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(Red_Maple_TREE_CHECKED.getHolder().get(),
                        0.00000001f)), Red_Maple_TREE_CHECKED.getHolder().get())));

        Nether_Coal_ORE_KEY = CONFIGURED_FEATURES.register("coal_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Nether_Coal_ORES_LIST.get(), 10)));
        Nether_Copper_ORE_KEY = CONFIGURED_FEATURES.register("copper_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Nether_Copper_ORES_LIST.get(), 8)));
        Nether_Diamond_ORE_KEY = CONFIGURED_FEATURES.register("diamond_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Nether_Diamond_ORES_LIST.get(), 8)));
        Nether_Emerald_ORE_KEY = CONFIGURED_FEATURES.register("emerald_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Nether_Emerald_ORES_LIST.get(), 3)));
        Nether_Gold_ORE_KEY = CONFIGURED_FEATURES.register("gold_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Nether_Gold_ORES_LIST.get(), 8)));
        Nether_Iron_ORE_KEY = CONFIGURED_FEATURES.register("iron_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Nether_Iron_ORES_LIST.get(), 8)));
        Nether_Lapis_ORE_KEY = CONFIGURED_FEATURES.register("lapis_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Nether_Lapis_ORES_LIST.get(), 8)));
        Nether_Redstone_ORE_KEY = CONFIGURED_FEATURES.register("redstone_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(Nether_Redstone_ORES_LIST.get(), 8)));

        //Leave carpet
        Red_Maple_Carpet_KEY = CONFIGURED_FEATURES.register("red_maple_carpet",
                () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(30, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(MapleBlocks.RED_MAPLE_CARPET.get().defaultBlockState()))))));
        Maple_Carpet_KEY = CONFIGURED_FEATURES.register("maple_carpet",
                () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(30, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(MapleBlocks.Maple_CARPET.get().defaultBlockState()))))));
        Sakura_Carpet_KEY = CONFIGURED_FEATURES.register("sakura_carpet",
                () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(30, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(MapleBlocks.SAKURA_CARPET.get().defaultBlockState()))))));

        //Lake
        LAKE_HOT_SPRING = CONFIGURED_FEATURES.register("lake_hot_spring",
                () -> new ConfiguredFeature<>(Feature.LAKE, new LakeFeature.Configuration(BlockStateProvider.simple(MapleFluidBlockOrItem.Hot_Spring_BLOCK.get()), BlockStateProvider.simple(Blocks.GRASS_BLOCK.defaultBlockState()))));



    }

    public static void registerModConfiguredFeatures(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

}
