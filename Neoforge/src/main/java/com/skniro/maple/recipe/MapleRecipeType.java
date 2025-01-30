package com.skniro.maple.recipe;

import com.skniro.maple.Maple;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public interface MapleRecipeType<T extends Recipe<?>> {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, Maple.MODID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, Maple.MODID);

    public static final Supplier<RecipeSerializer<MapleJuicerCraftingRecipe>> Maple_JUIER_SERIALIZER = SERIALIZERS.register( "maple_juicer", MapleJuicerCraftingRecipe.Serializer::new);
    public static final Supplier<RecipeType<MapleJuicerCraftingRecipe>> Maple_JUIER_TYPE = TYPES.register( "maple_juicer", () -> new RecipeType<MapleJuicerCraftingRecipe>() {
        @Override
        public String toString() {
            return "maple_juicer";
        }
    });

    public static void registerRecipes(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}

