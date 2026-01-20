package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.tag.MapleItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MapleRecipeGeneration extends FabricRecipeProvider {
    public MapleRecipeGeneration(FabricPackOutput generator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(generator, registryLookup);
    }


    public static final List<ItemLike> STRIPPED_MAPLE = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleBlocks.STRIPPED_MAPLE_LOG);
        list.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
    });
    public static final List<ItemLike> Green_Tea = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleFoodComponents.Green_Tea_Leaves);
    });

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput exporter) {
        return new RecipeProvider(wrapperLookup, exporter) {
            @Override
            public void buildRecipes() {
        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.MILK_BOTTOM,3).requires(Items.MILK_BUCKET).requires(Items.GLASS_BOTTLE,3).unlockedBy(getHasName(MapleFoodComponents.MILK_BOTTOM),
                has(MapleFoodComponents.MILK_BOTTOM)).unlockedBy(getHasName(Items.MILK_BUCKET),
                has(Items.MILK_BUCKET)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleItems.Flour,2).requires(Items.WHEAT).unlockedBy(getHasName(MapleItems.Flour),
                has(MapleItems.Flour)).unlockedBy(getHasName(Items.WHEAT),
                has(Items.WHEAT)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleBlocks.SAKURA_SAPLING,2).requires(Items.PINK_DYE).unlockedBy(getHasName(MapleBlocks.SAKURA_SAPLING),
                has(MapleBlocks.SAKURA_SAPLING)).unlockedBy(getHasName(Items.PINK_DYE),
                has(Items.PINK_DYE)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Anko_Dango,1)
                .requires(Items.SUGAR)
                .requires(Items.SUGAR)
                .requires(MapleFoodComponents.Mochi)
                .requires(MapleItems.SOYBEAN)
                .requires(Items.BAMBOO)
                .unlockedBy(getHasName(MapleFoodComponents.Anko_Dango),
                has(MapleFoodComponents.Anko_Dango)).unlockedBy(getHasName(Items.SUGAR),
                has(Items.SUGAR)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Mochi,2)
                .requires(MapleFoodComponents.Cooked_Rice)
                .requires(MapleFoodComponents.Cooked_Rice)
                .requires(MapleFoodComponents.Cooked_Rice)
                .requires(MapleFoodComponents.Cooked_Rice)
                .unlockedBy(getHasName(MapleFoodComponents.Mochi),
                        has(MapleFoodComponents.Mochi))
                .unlockedBy(getHasName(MapleFoodComponents.Cooked_Rice),
                        has(MapleFoodComponents.Cooked_Rice)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.SakuraMochi,2)
                .requires(MapleFoodComponents.Mochi)
                .requires(MapleBlocks.SAKURA_LEAVES)
                .unlockedBy(getHasName(MapleFoodComponents.Mochi),
                        has(MapleFoodComponents.Mochi))
                .unlockedBy(getHasName(MapleFoodComponents.Cooked_Rice),
                        has(MapleFoodComponents.Cooked_Rice)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleItems.Cream,3)
                .requires(MapleFoodComponents.MILK_BOTTOM)
                .requires(MapleFoodComponents.MILK_BOTTOM)
                .unlockedBy(getHasName(MapleItems.Cream),
                        has(MapleItems.Cream))
                .unlockedBy(getHasName(MapleFoodComponents.MILK_BOTTOM),
                        has(MapleFoodComponents.MILK_BOTTOM)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Cooked_Rice,2)
                .requires(MapleItems.Rice)
                .requires(MapleItems.Rice)
                .unlockedBy(getHasName(MapleFoodComponents.Cooked_Rice),
                        has(MapleFoodComponents.Cooked_Rice))
                .unlockedBy(getHasName(MapleItems.Rice),
                        has(MapleItems.Rice)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Kinako_Dango,1)
                .requires(Items.SUGAR)
                .requires(MapleFoodComponents.Mochi)
                .requires(MapleItems.SOYBEAN)
                .requires(Items.BAMBOO)
                .unlockedBy(getHasName(MapleFoodComponents.Kinako_Dango),
                        has(MapleFoodComponents.Kinako_Dango))
                .unlockedBy(getHasName(Items.SUGAR),
                        has(Items.SUGAR)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Zunda_Dango,1)
                .requires(Items.SUGAR)
                .requires(MapleFoodComponents.Mochi)
                .requires(MapleItems.SOYBEAN)
                .requires(MapleItems.SOYBEAN)
                .requires(Items.BAMBOO)
                .unlockedBy(getHasName(MapleFoodComponents.Zunda_Dango),
                        has(MapleFoodComponents.Zunda_Dango))
                .unlockedBy(getHasName(Items.SUGAR),
                        has(Items.SUGAR)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Sanshoku_Dango,1)
                .requires(Items.SUGAR)
                .requires(MapleFoodComponents.Mochi)
                .requires(Items.SHORT_GRASS)
                .requires(MapleBlocks.SAKURA_LEAVES)
                .requires(Items.BAMBOO)
                .unlockedBy(getHasName(MapleFoodComponents.Sanshoku_Dango),
                        has(MapleFoodComponents.Sanshoku_Dango))
                .unlockedBy(getHasName(Items.SUGAR),
                        has(Items.SUGAR)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.TOFU,1)
                .requires(MapleItems.SOYBEAN)
                .requires(MapleItems.SOYBEAN)
                .requires(Items.WATER_BUCKET)
                .unlockedBy(getHasName(MapleFoodComponents.TOFU),
                        has(MapleFoodComponents.TOFU))
                .unlockedBy(getHasName(MapleItems.SOYBEAN),
                        has(MapleItems.SOYBEAN)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.MILK_ICECREAM,2)
                .requires(MapleItems.Cream)
                .requires(MapleFoodComponents.MILK_BOTTOM)
                .requires(Items.WATER_BUCKET)
                .unlockedBy(getHasName(MapleFoodComponents.MILK_ICECREAM),
                        has(MapleFoodComponents.MILK_ICECREAM))
                .unlockedBy(getHasName(MapleItems.Cream),
                        has(MapleItems.Cream))
                .unlockedBy(getHasName(MapleFoodComponents.MILK_BOTTOM),
                        has(MapleFoodComponents.MILK_BOTTOM)).save(output);

        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Beef_Rice,1)
                .requires(MapleFoodComponents.Cooked_Rice)
                .requires(Items.BEEF)
                .unlockedBy(getHasName(MapleFoodComponents.Cooked_Rice),
                        has(MapleFoodComponents.Cooked_Rice))
                .unlockedBy(getHasName(Items.BEEF),
                        has(Items.BEEF))
                .save(output);

        shapeless(RecipeCategory.DECORATIONS ,MapleBlocks.Maple_CARPET,2)
                .requires(MapleBlocks.MAPLE_LEAVES,2)
                .unlockedBy(getHasName(MapleBlocks.MAPLE_LEAVES),
                        has(MapleBlocks.MAPLE_LEAVES))
                .save(output);

        shapeless(RecipeCategory.DECORATIONS ,MapleBlocks.RED_MAPLE_CARPET,2)
                .requires(MapleBlocks.RED_MAPLE_LEAVES,2)
                .unlockedBy(getHasName(MapleBlocks.RED_MAPLE_LEAVES),
                        has(MapleBlocks.RED_MAPLE_LEAVES))
                .save(output);

        shapeless(RecipeCategory.DECORATIONS ,MapleBlocks.GINKGO_CARPET,2)
                .requires(MapleBlocks.GINKGO_LEAVES,2)
                .unlockedBy(getHasName(MapleBlocks.GINKGO_LEAVES),
                        has(MapleBlocks.GINKGO_LEAVES))
                .save(output);

        shapeless(RecipeCategory.DECORATIONS ,MapleBlocks.SAKURA_CARPET,2)
                .requires(MapleBlocks.SAKURA_LEAVES,2)
                .unlockedBy(getHasName(MapleBlocks.SAKURA_LEAVES),
                        has(MapleBlocks.SAKURA_LEAVES))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', Blocks.SAND)
                .define('i', Blocks.BAMBOO_BLOCK)
                .unlockedBy(getHasName(Blocks.SAND),
                        has(Blocks.SAND))
                .unlockedBy(getHasName(Blocks.BAMBOO_BLOCK),
                        has(Blocks.BAMBOO_BLOCK))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.GREEN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.GREEN_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.GREEN_DYE),
                        has(Items.GREEN_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.ORANGE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.ORANGE_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.ORANGE_DYE),
                        has(Items.ORANGE_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.MAGENTA_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.MAGENTA_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.MAGENTA_DYE),
                        has(Items.MAGENTA_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIGHT_BLUE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.LIGHT_BLUE_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.LIGHT_BLUE_DYE),
                        has(Items.LIGHT_BLUE_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.YELLOW_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.YELLOW_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.YELLOW_DYE),
                        has(Items.YELLOW_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIME_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.LIME_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.LIME_DYE),
                        has(Items.LIME_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.PINK_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.PINK_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.PINK_DYE),
                        has(Items.PINK_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.GRAY_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.GRAY_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.GRAY_DYE),
                        has(Items.GRAY_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIGHT_GRAY_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.LIGHT_GRAY_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.LIGHT_GRAY_DYE),
                        has(Items.LIGHT_GRAY_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.CYAN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.CYAN_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.CYAN_DYE),
                        has(Items.CYAN_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.PURPLE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.PURPLE_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.PURPLE_DYE),
                        has(Items.PURPLE_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.BLUE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.BLUE_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.BLUE_DYE),
                        has(Items.BLUE_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.BROWN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.BROWN_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.BROWN_DYE),
                        has(Items.BROWN_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.RED_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.GREEN_DYE)
                .unlockedBy(getHasName(MapleBlocks.PLASTER),
                        has(MapleBlocks.PLASTER))
                .unlockedBy(getHasName(Items.RED_DYE),
                        has(Items.RED_DYE))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.Iron_Sea_Lantern).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', Blocks.SEA_LANTERN)
                .define('i', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Blocks.SEA_LANTERN),
                        has(Blocks.SEA_LANTERN))
                .unlockedBy(getHasName(Items.IRON_NUGGET),
                        has(Items.IRON_NUGGET))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.Gold_Sea_Lantern).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', Blocks.SEA_LANTERN)
                .define('i', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Blocks.SEA_LANTERN),
                        has(Blocks.SEA_LANTERN))
                .unlockedBy(getHasName(Items.GOLD_NUGGET),
                        has(Items.GOLD_NUGGET))
                .save(output);

        shapeless(RecipeCategory.FOOD , MapleFoodComponents.Red_Tea,1)
                .requires(MapleFoodComponents.Red_Tea_Leaves,2)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy(getHasName(MapleFoodComponents.Red_Tea_Leaves),
                        has(MapleFoodComponents.Red_Tea_Leaves))
                .unlockedBy(getHasName(Items.GLASS_BOTTLE),
                        has(Items.GLASS_BOTTLE)).save(output);

        shapeless(RecipeCategory.FOOD , MapleFoodComponents.Green_Tea,1)
                .requires(MapleFoodComponents.Green_Tea_Leaves,2)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy(getHasName(MapleFoodComponents.Green_Tea_Leaves),
                        has(MapleFoodComponents.Green_Tea_Leaves))
                .unlockedBy(getHasName(Items.GLASS_BOTTLE),
                        has(Items.GLASS_BOTTLE)).save(output);

                oreSmelting(STRIPPED_MAPLE, RecipeCategory.FOOD , MapleItems.MapleSyrup, 0.45F, 300, "maple_syrup");
                oreSmelting(Green_Tea, RecipeCategory.FOOD , MapleFoodComponents.Red_Tea_Leaves, 0.45F, 300, "red_tea");

                shaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_BOOTS).pattern("X X").pattern("X X")
                        .define('X', MapleArmorItems.Cherry_INGOT)
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_INGOT),
                                has(MapleArmorItems.Cherry_INGOT))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_CHESTPLATE).pattern("X X").pattern("XXX").pattern("XXX")
                        .define('X', MapleArmorItems.Cherry_INGOT)
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_INGOT), has(MapleArmorItems.Cherry_INGOT))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_HELMET).pattern("XXX").pattern("X X")
                        .define('X', MapleArmorItems.Cherry_INGOT)
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_INGOT), has(MapleArmorItems.Cherry_INGOT))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, MapleArmorItems.Cherry_LEGGINGS).pattern("XXX").pattern("X X").pattern("X X")
                        .define('X', MapleArmorItems.Cherry_INGOT)
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_INGOT), has(MapleArmorItems.Cherry_INGOT))
                        .save(this.output);

                shaped(RecipeCategory.COMBAT, Items.DIAMOND_SWORD).pattern("X").pattern("X").pattern("#")
                        .define('#', Items.STICK)
                        .define('X', MapleItemTags.CHERRY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(MapleItemTags.CHERRY_TOOL_MATERIALS))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, MapleArmorItems.Cherry_HOE).pattern("XX").pattern(" #").pattern(" #")
                        .define('#', Items.STICK)
                        .define('X', MapleItemTags.CHERRY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(MapleItemTags.CHERRY_TOOL_MATERIALS))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, MapleArmorItems.Cherry_PICKAXE).pattern("XXX").pattern(" # ").pattern(" # ")
                        .define('#', Items.STICK)
                        .define('X', MapleItemTags.CHERRY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(MapleItemTags.CHERRY_TOOL_MATERIALS))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, MapleArmorItems.Cherry_AXE).pattern("XX").pattern("X#").pattern(" #")
                        .define('#', Items.STICK)
                        .define('X', MapleItemTags.CHERRY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(MapleItemTags.CHERRY_TOOL_MATERIALS))
                        .save(this.output);

                shaped(RecipeCategory.TOOLS, MapleArmorItems.Cherry_SHOVEL).pattern("X").pattern("#").pattern("#")
                        .define('#', Items.STICK)
                        .define('X', MapleItemTags.CHERRY_TOOL_MATERIALS)
                        .unlockedBy("has_ruby", has(MapleItemTags.CHERRY_TOOL_MATERIALS))
                        .save(this.output);

                SimpleCookingRecipeBuilder.smelting
                                (Ingredient.of(MapleArmorItems.Cherry_PICKAXE, MapleArmorItems.Cherry_SHOVEL, MapleArmorItems.Cherry_AXE, MapleArmorItems.Cherry_HOE, MapleArmorItems.Cherry_SWORD, MapleArmorItems.Cherry_HELMET, MapleArmorItems.Cherry_CHESTPLATE, MapleArmorItems.Cherry_LEGGINGS, MapleArmorItems.Cherry_BOOTS)
                                        , RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT, 0.1F, 200)
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_PICKAXE), has(MapleArmorItems.Cherry_PICKAXE))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_SHOVEL), has(MapleArmorItems.Cherry_SHOVEL))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_AXE), has(MapleArmorItems.Cherry_AXE))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_HOE), has(MapleArmorItems.Cherry_HOE))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_SWORD), has(MapleArmorItems.Cherry_SWORD))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_HELMET), has(MapleArmorItems.Cherry_HELMET))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_CHESTPLATE), has(MapleArmorItems.Cherry_CHESTPLATE))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_LEGGINGS), has(MapleArmorItems.Cherry_LEGGINGS))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_BOOTS), has(MapleArmorItems.Cherry_BOOTS))
                        .save(this.output, getSmeltingRecipeName(MapleArmorItems.Cherry_INGOT));

                SimpleCookingRecipeBuilder.blasting
                                (Ingredient.of(MapleArmorItems.Cherry_PICKAXE, MapleArmorItems.Cherry_SHOVEL, MapleArmorItems.Cherry_AXE, MapleArmorItems.Cherry_HOE, MapleArmorItems.Cherry_SWORD, MapleArmorItems.Cherry_HELMET, MapleArmorItems.Cherry_CHESTPLATE, MapleArmorItems.Cherry_LEGGINGS, MapleArmorItems.Cherry_BOOTS)
                                        , RecipeCategory.MISC, MapleArmorItems.Cherry_INGOT, 0.1F, 200)
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_PICKAXE), has(MapleArmorItems.Cherry_PICKAXE))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_SHOVEL), has(MapleArmorItems.Cherry_SHOVEL))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_AXE), has(MapleArmorItems.Cherry_AXE))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_HOE), has(MapleArmorItems.Cherry_HOE))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_SWORD), has(MapleArmorItems.Cherry_SWORD))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_HELMET), has(MapleArmorItems.Cherry_HELMET))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_CHESTPLATE), has(MapleArmorItems.Cherry_CHESTPLATE))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_LEGGINGS), has(MapleArmorItems.Cherry_LEGGINGS))
                        .unlockedBy(getHasName(MapleArmorItems.Cherry_BOOTS), has(MapleArmorItems.Cherry_BOOTS))
                        .save(this.output, getBlastingRecipeName(MapleArmorItems.Cherry_INGOT));


                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.WHITE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.WHITE_CONCRETE),
                                has(Blocks.WHITE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.ORANGE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.ORANGE_CONCRETE),
                                has(Blocks.ORANGE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.MAGENTA_CONCRETE)
                        .unlockedBy(getHasName(Blocks.MAGENTA_CONCRETE),
                                has(Blocks.MAGENTA_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                                has(Blocks.LIGHT_BLUE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.YELLOW_CONCRETE)
                        .unlockedBy(getHasName(Blocks.YELLOW_CONCRETE),
                                has(Blocks.YELLOW_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.LIME_CONCRETE)
                        .unlockedBy(getHasName(Blocks.LIME_CONCRETE),
                                has(Blocks.LIME_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.PINK_CONCRETE)
                        .unlockedBy(getHasName(Blocks.PINK_CONCRETE),
                                has(Blocks.PINK_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.GRAY_CONCRETE)
                        .unlockedBy(getHasName(Blocks.GRAY_CONCRETE),
                                has(Blocks.GRAY_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                                has(Blocks.LIGHT_GRAY_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.CYAN_CONCRETE)
                        .unlockedBy(getHasName(Blocks.CYAN_CONCRETE),
                                has(Blocks.CYAN_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.PURPLE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.PURPLE_CONCRETE),
                                has(Blocks.PURPLE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.BLUE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.BLUE_CONCRETE),
                                has(Blocks.BLUE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.BROWN_CONCRETE)
                        .unlockedBy(getHasName(Blocks.BROWN_CONCRETE),
                                has(Blocks.BROWN_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.GREEN_CONCRETE)
                        .unlockedBy(getHasName(Blocks.GREEN_CONCRETE),
                                has(Blocks.GREEN_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.RED_CONCRETE)
                        .unlockedBy(getHasName(Blocks.RED_CONCRETE),
                                has(Blocks.RED_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.BLACK_CONCRETE)
                        .unlockedBy(getHasName(Blocks.BLACK_CONCRETE),
                                has(Blocks.BLACK_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.WHITE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.WHITE_CONCRETE),
                                has(Blocks.WHITE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.ORANGE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.ORANGE_CONCRETE),
                                has(Blocks.ORANGE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.MAGENTA_CONCRETE)
                        .unlockedBy(getHasName(Blocks.MAGENTA_CONCRETE),
                                has(Blocks.MAGENTA_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.LIGHT_BLUE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_CONCRETE),
                                has(Blocks.LIGHT_BLUE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.YELLOW_CONCRETE)
                        .unlockedBy(getHasName(Blocks.YELLOW_CONCRETE),
                                has(Blocks.YELLOW_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.LIME_CONCRETE)
                        .unlockedBy(getHasName(Blocks.LIME_CONCRETE),
                                has(Blocks.LIME_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.PINK_CONCRETE)
                        .unlockedBy(getHasName(Blocks.PINK_CONCRETE),
                                has(Blocks.PINK_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.GRAY_CONCRETE)
                        .unlockedBy(getHasName(Blocks.GRAY_CONCRETE),
                                has(Blocks.GRAY_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.LIGHT_GRAY_CONCRETE)
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_CONCRETE),
                                has(Blocks.LIGHT_GRAY_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.CYAN_CONCRETE)
                        .unlockedBy(getHasName(Blocks.CYAN_CONCRETE),
                                has(Blocks.CYAN_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.PURPLE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.PURPLE_CONCRETE),
                                has(Blocks.PURPLE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.BLUE_CONCRETE)
                        .unlockedBy(getHasName(Blocks.BLUE_CONCRETE),
                                has(Blocks.BLUE_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.BROWN_CONCRETE)
                        .unlockedBy(getHasName(Blocks.BROWN_CONCRETE),
                                has(Blocks.BROWN_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.GREEN_CONCRETE)
                        .unlockedBy(getHasName(Blocks.GREEN_CONCRETE),
                                has(Blocks.GREEN_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.RED_CONCRETE)
                        .unlockedBy(getHasName(Blocks.RED_CONCRETE),
                                has(Blocks.RED_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.BLACK_CONCRETE)
                        .unlockedBy(getHasName(Blocks.BLACK_CONCRETE),
                                has(Blocks.BLACK_CONCRETE))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.GLASS)
                        .unlockedBy(getHasName(Blocks.GLASS),
                                has(Blocks.GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.WHITE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.WHITE_STAINED_GLASS),
                                has(Blocks.WHITE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.ORANGE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.ORANGE_STAINED_GLASS),
                                has(Blocks.ORANGE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.MAGENTA_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.MAGENTA_STAINED_GLASS),
                                has(Blocks.MAGENTA_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                                has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.YELLOW_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.YELLOW_STAINED_GLASS),
                                has(Blocks.YELLOW_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.LIME_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.LIME_STAINED_GLASS),
                                has(Blocks.LIME_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.PINK_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.PINK_STAINED_GLASS),
                                has(Blocks.PINK_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.GRAY_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.GRAY_STAINED_GLASS),
                                has(Blocks.GRAY_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                                has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.CYAN_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.CYAN_STAINED_GLASS),
                                has(Blocks.CYAN_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.PURPLE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.PURPLE_STAINED_GLASS),
                                has(Blocks.PURPLE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.BLUE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.BLUE_STAINED_GLASS),
                                has(Blocks.BLUE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.BROWN_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.BROWN_STAINED_GLASS),
                                has(Blocks.BROWN_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.GREEN_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.GREEN_STAINED_GLASS),
                                has(Blocks.GREEN_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.RED_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.RED_STAINED_GLASS),
                                has(Blocks.RED_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 6)
                        .pattern("###")
                        .define('#', Blocks.BLACK_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.BLACK_STAINED_GLASS),
                                has(Blocks.BLACK_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.GLASS)
                        .unlockedBy(getHasName(Blocks.GLASS),
                                has(Blocks.GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.WHITE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.WHITE_STAINED_GLASS),
                                has(Blocks.WHITE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.ORANGE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.ORANGE_STAINED_GLASS),
                                has(Blocks.ORANGE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.MAGENTA_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.MAGENTA_STAINED_GLASS),
                                has(Blocks.MAGENTA_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.LIGHT_BLUE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS),
                                has(Blocks.LIGHT_BLUE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.YELLOW_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.YELLOW_STAINED_GLASS),
                                has(Blocks.YELLOW_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.LIME_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.LIME_STAINED_GLASS),
                                has(Blocks.LIME_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.PINK_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.PINK_STAINED_GLASS),
                                has(Blocks.PINK_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.GRAY_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.GRAY_STAINED_GLASS),
                                has(Blocks.GRAY_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.LIGHT_GRAY_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS),
                                has(Blocks.LIGHT_GRAY_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.CYAN_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.CYAN_STAINED_GLASS),
                                has(Blocks.CYAN_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.PURPLE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.PURPLE_STAINED_GLASS),
                                has(Blocks.PURPLE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.BLUE_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.BLUE_STAINED_GLASS),
                                has(Blocks.BLUE_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.BROWN_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.BROWN_STAINED_GLASS),
                                has(Blocks.BROWN_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.GREEN_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.GREEN_STAINED_GLASS),
                                has(Blocks.GREEN_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.RED_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.RED_STAINED_GLASS),
                                has(Blocks.RED_STAINED_GLASS))
                        .save(exporter);

                shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', Blocks.BLACK_STAINED_GLASS)
                        .unlockedBy(getHasName(Blocks.BLACK_STAINED_GLASS),
                                has(Blocks.BLACK_STAINED_GLASS))
                        .save(exporter);


                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.GLASS), has(Blocks.GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID,"cutting/glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.GLASS), has(Blocks.GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.WHITE_STAINED_GLASS), has(Blocks.WHITE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID,"cutting/white_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.WHITE_STAINED_GLASS), has(Blocks.WHITE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/white_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.ORANGE_STAINED_GLASS), has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/orange_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.ORANGE_STAINED_GLASS), has(Blocks.ORANGE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/orange_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.MAGENTA_STAINED_GLASS), has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/magenta_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.MAGENTA_STAINED_GLASS), has(Blocks.MAGENTA_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/magenta_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/light_blue_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.LIGHT_BLUE_STAINED_GLASS), has(Blocks.LIGHT_BLUE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/light_blue_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.YELLOW_STAINED_GLASS), has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/yellow_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.YELLOW_STAINED_GLASS), has(Blocks.YELLOW_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/yellow_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.LIME_STAINED_GLASS), has(Blocks.LIME_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/lime_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.LIME_STAINED_GLASS), has(Blocks.LIME_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/lime_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.PINK_STAINED_GLASS), has(Blocks.PINK_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/pink_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.PINK_STAINED_GLASS), has(Blocks.PINK_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/pink_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.GRAY_STAINED_GLASS), has(Blocks.GRAY_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/gray_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.GRAY_STAINED_GLASS), has(Blocks.GRAY_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/gray_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/light_gray_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.LIGHT_GRAY_STAINED_GLASS), has(Blocks.LIGHT_GRAY_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/light_gray_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.CYAN_STAINED_GLASS), has(Blocks.CYAN_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/cyan_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.CYAN_STAINED_GLASS), has(Blocks.CYAN_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/cyan_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.PURPLE_STAINED_GLASS), has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/purple_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.PURPLE_STAINED_GLASS), has(Blocks.PURPLE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/purple_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.BLUE_STAINED_GLASS), has(Blocks.BLUE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/blue_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.BLUE_STAINED_GLASS), has(Blocks.BLUE_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/blue_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.BROWN_STAINED_GLASS), has(Blocks.BROWN_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/brown_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.BROWN_STAINED_GLASS), has(Blocks.BROWN_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/brown_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.GREEN_STAINED_GLASS), has(Blocks.GREEN_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/green_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.GREEN_STAINED_GLASS), has(Blocks.GREEN_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/green_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.RED_STAINED_GLASS), has(Blocks.RED_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/red_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.RED_STAINED_GLASS), has(Blocks.RED_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/red_stained_glass_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_STAIRS, 1).unlockedBy(getHasName(Blocks.BLACK_STAINED_GLASS), has(Blocks.BLACK_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/black_stained_glass_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_STAINED_GLASS), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_STAINED_GLASS_SLAB, 2).unlockedBy(getHasName(Blocks.BLACK_STAINED_GLASS), has(Blocks.BLACK_STAINED_GLASS)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/black_stained_glass_slab")));

                //CONCRETE Stonecutting Recipes
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.WHITE_CONCRETE), has(Blocks.WHITE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/white_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.WHITE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.WHITE_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.WHITE_CONCRETE), has(Blocks.WHITE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/white_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.ORANGE_CONCRETE), has(Blocks.ORANGE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/orange_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.ORANGE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.ORANGE_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.ORANGE_CONCRETE), has(Blocks.ORANGE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/orange_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.MAGENTA_CONCRETE), has(Blocks.MAGENTA_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/magenta_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.MAGENTA_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.MAGENTA_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.MAGENTA_CONCRETE), has(Blocks.MAGENTA_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/magenta_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.LIGHT_BLUE_CONCRETE), has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/light_blue_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.LIGHT_BLUE_CONCRETE), has(Blocks.LIGHT_BLUE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/light_blue_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.YELLOW_CONCRETE), has(Blocks.YELLOW_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/yellow_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.YELLOW_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.YELLOW_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.YELLOW_CONCRETE), has(Blocks.YELLOW_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/yellow_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.LIME_CONCRETE), has(Blocks.LIME_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/lime_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIME_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIME_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.LIME_CONCRETE), has(Blocks.LIME_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/lime_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.PINK_CONCRETE), has(Blocks.PINK_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/pink_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PINK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PINK_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.PINK_CONCRETE), has(Blocks.PINK_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/pink_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.GRAY_CONCRETE), has(Blocks.GRAY_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/gray_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GRAY_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.GRAY_CONCRETE), has(Blocks.GRAY_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/gray_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.LIGHT_GRAY_CONCRETE), has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/light_gray_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.LIGHT_GRAY_CONCRETE), has(Blocks.LIGHT_GRAY_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/light_gray_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.CYAN_CONCRETE), has(Blocks.CYAN_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/cyan_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CYAN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.CYAN_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.CYAN_CONCRETE), has(Blocks.CYAN_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/cyan_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.PURPLE_CONCRETE), has(Blocks.PURPLE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/purple_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.PURPLE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PURPLE_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.PURPLE_CONCRETE), has(Blocks.PURPLE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/purple_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.BLUE_CONCRETE), has(Blocks.BLUE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/blue_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLUE_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLUE_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.BLUE_CONCRETE), has(Blocks.BLUE_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/blue_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.BROWN_CONCRETE), has(Blocks.BROWN_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/brown_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BROWN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BROWN_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.BROWN_CONCRETE), has(Blocks.BROWN_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/brown_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.GREEN_CONCRETE), has(Blocks.GREEN_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/green_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.GREEN_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.GREEN_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.GREEN_CONCRETE), has(Blocks.GREEN_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/green_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.RED_CONCRETE), has(Blocks.RED_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/red_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.RED_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.RED_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.RED_CONCRETE), has(Blocks.RED_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/red_concrete_slab")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_STAIRS, 1).unlockedBy(getHasName(Blocks.BLACK_CONCRETE), has(Blocks.BLACK_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/black_concrete_stairs")));
                SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.BLACK_CONCRETE), RecipeCategory.BUILDING_BLOCKS, MapleBlocks.BLACK_CONCRETE_SLAB, 2).unlockedBy(getHasName(Blocks.BLACK_CONCRETE), has(Blocks.BLACK_CONCRETE)).save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(Maple.MOD_ID, "cutting/black_concrete_slab")));
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}