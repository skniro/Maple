package com.skniro.maple;


import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.Maple_block;
import com.skniro.maple.block.MapleDoorBlocks;
import com.skniro.maple.util.MapleFlammableBlocks;
import com.skniro.maple.util.MapleStrippableBlocks;
import com.skniro.maple.world.MapleConfiguredFeatures;
import com.skniro.maple.world.gen.MapleTreeGeneration;
import item.MapleItems;


public class MapleContent {


    public static void registerItem(){
        MapleItems.registerModItems();
    }
    public static void registerBlock(){
        MapleFlammableBlocks.registerFlammableBlocks();
        MapleStrippableBlocks.registerStrippables();
        Maple_block.registerModWoodBlocks();
        MapleDoorBlocks.registerModDoorBlocks();
        MapleSignBlocks.registerMapleSignBlocks();
    }

    public static void CreativeTab() {
    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
    }
    public static void registerMapleConfigured() {
        MapleConfiguredFeatures.registerConfiguredFeatures();
    }

}

