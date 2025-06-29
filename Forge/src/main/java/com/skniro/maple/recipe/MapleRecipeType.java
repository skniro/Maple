package com.skniro.maple.recipe;

import com.skniro.maple.Maple;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public interface MapleRecipeType<T extends Recipe<?>> {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Maple.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, Maple.MOD_ID);

    public static final RegistryObject<RecipeSerializer<MapleJuicerCraftingRecipe>> Maple_JUIER_SERIALIZER = SERIALIZERS.register( "maple_juicer", MapleJuicerCraftingRecipe.Serializer::new);
    public static final RegistryObject<RecipeType<MapleJuicerCraftingRecipe>> Maple_JUIER_TYPE = TYPES.register( "maple_juicer", () -> new RecipeType<MapleJuicerCraftingRecipe>() {
        @Override
        public String toString() {
            return "maple_juicer";
        }
    });

    public static void registerRecipes(BusGroup eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}

