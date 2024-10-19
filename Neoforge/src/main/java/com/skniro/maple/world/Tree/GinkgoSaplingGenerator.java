package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class GinkgoSaplingGenerator extends AbstractTreeGrower {
        @Override
        protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pLargeHive) {
            return MapleConfiguredFeatures.GINKGO_TREE;
        }
    }