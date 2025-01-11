package com.skniro.maple;


import com.mojang.datafixers.schemas.Schema;
import com.skniro.maple.block.*;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.entity.MapleEntityType;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.misc.qsldatafixupper.api.QuiltDataFixerBuilder;
import com.skniro.maple.misc.qsldatafixupper.api.QuiltDataFixes;
import com.skniro.maple.misc.qsldatafixupper.api.SimpleFixes;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.util.MapleFlammableBlocks;
import com.skniro.maple.util.MapleLootTableModifiers;
import com.skniro.maple.util.MapleStrippableBlocks;
import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import com.skniro.maple.world.feature.MaplePlacedFeatures;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.feature.MapleBiomeFeatures;
import com.skniro.maple.world.gamerules.MapleGameRules;
import com.skniro.maple.world.gen.MapleLakeGeneration;
import com.skniro.maple.world.gen.MapleOreGeneration;
import com.skniro.maple.world.gen.MapleTreeGeneration;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.datafixer.schema.IdentifierNormalizingSchema;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;


public class MapleContent {


    public static void registerItem(){
        MapleItems.registerModItems();
        GlassCupItems.registerModItems();
        MapleFoodComponents.registerMapleFoodItems();
        MapleArmorItems.registerMapleArmorItems();
    }
    public static void registerBlock(){
        MapleFlammableBlocks.registerFlammableBlocks();
        MapleStrippableBlocks.registerStrippables();
        MapleBlocks.registerMapleBlocks();
        MapleSignBlocks.registerMapleSignBlocks();
        MapleOreBlocks.registerMapleOreBlocks();
        MapleNetherOresBlocks.registerNetherOresBlock();
        MapleCushionBlocks.registerCushionBlocks();
    }

