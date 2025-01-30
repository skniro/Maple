package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import com.skniro.maple.world.gamerules.MapleGameRules;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class SakuraSaplingGenerator extends AbstractTreeGrower {
        @Override
        protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean bees) {
            int chance = random.nextInt(2);
            return switch (chance) {
                case 1 -> MapleConfiguredFeatures.MAGE_SAKURA_TREE;
                default -> MapleConfiguredFeatures.SAKURA_TREE;
            };
        }
    }