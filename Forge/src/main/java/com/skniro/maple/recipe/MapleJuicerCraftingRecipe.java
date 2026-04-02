package com.skniro.maple.recipe;


import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;


public class MapleJuicerCraftingRecipe implements Recipe<RecipeInput> {
    private final ItemStackTemplate output;
    final List<Ingredient>  recipeItems;
    @Nullable
    private PlacementInfo ingredientPlacement;

    public MapleJuicerCraftingRecipe(List<Ingredient> recipeItems, ItemStackTemplate output) {
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
    public ItemStack assemble(RecipeInput inventory) {
        return output.create();
    }

    @Override
    public boolean showNotification() {
        return false;
    }

    @Override
    public String group() {
        return "";
    }


    @Override
    public PlacementInfo placementInfo() {
        if (this.ingredientPlacement == null) {
            this.ingredientPlacement = PlacementInfo.create(this.recipeItems);
        }

        return this.ingredientPlacement;
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return null;
    }


    public ItemStack getResult(HolderLookup.Provider lookup) {
        return output.create();
    }


    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.createWithCapacity(2);
        list.addAll(recipeItems);
        return list;
    }

    @Override
    public RecipeSerializer<? extends Recipe<RecipeInput>> getSerializer() {
        return MapleRecipeType.Maple_JUIER_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<RecipeInput>> getType() {
        return MapleRecipeType.Maple_JUIER_TYPE.get();
    }

    public static final MapCodec<MapleJuicerCraftingRecipe> CODEC =
            RecordCodecBuilder.mapCodec(inst -> inst.group(
                    Ingredient.CODEC.listOf()
                            .fieldOf("ingredient")
                            .forGetter(recipe -> recipe.recipeItems),

                    ItemStackTemplate.CODEC
                            .fieldOf("result")
                            .forGetter(recipe -> recipe.output)
            ).apply(inst, MapleJuicerCraftingRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, MapleJuicerCraftingRecipe> STREAM_CODEC =
            StreamCodec.of(
                    MapleJuicerCraftingRecipe::write,
                    MapleJuicerCraftingRecipe::read
            );

    public static final RecipeSerializer<MapleJuicerCraftingRecipe> SERIALIZER =
            new RecipeSerializer<>(CODEC, STREAM_CODEC);

    private static MapleJuicerCraftingRecipe read(RegistryFriendlyByteBuf buf) {
        int i = buf.readVarInt();
        NonNullList<Ingredient> defaultedList = NonNullList.withSize(i, Ingredient.of(ItemStack.EMPTY.getItem()));
        defaultedList.replaceAll((empty) -> {
            return (Ingredient)Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
        });
        ItemStackTemplate itemStack = ItemStackTemplate.STREAM_CODEC.decode(buf);
        return new MapleJuicerCraftingRecipe(defaultedList, itemStack);
    }

    private static void write(RegistryFriendlyByteBuf buf, MapleJuicerCraftingRecipe recipe) {
        buf.writeVarInt(recipe.recipeItems.size());
        Iterator var2 = recipe.recipeItems.iterator();

        while(var2.hasNext()) {
            Ingredient ingredient = (Ingredient)var2.next();
            Ingredient.CONTENTS_STREAM_CODEC.encode(buf, ingredient);
        }

        ItemStackTemplate.STREAM_CODEC.encode(buf, recipe.output);
    }
}




