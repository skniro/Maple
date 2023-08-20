package com.skniro.maple;


import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.util.MapleFlammableBlocks;
import com.skniro.maple.util.MapleStrippableBlocks;
import com.skniro.maple.world.MapleConfiguredFeatures;
import com.skniro.maple.world.MaplePlacedFeatures;
import com.skniro.maple.world.gen.MapleOreGeneration;
import com.skniro.maple.world.gen.MapleTreeGeneration;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class MapleContent {


    public static void registerItem(){
        MapleItems.registerModItems();
        GlassCupItems.registerModItems();
        MapleFoodComponents.registerMapleFoodItems();
    }
    public static void registerBlock(){
        MapleFlammableBlocks.registerFlammableBlocks();
        MapleStrippableBlocks.registerStrippables();
        MapleBlocks.registerMapleBlocks();
        MapleSignBlocks.registerMapleSignBlocks();
        MapleOreBlocks.registerMapleOreBlocks();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group).register(content -> {
            content.add(MapleBlocks.MAPLE_LOG);
            content.add(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(MapleBlocks.MAPLE_WOOD);
            content.add(MapleBlocks.CHERRY_LOG);
            content.add(MapleBlocks.CHERRY_WOOD);
            content.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(MapleBlocks.BAMBOO_BLOCK);
            content.add(MapleBlocks.STRIPPED_BAMBOO_BLOCK);
            content.add(MapleBlocks.MAPLE_SAPLING);
            content.add(MapleBlocks.CHERRY_SAPLING);
            content.add(MapleBlocks.SAKURA_SAPLING);
            content.add(MapleBlocks.MAPLE_LEAVES);
            content.add(MapleBlocks.CHERRY_LEAVES);
            content.add(MapleBlocks.SAKURA_LEAVES);
            content.add(MapleBlocks.MAPLE_PLANKS);
            content.add(MapleBlocks.CHERRY_PLANKS);
            content.add(MapleBlocks.BAMBOO_PLANKS);
            content.add(MapleBlocks.BAMBOO_MOSAIC);
            content.add(MapleBlocks.CHERRY_BUTTON);
            content.add(MapleBlocks.MAPLE_BUTTON);
            content.add(MapleBlocks.BAMBOO_BUTTON);
            content.add(MapleBlocks.CHERRY_STAIRS);
            content.add(MapleBlocks.MAPLE_STAIRS);
            content.add(MapleBlocks.BAMBOO_STAIRS);
            content.add(MapleBlocks.BAMBOO_MOSAIC_STAIRS);
            content.add(MapleBlocks.CHERRY_SLAB);
            content.add(MapleBlocks.MAPLE_SLAB);
            content.add(MapleBlocks.BAMBOO_SLAB);
            content.add(MapleBlocks.BAMBOO_MOSAIC_SLAB);
            content.add(MapleBlocks.CHERRY_FENCE);
            content.add(MapleBlocks.CHERRY_FENCE_GATE);
            content.add(MapleBlocks.MAPLE_FENCE);
            content.add(MapleBlocks.MAPLE_FENCE_GATE);
            content.add(MapleBlocks.BAMBOO_FENCE);
            content.add(MapleBlocks.BAMBOO_FENCE_GATE);
            content.add(MapleBlocks.CHERRY_TRAPDOOR);
            content.add(MapleBlocks.MAPLE_TRAPDOOR);
            content.add(MapleBlocks.BAMBOO_TRAPDOOR);
            content.add(MapleBlocks.CHERRY_PRESSURE_PLATE);
            content.add(MapleBlocks.MAPLE_PRESSURE_PLATE);
            content.add(MapleBlocks.BAMBOO_PRESSURE_PLATE);
            content.add(MapleBlocks.PINK_PETALS);
            content.add(MapleBlocks.CHISELED_BOOKSHELF);
            content.add(MapleItems.CHERRY_SIGN);
            content.add(MapleItems.MAPLE_SIGN);
            content.add(MapleItems.BAMBOO_SIGN);
            content.add(MapleItems.CHERRY_DOOR);
            content.add(MapleItems.MAPLE_DOOR);
            content.add(MapleItems.BAMBOO_DOOR);
            content.add(MapleItems.CHERRY_BOAT);
            content.add(MapleItems.MAPLE_BOAT);
            content.add(MapleItems.BAMBOO_BOAT);
            content.add(MapleItems.CHERRY_CHEST_BOAT);
            content.add(MapleItems.MAPLE_CHEST_BOAT);
            content.add(MapleItems.BAMBOO_CHEST_BOAT);
            content.add(MapleOreBlocks.Salt_Ore);
            content.add(MapleOreBlocks.DEEPSLATE_Salt_Ore);
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
        });


    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        MapleConfiguredFeatures.registerConfiguredFeatures();
        MaplePlacedFeatures.registerPlacedFeatures();
        MapleOreGeneration.generateOres();
    }

    public static void registerBlockEntityType() {
        MapleBlockEntityType.registerMapleBlockEntityType();
        MapleParticleTypes.registerParticleTypes();
    }
}

