package com.skniro.maple.world.feature;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;


public class MapleConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> Maple_TREE =registerKey("maple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Red_Maple_TREE =registerKey("red_maple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHERRY_TREE = registerKey("cherry_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAKURA_TREE = registerKey("sakura_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGE_SAKURA_TREE = registerKey("mage_sakura_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GINKGO_TREE = registerKey("ginkgo_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SALT_ORE = registerKey("salt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAKE_HOT_SPRING = registerKey("lake_hot_spring");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Coal_ORE_KEY = registerKey("coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Copper_KEY = registerKey("copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Diamond_KEY = registerKey("diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Emerald_KEY = registerKey("emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Gold_KEY = registerKey("gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Iron_KEY = registerKey("iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Lapis_KEY = registerKey("lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Redstone_ORE_KEY = registerKey("redstone_ore");

    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static TreeFeatureConfig.Builder maple() {
        return MapleConfiguredFeatures.builder(MapleBlocks.MAPLE_LOG, MapleBlocks.MAPLE_LEAVES, 4, 2, 0, 2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder redmaple() {
        return MapleConfiguredFeatures.builder(MapleBlocks.MAPLE_LOG, MapleBlocks.RED_MAPLE_LEAVES, 4, 3, 0, 2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder cherry() {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(Blocks.CHERRY_LOG), new CherryTrunkPlacer(7, 1, 0, new WeightedListIntProvider(DataPool.<IntProvider>builder().add(ConstantIntProvider.create(1), 1).add(ConstantIntProvider.create(2), 1).add(ConstantIntProvider.create(3), 1).build()), UniformIntProvider.create(2, 4), UniformIntProvider.create(-4, -3), UniformIntProvider.create(-1, 0)), BlockStateProvider.of(Blocks.CHERRY_LEAVES), new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5), 0.25f, 0.5f, 0.16666667f, 0.33333334f), new TwoLayersFeatureSize(1, 0, 2)).ignoreVines();
    }

    private static TreeFeatureConfig.Builder sakura() {
        return MapleConfiguredFeatures.builder(Blocks.CHERRY_LOG, MapleBlocks.SAKURA_LEAVES,4,2,0,2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder sakura2() {
        return (new TreeFeatureConfig.Builder(BlockStateProvider.of(Blocks.CHERRY_LOG), new LargeOakTrunkPlacer(8, 20, 0), BlockStateProvider.of(MapleBlocks.SAKURA_LEAVES), new LargeOakFoliagePlacer(ConstantIntProvider.create(2),ConstantIntProvider.create(3), 3), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(1)))).ignoreVines();
    }

    private static TreeFeatureConfig.Builder ginkgo() {
        return MapleConfiguredFeatures.builder(MapleBlocks.GINKGO_LOG, MapleBlocks.GINKGO_LEAVES,5,2,0,2).ignoreVines();
    }
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherstoneReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);

        List<OreFeatureConfig.Target> overworldSaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MapleOreBlocks.Salt_Ore.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MapleOreBlocks.DEEPSLATE_Salt_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherCoalOres =
                List.of(OreFeatureConfig.createTarget(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Coal_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherCopperOres =
                List.of(OreFeatureConfig.createTarget(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Copper_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherDiamondOres =
                List.of(OreFeatureConfig.createTarget(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Diamond_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherEmeraldOres =
                List.of(OreFeatureConfig.createTarget(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Emerald_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherGoldOres =
                List.of(OreFeatureConfig.createTarget(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Gold_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherIronOres =
                List.of(OreFeatureConfig.createTarget(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Iron_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherLapisOres =
                List.of(OreFeatureConfig.createTarget(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Lapis_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherRedstoneOres =
                List.of(OreFeatureConfig.createTarget(netherstoneReplaceables, MapleNetherOresBlocks.Nether_Redstone_Ore.getDefaultState()));

        //Lake
        register(featureRegisterable, LAKE_HOT_SPRING , Feature.LAKE, new LakeFeature.Config(BlockStateProvider.of(MapleFluidBlockOrItem.Hot_Spring_BLOCK.getDefaultState()), BlockStateProvider.of(Blocks.GRASS_BLOCK.getDefaultState())));

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
        register(featureRegisterable, SALT_ORE , Feature.ORE, new OreFeatureConfig(overworldSaltOres, 12));


        register(featureRegisterable, Nether_Coal_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCoalOres, 10));
        register(featureRegisterable, Nether_Copper_KEY, Feature.ORE, new OreFeatureConfig(netherCopperOres, 8));
        register(featureRegisterable, Nether_Diamond_KEY, Feature.ORE, new OreFeatureConfig(netherDiamondOres, 8));
        register(featureRegisterable, Nether_Emerald_KEY, Feature.ORE, new OreFeatureConfig(netherEmeraldOres, 3));
        register(featureRegisterable,Nether_Gold_KEY, Feature.ORE, new OreFeatureConfig(netherGoldOres, 8));
        register(featureRegisterable, Nether_Iron_KEY, Feature.ORE, new OreFeatureConfig(netherIronOres, 8));
        register(featureRegisterable, Nether_Lapis_KEY, Feature.ORE, new OreFeatureConfig(netherLapisOres, 8));
        register(featureRegisterable, Nether_Redstone_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRedstoneOres, 8));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Maple.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static void registerConfiguredFeatures() {
        Maple.LOGGER.debug("Registering the ModConfiguredFeatures for " + Maple.MOD_ID);
    }

}
