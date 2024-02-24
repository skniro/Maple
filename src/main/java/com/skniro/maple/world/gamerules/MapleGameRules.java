package com.skniro.maple.world.gamerules;

import com.google.common.collect.Maps;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.feature.MaplePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import net.minecraft.world.gen.GenerationStep;

import java.util.Comparator;
import java.util.Map;

public class MapleGameRules {
    public static final GameRules.Key<GameRules.BooleanRule> HOT_SPRING_SOURCE_CONVERSION =
            GameRuleRegistry.register("HotSpringSourceConversion", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(false));

    public static void maplegamerule() {
    }
}
