package com.skniro.maple.recipe;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.recipe.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
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
    public boolean matches(RecipeInput inventory, Level world) {
        for (int i = 0; i < recipeItems.size(); i++) {
            if (!recipeItems.get(i).test(inventory.getItem(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack assemble(RecipeInput inventory, HolderLookup.Provider lookup) {
        return output;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider lookup) {
        return output;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.createWithCapacity(2);
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
                Ingredient.CODEC_NONEMPTY.listOf().fieldOf("ingredient").forGetter((recipe) -> {
                    return recipe.recipeItems;
                }),
                ItemStack.CODEC.fieldOf("result").forGetter((recipe) -> {
                    return recipe.output;
                })
        ).apply(inst, MapleJuicerCraftingRecipe::new));


        public static final StreamCodec<RegistryFriendlyByteBuf, MapleJuicerCraftingRecipe> PACKET_CODEC = StreamCodec.of(MapleJuicerCraftingRecipe.Serializer::write, MapleJuicerCraftingRecipe.Serializer::read);

        public Serializer() {
        }

        public MapCodec<MapleJuicerCraftingRecipe> codec() {
            return CODEC;
        }

        public StreamCodec<RegistryFriendlyByteBuf, MapleJuicerCraftingRecipe> streamCodec() {
            return PACKET_CODEC;
        }

        private static MapleJuicerCraftingRecipe read(RegistryFriendlyByteBuf buf) {
            int i = buf.readVarInt();
            NonNullList<Ingredient> defaultedList = NonNullList.withSize(i, Ingredient.EMPTY);
            defaultedList.replaceAll((empty) -> {
                return (Ingredient)Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
            });
            ItemStack itemStack = (ItemStack)ItemStack.STREAM_CODEC.decode(buf);
            return new MapleJuicerCraftingRecipe(defaultedList, itemStack);
        }

        private static void write(RegistryFriendlyByteBuf buf, MapleJuicerCraftingRecipe recipe) {
            buf.writeVarInt(recipe.recipeItems.size());
            Iterator var2 = recipe.recipeItems.iterator();

            while(var2.hasNext()) {
                Ingredient ingredient = (Ingredient)var2.next();
                Ingredient.CONTENTS_STREAM_CODEC.encode(buf, ingredient);
            }

            ItemStack.STREAM_CODEC.encode(buf, recipe.output);
        }
    }
}




