package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.tag.MapleItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
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

    public static final List<ItemConvertible> Cherry_INGOT = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleArmorItems.Cherry_PICKAXE);
        list.add(MapleArmorItems.Cherry_SHOVEL);
        list.add(MapleArmorItems.Cherry_AXE);
        list.add(MapleArmorItems.Cherry_HOE);
        list.add(MapleArmorItems.Cherry_SWORD);
        list.add(MapleArmorItems.Cherry_HELMET);
        list.add(MapleArmorItems.Cherry_CHESTPLATE);
        list.add(MapleArmorItems.Cherry_LEGGINGS);
        list.add(MapleArmorItems.Cherry_BOOTS);

    });

    @Override
    public void generate(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD ,MapleFoodComponents.MILK_BOTTOM,3).input(Items.MILK_BUCKET).input(Items.GLASS_BOTTLE,3).criterion(hasItem(MapleFoodComponents.MILK_BOTTOM),
                conditionsFromItem(MapleFoodComponents.MILK_BOTTOM)).criterion(hasItem(Items.MILK_BUCKET),
                conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);

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
                .input(MapleFoodComponents.MILK_BOTTOM)
                .input(MapleFoodComponents.MILK_BOTTOM)
                .criterion(FabricRecipeProvider.hasItem(MapleItems.Cream),
                        FabricRecipeProvider.conditionsFromItem(MapleItems.Cream))
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.MILK_BOTTOM),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.MILK_BOTTOM)).offerTo(exporter);

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
                .input(MapleFoodComponents.MILK_BOTTOM)
                .input(Items.WATER_BUCKET)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.MILK_ICECREAM),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.MILK_ICECREAM))
                .criterion(FabricRecipeProvider.hasItem(MapleItems.Cream),
                        FabricRecipeProvider.conditionsFromItem(MapleItems.Cream))
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.MILK_BOTTOM),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.MILK_BOTTOM)).offerTo(exporter);

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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD , MapleFoodComponents.Red_Tea,1)
                .input(MapleFoodComponents.Red_Tea_Leaves,2)
                .input(Items.GLASS_BOTTLE)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Red_Tea_Leaves),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Red_Tea_Leaves))
                .criterion(FabricRecipeProvider.hasItem(Items.GLASS_BOTTLE),
                        FabricRecipeProvider.conditionsFromItem(Items.GLASS_BOTTLE)).offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD , MapleFoodComponents.Green_Tea,1)
                .input(MapleFoodComponents.Green_Tea_Leaves,2)
                .input(Items.GLASS_BOTTLE)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.Green_Tea_Leaves),
                        FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.Green_Tea_Leaves))
                .criterion(FabricRecipeProvider.hasItem(Items.GLASS_BOTTLE),
                        FabricRecipeProvider.conditionsFromItem(Items.GLASS_BOTTLE)).offerTo(exporter);

        RecipeProvider.offerSmelting(exporter, STRIPPED_MAPLE, RecipeCategory.FOOD , MapleItems.MapleSyrup, 0.45F, 300, "maple_syrup");
        RecipeProvider.offerSmelting(exporter, Green_Tea, RecipeCategory.FOOD , MapleFoodComponents.Red_Tea_Leaves, 0.45F, 300, "red_tea");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, MapleArmorItems.Cherry_BOOTS).pattern("X X").pattern("X X")
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT),
                        FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, MapleArmorItems.Cherry_CHESTPLATE).pattern("X X").pattern("XXX").pattern("XXX")
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, MapleArmorItems.Cherry_HELMET).pattern("XXX").pattern("X X")
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, MapleArmorItems.Cherry_LEGGINGS).pattern("XXX").pattern("X X").pattern("X X")
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, MapleArmorItems.Cherry_SWORD).pattern("X").pattern("X").pattern("#")
                .input('#', Items.STICK)
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MapleArmorItems.Cherry_HOE).pattern("XX").pattern(" #").pattern(" #")
                .input('#', Items.STICK)
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MapleArmorItems.Cherry_PICKAXE).pattern("XXX").pattern(" # ").pattern(" # ")
                .input('#', Items.STICK)
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MapleArmorItems.Cherry_AXE).pattern("XX").pattern("X#").pattern(" #")
                .input('#', Items.STICK)
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MapleArmorItems.Cherry_SHOVEL).pattern("X").pattern("#").pattern("#")
                .input('#', Items.STICK)
                .input('X', MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter);

        RecipeProvider.offerSmelting(exporter, Cherry_INGOT, RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT, 0.1F, 200, "cherry_ingot_smelting");
        RecipeProvider.offerBlasting(exporter, Cherry_INGOT, RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT, 0.1F, 200, "cherry_ingot_blasting");


        // cherry nugget / ingot recipes (convert from JSON -> datagen)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MapleArmorItems.Cherry_NUGGET, 9)
                .input(MapleArmorItems.Cherry_INGOT)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_INGOT), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                .offerTo(exporter, "cherry_armor_tool/cherry_nugget");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT)
                .pattern("###").pattern("###").pattern("###")
                .input('#', MapleArmorItems.Cherry_NUGGET)
                .criterion(FabricRecipeProvider.hasItem(MapleArmorItems.Cherry_NUGGET), FabricRecipeProvider.conditionsFromItem(MapleArmorItems.Cherry_NUGGET))
                .offerTo(exporter, "cherry_armor_tool/cherry_ingot_from_nuggets");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT)
                .input(Items.IRON_INGOT).input(Items.IRON_INGOT).input(Items.IRON_INGOT).input(Items.IRON_INGOT)
                .input(Items.GOLD_INGOT).input(Items.GOLD_INGOT).input(Items.GOLD_INGOT).input(Items.GOLD_INGOT)
                .input(MapleBlocks.MAPLE_LEAVES)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "cherry_armor_tool/cherry_ingot");


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.WHITE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.ORANGE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.YELLOW_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIME_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.PINK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.CYAN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.PURPLE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BROWN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BLACK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.WHITE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.ORANGE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.MAGENTA_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.YELLOW_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIME_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.PINK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.CYAN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.PURPLE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BLUE_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BROWN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GREEN_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.RED_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BLACK_CONCRETE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.GREEN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.RED_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 6)
                .pattern("###")
                .input('#', Blocks.BLACK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.WHITE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.ORANGE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.MAGENTA_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.YELLOW_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIME_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.PINK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.CYAN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.PURPLE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BLUE_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BROWN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.GREEN_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.RED_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Blocks.BLACK_STAINED_GLASS)
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS),
                        FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                .offerTo(exporter);


        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID,"cutting/glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID,"cutting/white_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/white_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/orange_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/orange_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/magenta_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/magenta_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_blue_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_blue_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/yellow_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/yellow_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/lime_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.LIME_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/lime_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/pink_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.PINK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/pink_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/gray_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/gray_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_gray_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_gray_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/cyan_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/cyan_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/purple_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/purple_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/blue_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/blue_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/brown_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/brown_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/green_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/green_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/red_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.RED_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/red_stained_glass_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/black_stained_glass_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_STAINED_GLASS), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/black_stained_glass_slab")));

        //CONCRETE Stonecutting Recipes
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/white_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.WHITE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/white_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/orange_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.ORANGE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/orange_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/magenta_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.MAGENTA_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/magenta_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_blue_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_blue_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/yellow_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.YELLOW_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/yellow_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/lime_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.LIME_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/lime_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/pink_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.PINK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/pink_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/gray_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/gray_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_gray_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.LIGHT_GRAY_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_gray_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/cyan_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.CYAN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/cyan_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/purple_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.PURPLE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/purple_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/blue_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.BLUE_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/blue_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/brown_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.BROWN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/brown_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/green_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.GREEN_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/green_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/red_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.RED_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/red_concrete_slab")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 1).criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/black_concrete_stairs")));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 2).criterion(FabricRecipeProvider.hasItem(Blocks.BLACK_CONCRETE), FabricRecipeProvider.conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/black_concrete_slab")));
        // Additional datagen conversions for recipes currently in resources

        // snowball variants
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_STONE, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.STONE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_stone");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_ICE, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.ICE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_ice");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_ICE, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.ICE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_ice2");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_ICE, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.ICE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_ice3");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_IRON, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_iron");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_Gold, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.GOLD_NUGGET)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_gold");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_Diamond, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.DIAMOND)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_diamond");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_Compression, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.WATER_BUCKET)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_compression");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_Teleporting, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.ENDER_PEARL)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_teleporting");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_Confusion, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.RED_MUSHROOM)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_confusion");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_Poison, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.SPIDER_EYE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_posion");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.SNOWBALL_Instant_Health, 32)
                .pattern("###").pattern("#G#").pattern("###")
                .input('#', Blocks.SNOW_BLOCK)
                .input('G', Items.MELON_SLICE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.SNOW_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.SNOW_BLOCK))
                .offerTo(exporter, "snowball/snowball_instant_health");

        // hanging signs
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.Maple_HANGING_SIGN, 6)
                .pattern("X X").pattern("###").pattern("###")
                .input('X', Items.CHAIN)
                .input('#', MapleBlocks.STRIPPED_MAPLE_LOG)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.STRIPPED_MAPLE_LOG), FabricRecipeProvider.conditionsFromItem(MapleBlocks.STRIPPED_MAPLE_LOG))
                .offerTo(exporter, "hanging_sign/maple_hanging_sign");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.GINKGO_HANGING_SIGN, 6)
                .pattern("X X").pattern("###").pattern("###")
                .input('X', Items.CHAIN)
                .input('#', MapleBlocks.STRIPPED_GINKGO_LOG)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.STRIPPED_GINKGO_LOG), FabricRecipeProvider.conditionsFromItem(MapleBlocks.STRIPPED_GINKGO_LOG))
                .offerTo(exporter, "hanging_sign/ginkgo_hanging_sign");

        // tatami
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.TATAMI, 4)
                .pattern("###").pattern("GGG")
                .input('#', Items.SHORT_GRASS)
                .input('G', Items.WHEAT)
                .criterion(FabricRecipeProvider.hasItem(Items.WHEAT), FabricRecipeProvider.conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, "tatami/tatami");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.TATAMI_SLAB, 6)
                .pattern("###")
                .input('#', MapleBlocks.TATAMI)
                .criterion(FabricRecipeProvider.hasItem(MapleBlocks.TATAMI), FabricRecipeProvider.conditionsFromItem(MapleBlocks.TATAMI))
                .offerTo(exporter, "tatami/tatami_slab");

        // ginkgo sapling
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_SAPLING)
                .input(Items.OAK_SAPLING)
                .input(Items.YELLOW_DYE)
                .criterion(FabricRecipeProvider.hasItem(Items.OAK_SAPLING), FabricRecipeProvider.conditionsFromItem(Items.OAK_SAPLING))
                .offerTo(exporter, "sapling/ginkgo_sapling");

        // maple wood family (maple + ginkgo) common recipes
        // planks from logs
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAPLE_PLANKS, 4)
                .input(MapleItemTagGeneration.ModItemTags.MAPLE_LOGS)
                .criterion(String.valueOf(FabricRecipeProvider.conditionsFromTag(MapleItemTagGeneration.ModItemTags.MAPLE_LOGS)), FabricRecipeProvider.conditionsFromTag(MapleItemTagGeneration.ModItemTags.MAPLE_LOGS))
                .offerTo(exporter, "maple/maple_planks");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_PLANKS, 4)
                .input(MapleItemTagGeneration.ModItemTags.GINKGO_LOGS)
                .criterion(String.valueOf(FabricRecipeProvider.conditionsFromTag(MapleItemTagGeneration.ModItemTags.GINKGO_LOGS)), FabricRecipeProvider.conditionsFromTag(MapleItemTagGeneration.ModItemTags.GINKGO_LOGS))
                .offerTo(exporter, "ginkgo/ginkgo_planks");

        // slabs & stairs & trapdoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAPLE_SLAB, 6).pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_slab");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAPLE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_stairs");
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleBlocks.MAPLE_TRAPDOOR, 2).pattern("###").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_trapdoor");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.MAPLE_SIGN, 3).pattern("###").pattern("###").pattern(" X ").input('#', MapleBlocks.MAPLE_PLANKS).input('X', Items.STICK).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_sign");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleItems.MAPLE_DOOR, 3).pattern("##").pattern("##").pattern("##").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_door");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleBlocks.MAPLE_BUTTON).pattern("#").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_button");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleBlocks.MAPLE_PRESSURE_PLATE).pattern("##").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_pressure_plate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, MapleBlocks.MAPLE_FENCE, 3).pattern("# #").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_fence");

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, MapleBlocks.MAPLE_FENCE_GATE).pattern("# #").pattern("# #").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_fence_gate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.MAPLE_BOAT).pattern("# #").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_boat");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.MAPLE_CHEST_BOAT).pattern("# #").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_chest_boat");

        // cherry ingot variant using sakura leaves
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT)
                .input(Items.IRON_INGOT).input(Items.IRON_INGOT).input(Items.IRON_INGOT).input(Items.IRON_INGOT)
                .input(Items.GOLD_INGOT).input(Items.GOLD_INGOT).input(Items.GOLD_INGOT).input(Items.GOLD_INGOT)
                .input(MapleBlocks.SAKURA_LEAVES)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, "cherry_armor_tool/cherry_ingot_sakura");

        // cheese
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MapleFoodComponents.Cheese)
                .input(MapleFoodComponents.MILK_BOTTOM)
                .criterion(FabricRecipeProvider.hasItem(MapleFoodComponents.MILK_BOTTOM), FabricRecipeProvider.conditionsFromItem(MapleFoodComponents.MILK_BOTTOM))
                .offerTo(exporter, "food/cheese");

        // maple wood conversions
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAPLE_WOOD, 3).pattern("##").pattern("##").input('#', MapleBlocks.MAPLE_LOG).criterion(FabricRecipeProvider.hasItem(MapleBlocks.MAPLE_LOG), FabricRecipeProvider.conditionsFromItem(MapleBlocks.MAPLE_LOG)).offerTo(exporter, "maple/maple_wood");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.STRIPPED_MAPLE_WOOD, 3).pattern("##").pattern("##").input('#', MapleBlocks.STRIPPED_MAPLE_LOG).criterion(FabricRecipeProvider.hasItem(MapleBlocks.STRIPPED_MAPLE_LOG), FabricRecipeProvider.conditionsFromItem(MapleBlocks.STRIPPED_MAPLE_LOG)).offerTo(exporter, "maple/stripped_maple_wood");

        // ginkgo wood conversions & family
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_WOOD, 3).pattern("##").pattern("##").input('#', MapleBlocks.GINKGO_LOG).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_LOG), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_LOG)).offerTo(exporter, "ginkgo/ginkgo_wood");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.STRIPPED_GINKGO_WOOD, 3).pattern("##").pattern("##").input('#', MapleBlocks.STRIPPED_GINKGO_LOG).criterion(FabricRecipeProvider.hasItem(MapleBlocks.STRIPPED_GINKGO_LOG), FabricRecipeProvider.conditionsFromItem(MapleBlocks.STRIPPED_GINKGO_LOG)).offerTo(exporter, "ginkgo/stripped_ginkgo_wood");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_SLAB, 6).pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_slab");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_stairs");
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleBlocks.GINKGO_TRAPDOOR, 2).pattern("###").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_trapdoor");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.GINKGO_SIGN, 3).pattern("###").pattern("###").pattern(" X ").input('#', MapleBlocks.GINKGO_PLANKS).input('X', Items.STICK).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_sign");
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleBlocks.GINKGO_BUTTON).pattern("#").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_button");
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleBlocks.GINKGO_PRESSURE_PLATE).pattern("##").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_pressure_plate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, MapleBlocks.GINKGO_FENCE, 3).pattern("# #").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_fence");
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, MapleBlocks.GINKGO_FENCE_GATE).pattern("# #").pattern("# #").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_fence_gate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, MapleItems.GINKGO_DOOR, 3).pattern("##").pattern("##").pattern("##").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_door");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.GINKGO_BOAT).pattern("# #").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_boat");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MapleItems.GINKGO_CHEST_BOAT).pattern("# #").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(FabricRecipeProvider.hasItem(MapleBlocks.GINKGO_PLANKS), FabricRecipeProvider.conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_chest_boat");

    }
}
