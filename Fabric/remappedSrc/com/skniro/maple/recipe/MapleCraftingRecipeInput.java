package com.skniro.maple.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

public record MapleCraftingRecipeInput(ItemStack input,ItemStack glass) implements RecipeInput {
    @Override
    public ItemStack getItem(int slot) {
        ItemStack input;
        switch (slot) {
            case 0 -> input = this.input;
            case 1 -> input = this.glass;
            default -> throw new IllegalArgumentException("Recipe does not contain slot " + slot);
        }

        return input;
    }

    @Override
    public int size() {
        return 2;
    }
}