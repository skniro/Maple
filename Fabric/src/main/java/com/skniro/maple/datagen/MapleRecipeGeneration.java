package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Util;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MapleRecipeGeneration extends FabricRecipeProvider {
    public MapleRecipeGeneration(FabricDataOutput generator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(generator, registryLookup);
    }


    public static final List<ItemConvertible> STRIPPED_MAPLE = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleBlocks.STRIPPED_MAPLE_LOG);
        list.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
    });

    @Override
    public void generate(RecipeExporter exporter) {
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
                .input(Items.SHORT_GRASS)
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS ,MapleBlocks.Maple_CARPET,2)
                .input(MapleBlocks.MAPLE_LEAVES,2)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_LEAVES),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_LEAVES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS ,MapleBlocks.RED_MAPLE_CARPET,2)
                .input(MapleBlocks.RED_MAPLE_LEAVES,2)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.RED_MAPLE_LEAVES),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.RED_MAPLE_LEAVES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS ,MapleBlocks.GINKGO_CARPET,2)
                .input(MapleBlocks.GINKGO_LEAVES,2)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_LEAVES),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_LEAVES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS ,MapleBlocks.SAKURA_CARPET,2)
                .input(MapleBlocks.SAKURA_LEAVES,2)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.SAKURA_LEAVES),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.SAKURA_LEAVES))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', Blocks.SAND)
                .input('i', Blocks.BAMBOO_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SAND),
                        FabricRecipeProvider.conditionsFromItem(Blocks.SAND))
                .criterion(FabricRecipeProvider.hasItem(Blocks.BAMBOO_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.GREEN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.GREEN_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.GREEN_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.ORANGE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.ORANGE_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.MAGENTA_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.MAGENTA_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIGHT_BLUE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.LIGHT_BLUE_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.YELLOW_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.YELLOW_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIME_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.LIME_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.PINK_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.PINK_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.GRAY_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.GRAY_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.GRAY_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIGHT_GRAY_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.LIGHT_GRAY_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.CYAN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.CYAN_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.PURPLE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.PURPLE_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.BLUE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.BLUE_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.BROWN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.BROWN_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.RED_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.GREEN_DYE)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.PLASTER),
                        FabricRecipeProvider.conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE),
                        FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.Iron_Sea_Lantern).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', Blocks.SEA_LANTERN)
                .input('i', Items.IRON_NUGGET)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SEA_LANTERN),
                        FabricRecipeProvider.conditionsFromItem(Blocks.SEA_LANTERN))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_NUGGET),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.Gold_Sea_Lantern).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', Blocks.SEA_LANTERN)
                .input('i', Items.GOLD_NUGGET)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SEA_LANTERN),
                        FabricRecipeProvider.conditionsFromItem(Blocks.SEA_LANTERN))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_NUGGET),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter);

        RecipeProvider.offerSmelting(exporter, STRIPPED_MAPLE, RecipeCategory.FOOD , MapleItems.MapleSyrup, 0.45F, 300, "maple_syrup");

    }
}
