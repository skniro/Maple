package com.skniro.maple.world.gamerules;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.world.rule.GameRule;


public class MapleGameRules {
    public static final GameRule<Boolean> HOT_SPRING_SOURCE_CONVERSION =
            GameRuleBuilder.forBoolean(false).buildAndRegister(Identifier.of(Maple.MOD_ID,"hot_spring_source_conversion"));

    public static void maplegamerule() {
    }
}
