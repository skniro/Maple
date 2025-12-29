package com.skniro.maple.world.gamerules;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.serialization.Codec;
import com.skniro.maple.Maple;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.gamerules.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.ToIntFunction;


public class MapleGameRules {
    public static final DeferredRegister<GameRule<?>> GAME_RULES = DeferredRegister.create(BuiltInRegistries.GAME_RULE, Maple.MOD_ID);

    public static DeferredHolder<GameRule<?>, GameRule<Boolean>> HOT_SPRING_SOURCE_CONVERSION = registerBoolean("hot_spring_source_conversion", GameRuleCategory.UPDATES, true);

    private static DeferredHolder<GameRule<?>, GameRule<Boolean>> registerBoolean(String id, GameRuleCategory category, boolean defaultValue) {
        return register(id, category, GameRuleType.BOOL, BoolArgumentType.bool(), Codec.BOOL, defaultValue, FeatureFlagSet.of(), GameRuleTypeVisitor::visitBoolean, (b) -> b ? 1 : 0);
    }

    private static <T> DeferredHolder<GameRule<?>, GameRule<Boolean>> register(String id, GameRuleCategory category, GameRuleType typeHint, ArgumentType<T> argumentType, Codec<T> codec, T defaultValue, FeatureFlagSet requiredFeatures, GameRules.VisitorCaller<T> visitorCaller, ToIntFunction<T> commandResultFunction) {
        return GAME_RULES.register(id, ()-> new GameRule(category, typeHint, argumentType, visitorCaller, codec, commandResultFunction, defaultValue, requiredFeatures));
    }

    public static void maplegamerule(IEventBus eventBus) {
        GAME_RULES.register(eventBus);
    }
}
