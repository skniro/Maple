package com.skniro.maple;


import com.skniro.maple.block.*;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.client.particle.MapleCherryLeavesParticle;
import com.skniro.maple.client.renderer.ChairRenderer;
import com.skniro.maple.client.renderer.CushinoRenderer;
import com.skniro.maple.entity.MapleEntityType;
import com.skniro.maple.entity.village.MapleVillagers;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.item.init.equipment.MapleEquipmentAssetKeys;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.recipe.MapleRecipeType;
import com.skniro.maple.screen.MapleScreenHandlerType;
import com.skniro.maple.util.MapleFlammableBlocks;
import com.skniro.maple.util.MapleLootTableModifiers;
import com.skniro.maple.util.MapleStrippableBlocks;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.feature.MapleBiomeFeatures;
import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import com.skniro.maple.world.feature.MaplePlacedFeatures;
import com.skniro.maple.world.gamerules.MapleGameRules;
import com.skniro.maple.world.gen.MapleLakeGeneration;
import com.skniro.maple.world.gen.MapleOreGeneration;
import com.skniro.maple.world.gen.MapleTreeGeneration;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.resources.ResourceLocation;


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
        MapleFurnitureBlocks.registerCushionBlocks();
    }

    public static void registerFluid(){
        MapleFluids.registerFluids();
        MapleFluidBlockOrItem.registerFluidBlocks();
        MapleFluidBlockOrItem.registerFluidItems();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group).register(content -> {
            content.accept(MapleBlocks.MAPLE_LOG);
            content.accept(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.accept(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.accept(MapleBlocks.MAPLE_WOOD);
            content.accept(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.accept(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.accept(MapleBlocks.MAPLE_SAPLING);
            content.accept(MapleBlocks.RED_MAPLE_SAPLING);
            content.accept(MapleBlocks.SAKURA_SAPLING);
            content.accept(MapleBlocks.SAKURA_CARPET);
            content.accept(MapleBlocks.MAPLE_LEAVES);
            content.accept(MapleBlocks.Maple_CARPET);
            content.accept(MapleBlocks.SAKURA_LEAVES);
            content.accept(MapleBlocks.MAPLE_PLANKS);
            content.accept(MapleBlocks.RED_MAPLE_LEAVES);
            content.accept(MapleBlocks.RED_MAPLE_CARPET);
            content.accept(MapleBlocks.MAPLE_BUTTON);
            content.accept(MapleBlocks.MAPLE_STAIRS);
            content.accept(MapleBlocks.MAPLE_SLAB);
            content.accept(MapleBlocks.MAPLE_FENCE);
            content.accept(MapleBlocks.MAPLE_FENCE_GATE);
            content.accept(MapleBlocks.MAPLE_TRAPDOOR);
            content.accept(MapleBlocks.MAPLE_PRESSURE_PLATE);
            content.accept(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.LIME_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.LIME_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.PINK_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.PINK_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.RED_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.RED_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
            content.accept(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);
            content.accept(MapleBlocks.GLASS_SLAB);
            content.accept(MapleBlocks.GLASS_STAIRS);
            content.accept(MapleItems.MAPLE_SIGN);
            content.accept(MapleItems.Maple_HANGING_SIGN);
            content.accept(MapleItems.MAPLE_DOOR);
            content.accept(MapleItems.MAPLE_BOAT);
            content.accept(MapleItems.MAPLE_CHEST_BOAT);
            content.accept(MapleBlocks.GINKGO_LOG);
            content.accept(MapleBlocks.STRIPPED_GINKGO_LOG);
            content.accept(MapleBlocks.STRIPPED_GINKGO_WOOD);
            content.accept(MapleBlocks.GINKGO_WOOD);
            content.accept(MapleBlocks.STRIPPED_GINKGO_WOOD);
            content.accept(MapleBlocks.STRIPPED_GINKGO_LOG);
            content.accept(MapleBlocks.GINKGO_SAPLING);
            content.accept(MapleBlocks.GINKGO_LEAVES);
            content.accept(MapleBlocks.GINKGO_CARPET);
            content.accept(MapleBlocks.GINKGO_PLANKS);
            content.accept(MapleBlocks.GINKGO_BUTTON);
            content.accept(MapleBlocks.GINKGO_STAIRS);
            content.accept(MapleBlocks.GINKGO_SLAB);
            content.accept(MapleBlocks.GINKGO_FENCE);
            content.accept(MapleBlocks.GINKGO_FENCE_GATE);
            content.accept(MapleBlocks.GINKGO_TRAPDOOR);
            content.accept(MapleBlocks.GINKGO_PRESSURE_PLATE);
            content.accept(MapleItems.GINKGO_SIGN);
            content.accept(MapleItems.GINKGO_HANGING_SIGN);
            content.accept(MapleItems.GINKGO_DOOR);
            content.accept(MapleItems.GINKGO_BOAT);
            content.accept(MapleItems.GINKGO_CHEST_BOAT);
            content.accept(MapleOreBlocks.Salt_Ore);
            content.accept(MapleOreBlocks.DEEPSLATE_Salt_Ore);
            content.accept(MapleItems.SNOWBALL_STONE);
            content.accept(MapleItems.SNOWBALL_Diamond);
            content.accept(MapleItems.SNOWBALL_Gold);
            content.accept(MapleItems.SNOWBALL_ICE);
            content.accept(MapleItems.SNOWBALL_IRON);
            content.accept(MapleItems.SNOWBALL_Compression);
            content.accept(MapleItems.SNOWBALL_Teleporting);
            content.accept(MapleItems.SNOWBALL_Confusion);
            content.accept(MapleItems.SNOWBALL_Instant_Health);
            content.accept(MapleItems.SNOWBALL_Poison);
            content.accept(MapleBlocks.TATAMI);
            content.accept(MapleBlocks.TATAMI_SLAB);
            content.accept(MapleFluidBlockOrItem.Hot_Spring_BUCKET);
            content.accept(MapleNetherOresBlocks.Nether_Coal_Ore);
            content.accept(MapleNetherOresBlocks.Nether_Copper_Ore);
            content.accept(MapleNetherOresBlocks.Nether_Diamond_Ore);
            content.accept(MapleNetherOresBlocks.Nether_Emerald_Ore);
            content.accept(MapleNetherOresBlocks.Nether_Gold_Ore);
            content.accept(MapleNetherOresBlocks.Nether_Iron_Ore);
            content.accept(MapleNetherOresBlocks.Nether_Lapis_Ore);
            content.accept(MapleNetherOresBlocks.Nether_Redstone_Ore);
            //PLASTER
            content.accept(MapleBlocks.GREEN_PLASTER);
            content.accept(MapleBlocks.PLASTER);
            content.accept(MapleBlocks.ORANGE_PLASTER);
            content.accept(MapleBlocks.MAGENTA_PLASTER);
            content.accept(MapleBlocks.LIGHT_BLUE_PLASTER);
            content.accept(MapleBlocks.YELLOW_PLASTER);
            content.accept(MapleBlocks.LIME_PLASTER);
            content.accept(MapleBlocks.PINK_PLASTER);
            content.accept(MapleBlocks.GRAY_PLASTER);
            content.accept(MapleBlocks.LIGHT_GRAY_PLASTER);
            content.accept(MapleBlocks.CYAN_PLASTER);
            content.accept(MapleBlocks.PURPLE_PLASTER);
            content.accept(MapleBlocks.BLUE_PLASTER);
            content.accept(MapleBlocks.BROWN_PLASTER);
            content.accept(MapleBlocks.RED_PLASTER);
            //Sea Lantern
            content.accept(MapleBlocks.Iron_Sea_Lantern);
            content.accept(MapleBlocks.Gold_Sea_Lantern);
            //Cherry Armor and tools
            content.accept(MapleArmorItems.Cherry_INGOT);
            content.accept(MapleArmorItems.Cherry_NUGGET);
            content.accept(MapleArmorItems.Cherry_HELMET);
            content.accept(MapleArmorItems.Cherry_CHESTPLATE);
            content.accept(MapleArmorItems.Cherry_LEGGINGS);
            content.accept(MapleArmorItems.Cherry_BOOTS);
            content.accept(MapleArmorItems.Cherry_SWORD);
            content.accept(MapleArmorItems.Cherry_AXE);
            content.accept(MapleArmorItems.Cherry_PICKAXE);
            content.accept(MapleArmorItems.Cherry_SHOVEL);
            content.accept(MapleArmorItems.Cherry_HOE);
            content.accept(MapleBlocks.WHITE_CONCRETE_SLAB);
            content.accept(MapleBlocks.WHITE_CONCRETE_STAIRS);
            content.accept(MapleBlocks.ORANGE_CONCRETE_SLAB);
            content.accept(MapleBlocks.ORANGE_CONCRETE_STAIRS);
            content.accept(MapleBlocks.MAGENTA_CONCRETE_SLAB);
            content.accept(MapleBlocks.MAGENTA_CONCRETE_STAIRS);
            content.accept(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            content.accept(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            content.accept(MapleBlocks.YELLOW_CONCRETE_SLAB);
            content.accept(MapleBlocks.YELLOW_CONCRETE_STAIRS);
            content.accept(MapleBlocks.LIME_CONCRETE_SLAB);
            content.accept(MapleBlocks.LIME_CONCRETE_STAIRS);
            content.accept(MapleBlocks.PINK_CONCRETE_SLAB);
            content.accept(MapleBlocks.PINK_CONCRETE_STAIRS);
            content.accept(MapleBlocks.GRAY_CONCRETE_SLAB);
            content.accept(MapleBlocks.GRAY_CONCRETE_STAIRS);
            content.accept(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            content.accept(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            content.accept(MapleBlocks.CYAN_CONCRETE_SLAB);
            content.accept(MapleBlocks.CYAN_CONCRETE_STAIRS);
            content.accept(MapleBlocks.PURPLE_CONCRETE_SLAB);;
            content.accept(MapleBlocks.PURPLE_CONCRETE_STAIRS);
            content.accept(MapleBlocks.BLUE_CONCRETE_SLAB);
            content.accept(MapleBlocks.BLUE_CONCRETE_STAIRS);
            content.accept(MapleBlocks.BROWN_CONCRETE_SLAB);
            content.accept(MapleBlocks.BROWN_CONCRETE_STAIRS);
            content.accept(MapleBlocks.GREEN_CONCRETE_SLAB);
            content.accept(MapleBlocks.GREEN_CONCRETE_STAIRS);
            content.accept(MapleBlocks.RED_CONCRETE_SLAB);
            content.accept(MapleBlocks.RED_CONCRETE_STAIRS);
            content.accept(MapleBlocks.BLACK_CONCRETE_SLAB);
            content.accept(MapleBlocks.BLACK_CONCRETE_STAIRS);
            content.accept(MapleBlocks.Maple_Juicer_Block);
        });

        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group_Food).register(content -> {
            content.accept(MapleItems.Flour);
            content.accept(MapleItems.MapleSyrup);
            content.accept(MapleItems.Cream);
            content.accept(MapleFoodComponents.MILK_BOTTOM);
            content.accept(MapleItems.SOYBEAN);
            content.accept(MapleItems.Salt);
            content.accept(MapleItems.Rice);
            content.accept(MapleFoodComponents.Sanshoku_Dango);
            content.accept(MapleFoodComponents.Anko_Dango);
            content.accept(MapleFoodComponents.Zunda_Dango);
            content.accept(MapleFoodComponents.Kinako_Dango);
            content.accept(MapleFoodComponents.Mochi);
            content.accept(MapleFoodComponents.SakuraMochi);
            content.accept(MapleFoodComponents.TOFU);
            content.accept(MapleFoodComponents.MILK_ICECREAM);
            content.accept(MapleFoodComponents.Cooked_Rice);
            content.accept(MapleFoodComponents.Beef_Rice);
            content.accept(MapleFoodComponents.Cheese);
            content.accept(MapleFoodComponents.Chorus_Juice);
            content.accept(MapleFoodComponents.AppleJuice);
            content.accept(MapleFoodComponents.CarrotJuice);
            content.accept(MapleFoodComponents.MelonJuice);
            content.accept(MapleFoodComponents.Sweet_Berries_Juice);
            content.accept(MapleFoodComponents.Glow_Berries_Juice);
            content.accept(MapleFoodComponents.Green_Tea);
            content.accept(MapleFoodComponents.Red_Tea);
            content.accept(MapleFoodComponents.Green_Tea_Leaves);
            content.accept(MapleFoodComponents.Red_Tea_Leaves);
        });

        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group_Furniture).register(content -> {
            //Cushion
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_OAK_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_SPRUCE_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_BIRCH_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_JUNGLE_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_ACACIA_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_DARK_OAK_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_CRIMSON_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_WARPED_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_MANGROVE_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_MAPLE_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_CHERRY_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_GINKGO_BLACK);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_WHITE);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_ORANGE);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_MAGENTA);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_LIGHT_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_YELLOW);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_LIME);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_PINK);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_LIGHT_GRAY);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_CYAN);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_PURPLE);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_BLUE);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_BROWN);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_GREEN);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_RED);
            content.accept(MapleFurnitureBlocks.CUSHION_BAMBOO_BLACK);

            content.accept(MapleFurnitureBlocks.TABLE_OAK);
            content.accept(MapleFurnitureBlocks.TABLE_SPRUCE);
            content.accept(MapleFurnitureBlocks.TABLE_BIRCH);
            content.accept(MapleFurnitureBlocks.TABLE_JUNGLE);
            content.accept(MapleFurnitureBlocks.TABLE_ACACIA);
            content.accept(MapleFurnitureBlocks.TABLE_DARK_OAK);
            content.accept(MapleFurnitureBlocks.TABLE_CRIMSON);
            content.accept(MapleFurnitureBlocks.TABLE_WARPED);
            content.accept(MapleFurnitureBlocks.TABLE_MANGROVE);
            content.accept(MapleFurnitureBlocks.TABLE_BAMBOO);
            content.accept(MapleFurnitureBlocks.TABLE_CHERRY);
            content.accept(MapleFurnitureBlocks.TABLE_MAPLE);
            content.accept(MapleFurnitureBlocks.TABLE_GINKGO);
            content.accept(MapleFurnitureBlocks.Window_Wood_GINKGO);
            content.accept(MapleFurnitureBlocks.Window_Wood_MAPLE);
            content.accept(MapleFurnitureBlocks.Window_WOOD_OAK);
            content.accept(MapleFurnitureBlocks.Window_WOOD_BIRCH);
            content.accept(MapleFurnitureBlocks.Window_WOOD_SPRUCE);
            content.accept(MapleFurnitureBlocks.Window_WOOD_JUNGLE);
            content.accept(MapleFurnitureBlocks.Window_WOOD_DARK_OAK);
            content.accept(MapleFurnitureBlocks.Window_WOOD_ACACIA);
            content.accept(MapleFurnitureBlocks.Window_WOOD_MANGROVE);
            content.accept(MapleFurnitureBlocks.Window_WOOD_CHERRY);
            content.accept(MapleFurnitureBlocks.Window_WOOD_CRIMSON);
            content.accept(MapleFurnitureBlocks.Window_WOOD_WARPED);
            content.accept(MapleFurnitureBlocks.Window_PLANK_OAK);
            content.accept(MapleFurnitureBlocks.Window_PLANK_BIRCH);
            content.accept(MapleFurnitureBlocks.Window_PLANK_SPRUCE);
            content.accept(MapleFurnitureBlocks.Window_PLANK_JUNGLE);
            content.accept(MapleFurnitureBlocks.Window_PLANK_DARK_OAK);
            content.accept(MapleFurnitureBlocks.Window_PLANK_ACACIA);
            content.accept(MapleFurnitureBlocks.Window_PLANK_MANGROVE);
            content.accept(MapleFurnitureBlocks.Window_PLANK_CHERRY);
            content.accept(MapleFurnitureBlocks.Window_PLANK_CRIMSON);
            content.accept(MapleFurnitureBlocks.Window_PLANK_WARPED);
            content.accept(MapleFurnitureBlocks.Window_PLANK_GINKGO);
            content.accept(MapleFurnitureBlocks.Window_PLANK_MAPLE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_OAK);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_SPRUCE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_BIRCH);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_JUNGLE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_ACACIA);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_DARK_OAK);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_CRIMSON);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_WARPED);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_MANGROVE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_BAMBOO);
            content.accept(MapleFurnitureBlocks.Coffee_Table_WOOD_CHERRY);
            content.accept(MapleFurnitureBlocks.Coffee_Table_Wood_MAPLE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_Wood_GINKGO);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_OAK);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_SPRUCE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_BIRCH);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_JUNGLE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_ACACIA);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_DARK_OAK);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_CRIMSON);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_WARPED);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_MANGROVE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_BAMBOO);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_CHERRY);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_MAPLE);
            content.accept(MapleFurnitureBlocks.Coffee_Table_PLANK_GINKGO);

            content.accept(MapleFurnitureBlocks.Chair_WOOD_OAK);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_SPRUCE);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_BIRCH);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_JUNGLE);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_ACACIA);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_DARK_OAK);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_CRIMSON);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_WARPED);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_MANGROVE);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_BAMBOO);
            content.accept(MapleFurnitureBlocks.Chair_WOOD_CHERRY);
            content.accept(MapleFurnitureBlocks.Chair_Wood_MAPLE);
            content.accept(MapleFurnitureBlocks.Chair_Wood_GINKGO);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_OAK);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_SPRUCE);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_BIRCH);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_JUNGLE);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_ACACIA);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_DARK_OAK);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_CRIMSON);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_WARPED);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_MANGROVE);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_BAMBOO);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_CHERRY);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_MAPLE);
            content.accept(MapleFurnitureBlocks.Chair_PLANK_GINKGO);
            content.accept(MapleFurnitureBlocks.END_TABLE_OAK);
            content.accept(MapleFurnitureBlocks.END_TABLE_SPRUCE);
            content.accept(MapleFurnitureBlocks.END_TABLE_BIRCH);
            content.accept(MapleFurnitureBlocks.END_TABLE_JUNGLE);
            content.accept(MapleFurnitureBlocks.END_TABLE_ACACIA);
            content.accept(MapleFurnitureBlocks.END_TABLE_DARK_OAK);
            content.accept(MapleFurnitureBlocks.END_TABLE_CRIMSON);
            content.accept(MapleFurnitureBlocks.END_TABLE_WARPED);
            content.accept(MapleFurnitureBlocks.END_TABLE_MANGROVE);
            content.accept(MapleFurnitureBlocks.END_TABLE_BAMBOO);
            content.accept(MapleFurnitureBlocks.END_TABLE_CHERRY);
            content.accept(MapleFurnitureBlocks.END_TABLE_MAPLE);
            content.accept(MapleFurnitureBlocks.END_TABLE_GINKGO);
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

    public static void registerRecipeType() {
        MapleRecipeType.registerMapleRecipes();
    }

    public static void registerScreenType() {
        MapleScreenHandlerType.registerMapleScreenHandlerType();
    }

    public static void registerOthers() {
        MapleBlockEntityType.registerMapleBlockEntityType();
        MapleParticleTypes.registerParticleTypes();
        MapleEntityType.registerMapleEntityType();
        MapleVillagers.registerVillagerType();
        MapleEquipmentAssetKeys.registerMapleArmorAssetsKeys();
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

    @Environment(EnvType.CLIENT)
    public static void registerClientEntityRenderer() {
        EntityRendererRegistry.register(MapleEntityType.CHAIR_ENTITY, ChairRenderer::new);
        EntityRendererRegistry.register(MapleEntityType.Cushion_ENTITY, CushinoRenderer::new);

        var maple_boat = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "boat/maple"), "main");
        EntityModelLayerRegistry.registerModelLayer(maple_boat, BoatModel::createBoatModel);
        EntityRendererRegistry.register(MapleEntityType.Maple_BOAT, (dispatcher) -> new BoatRenderer(dispatcher,maple_boat));

        var ginkgo_boat = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "boat/ginkgo"), "main");
        EntityModelLayerRegistry.registerModelLayer(ginkgo_boat, BoatModel::createBoatModel);
        EntityRendererRegistry.register(MapleEntityType.GINKGO_BOAT, (dispatcher) -> new BoatRenderer(dispatcher, ginkgo_boat));

        var maple_chest_boat = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "chest_boat/maple"), "main");
        EntityModelLayerRegistry.registerModelLayer(maple_chest_boat, BoatModel::createChestBoatModel);
        EntityRendererRegistry.register(MapleEntityType.Maple_CHEST_BOAT, (dispatcher) -> new BoatRenderer(dispatcher, maple_chest_boat));

        var ginkgo_chest_boat = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "chest_boat/ginkgo"), "main");
        EntityModelLayerRegistry.registerModelLayer(ginkgo_chest_boat, BoatModel::createChestBoatModel);
        EntityRendererRegistry.register(MapleEntityType.GINKGO_CHEST_BOAT,  (dispatcher) -> new BoatRenderer(dispatcher, ginkgo_chest_boat));

    }

    @Environment(EnvType.CLIENT)
    public static void registerClientParticle() {
        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.CHERRY_LEAVES, ((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider);
            };
        }));

        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.SAKURA_LEAVES, ((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider);
            };
        }));
    }
}

