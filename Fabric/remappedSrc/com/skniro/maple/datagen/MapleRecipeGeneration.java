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
    public static final List<ItemLike> Green_Tea = Util.make(Lists.newArrayList(), list -> {
        list.add(MapleFoodComponents.Green_Tea_Leaves);
    });

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput exporter) {
        return new RecipeProvider(wrapperLookup, exporter) {
            @Override
            public void buildRecipes() {
        shapeless(RecipeCategory.FOOD ,MapleFoodComponents.MILK_BOTTOM,3).requires(Items.MILK_BUCKET).unlockedBy(getHasName(MapleFoodComponents.MILK_BOTTOM),
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
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}