package com.skniro.maple;


import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.util.MapleFlammableBlocks;
import com.skniro.maple.util.MapleLootTableModifiers;
import com.skniro.maple.util.MapleStrippableBlocks;
import com.skniro.maple.world.MapleConfiguredFeatures;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.gen.MapleOreGeneration;
import com.skniro.maple.world.gen.MapleTreeGeneration;
import com.skniro.maple.item.MapleItems;



public class MapleContent {


    public static void registerItem(){
        MapleItems.registerModItems();
        GlassCupItems.registerModItems();
        MapleFoodComponents.registerMapleFoodItems();
        MapleOreBlocks.registerMapleOreBlocks();
    }
    public static void registerBlock(){
        MapleFlammableBlocks.registerFlammableBlocks();
        MapleStrippableBlocks.registerStrippables();
        MapleBlocks.registerMapleBlocks();
        MapleSignBlocks.registerMapleSignBlocks();
    }

    public static void CreativeTab() {
    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        MapleBiomeKeys.registerBiome();
        MapleOreGeneration.generateOres();

    }
    public static void registerMapleConfigured() {
        MapleConfiguredFeatures.registerConfiguredFeatures();
    }

    public static void registerBlockEntityType() {
        MapleParticleTypes.registerParticleTypes();
    }

    public static void registerMapleLootTable() {
        MapleLootTableModifiers.modifyLootTables();
    }
}

