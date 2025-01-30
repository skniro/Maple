package com.skniro.maple.world.feature;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.init.MapleTeaBlock;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.CherryTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import java.util.List;
import java.util.OptionalInt;


public class MapleConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> Maple_TREE =registerKey("maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Red_Maple_TREE =registerKey("red_maple_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHERRY_TREE = registerKey("cherry_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAKURA_TREE = registerKey("sakura_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGE_SAKURA_TREE = registerKey("mage_sakura_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GINKGO_TREE = registerKey("ginkgo_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SALT_ORE = registerKey("salt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAKE_HOT_SPRING = registerKey("lake_hot_spring");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Coal_ORE_KEY = registerKey("coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Copper_KEY = registerKey("copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Diamond_KEY = registerKey("diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Emerald_KEY = registerKey("emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Gold_KEY = registerKey("gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Iron_KEY = registerKey("iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Lapis_KEY = registerKey("lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Redstone_ORE_KEY = registerKey("redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Sakura_Carpet_KEY = registerKey("sakura_carpet");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Maple_Carpet_KEY = registerKey("maple_carpet");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Red_Maple_Carpet_KEY = registerKey("red_maple_carpet");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_TEA = registerKey("patch_tea");

    private static TreeConfiguration.TreeConfigurationBuilder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.simple(leaves), new BlobFoliagePlacer(ConstantInt.of(radius), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static TreeConfiguration.TreeConfigurationBuilder maple() {
        return MapleConfiguredFeatures.builder(MapleBlocks.MAPLE_LOG, MapleBlocks.MAPLE_LEAVES, 4, 2, 0, 2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder redmaple() {
        return MapleConfiguredFeatures.builder(MapleBlocks.MAPLE_LOG, MapleBlocks.RED_MAPLE_LEAVES, 4, 3, 0, 2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder cherry() {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.CHERRY_LOG), new CherryTrunkPlacer(7, 1, 0, new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1).add(ConstantInt.of(2), 1).add(ConstantInt.of(3), 1).build()), UniformInt.of(2, 4), UniformInt.of(-4, -3), UniformInt.of(-1, 0)), BlockStateProvider.simple(Blocks.CHERRY_LEAVES), new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25f, 0.5f, 0.16666667f, 0.33333334f), new TwoLayersFeatureSize(1, 0, 2)).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder sakura() {
        return MapleConfiguredFeatures.builder(Blocks.CHERRY_LOG, MapleBlocks.SAKURA_LEAVES,4,2,0,2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder sakura2() {
        return (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.CHERRY_LOG), new FancyTrunkPlacer(8, 20, 0), BlockStateProvider.simple(MapleBlocks.SAKURA_LEAVES), new FancyFoliagePlacer(ConstantInt.of(2),ConstantInt.of(3), 3), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(1)))).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder ginkgo() {
        return MapleConfiguredFeatures.builder(MapleBlocks.GINKGO_LOG, MapleBlocks.GINKGO_LEAVES,5,2,0,2).ignoreVines();
    }
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherstoneReplaceables = new BlockMatchTest(Blocks.NETHERRACK);

        List<OreConfiguration.TargetBlockState> overworldSaltOres =
                List.of(OreConfiguration.target(stoneReplaceables, MapleOreBlocks.Salt_Ore.defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, MapleOreBlocks.DEEPSLATE_Salt_Ore.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherCoalOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Coal_Ore.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherCopperOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Copper_Ore.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherDiamondOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Diamond_Ore.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherEmeraldOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Emerald_Ore.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherGoldOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Gold_Ore.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherIronOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Iron_Ore.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherLapisOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Lapis_Ore.defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherRedstoneOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Redstone_Ore.defaultBlockState()));

        //Lake
        register(featureRegisterable, LAKE_HOT_SPRING , Feature.LAKE, new LakeFeature.Configuration(BlockStateProvider.simple(MapleFluidBlockOrItem.Hot_Spring_BLOCK.defaultBlockState()), BlockStateProvider.simple(Blocks.GRASS_BLOCK.defaultBlockState())));

        //Tree
        register(featureRegisterable, Red_Maple_TREE, Feature.TREE,
                MapleConfiguredFeatures.redmaple().build());
        register(featureRegisterable, Maple_TREE, Feature.TREE,
                MapleConfiguredFeatures.maple().build());
        register(featureRegisterable, CHERRY_TREE, Feature.TREE,
                MapleConfiguredFeatures.cherry().build());
        register(featureRegisterable, SAKURA_TREE, Feature.TREE,
                MapleConfiguredFeatures.sakura().build());
        register(featureRegisterable, MAGE_SAKURA_TREE, Feature.TREE,
                MapleConfiguredFeatures.sakura2().build());
        register(featureRegisterable, GINKGO_TREE, Feature.TREE,
                MapleConfiguredFeatures.ginkgo().build());

        //Ores
        register(featureRegisterable, SALT_ORE , Feature.ORE, new OreConfiguration(overworldSaltOres, 12));


        register(featureRegisterable, Nether_Coal_ORE_KEY, Feature.ORE, new OreConfiguration(netherCoalOres, 10));
        register(featureRegisterable, Nether_Copper_KEY, Feature.ORE, new OreConfiguration(netherCopperOres, 8));
        register(featureRegisterable, Nether_Diamond_KEY, Feature.ORE, new OreConfiguration(netherDiamondOres, 8));
        register(featureRegisterable, Nether_Emerald_KEY, Feature.ORE, new OreConfiguration(netherEmeraldOres, 3));
        register(featureRegisterable, Nether_Gold_KEY, Feature.ORE, new OreConfiguration(netherGoldOres, 8));
        register(featureRegisterable, Nether_Iron_KEY, Feature.ORE, new OreConfiguration(netherIronOres, 8));
        register(featureRegisterable, Nether_Lapis_KEY, Feature.ORE, new OreConfiguration(netherLapisOres, 8));
        register(featureRegisterable, Nether_Redstone_ORE_KEY, Feature.ORE, new OreConfiguration(netherRedstoneOres, 8));

        //Leave carpet
        register(featureRegisterable, Red_Maple_Carpet_KEY, Feature.FLOWER, new RandomPatchConfiguration(30, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(MapleBlocks.RED_MAPLE_CARPET.defaultBlockState())))));
        register(featureRegisterable, Maple_Carpet_KEY, Feature.FLOWER, new RandomPatchConfiguration(30, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(MapleBlocks.Maple_CARPET.defaultBlockState())))));
        register(featureRegisterable, Sakura_Carpet_KEY, Feature.FLOWER, new RandomPatchConfiguration(30, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(MapleBlocks.SAKURA_CARPET.defaultBlockState())))));

        FeatureUtils.register(featureRegisterable, PATCH_TEA, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(MapleBlocks.Tea_Block.defaultBlockState().setValue(MapleTeaBlock.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                   ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static void registerConfiguredFeatures() {
        Maple.LOGGER.debug("Registering the ModConfiguredFeatures for " + Maple.MOD_ID);
    }

}
