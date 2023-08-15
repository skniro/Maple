package com.skniro.maple.world.Tree;

import com.skniro.maple.world.MapleConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class SakuraSaplingGenerator extends SaplingGenerator {
        @Override
        protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
            return MapleConfiguredFeatures.SAKURA_TREE;
        }
    }