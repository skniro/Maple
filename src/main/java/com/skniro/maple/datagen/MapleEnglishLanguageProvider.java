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
        translationBuilder.add(Maple_block.MAPLE_PLANKS,"maple planks");
        translationBuilder.add(Maple_block.MAPLE_LOG,"maple log");
        translationBuilder.add(Maple_block.MAPLE_WOOD,"maple wood");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_WOOD,"stripped maple wood");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_LOG,"stripped maple log");
        translationBuilder.add(Maple_block.MAPLE_LEAVES,"maple leaves");
        translationBuilder.add(Maple_block.MAPLE_DOOR,"maple door");
        translationBuilder.add(Maple_block.MAPLE_BUTTON,"maple button");
        translationBuilder.add(Maple_block.MAPLE_FENCE,"maple fence");
        translationBuilder.add(Maple_block.MAPLE_FENCE_GATE,"maple fence gate");
        translationBuilder.add(Maple_block.MAPLE_SLAB,"maple slab");
        translationBuilder.add(Maple_block.MAPLE_STAIRS,"maple stairs");
        translationBuilder.add(Maple_block.MAPLE_SAPLING,"maple sapling");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"maple sign");
        translationBuilder.add(Maple_block.MAPLE_TRAPDOOR,"maple trapdoor");
        translationBuilder.add(Maple_block.MAPLE_PRESSURE_PLATE,"maple pressure plate");

        //Cherry
        translationBuilder.add(Maple_block.CHERRY_LOG,"cherry log");
        translationBuilder.add(Maple_block.CHERRY_WOOD,"cherry wood");
        translationBuilder.add(Maple_block.CHERRY_PLANKS,"cherry planks");
        translationBuilder.add(Maple_block.STRIPPED_CHERRY_WOOD,"stripped cherry wood");
        translationBuilder.add(Maple_block.STRIPPED_CHERRY_LOG,"stripped cherry log");
        translationBuilder.add(Maple_block.CHERRY_LEAVES,"cherry leaves");
        translationBuilder.add(Maple_block.CHERRY_DOOR,"cherry door");
        translationBuilder.add(Maple_block.CHERRY_BUTTON,"cherry button");
        translationBuilder.add(Maple_block.CHERRY_FENCE,"cherry fence");
        translationBuilder.add(Maple_block.CHERRY_FENCE_GATE,"cherry fence gate");
        translationBuilder.add(Maple_block.CHERRY_SLAB,"cherry slab");
        translationBuilder.add(Maple_block.CHERRY_STAIRS,"cherry stairs");
        translationBuilder.add(Maple_block.CHERRY_SAPLING,"cherry sapling");
        translationBuilder.add(MapleSignBlocks.CHERRY_SIGN,"cherry sign");
        translationBuilder.add(Maple_block.CHERRY_TRAPDOOR,"cherry trapdoor");
        translationBuilder.add(Maple_block.CHERRY_PRESSURE_PLATE,"cherry pressure plate");

        //BAMBOO
        translationBuilder.add(Maple_block.BAMBOO_BLOCK,"bamboo block");
        translationBuilder.add(Maple_block.BAMBOO_PLANKS,"bamboo planks");
        translationBuilder.add(Maple_block.STRIPPED_BAMBOO_BLOCK,"stripped bamboo block");
        translationBuilder.add(Maple_block.BAMBOO_DOOR,"bamboo door");
        translationBuilder.add(Maple_block.BAMBOO_BUTTON,"bamboo button");
        translationBuilder.add(Maple_block.BAMBOO_FENCE,"bamboo fence");
        translationBuilder.add(Maple_block.BAMBOO_FENCE_GATE,"bamboo fence gate");
        translationBuilder.add(Maple_block.BAMBOO_SLAB,"bamboo slab");
        translationBuilder.add(Maple_block.BAMBOO_STAIRS,"bamboo stairs");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC,"bamboo mosaic");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC_SLAB,"bamboo mosaic");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC_STAIRS,"bamboo mosaic stairs");
        translationBuilder.add(MapleSignBlocks.BAMBOO_SIGN,"bamboo sign");
        translationBuilder.add(Maple_block.BAMBOO_TRAPDOOR,"bamboo trapdoor");
        translationBuilder.add(Maple_block.BAMBOO_PRESSURE_PLATE,"bamboo pressure plate");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"high glass cup");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"maple");

    }
}
