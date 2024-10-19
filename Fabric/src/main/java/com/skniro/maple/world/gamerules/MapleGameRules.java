package com.skniro.maple.world.gamerules;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class MapleGameRules {
    public static final GameRules.Key<GameRules.BooleanRule> HOT_SPRING_SOURCE_CONVERSION =
            GameRuleRegistry.register("HotSpringSourceConversion", GameRules.Category.UPDATES, GameRuleFactory.createBooleanRule(false));

    public static void maplegamerule() {
    }
}
