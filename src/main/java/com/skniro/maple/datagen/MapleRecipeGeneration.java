package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.util.Util;

import java.util.List;
import java.util.function.Consumer;

public class MapleRecipeGeneration extends FabricRecipeProvider {
    public MapleRecipeGeneration(FabricDataGenerator generator) {
        super(generator);
    }


    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
    }
}
