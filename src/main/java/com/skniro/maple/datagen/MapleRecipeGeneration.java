package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Util;

import java.util.List;
import java.util.function.Consumer;

public class MapleRecipeGeneration extends FabricRecipeProvider {
    public MapleRecipeGeneration(FabricDataOutput generator) {
        super(generator);
    }


    public static final List<ItemConvertible> STRIPPED_MAPLE = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleBlocks.STRIPPED_MAPLE_LOG);
        list.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
    });

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleItems.MILK_BOTTOM,3).input(Items.MILK_BUCKET).criterion(FabricRecipeProvider.hasItem(MapleItems.MILK_BOTTOM),
                FabricRecipeProvider.conditionsFromItem(MapleItems.MILK_BOTTOM)).criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET),
                FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleItems.Flour,2).input(Items.WHEAT).criterion(FabricRecipeProvider.hasItem(MapleItems.Flour),
                FabricRecipeProvider.conditionsFromItem(MapleItems.Flour)).criterion(FabricRecipeProvider.hasItem(Items.WHEAT),
                FabricRecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleBlocks.SAKURA_SAPLING,2).input(Items.PINK_DYE).criterion(FabricRecipeProvider.hasItem(MapleBlocks.SAKURA_SAPLING),
                FabricRecipeProvider.conditionsFromItem(MapleBlocks.SAKURA_SAPLING)).criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE),
                FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.Anko_Dango,1)
                .input(Items.SUGAR)
                .input(Items.SUGAR)
                .input(MapleFoodComponents.Mochi)
                .input(MapleItems.SOYBEAN)
                .input(Items.BAMBOO)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Anko_Dango),
                FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Anko_Dango)).criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                FabricRecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.Mochi,2)
                .input(MapleFoodComponents.Cooked_Rice)
                .input(MapleFoodComponents.Cooked_Rice)
                .input(MapleFoodComponents.Cooked_Rice)
                .input(MapleFoodComponents.Cooked_Rice)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Mochi),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Mochi))
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Cooked_Rice),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Cooked_Rice)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.SakuraMochi,2)
                .input(MapleFoodComponents.Mochi)
                .input(MapleBlocks.SAKURA_LEAVES)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Mochi),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Mochi))
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Cooked_Rice),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Cooked_Rice)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleItems.Cream,3)
                .input(MapleItems.MILK_BOTTOM)
                .input(MapleItems.MILK_BOTTOM)
                .criterion(FabricRecipeProvider.hasItem(MapleItems.Cream),
                        FabricRecipeProvider.conditionsFromItem(MapleItems.Cream))
                .criterion(FabricRecipeProvider.hasItem(MapleItems.MILK_BOTTOM),
                        FabricRecipeProvider.conditionsFromItem(MapleItems.MILK_BOTTOM)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.Cooked_Rice,2)
                .input(MapleItems.Rice)
                .input(MapleItems.Rice)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Cooked_Rice),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Cooked_Rice))
                .criterion(FabricRecipeProvider.hasItem(MapleItems.Rice),
                        FabricRecipeProvider.conditionsFromItem(MapleItems.Rice)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.Kinako_Dango,1)
                .input(Items.SUGAR)
                .input(MapleFoodComponents.Mochi)
                .input(MapleItems.SOYBEAN)
                .input(Items.BAMBOO)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Kinako_Dango),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Kinako_Dango))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.Zunda_Dango,1)
                .input(Items.SUGAR)
                .input(MapleFoodComponents.Mochi)
                .input(MapleItems.SOYBEAN)
                .input(MapleItems.SOYBEAN)
                .input(Items.BAMBOO)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Zunda_Dango),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Zunda_Dango))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.Sanshoku_Dango,1)
                .input(Items.SUGAR)
                .input(MapleFoodComponents.Mochi)
                .input(Items.GRASS)
                .input(MapleBlocks.SAKURA_LEAVES)
                .input(Items.BAMBOO)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Sanshoku_Dango),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Sanshoku_Dango))
                .criterion(FabricRecipeProvider.hasItem(Items.SUGAR),
                        FabricRecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.TOFU,1)
                .input(MapleItems.SOYBEAN)
                .input(MapleItems.SOYBEAN)
                .input(Items.WATER_BUCKET)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.TOFU),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.TOFU))
                .criterion(FabricRecipeProvider.hasItem(MapleItems.SOYBEAN),
                        FabricRecipeProvider.conditionsFromItem(MapleItems.SOYBEAN)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.MILK_ICECREAM,2)
                .input(MapleItems.Cream)
                .input(MapleItems.MILK_BOTTOM)
                .input(Items.WATER_BUCKET)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.MILK_ICECREAM),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.MILK_ICECREAM))
                .criterion(FabricRecipeProvider.hasItem(MapleItems.Cream),
                        FabricRecipeProvider.conditionsFromItem(MapleItems.Cream))
                .criterion(FabricRecipeProvider.hasItem(MapleItems.MILK_BOTTOM),
                        FabricRecipeProvider.conditionsFromItem(MapleItems.MILK_BOTTOM)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.Beef_Rice,1)
                .input(MapleFoodComponents.Cooked_Rice)
                .input(Items.BEEF)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Cooked_Rice),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Cooked_Rice))
                .criterion(FabricRecipeProvider.hasItem(Items.BEEF),
                        FabricRecipeProvider.conditionsFromItem(Items.BEEF))
                .offerTo(exporter);



        RecipeProvider.offerSmelting(exporter, STRIPPED_MAPLE, RecipeCategory.FOOD , MapleItems.MapleSyrup, 0.45F, 300, "maple_syrup");

    }
}
