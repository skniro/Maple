package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.Maple_block;
import com.skniro.maple.item.GlassCupItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.data.DataGenerator;

public class MapleEnglishLanguageProvider extends FabricLanguageProvider {
    public MapleEnglishLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //Maple
        translationBuilder.add(Maple_block.MAPLE_PLANKS,"Maple Planks");
        translationBuilder.add(Maple_block.MAPLE_LOG,"Maple Log");
        translationBuilder.add(Maple_block.MAPLE_WOOD,"Maple Wood");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_WOOD,"Stripped Maple Wood");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_LOG,"Stripped Maple Log");
        translationBuilder.add(Maple_block.MAPLE_LEAVES,"Maple Leaves");
        translationBuilder.add(Maple_block.MAPLE_DOOR,"Maple Door");
        translationBuilder.add(Maple_block.MAPLE_BUTTON,"Maple Button");
        translationBuilder.add(Maple_block.MAPLE_FENCE,"Maple Fence");
        translationBuilder.add(Maple_block.MAPLE_FENCE_GATE,"Maple Fence Gate");
        translationBuilder.add(Maple_block.MAPLE_SLAB,"Maple Slab");
        translationBuilder.add(Maple_block.MAPLE_STAIRS,"Maple Stairs");
        translationBuilder.add(Maple_block.MAPLE_SAPLING,"Maple Sapling");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"Maple Sign");
        translationBuilder.add(Maple_block.MAPLE_TRAPDOOR,"Maple Trapdoor");
        translationBuilder.add(Maple_block.MAPLE_PRESSURE_PLATE,"Maple Pressure Plate");

        //Cherry
        translationBuilder.add(Maple_block.CHERRY_LOG,"Cherry Log");
        translationBuilder.add(Maple_block.CHERRY_WOOD,"Cherry Wood");
        translationBuilder.add(Maple_block.CHERRY_PLANKS,"Cherry Planks");
        translationBuilder.add(Maple_block.STRIPPED_CHERRY_WOOD,"Stripped Cherry Wood");
        translationBuilder.add(Maple_block.STRIPPED_CHERRY_LOG,"Stripped Cherry Log");
        translationBuilder.add(Maple_block.CHERRY_LEAVES,"Cherry Leaves");
        translationBuilder.add(Maple_block.CHERRY_DOOR,"Cherry Door");
        translationBuilder.add(Maple_block.CHERRY_BUTTON,"Cherry Button");
        translationBuilder.add(Maple_block.CHERRY_FENCE,"Cherry Fence");
        translationBuilder.add(Maple_block.CHERRY_FENCE_GATE,"Cherry Fence Gate");
        translationBuilder.add(Maple_block.CHERRY_SLAB,"Cherry Slab");
        translationBuilder.add(Maple_block.CHERRY_STAIRS,"Cherry Stairs");
        translationBuilder.add(Maple_block.CHERRY_SAPLING,"Cherry Sapling");
        translationBuilder.add(MapleSignBlocks.CHERRY_SIGN,"Cherry Sign");
        translationBuilder.add(Maple_block.CHERRY_TRAPDOOR,"Cherry Trapdoor");
        translationBuilder.add(Maple_block.CHERRY_PRESSURE_PLATE,"Cherry Pressure Plate");

        //BAMBOO
        translationBuilder.add(Maple_block.BAMBOO_BLOCK,"Bamboo Block");
        translationBuilder.add(Maple_block.BAMBOO_PLANKS,"Bamboo Planks");
        translationBuilder.add(Maple_block.STRIPPED_BAMBOO_BLOCK,"Stripped Bamboo Block");
        translationBuilder.add(Maple_block.BAMBOO_DOOR,"Bamboo Door");
        translationBuilder.add(Maple_block.BAMBOO_BUTTON,"Bamboo Button");
        translationBuilder.add(Maple_block.BAMBOO_FENCE,"Bamboo Fence");
        translationBuilder.add(Maple_block.BAMBOO_FENCE_GATE,"Bamboo Fence Gate");
        translationBuilder.add(Maple_block.BAMBOO_SLAB,"Bamboo Slab");
        translationBuilder.add(Maple_block.BAMBOO_STAIRS,"Bamboo Stairs");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC,"Bamboo Mosaic");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC_SLAB,"Bamboo Mosaic Slab");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC_STAIRS,"Bamboo Mosaic Stairs");
        translationBuilder.add(MapleSignBlocks.BAMBOO_SIGN,"Bamboo Sign");
        translationBuilder.add(Maple_block.BAMBOO_TRAPDOOR,"Bamboo Trapdoor");
        translationBuilder.add(Maple_block.BAMBOO_PRESSURE_PLATE,"Bamboo Pressure Plate");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"High Glass Cup");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"Maple");

    }
}
