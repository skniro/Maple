package com.skniro.maple.world;

import com.google.common.base.Suppliers;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;


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
    }

    public static void registerModConfiguredFeatures(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

}
