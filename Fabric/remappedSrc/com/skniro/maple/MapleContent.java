package com.skniro.maple;


import com.mojang.datafixers.schemas.Schema;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
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
        });

        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group_Food).register(content -> {
            content.accept(MapleItems.Flour);
            content.accept(MapleItems.MapleSyrup);
            content.accept(MapleItems.Cream);
            content.accept(MapleItems.MILK_BOTTOM);
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

}

