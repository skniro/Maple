package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
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
    public static final List<ItemConvertible> Green_Tea = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleFoodComponents.Green_Tea_Leaves);
    });

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter exporter) {
        return new RecipeGenerator(wrapperLookup, exporter) {
            @Override
            public void generate() {
        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.MILK_BOTTOM,3).input(Items.MILK_BUCKET).input(Items.GLASS_BOTTLE,3).criterion(hasItem(MapleFoodComponents.MILK_BOTTOM),
                conditionsFromItem(MapleFoodComponents.MILK_BOTTOM)).criterion(hasItem(Items.MILK_BUCKET),
                conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleItems.Flour,2).input(Items.WHEAT).criterion(hasItem(MapleItems.Flour),
                conditionsFromItem(MapleItems.Flour)).criterion(hasItem(Items.WHEAT),
                conditionsFromItem(Items.WHEAT)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleBlocks.SAKURA_SAPLING,2).input(Items.PINK_DYE).criterion(hasItem(MapleBlocks.SAKURA_SAPLING),
                conditionsFromItem(MapleBlocks.SAKURA_SAPLING)).criterion(hasItem(Items.PINK_DYE),
                conditionsFromItem(Items.PINK_DYE)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.Anko_Dango,1)
                .input(Items.SUGAR)
                .input(Items.SUGAR)
                .input(MapleFoodComponents.Mochi)
                .input(MapleItems.SOYBEAN)
                .input(Items.BAMBOO)
                .criterion(hasItem(MapleFoodComponents.Anko_Dango),
                conditionsFromItem(MapleFoodComponents.Anko_Dango)).criterion(hasItem(Items.SUGAR),
                conditionsFromItem(Items.SUGAR)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.Mochi,2)
                .input(MapleFoodComponents.Cooked_Rice)
                .input(MapleFoodComponents.Cooked_Rice)
                .input(MapleFoodComponents.Cooked_Rice)
                .input(MapleFoodComponents.Cooked_Rice)
                .criterion(hasItem(MapleFoodComponents.Mochi),
                        conditionsFromItem(MapleFoodComponents.Mochi))
                .criterion(hasItem(MapleFoodComponents.Cooked_Rice),
                        conditionsFromItem(MapleFoodComponents.Cooked_Rice)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.SakuraMochi,2)
                .input(MapleFoodComponents.Mochi)
                .input(MapleBlocks.SAKURA_LEAVES)
                .criterion(hasItem(MapleFoodComponents.Mochi),
                        conditionsFromItem(MapleFoodComponents.Mochi))
                .criterion(hasItem(MapleFoodComponents.Cooked_Rice),
                        conditionsFromItem(MapleFoodComponents.Cooked_Rice)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleItems.Cream,3)
                .input(MapleFoodComponents.MILK_BOTTOM)
                .input(MapleFoodComponents.MILK_BOTTOM)
                .criterion(hasItem(MapleItems.Cream),
                        conditionsFromItem(MapleItems.Cream))
                .criterion(hasItem(MapleFoodComponents.MILK_BOTTOM),
                        conditionsFromItem(MapleFoodComponents.MILK_BOTTOM)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.Cooked_Rice,2)
                .input(MapleItems.Rice)
                .input(MapleItems.Rice)
                .criterion(hasItem(MapleFoodComponents.Cooked_Rice),
                        conditionsFromItem(MapleFoodComponents.Cooked_Rice))
                .criterion(hasItem(MapleItems.Rice),
                        conditionsFromItem(MapleItems.Rice)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.Kinako_Dango,1)
                .input(Items.SUGAR)
                .input(MapleFoodComponents.Mochi)
                .input(MapleItems.SOYBEAN)
                .input(Items.BAMBOO)
                .criterion(hasItem(MapleFoodComponents.Kinako_Dango),
                        conditionsFromItem(MapleFoodComponents.Kinako_Dango))
                .criterion(hasItem(Items.SUGAR),
                        conditionsFromItem(Items.SUGAR)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.Zunda_Dango,1)
                .input(Items.SUGAR)
                .input(MapleFoodComponents.Mochi)
                .input(MapleItems.SOYBEAN)
                .input(MapleItems.SOYBEAN)
                .input(Items.BAMBOO)
                .criterion(hasItem(MapleFoodComponents.Zunda_Dango),
                        conditionsFromItem(MapleFoodComponents.Zunda_Dango))
                .criterion(hasItem(Items.SUGAR),
                        conditionsFromItem(Items.SUGAR)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.Sanshoku_Dango,1)
                .input(Items.SUGAR)
                .input(MapleFoodComponents.Mochi)
                .input(Items.SHORT_GRASS)
                .input(MapleBlocks.SAKURA_LEAVES)
                .input(Items.BAMBOO)
                .criterion(hasItem(MapleFoodComponents.Sanshoku_Dango),
                        conditionsFromItem(MapleFoodComponents.Sanshoku_Dango))
                .criterion(hasItem(Items.SUGAR),
                        conditionsFromItem(Items.SUGAR)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.TOFU,1)
                .input(MapleItems.SOYBEAN)
                .input(MapleItems.SOYBEAN)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(MapleFoodComponents.TOFU),
                        conditionsFromItem(MapleFoodComponents.TOFU))
                .criterion(hasItem(MapleItems.SOYBEAN),
                        conditionsFromItem(MapleItems.SOYBEAN)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.MILK_ICECREAM,2)
                .input(MapleItems.Cream)
                .input(MapleFoodComponents.MILK_BOTTOM)
                .input(Items.WATER_BUCKET)
                .criterion(hasItem(MapleFoodComponents.MILK_ICECREAM),
                        conditionsFromItem(MapleFoodComponents.MILK_ICECREAM))
                .criterion(hasItem(MapleItems.Cream),
                        conditionsFromItem(MapleItems.Cream))
                .criterion(hasItem(MapleFoodComponents.MILK_BOTTOM),
                        conditionsFromItem(MapleFoodComponents.MILK_BOTTOM)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD ,MapleFoodComponents.Beef_Rice,1)
                .input(MapleFoodComponents.Cooked_Rice)
                .input(Items.BEEF)
                .criterion(hasItem(MapleFoodComponents.Cooked_Rice),
                        conditionsFromItem(MapleFoodComponents.Cooked_Rice))
                .criterion(hasItem(Items.BEEF),
                        conditionsFromItem(Items.BEEF))
                .offerTo(exporter);

        createShapeless(RecipeCategory.DECORATIONS ,MapleBlocks.Maple_CARPET,2)
                .input(MapleBlocks.MAPLE_LEAVES,2)
                .criterion(hasItem(MapleBlocks.MAPLE_LEAVES),
                        conditionsFromItem(MapleBlocks.MAPLE_LEAVES))
                .offerTo(exporter);

        createShapeless(RecipeCategory.DECORATIONS ,MapleBlocks.RED_MAPLE_CARPET,2)
                .input(MapleBlocks.RED_MAPLE_LEAVES,2)
                .criterion(hasItem(MapleBlocks.RED_MAPLE_LEAVES),
                        conditionsFromItem(MapleBlocks.RED_MAPLE_LEAVES))
                .offerTo(exporter);

        createShapeless(RecipeCategory.DECORATIONS ,MapleBlocks.GINKGO_CARPET,2)
                .input(MapleBlocks.GINKGO_LEAVES,2)
                .criterion(hasItem(MapleBlocks.GINKGO_LEAVES),
                        conditionsFromItem(MapleBlocks.GINKGO_LEAVES))
                .offerTo(exporter);

        createShapeless(RecipeCategory.DECORATIONS ,MapleBlocks.SAKURA_CARPET,2)
                .input(MapleBlocks.SAKURA_LEAVES,2)
                .criterion(hasItem(MapleBlocks.SAKURA_LEAVES),
                        conditionsFromItem(MapleBlocks.SAKURA_LEAVES))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', Blocks.SAND)
                .input('i', Blocks.BAMBOO_BLOCK)
                .criterion(hasItem(Blocks.SAND),
                        conditionsFromItem(Blocks.SAND))
                .criterion(hasItem(Blocks.BAMBOO_BLOCK),
                        conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.GREEN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.GREEN_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.GREEN_DYE),
                        conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.ORANGE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.ORANGE_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.ORANGE_DYE),
                        conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.MAGENTA_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.MAGENTA_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.MAGENTA_DYE),
                        conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIGHT_BLUE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.LIGHT_BLUE_DYE),
                        conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.YELLOW_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.YELLOW_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.YELLOW_DYE),
                        conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIME_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.LIME_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.LIME_DYE),
                        conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.PINK_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.PINK_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.PINK_DYE),
                        conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.GRAY_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.GRAY_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.GRAY_DYE),
                        conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIGHT_GRAY_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.LIGHT_GRAY_DYE),
                        conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.CYAN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.CYAN_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.CYAN_DYE),
                        conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.PURPLE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.PURPLE_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.PURPLE_DYE),
                        conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.BLUE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.BLUE_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.BLUE_DYE),
                        conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.BROWN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.BROWN_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.BROWN_DYE),
                        conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.RED_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', MapleBlocks.PLASTER)
                .input('i', Items.GREEN_DYE)
                .criterion(hasItem(MapleBlocks.PLASTER),
                        conditionsFromItem(MapleBlocks.PLASTER))
                .criterion(hasItem(Items.RED_DYE),
                        conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.Iron_Sea_Lantern).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', Blocks.SEA_LANTERN)
                .input('i', Items.IRON_NUGGET)
                .criterion(hasItem(Blocks.SEA_LANTERN),
                        conditionsFromItem(Blocks.SEA_LANTERN))
                .criterion(hasItem(Items.IRON_NUGGET),
                        conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter);

        createShaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.Gold_Sea_Lantern).pattern("bbb").pattern("bib").pattern("bbb")
                .input('b', Blocks.SEA_LANTERN)
                .input('i', Items.GOLD_NUGGET)
                .criterion(hasItem(Blocks.SEA_LANTERN),
                        conditionsFromItem(Blocks.SEA_LANTERN))
                .criterion(hasItem(Items.GOLD_NUGGET),
                        conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter);

        createShapeless(RecipeCategory.FOOD , MapleFoodComponents.Red_Tea,1)
                .input(MapleFoodComponents.Red_Tea_Leaves,2)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(MapleFoodComponents.Red_Tea_Leaves),
                        conditionsFromItem(MapleFoodComponents.Red_Tea_Leaves))
                .criterion(hasItem(Items.GLASS_BOTTLE),
                        conditionsFromItem(Items.GLASS_BOTTLE)).offerTo(exporter);

        createShapeless(RecipeCategory.FOOD , MapleFoodComponents.Green_Tea,1)
                .input(MapleFoodComponents.Green_Tea_Leaves,2)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(MapleFoodComponents.Green_Tea_Leaves),
                        conditionsFromItem(MapleFoodComponents.Green_Tea_Leaves))
                .criterion(hasItem(Items.GLASS_BOTTLE),
                        conditionsFromItem(Items.GLASS_BOTTLE)).offerTo(exporter);

                offerSmelting(STRIPPED_MAPLE, RecipeCategory.FOOD , MapleItems.MapleSyrup, 0.45F, 300, "maple_syrup");
                offerSmelting(Green_Tea, RecipeCategory.FOOD , MapleFoodComponents.Red_Tea_Leaves, 0.45F, 300, "red_tea");
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}