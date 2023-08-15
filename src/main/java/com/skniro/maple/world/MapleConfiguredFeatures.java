package com.skniro.maple.world;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;


public class MapleConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> Maple_TREE =registerKey("maple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHERRY_TREE = registerKey("cherry_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAKURA_TREE = registerKey("sakura_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SALT_ORE = registerKey("salt_ore");


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
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldSaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MapleOreBlocks.Salt_Ore.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MapleOreBlocks.DEEPSLATE_Salt_Ore.getDefaultState()));

        register(featureRegisterable, Maple_TREE, Feature.TREE,
                MapleConfiguredFeatures.maple().build());
        register(featureRegisterable, CHERRY_TREE, Feature.TREE,
                MapleConfiguredFeatures.cherry().build());
        register(featureRegisterable, SAKURA_TREE, Feature.TREE,
                MapleConfiguredFeatures.sakura().build());

        register(featureRegisterable, SALT_ORE , Feature.ORE, new OreFeatureConfig(overworldSaltOres, 12));
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
