package com.skniro.maple.datagen;

import com.google.common.collect.Lists;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MapleRecipeGeneration extends FabricRecipeProvider {
    public MapleRecipeGeneration(FabricDataOutput generator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(generator, registryLookup);
    }


    public static final List<ItemLike> STRIPPED_MAPLE = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleBlocks.STRIPPED_MAPLE_LOG);
        list.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
    });

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleItems.MILK_BOTTOM,3).requires(Items.MILK_BUCKET).unlockedBy(FabricRecipeProvider.getHasName(MapleItems.MILK_BOTTOM),
                FabricRecipeProvider.has(MapleItems.MILK_BOTTOM)).unlockedBy(FabricRecipeProvider.getHasName(Items.MILK_BUCKET),
                FabricRecipeProvider.has(Items.MILK_BUCKET)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleItems.Flour,2).requires(Items.WHEAT).unlockedBy(FabricRecipeProvider.getHasName(MapleItems.Flour),
                FabricRecipeProvider.has(MapleItems.Flour)).unlockedBy(FabricRecipeProvider.getHasName(Items.WHEAT),
                FabricRecipeProvider.has(Items.WHEAT)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleBlocks.SAKURA_SAPLING,2).requires(Items.PINK_DYE).unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.SAKURA_SAPLING),
                FabricRecipeProvider.has(MapleBlocks.SAKURA_SAPLING)).unlockedBy(FabricRecipeProvider.getHasName(Items.PINK_DYE),
                FabricRecipeProvider.has(Items.PINK_DYE)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Anko_Dango,1)
                .requires(Items.SUGAR)
                .requires(Items.SUGAR)
                .requires(MapleFoodComponents.Mochi)
                .requires(MapleItems.SOYBEAN)
                .requires(Items.BAMBOO)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Anko_Dango),
                FabricRecipeProvider.has(MapleFoodComponents.Anko_Dango)).unlockedBy(FabricRecipeProvider.getHasName(Items.SUGAR),
                FabricRecipeProvider.has(Items.SUGAR)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Mochi,2)
                .requires(MapleFoodComponents.Cooked_Rice)
                .requires(MapleFoodComponents.Cooked_Rice)
                .requires(MapleFoodComponents.Cooked_Rice)
                .requires(MapleFoodComponents.Cooked_Rice)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Mochi),
                        FabricRecipeProvider.has(MapleFoodComponents.Mochi))
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Cooked_Rice),
                        FabricRecipeProvider.has(MapleFoodComponents.Cooked_Rice)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.SakuraMochi,2)
                .requires(MapleFoodComponents.Mochi)
                .requires(MapleBlocks.SAKURA_LEAVES)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Mochi),
                        FabricRecipeProvider.has(MapleFoodComponents.Mochi))
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Cooked_Rice),
                        FabricRecipeProvider.has(MapleFoodComponents.Cooked_Rice)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleItems.Cream,3)
                .requires(MapleItems.MILK_BOTTOM)
                .requires(MapleItems.MILK_BOTTOM)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleItems.Cream),
                        FabricRecipeProvider.has(MapleItems.Cream))
                .unlockedBy(FabricRecipeProvider.getHasName(MapleItems.MILK_BOTTOM),
                        FabricRecipeProvider.has(MapleItems.MILK_BOTTOM)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Cooked_Rice,2)
                .requires(MapleItems.Rice)
                .requires(MapleItems.Rice)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Cooked_Rice),
                        FabricRecipeProvider.has(MapleFoodComponents.Cooked_Rice))
                .unlockedBy(FabricRecipeProvider.getHasName(MapleItems.Rice),
                        FabricRecipeProvider.has(MapleItems.Rice)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Kinako_Dango,1)
                .requires(Items.SUGAR)
                .requires(MapleFoodComponents.Mochi)
                .requires(MapleItems.SOYBEAN)
                .requires(Items.BAMBOO)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Kinako_Dango),
                        FabricRecipeProvider.has(MapleFoodComponents.Kinako_Dango))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.SUGAR),
                        FabricRecipeProvider.has(Items.SUGAR)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Zunda_Dango,1)
                .requires(Items.SUGAR)
                .requires(MapleFoodComponents.Mochi)
                .requires(MapleItems.SOYBEAN)
                .requires(MapleItems.SOYBEAN)
                .requires(Items.BAMBOO)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Zunda_Dango),
                        FabricRecipeProvider.has(MapleFoodComponents.Zunda_Dango))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.SUGAR),
                        FabricRecipeProvider.has(Items.SUGAR)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Sanshoku_Dango,1)
                .requires(Items.SUGAR)
                .requires(MapleFoodComponents.Mochi)
                .requires(Items.SHORT_GRASS)
                .requires(MapleBlocks.SAKURA_LEAVES)
                .requires(Items.BAMBOO)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Sanshoku_Dango),
                        FabricRecipeProvider.has(MapleFoodComponents.Sanshoku_Dango))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.SUGAR),
                        FabricRecipeProvider.has(Items.SUGAR)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.TOFU,1)
                .requires(MapleItems.SOYBEAN)
                .requires(MapleItems.SOYBEAN)
                .requires(Items.WATER_BUCKET)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.TOFU),
                        FabricRecipeProvider.has(MapleFoodComponents.TOFU))
                .unlockedBy(FabricRecipeProvider.getHasName(MapleItems.SOYBEAN),
                        FabricRecipeProvider.has(MapleItems.SOYBEAN)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.MILK_ICECREAM,2)
                .requires(MapleItems.Cream)
                .requires(MapleItems.MILK_BOTTOM)
                .requires(Items.WATER_BUCKET)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.MILK_ICECREAM),
                        FabricRecipeProvider.has(MapleFoodComponents.MILK_ICECREAM))
                .unlockedBy(FabricRecipeProvider.getHasName(MapleItems.Cream),
                        FabricRecipeProvider.has(MapleItems.Cream))
                .unlockedBy(FabricRecipeProvider.getHasName(MapleItems.MILK_BOTTOM),
                        FabricRecipeProvider.has(MapleItems.MILK_BOTTOM)).save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD ,MapleFoodComponents.Beef_Rice,1)
                .requires(MapleFoodComponents.Cooked_Rice)
                .requires(Items.BEEF)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleFoodComponents.Cooked_Rice),
                        FabricRecipeProvider.has(MapleFoodComponents.Cooked_Rice))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.BEEF),
                        FabricRecipeProvider.has(Items.BEEF))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS ,MapleBlocks.Maple_CARPET,2)
                .requires(MapleBlocks.MAPLE_LEAVES,2)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.MAPLE_LEAVES),
                        FabricRecipeProvider.has(MapleBlocks.MAPLE_LEAVES))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS ,MapleBlocks.RED_MAPLE_CARPET,2)
                .requires(MapleBlocks.RED_MAPLE_LEAVES,2)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.RED_MAPLE_LEAVES),
                        FabricRecipeProvider.has(MapleBlocks.RED_MAPLE_LEAVES))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS ,MapleBlocks.GINKGO_CARPET,2)
                .requires(MapleBlocks.GINKGO_LEAVES,2)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.GINKGO_LEAVES),
                        FabricRecipeProvider.has(MapleBlocks.GINKGO_LEAVES))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS ,MapleBlocks.SAKURA_CARPET,2)
                .requires(MapleBlocks.SAKURA_LEAVES,2)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.SAKURA_LEAVES),
                        FabricRecipeProvider.has(MapleBlocks.SAKURA_LEAVES))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, MapleBlocks.PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', Blocks.SAND)
                .define('i', Blocks.BAMBOO_BLOCK)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.SAND),
                        FabricRecipeProvider.has(Blocks.SAND))
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.BAMBOO_BLOCK),
                        FabricRecipeProvider.has(Blocks.BAMBOO_BLOCK))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.GREEN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.GREEN_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.GREEN_DYE),
                        FabricRecipeProvider.has(Items.GREEN_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.ORANGE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.ORANGE_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.ORANGE_DYE),
                        FabricRecipeProvider.has(Items.ORANGE_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.MAGENTA_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.MAGENTA_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.MAGENTA_DYE),
                        FabricRecipeProvider.has(Items.MAGENTA_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIGHT_BLUE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.LIGHT_BLUE_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.LIGHT_BLUE_DYE),
                        FabricRecipeProvider.has(Items.LIGHT_BLUE_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.YELLOW_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.YELLOW_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.YELLOW_DYE),
                        FabricRecipeProvider.has(Items.YELLOW_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIME_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.LIME_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.LIME_DYE),
                        FabricRecipeProvider.has(Items.LIME_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.PINK_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.PINK_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.PINK_DYE),
                        FabricRecipeProvider.has(Items.PINK_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.GRAY_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.GRAY_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.GRAY_DYE),
                        FabricRecipeProvider.has(Items.GRAY_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.LIGHT_GRAY_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.LIGHT_GRAY_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.LIGHT_GRAY_DYE),
                        FabricRecipeProvider.has(Items.LIGHT_GRAY_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.CYAN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.CYAN_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.CYAN_DYE),
                        FabricRecipeProvider.has(Items.CYAN_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.PURPLE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.PURPLE_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.PURPLE_DYE),
                        FabricRecipeProvider.has(Items.PURPLE_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.BLUE_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.BLUE_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.BLUE_DYE),
                        FabricRecipeProvider.has(Items.BLUE_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.BROWN_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.BROWN_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.BROWN_DYE),
                        FabricRecipeProvider.has(Items.BROWN_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.RED_PLASTER,8).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', MapleBlocks.PLASTER)
                .define('i', Items.GREEN_DYE)
                .unlockedBy(FabricRecipeProvider.getHasName(MapleBlocks.PLASTER),
                        FabricRecipeProvider.has(MapleBlocks.PLASTER))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.RED_DYE),
                        FabricRecipeProvider.has(Items.RED_DYE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.Iron_Sea_Lantern).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', Blocks.SEA_LANTERN)
                .define('i', Items.IRON_NUGGET)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.SEA_LANTERN),
                        FabricRecipeProvider.has(Blocks.SEA_LANTERN))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.IRON_NUGGET),
                        FabricRecipeProvider.has(Items.IRON_NUGGET))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS ,MapleBlocks.Gold_Sea_Lantern).pattern("bbb").pattern("bib").pattern("bbb")
                .define('b', Blocks.SEA_LANTERN)
                .define('i', Items.GOLD_NUGGET)
                .unlockedBy(FabricRecipeProvider.getHasName(Blocks.SEA_LANTERN),
                        FabricRecipeProvider.has(Blocks.SEA_LANTERN))
                .unlockedBy(FabricRecipeProvider.getHasName(Items.GOLD_NUGGET),
                        FabricRecipeProvider.has(Items.GOLD_NUGGET))
                .save(exporter);

        RecipeProvider.oreSmelting(exporter, STRIPPED_MAPLE, RecipeCategory.FOOD , MapleItems.MapleSyrup, 0.45F, 300, "maple_syrup");

    }
}
