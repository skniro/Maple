package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class MapleSaplingGenerator extends SaplingGenerator {
        @Override
        protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
            int chance = random.nextInt(2);
            return switch (chance) {
                case 1 -> MapleConfiguredFeatures.Red_Maple_TREE;
                default -> MapleConfiguredFeatures.Maple_TREE;
            };
        }
    }