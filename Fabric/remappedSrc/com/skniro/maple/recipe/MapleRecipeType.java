package com.skniro.maple.recipe;

import com.skniro.maple.Maple;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

public interface MapleRecipeType<T extends Recipe<?>> {
    public static final RecipeSerializer<MapleJuicerCraftingRecipe> Maple_JUIER_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "maple_juicer"), new MapleJuicerCraftingRecipe.Serializer());
    public static final RecipeType<MapleJuicerCraftingRecipe> Maple_JUIER_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "maple_juicer"), new RecipeType<>() {
                @Override
                public String toString() {
                    return "maple_juicer";
                }
            });
    public static void registerMapleRecipes() {
        Maple.LOGGER.info("Registering Custom Recipes for " + Maple.MOD_ID);
    }
}

