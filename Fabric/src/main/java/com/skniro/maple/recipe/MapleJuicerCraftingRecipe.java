package com.skniro.maple.recipe;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.recipe.input.RecipeInput;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class MapleJuicerCraftingRecipe implements Recipe<RecipeInput> {
    private final ItemStack output;
    final List<Ingredient> recipeItems;

    public MapleJuicerCraftingRecipe(List<Ingredient> recipeItems, ItemStack output) {
        this.output = output;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(RecipeInput inventory, World world) {
        for (int i = 0; i < recipeItems.size(); i++) {
            if (!recipeItems.get(i).test(inventory.getStackInSlot(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack craft(RecipeInput inventory, RegistryWrapper.WrapperLookup lookup) {
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup lookup) {
        return output;
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.ofSize(2);
        list.addAll(recipeItems);
        return list;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return MapleRecipeType.Maple_JUIER_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return MapleRecipeType.Maple_JUIER_TYPE;
    }

    public static class Serializer implements RecipeSerializer<MapleJuicerCraftingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final MapCodec<MapleJuicerCraftingRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.listOf().fieldOf("ingredient").forGetter((recipe) -> {
                    return recipe.recipeItems;
                }),
                ItemStack.CODEC.fieldOf("result").forGetter((recipe) -> {
                    return recipe.output;
                })
        ).apply(inst, MapleJuicerCraftingRecipe::new));


        public static final PacketCodec<RegistryByteBuf, MapleJuicerCraftingRecipe> PACKET_CODEC = PacketCodec.ofStatic(MapleJuicerCraftingRecipe.Serializer::write, MapleJuicerCraftingRecipe.Serializer::read);

        public Serializer() {
        }

        public MapCodec<MapleJuicerCraftingRecipe> codec() {
            return CODEC;
        }

        public PacketCodec<RegistryByteBuf, MapleJuicerCraftingRecipe> packetCodec() {
            return PACKET_CODEC;
        }

        private static MapleJuicerCraftingRecipe read(RegistryByteBuf buf) {
            int i = buf.readVarInt();
            DefaultedList<Ingredient> defaultedList = DefaultedList.ofSize(i, Ingredient.EMPTY);
            defaultedList.replaceAll((empty) -> {
                return (Ingredient)Ingredient.PACKET_CODEC.decode(buf);
            });
            ItemStack itemStack = (ItemStack)ItemStack.PACKET_CODEC.decode(buf);
            return new MapleJuicerCraftingRecipe(defaultedList, itemStack);
        }

        private static void write(RegistryByteBuf buf, MapleJuicerCraftingRecipe recipe) {
            buf.writeVarInt(recipe.recipeItems.size());
            Iterator var2 = recipe.recipeItems.iterator();

            while(var2.hasNext()) {
                Ingredient ingredient = (Ingredient)var2.next();
                Ingredient.PACKET_CODEC.encode(buf, ingredient);
            }

            ItemStack.PACKET_CODEC.encode(buf, recipe.output);
        }
    }
}




