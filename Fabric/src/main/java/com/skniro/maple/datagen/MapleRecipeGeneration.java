package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.StonecuttingRecipeJsonBuilder;
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

                createShaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_BOOTS).pattern("X X").pattern("X X")
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT),
                                conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_CHESTPLATE).pattern("X X").pattern("XXX").pattern("XXX")
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_HELMET).pattern("XXX").pattern("X X")
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_LEGGINGS).pattern("XXX").pattern("X X").pattern("X X")
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_SWORD).pattern("X").pattern("X").pattern("#")
                        .input('#', Items.STICK)
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, MapleArmorItems.Cherry_HOE).pattern("XX").pattern(" #").pattern(" #")
                        .input('#', Items.STICK)
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, MapleArmorItems.Cherry_PICKAXE).pattern("XXX").pattern(" # ").pattern(" # ")
                        .input('#', Items.STICK)
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, MapleArmorItems.Cherry_AXE).pattern("XX").pattern("X#").pattern(" #")
                        .input('#', Items.STICK)
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, MapleArmorItems.Cherry_SHOVEL).pattern("X").pattern("#").pattern("#")
                        .input('#', Items.STICK)
                        .input('X', MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter);

                offerSmelting(Cherry_INGOT, RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT, 0.1F, 200, "cherry_ingot_smelting");
                offerBlasting(Cherry_INGOT, RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT, 0.1F, 200, "cherry_ingot_blasting");


                // cherry nugget / ingot recipes (convert from JSON -> datagen)
                createShapeless(RecipeCategory.MISC, MapleArmorItems.Cherry_NUGGET, 9)
                        .input(MapleArmorItems.Cherry_INGOT)
                        .criterion(hasItem(MapleArmorItems.Cherry_INGOT), conditionsFromItem(MapleArmorItems.Cherry_INGOT))
                        .offerTo(exporter, "cherry_armor_tool/cherry_nugget");

                createShaped(RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT)
                        .pattern("###").pattern("###").pattern("###")
                        .input('#', MapleArmorItems.Cherry_NUGGET)
                        .criterion(hasItem(MapleArmorItems.Cherry_NUGGET), conditionsFromItem(MapleArmorItems.Cherry_NUGGET))
                        .offerTo(exporter, "cherry_armor_tool/cherry_ingot_from_nuggets");

                createShapeless(RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT)
                        .input(Items.IRON_INGOT).input(Items.IRON_INGOT).input(Items.IRON_INGOT).input(Items.IRON_INGOT)
                        .input(Items.GOLD_INGOT).input(Items.GOLD_INGOT).input(Items.GOLD_INGOT).input(Items.GOLD_INGOT)
                        .input(MapleBlocks.MAPLE_LEAVES)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "cherry_armor_tool/cherry_ingot");


                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.WHITE_CONCRETE)
                        .criterion(hasItem(Blocks.WHITE_CONCRETE),
                                conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.ORANGE_CONCRETE)
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE),
                                conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.MAGENTA_CONCRETE)
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE),
                                conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                                conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.YELLOW_CONCRETE)
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE),
                                conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.LIME_CONCRETE)
                        .criterion(hasItem(Blocks.LIME_CONCRETE),
                                conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.PINK_CONCRETE)
                        .criterion(hasItem(Blocks.PINK_CONCRETE),
                                conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.GRAY_CONCRETE),
                                conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                                conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.CYAN_CONCRETE)
                        .criterion(hasItem(Blocks.CYAN_CONCRETE),
                                conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.PURPLE_CONCRETE)
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE),
                                conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.BLUE_CONCRETE),
                                conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.BROWN_CONCRETE)
                        .criterion(hasItem(Blocks.BROWN_CONCRETE),
                                conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.GREEN_CONCRETE)
                        .criterion(hasItem(Blocks.GREEN_CONCRETE),
                                conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.RED_CONCRETE)
                        .criterion(hasItem(Blocks.RED_CONCRETE),
                                conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.BLACK_CONCRETE)
                        .criterion(hasItem(Blocks.BLACK_CONCRETE),
                                conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.WHITE_CONCRETE)
                        .criterion(hasItem(Blocks.WHITE_CONCRETE),
                                conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.ORANGE_CONCRETE)
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE),
                                conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.MAGENTA_CONCRETE)
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE),
                                conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.LIGHT_BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE),
                                conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.YELLOW_CONCRETE)
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE),
                                conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.LIME_CONCRETE)
                        .criterion(hasItem(Blocks.LIME_CONCRETE),
                                conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.PINK_CONCRETE)
                        .criterion(hasItem(Blocks.PINK_CONCRETE),
                                conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.GRAY_CONCRETE),
                                conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.LIGHT_GRAY_CONCRETE)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE),
                                conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.CYAN_CONCRETE)
                        .criterion(hasItem(Blocks.CYAN_CONCRETE),
                                conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.PURPLE_CONCRETE)
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE),
                                conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.BLUE_CONCRETE)
                        .criterion(hasItem(Blocks.BLUE_CONCRETE),
                                conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.BROWN_CONCRETE)
                        .criterion(hasItem(Blocks.BROWN_CONCRETE),
                                conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.GREEN_CONCRETE)
                        .criterion(hasItem(Blocks.GREEN_CONCRETE),
                                conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.RED_CONCRETE)
                        .criterion(hasItem(Blocks.RED_CONCRETE),
                                conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.BLACK_CONCRETE)
                        .criterion(hasItem(Blocks.BLACK_CONCRETE),
                                conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.GLASS)
                        .criterion(hasItem(Blocks.GLASS),
                                conditionsFromItem(Blocks.GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.WHITE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.WHITE_STAINED_GLASS),
                                conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.ORANGE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS),
                                conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.MAGENTA_STAINED_GLASS)
                        .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS),
                                conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                                conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.YELLOW_STAINED_GLASS)
                        .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS),
                                conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.LIME_STAINED_GLASS)
                        .criterion(hasItem(Blocks.LIME_STAINED_GLASS),
                                conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.PINK_STAINED_GLASS)
                        .criterion(hasItem(Blocks.PINK_STAINED_GLASS),
                                conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.GRAY_STAINED_GLASS)
                        .criterion(hasItem(Blocks.GRAY_STAINED_GLASS),
                                conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                                conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.CYAN_STAINED_GLASS)
                        .criterion(hasItem(Blocks.CYAN_STAINED_GLASS),
                                conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.PURPLE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS),
                                conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.BLUE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.BLUE_STAINED_GLASS),
                                conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.BROWN_STAINED_GLASS)
                        .criterion(hasItem(Blocks.BROWN_STAINED_GLASS),
                                conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.GREEN_STAINED_GLASS)
                        .criterion(hasItem(Blocks.GREEN_STAINED_GLASS),
                                conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.RED_STAINED_GLASS)
                        .criterion(hasItem(Blocks.RED_STAINED_GLASS),
                                conditionsFromItem(Blocks.RED_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .input('#', Blocks.BLACK_STAINED_GLASS)
                        .criterion(hasItem(Blocks.BLACK_STAINED_GLASS),
                                conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.GLASS)
                        .criterion(hasItem(Blocks.GLASS),
                                conditionsFromItem(Blocks.GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.WHITE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.WHITE_STAINED_GLASS),
                                conditionsFromItem(Blocks.WHITE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.ORANGE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS),
                                conditionsFromItem(Blocks.ORANGE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.MAGENTA_STAINED_GLASS)
                        .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS),
                                conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS),
                                conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.YELLOW_STAINED_GLASS)
                        .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS),
                                conditionsFromItem(Blocks.YELLOW_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.LIME_STAINED_GLASS)
                        .criterion(hasItem(Blocks.LIME_STAINED_GLASS),
                                conditionsFromItem(Blocks.LIME_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.PINK_STAINED_GLASS)
                        .criterion(hasItem(Blocks.PINK_STAINED_GLASS),
                                conditionsFromItem(Blocks.PINK_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.GRAY_STAINED_GLASS)
                        .criterion(hasItem(Blocks.GRAY_STAINED_GLASS),
                                conditionsFromItem(Blocks.GRAY_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS),
                                conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.CYAN_STAINED_GLASS)
                        .criterion(hasItem(Blocks.CYAN_STAINED_GLASS),
                                conditionsFromItem(Blocks.CYAN_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.PURPLE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS),
                                conditionsFromItem(Blocks.PURPLE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.BLUE_STAINED_GLASS)
                        .criterion(hasItem(Blocks.BLUE_STAINED_GLASS),
                                conditionsFromItem(Blocks.BLUE_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.BROWN_STAINED_GLASS)
                        .criterion(hasItem(Blocks.BROWN_STAINED_GLASS),
                                conditionsFromItem(Blocks.BROWN_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.GREEN_STAINED_GLASS)
                        .criterion(hasItem(Blocks.GREEN_STAINED_GLASS),
                                conditionsFromItem(Blocks.GREEN_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.RED_STAINED_GLASS)
                        .criterion(hasItem(Blocks.RED_STAINED_GLASS),
                                conditionsFromItem(Blocks.RED_STAINED_GLASS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', Blocks.BLACK_STAINED_GLASS)
                        .criterion(hasItem(Blocks.BLACK_STAINED_GLASS),
                                conditionsFromItem(Blocks.BLACK_STAINED_GLASS))
                        .offerTo(exporter);


                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_STAIRS, 1).criterion(hasItem(Blocks.GLASS), conditionsFromItem(Blocks.GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID,"cutting/glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_SLAB, 2).criterion(hasItem(Blocks.GLASS), conditionsFromItem(Blocks.GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.WHITE_STAINED_GLASS), conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID,"cutting/white_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.WHITE_STAINED_GLASS), conditionsFromItem(Blocks.WHITE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/white_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.ORANGE_STAINED_GLASS), conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/orange_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.ORANGE_STAINED_GLASS), conditionsFromItem(Blocks.ORANGE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/orange_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS), conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/magenta_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS), conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/magenta_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_blue_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_blue_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.YELLOW_STAINED_GLASS), conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/yellow_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.YELLOW_STAINED_GLASS), conditionsFromItem(Blocks.YELLOW_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/yellow_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.LIME_STAINED_GLASS), conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/lime_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.LIME_STAINED_GLASS), conditionsFromItem(Blocks.LIME_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/lime_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.PINK_STAINED_GLASS), conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/pink_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.PINK_STAINED_GLASS), conditionsFromItem(Blocks.PINK_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/pink_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.GRAY_STAINED_GLASS), conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/gray_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.GRAY_STAINED_GLASS), conditionsFromItem(Blocks.GRAY_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/gray_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_gray_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS), conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_gray_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.CYAN_STAINED_GLASS), conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/cyan_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.CYAN_STAINED_GLASS), conditionsFromItem(Blocks.CYAN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/cyan_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.PURPLE_STAINED_GLASS), conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/purple_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.PURPLE_STAINED_GLASS), conditionsFromItem(Blocks.PURPLE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/purple_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.BLUE_STAINED_GLASS), conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/blue_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.BLUE_STAINED_GLASS), conditionsFromItem(Blocks.BLUE_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/blue_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.BROWN_STAINED_GLASS), conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/brown_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.BROWN_STAINED_GLASS), conditionsFromItem(Blocks.BROWN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/brown_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.GREEN_STAINED_GLASS), conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/green_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.GREEN_STAINED_GLASS), conditionsFromItem(Blocks.GREEN_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/green_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.RED_STAINED_GLASS), conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/red_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.RED_STAINED_GLASS), conditionsFromItem(Blocks.RED_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/red_stained_glass_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 1).criterion(hasItem(Blocks.BLACK_STAINED_GLASS), conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/black_stained_glass_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 2).criterion(hasItem(Blocks.BLACK_STAINED_GLASS), conditionsFromItem(Blocks.BLACK_STAINED_GLASS)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/black_stained_glass_slab")));

                //CONCRETE Stonecutting Recipes
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/white_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/white_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/orange_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/orange_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/magenta_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/magenta_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_blue_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_blue_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/yellow_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/yellow_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/lime_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/lime_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/pink_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/pink_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/gray_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/gray_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_gray_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/light_gray_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/cyan_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/cyan_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/purple_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/purple_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/blue_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/blue_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/brown_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/brown_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/green_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/green_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/red_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/red_concrete_slab")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 1).criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/black_concrete_stairs")));
                StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 2).criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE)).offerTo(exporter, String.valueOf(Identifier.of(Maple.MOD_ID, "cutting/black_concrete_slab")));
                // Additional datagen conversions for recipes currently in resources

                // snowball variants
                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_STONE, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.STONE)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_stone");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_ICE, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.ICE)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_ice");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_ICE, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.ICE)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_ice2");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_ICE, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.ICE)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_ice3");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_IRON, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.IRON_INGOT)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_iron");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_Gold, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.GOLD_NUGGET)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_gold");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_Diamond, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.DIAMOND)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_diamond");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_Compression, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.WATER_BUCKET)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_compression");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_Teleporting, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.ENDER_PEARL)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_teleporting");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_Confusion, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.RED_MUSHROOM)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_confusion");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_Poison, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.SPIDER_EYE)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_posion");

                createShaped(RecipeCategory.MISC, MapleItems.SNOWBALL_Instant_Health, 32)
                        .pattern("###").pattern("#G#").pattern("###")
                        .input('#', Blocks.SNOW_BLOCK)
                        .input('G', Items.MELON_SLICE)
                        .criterion(hasItem(Blocks.SNOW_BLOCK), conditionsFromItem(Blocks.SNOW_BLOCK))
                        .offerTo(exporter, "snowball/snowball_instant_health");

                // hanging signs
                createShaped(RecipeCategory.MISC, MapleItems.Maple_HANGING_SIGN, 6)
                        .pattern("X X").pattern("###").pattern("###")
                        .input('X', Items.IRON_CHAIN)
                        .input('#', MapleBlocks.STRIPPED_MAPLE_LOG)
                        .criterion(hasItem(MapleBlocks.STRIPPED_MAPLE_LOG), conditionsFromItem(MapleBlocks.STRIPPED_MAPLE_LOG))
                        .offerTo(exporter, "hanging_sign/maple_hanging_sign");

                createShaped(RecipeCategory.MISC, MapleItems.GINKGO_HANGING_SIGN, 6)
                        .pattern("X X").pattern("###").pattern("###")
                        .input('X', Items.IRON_CHAIN)
                        .input('#', MapleBlocks.STRIPPED_GINKGO_LOG)
                        .criterion(hasItem(MapleBlocks.STRIPPED_GINKGO_LOG), conditionsFromItem(MapleBlocks.STRIPPED_GINKGO_LOG))
                        .offerTo(exporter, "hanging_sign/ginkgo_hanging_sign");

                // tatami
                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.TATAMI, 4)
                        .pattern("###").pattern("GGG")
                        .input('#', Items.SHORT_GRASS)
                        .input('G', Items.WHEAT)
                        .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                        .offerTo(exporter, "tatami/tatami");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.TATAMI_SLAB, 6)
                        .pattern("###")
                        .input('#', MapleBlocks.TATAMI)
                        .criterion(hasItem(MapleBlocks.TATAMI), conditionsFromItem(MapleBlocks.TATAMI))
                        .offerTo(exporter, "tatami/tatami_slab");

                // ginkgo sapling
                createShapeless(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_SAPLING)
                        .input(Items.OAK_SAPLING)
                        .input(Items.YELLOW_DYE)
                        .criterion(hasItem(Items.OAK_SAPLING), conditionsFromItem(Items.OAK_SAPLING))
                        .offerTo(exporter, "sapling/ginkgo_sapling");

                // maple wood family (maple + ginkgo) common recipes
                // planks from logs
                createShapeless(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAPLE_PLANKS, 4)
                        .input(MapleItemTagGeneration.ModItemTags.MAPLE_LOGS)
                        .criterion(String.valueOf(conditionsFromTag(MapleItemTagGeneration.ModItemTags.MAPLE_LOGS)), conditionsFromTag(MapleItemTagGeneration.ModItemTags.MAPLE_LOGS))
                        .offerTo(exporter, "maple/maple_planks");

                createShapeless(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_PLANKS, 4)
                        .input(MapleItemTagGeneration.ModItemTags.GINKGO_LOGS)
                        .criterion(String.valueOf(conditionsFromTag(MapleItemTagGeneration.ModItemTags.GINKGO_LOGS)), conditionsFromTag(MapleItemTagGeneration.ModItemTags.GINKGO_LOGS))
                        .offerTo(exporter, "ginkgo/ginkgo_planks");

                // slabs & stairs & trapdoor
                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAPLE_SLAB, 6).pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAPLE_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_stairs");
                createShaped(RecipeCategory.REDSTONE, MapleBlocks.MAPLE_TRAPDOOR, 2).pattern("###").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_trapdoor");

                createShaped(RecipeCategory.MISC, MapleItems.MAPLE_SIGN, 3).pattern("###").pattern("###").pattern(" X ").input('#', MapleBlocks.MAPLE_PLANKS).input('X', Items.STICK).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_sign");

                createShaped(RecipeCategory.REDSTONE, MapleItems.MAPLE_DOOR, 3).pattern("##").pattern("##").pattern("##").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_door");

                createShaped(RecipeCategory.REDSTONE, MapleBlocks.MAPLE_BUTTON).pattern("#").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_button");

                createShaped(RecipeCategory.REDSTONE, MapleBlocks.MAPLE_PRESSURE_PLATE).pattern("##").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_pressure_plate");

                createShaped(RecipeCategory.DECORATIONS, MapleBlocks.MAPLE_FENCE, 3).pattern("# #").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_fence");

                createShaped(RecipeCategory.DECORATIONS, MapleBlocks.MAPLE_FENCE_GATE).pattern("# #").pattern("# #").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_fence_gate");

                createShaped(RecipeCategory.MISC, MapleItems.MAPLE_BOAT).pattern("# #").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_boat");
                createShaped(RecipeCategory.MISC, MapleItems.MAPLE_CHEST_BOAT).pattern("# #").pattern("###").input('#', MapleBlocks.MAPLE_PLANKS).criterion(hasItem(MapleBlocks.MAPLE_PLANKS), conditionsFromItem(MapleBlocks.MAPLE_PLANKS)).offerTo(exporter, "maple/maple_chest_boat");

                // cherry ingot variant using sakura leaves
                createShapeless(RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT)
                        .input(Items.IRON_INGOT).input(Items.IRON_INGOT).input(Items.IRON_INGOT).input(Items.IRON_INGOT)
                        .input(Items.GOLD_INGOT).input(Items.GOLD_INGOT).input(Items.GOLD_INGOT).input(Items.GOLD_INGOT)
                        .input(MapleBlocks.SAKURA_LEAVES)
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "cherry_armor_tool/cherry_ingot_sakura");

                // cheese
                createShapeless(RecipeCategory.MISC, MapleFoodComponents.Cheese)
                        .input(MapleFoodComponents.MILK_BOTTOM)
                        .criterion(hasItem(MapleFoodComponents.MILK_BOTTOM), conditionsFromItem(MapleFoodComponents.MILK_BOTTOM))
                        .offerTo(exporter, "food/cheese");

                // maple wood conversions
                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAPLE_WOOD, 3).pattern("##").pattern("##").input('#', MapleBlocks.MAPLE_LOG).criterion(hasItem(MapleBlocks.MAPLE_LOG), conditionsFromItem(MapleBlocks.MAPLE_LOG)).offerTo(exporter, "maple/maple_wood");
                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.STRIPPED_MAPLE_WOOD, 3).pattern("##").pattern("##").input('#', MapleBlocks.STRIPPED_MAPLE_LOG).criterion(hasItem(MapleBlocks.STRIPPED_MAPLE_LOG), conditionsFromItem(MapleBlocks.STRIPPED_MAPLE_LOG)).offerTo(exporter, "maple/stripped_maple_wood");

                // ginkgo wood conversions & family
                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_WOOD, 3).pattern("##").pattern("##").input('#', MapleBlocks.GINKGO_LOG).criterion(hasItem(MapleBlocks.GINKGO_LOG), conditionsFromItem(MapleBlocks.GINKGO_LOG)).offerTo(exporter, "ginkgo/ginkgo_wood");
                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.STRIPPED_GINKGO_WOOD, 3).pattern("##").pattern("##").input('#', MapleBlocks.STRIPPED_GINKGO_LOG).criterion(hasItem(MapleBlocks.STRIPPED_GINKGO_LOG), conditionsFromItem(MapleBlocks.STRIPPED_GINKGO_LOG)).offerTo(exporter, "ginkgo/stripped_ginkgo_wood");

                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_SLAB, 6).pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_slab");
                createShaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GINKGO_STAIRS, 4).pattern("#  ").pattern("## ").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_stairs");
                createShaped(RecipeCategory.REDSTONE, MapleBlocks.GINKGO_TRAPDOOR, 2).pattern("###").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_trapdoor");

                createShaped(RecipeCategory.MISC, MapleItems.GINKGO_SIGN, 3).pattern("###").pattern("###").pattern(" X ").input('#', MapleBlocks.GINKGO_PLANKS).input('X', Items.STICK).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_sign");
                createShaped(RecipeCategory.REDSTONE, MapleBlocks.GINKGO_BUTTON).pattern("#").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_button");
                createShaped(RecipeCategory.REDSTONE, MapleBlocks.GINKGO_PRESSURE_PLATE).pattern("##").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_pressure_plate");

                createShaped(RecipeCategory.DECORATIONS, MapleBlocks.GINKGO_FENCE, 3).pattern("# #").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_fence");
                createShaped(RecipeCategory.DECORATIONS, MapleBlocks.GINKGO_FENCE_GATE).pattern("# #").pattern("# #").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_fence_gate");

                createShaped(RecipeCategory.REDSTONE, MapleItems.GINKGO_DOOR, 3).pattern("##").pattern("##").pattern("##").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_door");
                createShaped(RecipeCategory.MISC, MapleItems.GINKGO_BOAT).pattern("# #").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_boat");
                createShaped(RecipeCategory.MISC, MapleItems.GINKGO_CHEST_BOAT).pattern("# #").pattern("###").input('#', MapleBlocks.GINKGO_PLANKS).criterion(hasItem(MapleBlocks.GINKGO_PLANKS), conditionsFromItem(MapleBlocks.GINKGO_PLANKS)).offerTo(exporter, "ginkgo/ginkgo_chest_boat");

            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}