    public static void registerFluid(){
        MapleFluids.registerFluids();
        MapleFluidBlockOrItem.registerFluidBlocks();
        MapleFluidBlockOrItem.registerFluidItems();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group).register(content -> {
            content.add(MapleBlocks.MAPLE_LOG);
            content.add(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(MapleBlocks.MAPLE_WOOD);
            content.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(MapleBlocks.MAPLE_SAPLING);
            content.add(MapleBlocks.RED_MAPLE_SAPLING);
            content.add(MapleBlocks.SAKURA_SAPLING);
            content.add(MapleBlocks.SAKURA_CARPET);
            content.add(MapleBlocks.MAPLE_LEAVES);
            content.add(MapleBlocks.Maple_CARPET);
            content.add(MapleBlocks.SAKURA_LEAVES);
            content.add(MapleBlocks.MAPLE_PLANKS);
            content.add(MapleBlocks.RED_MAPLE_LEAVES);
            content.add(MapleBlocks.RED_MAPLE_CARPET);
            content.add(MapleBlocks.MAPLE_BUTTON);
            content.add(MapleBlocks.MAPLE_STAIRS);
            content.add(MapleBlocks.MAPLE_SLAB);
            content.add(MapleBlocks.MAPLE_FENCE);
            content.add(MapleBlocks.MAPLE_FENCE_GATE);
            content.add(MapleBlocks.MAPLE_TRAPDOOR);
            content.add(MapleBlocks.MAPLE_PRESSURE_PLATE);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIME_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIME_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.PINK_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.RED_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.RED_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.GLASS_SLAB);
            content.add(MapleBlocks.GLASS_STAIRS);
            content.add(MapleItems.MAPLE_SIGN);
            content.add(MapleItems.Maple_HANGING_SIGN);
            content.add(MapleItems.MAPLE_DOOR);
            content.add(MapleItems.MAPLE_BOAT);
            content.add(MapleItems.MAPLE_CHEST_BOAT);
            content.add(MapleBlocks.GINKGO_LOG);
            content.add(MapleBlocks.STRIPPED_GINKGO_LOG);
            content.add(MapleBlocks.STRIPPED_GINKGO_WOOD);
            content.add(MapleBlocks.GINKGO_WOOD);
            content.add(MapleBlocks.STRIPPED_GINKGO_WOOD);
            content.add(MapleBlocks.STRIPPED_GINKGO_LOG);
            content.add(MapleBlocks.GINKGO_SAPLING);
            content.add(MapleBlocks.GINKGO_LEAVES);
            content.add(MapleBlocks.GINKGO_CARPET);
            content.add(MapleBlocks.GINKGO_PLANKS);
            content.add(MapleBlocks.GINKGO_BUTTON);
            content.add(MapleBlocks.GINKGO_STAIRS);
            content.add(MapleBlocks.GINKGO_SLAB);
            content.add(MapleBlocks.GINKGO_FENCE);
            content.add(MapleBlocks.GINKGO_FENCE_GATE);
            content.add(MapleBlocks.GINKGO_TRAPDOOR);
            content.add(MapleBlocks.GINKGO_PRESSURE_PLATE);
            content.add(MapleItems.GINKGO_SIGN);
            content.add(MapleItems.GINKGO_HANGING_SIGN);
            content.add(MapleItems.GINKGO_DOOR);
            content.add(MapleItems.GINKGO_BOAT);
            content.add(MapleItems.GINKGO_CHEST_BOAT);
            content.add(MapleOreBlocks.Salt_Ore);
            content.add(MapleOreBlocks.DEEPSLATE_Salt_Ore);
            content.add(MapleItems.SNOWBALL_STONE);
            content.add(MapleItems.SNOWBALL_Diamond);
            content.add(MapleItems.SNOWBALL_Gold);
            content.add(MapleItems.SNOWBALL_ICE);
            content.add(MapleItems.SNOWBALL_IRON);
            content.add(MapleItems.SNOWBALL_Compression);
            content.add(MapleItems.SNOWBALL_Teleporting);
            content.add(MapleItems.SNOWBALL_Confusion);
            content.add(MapleItems.SNOWBALL_Instant_Health);
            content.add(MapleItems.SNOWBALL_Poison);
            content.add(MapleBlocks.TATAMI);
            content.add(MapleBlocks.TATAMI_SLAB);
            content.add(MapleFluidBlockOrItem.Hot_Spring_BUCKET);
            content.add(MapleNetherOresBlocks.Nether_Coal_Ore);
            content.add(MapleNetherOresBlocks.Nether_Copper_Ore);
            content.add(MapleNetherOresBlocks.Nether_Diamond_Ore);
            content.add(MapleNetherOresBlocks.Nether_Emerald_Ore);
            content.add(MapleNetherOresBlocks.Nether_Gold_Ore);
            content.add(MapleNetherOresBlocks.Nether_Iron_Ore);
            content.add(MapleNetherOresBlocks.Nether_Lapis_Ore);
            content.add(MapleNetherOresBlocks.Nether_Redstone_Ore);
            //PLASTER
            content.add(MapleBlocks.GREEN_PLASTER);
            content.add(MapleBlocks.PLASTER);
            content.add(MapleBlocks.ORANGE_PLASTER);
            content.add(MapleBlocks.MAGENTA_PLASTER);
            content.add(MapleBlocks.LIGHT_BLUE_PLASTER);
            content.add(MapleBlocks.YELLOW_PLASTER);
            content.add(MapleBlocks.LIME_PLASTER);
            content.add(MapleBlocks.PINK_PLASTER);
            content.add(MapleBlocks.GRAY_PLASTER);
            content.add(MapleBlocks.LIGHT_GRAY_PLASTER);
            content.add(MapleBlocks.CYAN_PLASTER);
            content.add(MapleBlocks.PURPLE_PLASTER);
            content.add(MapleBlocks.BLUE_PLASTER);
            content.add(MapleBlocks.BROWN_PLASTER);
            content.add(MapleBlocks.RED_PLASTER);
            //Sea Lantern
            content.add(MapleBlocks.Iron_Sea_Lantern);
            content.add(MapleBlocks.Gold_Sea_Lantern);
            //Cherry Armor and tools
            content.add(MapleArmorItems.Cherry_INGOT);
            content.add(MapleArmorItems.Cherry_NUGGET);
            content.add(MapleArmorItems.Cherry_HELMET);
            content.add(MapleArmorItems.Cherry_CHESTPLATE);
            content.add(MapleArmorItems.Cherry_LEGGINGS);
            content.add(MapleArmorItems.Cherry_BOOTS);
            content.add(MapleArmorItems.Cherry_SWORD);
            content.add(MapleArmorItems.Cherry_AXE);
            content.add(MapleArmorItems.Cherry_PICKAXE);
            content.add(MapleArmorItems.Cherry_SHOVEL);
            content.add(MapleArmorItems.Cherry_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group_Food).register(content -> {
            content.add(MapleItems.Flour);
            content.add(MapleItems.MapleSyrup);
            content.add(MapleItems.Cream);
            content.add(MapleItems.MILK_BOTTOM);
            content.add(MapleItems.SOYBEAN);
            content.add(MapleItems.Salt);
            content.add(MapleItems.Rice);
            content.add(MapleFoodComponents.Sanshoku_Dango);
            content.add(MapleFoodComponents.Anko_Dango);
            content.add(MapleFoodComponents.Zunda_Dango);
            content.add(MapleFoodComponents.Kinako_Dango);
            content.add(MapleFoodComponents.Mochi);
            content.add(MapleFoodComponents.SakuraMochi);
            content.add(MapleFoodComponents.TOFU);
            content.add(MapleFoodComponents.MILK_ICECREAM);
            content.add(MapleFoodComponents.Cooked_Rice);
            content.add(MapleFoodComponents.Beef_Rice);
            content.add(MapleFoodComponents.Cheese);
        });

        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group_Furniture).register(content -> {
            //Cushion
            content.add(MapleCushionBlocks.CUSHION_OAK_WHITE);
            content.add(MapleCushionBlocks.CUSHION_OAK_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_OAK_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_OAK_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_OAK_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_OAK_LIME);
            content.add(MapleCushionBlocks.CUSHION_OAK_PINK);
            content.add(MapleCushionBlocks.CUSHION_OAK_GRAY);
            content.add(MapleCushionBlocks.CUSHION_OAK_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_OAK_CYAN);
            content.add(MapleCushionBlocks.CUSHION_OAK_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_OAK_BLUE);
            content.add(MapleCushionBlocks.CUSHION_OAK_BROWN);
            content.add(MapleCushionBlocks.CUSHION_OAK_GREEN);
            content.add(MapleCushionBlocks.CUSHION_OAK_RED);
            content.add(MapleCushionBlocks.CUSHION_OAK_BLACK);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_WHITE);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_LIME);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_PINK);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_GRAY);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_CYAN);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_BLUE);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_BROWN);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_GREEN);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_RED);
            content.add(MapleCushionBlocks.CUSHION_SPRUCE_BLACK);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_WHITE);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_LIME);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_PINK);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_GRAY);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_CYAN);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_BLUE);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_BROWN);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_GREEN);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_RED);
            content.add(MapleCushionBlocks.CUSHION_BIRCH_BLACK);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_WHITE);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_LIME);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_PINK);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_GRAY);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_CYAN);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_BLUE);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_BROWN);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_GREEN);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_RED);
            content.add(MapleCushionBlocks.CUSHION_JUNGLE_BLACK);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_WHITE);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_LIME);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_PINK);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_GRAY);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_CYAN);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_BLUE);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_BROWN);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_GREEN);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_RED);
            content.add(MapleCushionBlocks.CUSHION_ACACIA_BLACK);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_WHITE);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_LIME);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_PINK);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_GRAY);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_CYAN);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_BLUE);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_BROWN);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_GREEN);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_RED);
            content.add(MapleCushionBlocks.CUSHION_DARK_OAK_BLACK);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_WHITE);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_LIME);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_PINK);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_GRAY);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_CYAN);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_BLUE);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_BROWN);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_GREEN);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_RED);
            content.add(MapleCushionBlocks.CUSHION_CRIMSON_BLACK);
            content.add(MapleCushionBlocks.CUSHION_WARPED_WHITE);
            content.add(MapleCushionBlocks.CUSHION_WARPED_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_WARPED_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_WARPED_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_WARPED_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_WARPED_LIME);
            content.add(MapleCushionBlocks.CUSHION_WARPED_PINK);
            content.add(MapleCushionBlocks.CUSHION_WARPED_GRAY);
            content.add(MapleCushionBlocks.CUSHION_WARPED_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_WARPED_CYAN);
            content.add(MapleCushionBlocks.CUSHION_WARPED_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_WARPED_BLUE);
            content.add(MapleCushionBlocks.CUSHION_WARPED_BROWN);
            content.add(MapleCushionBlocks.CUSHION_WARPED_GREEN);
            content.add(MapleCushionBlocks.CUSHION_WARPED_RED);
            content.add(MapleCushionBlocks.CUSHION_WARPED_BLACK);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_WHITE);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_LIME);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_PINK);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_GRAY);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_CYAN);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_BLUE);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_BROWN);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_GREEN);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_RED);
            content.add(MapleCushionBlocks.CUSHION_MANGROVE_BLACK);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_WHITE);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_LIME);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_PINK);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_GRAY);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_CYAN);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_BLUE);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_BROWN);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_GREEN);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_RED);
            content.add(MapleCushionBlocks.CUSHION_MAPLE_BLACK);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_WHITE);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_LIME);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_PINK);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_GRAY);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_CYAN);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_BLUE);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_BROWN);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_GREEN);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_RED);
            content.add(MapleCushionBlocks.CUSHION_CHERRY_BLACK);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_WHITE);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_LIME);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_PINK);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_GRAY);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_CYAN);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_BLUE);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_BROWN);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_GREEN);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_RED);
            content.add(MapleCushionBlocks.CUSHION_GINKGO_BLACK);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_WHITE);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_ORANGE);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_MAGENTA);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_LIGHT_BLUE);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_YELLOW);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_LIME);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_PINK);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_GRAY);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_LIGHT_GRAY);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_CYAN);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_PURPLE);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_BLUE);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_BROWN);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_GREEN);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_RED);
            content.add(MapleCushionBlocks.CUSHION_BAMBOO_BLACK);
        });


    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        MapleConfiguredFeatures.registerConfiguredFeatures();
        MaplePlacedFeatures.registerPlacedFeatures();
        MapleOreGeneration.generateOres();
        MapleBiomeKeys.registerBiome();
        MapleBiomeFeatures.registerBiomesFeatures();
        MapleLakeGeneration.generateHotSpringLake();
    }

    public static void registerBlockEntityType() {
        MapleBlockEntityType.registerMapleBlockEntityType();
        MapleParticleTypes.registerParticleTypes();
        MapleEntityType.registerMapleEntityType();
    }

    public static void registerCommand() {
        MapleGameRules.maplegamerule();
    }

    public static void registerMapleLootTable() {
        MapleLootTableModifiers.modifyLootTables();
    }

    public static void registerMapleCompostableItems() {
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.CHERRY_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.MAPLE_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.RED_MAPLE_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.SAKURA_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.GINKGO_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.CHERRY_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.MAPLE_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.RED_MAPLE_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.SAKURA_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.GINKGO_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.Maple_CARPET, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.RED_MAPLE_CARPET, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.GINKGO_CARPET, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.SAKURA_CARPET, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleItems.Rice, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleItems.SOYBEAN, 0.3f);
    }


    private static final int DATA_VERSION = 3;
    public static void datafix(final @NotNull ModContainer mod) {
        QuiltDataFixerBuilder builder = new QuiltDataFixerBuilder(DATA_VERSION);
        builder.addSchema(0, QuiltDataFixes.BASE_SCHEMA);
        Schema schemaV1 = builder.addSchema(3, IdentifierNormalizingSchema::new);
        SimpleFixes.addItemRenameFix(builder, "Rename old_item to new_item",
                new Identifier(Maple.MOD_ID, "cherry_log"), new Identifier(Maple.MOD_ID, "cherry_log"), schemaV1);
        SimpleFixes.addBlockRenameFix(builder, "Rename cherry_log to vanilla",
                new Identifier(Maple.MOD_ID, "cherry_log"), new Identifier(Maple.MOD_ID, "cherry_log"), schemaV1);
/*        Schema schemaV2 = builder.addSchema(2, IdentifierNormalizingSchema::new);
        SimpleFixes.addItemRenameFix(builder, "Rename new_item to fine_item",
                new Identifier(Maple.MOD_ID, "new_item"), new Identifier(Maple.MOD_ID, "fine_item"), schemaV2);
        SimpleFixes.addBlockRenameFix(builder, "Rename old_block to cool_block",
                new Identifier(Maple.MOD_ID, "old_block"), new Identifier(Maple.MOD_ID, "cool_block"), schemaV2);*/
        QuiltDataFixes.buildAndRegisterFixer(mod,new QuiltDataFixerBuilder(3));
    }



}

