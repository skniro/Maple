package com.skniro.maple.recipe;

import com.skniro.maple.Maple;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public interface MapleRecipeType<T extends Recipe<?>> {
    public static final RecipeSerializer<MapleJuicerCraftingRecipe> Maple_JUIER_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Maple.MOD_ID, "maple_juicer"), new MapleJuicerCraftingRecipe.Serializer());
    public static final RecipeType<MapleJuicerCraftingRecipe> Maple_JUIER_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Maple.MOD_ID, "maple_juicer"), new RecipeType<>() {
                @Override
                public String toString() {
                    return "maple_juicer";
                }
            });
    public static void registerMapleRecipes() {
        Maple.LOGGER.info("Registering Custom Recipes for " + Maple.MOD_ID);
    }
}

