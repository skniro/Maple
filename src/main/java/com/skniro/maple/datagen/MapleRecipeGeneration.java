package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
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

    public static final List<ItemConvertible> STRIPPED_MAPLE = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleBlocks.STRIPPED_MAPLE_LOG);
        list.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
    });

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(MapleItems.Cream).input(MapleItems.MILK_BOTTOM).criterion(FabricRecipeProvider.hasItem(MapleItems.Cream),
                FabricRecipeProvider.conditionsFromItem(MapleItems.Cream)).criterion(FabricRecipeProvider.hasItem(MapleItems.MILK_BOTTOM),
                FabricRecipeProvider.conditionsFromItem(MapleItems.MILK_BOTTOM)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(MapleItems.MILK_BOTTOM,3).input(Items.MILK_BUCKET).criterion(FabricRecipeProvider.hasItem(MapleItems.MILK_BOTTOM),
                FabricRecipeProvider.conditionsFromItem(MapleItems.MILK_BOTTOM)).criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET),
                FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(MapleItems.Flour,2).input(Items.WHEAT).criterion(FabricRecipeProvider.hasItem(MapleItems.Flour),
                FabricRecipeProvider.conditionsFromItem(MapleItems.Flour)).criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                FabricRecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(MapleBlocks.SAKURA_SAPLING,2).input(Items.PINK_DYE).criterion(FabricRecipeProvider.hasItem(MapleBlocks.SAKURA_SAPLING),
                FabricRecipeProvider.conditionsFromItem(MapleBlocks.SAKURA_SAPLING)).criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE)).offerTo(exporter);

        RecipeProvider.offerSmelting(exporter, STRIPPED_MAPLE, MapleItems.MapleSyrup, 0.45F, 300, "maple_syrup");

    }
}
