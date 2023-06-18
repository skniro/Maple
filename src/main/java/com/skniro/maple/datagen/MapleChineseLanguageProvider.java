package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.Maple_block;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleChineseLanguageProvider extends FabricLanguageProvider {
    public MapleChineseLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        //Maple
        translationBuilder.add(Maple_block.MAPLE_PLANKS,"枫木木板");
        translationBuilder.add(Maple_block.MAPLE_LOG,"枫树原木");
        translationBuilder.add(Maple_block.MAPLE_WOOD,"枫树木");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_WOOD,"去皮枫树木");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_LOG,"去皮枫树原木");
        translationBuilder.add(Maple_block.MAPLE_LEAVES,"枫树叶");
        translationBuilder.add(Maple_block.MAPLE_DOOR,"枫木门");
        translationBuilder.add(Maple_block.MAPLE_BUTTON,"枫木按钮");
        translationBuilder.add(Maple_block.MAPLE_FENCE,"枫木栏杆");
        translationBuilder.add(Maple_block.MAPLE_FENCE_GATE,"枫木栏杆门");
        translationBuilder.add(Maple_block.MAPLE_SLAB,"枫木台阶");
        translationBuilder.add(Maple_block.MAPLE_STAIRS,"枫木楼梯");
        translationBuilder.add(Maple_block.MAPLE_SAPLING,"枫木树苗");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"枫木告示牌");
        translationBuilder.add(Maple_block.MAPLE_TRAPDOOR,"枫木活版门");
        translationBuilder.add(Maple_block.MAPLE_PRESSURE_PLATE,"枫木压力板");

        //Cherry
        translationBuilder.add(Maple_block.CHERRY_LOG,"樱树原木");
        translationBuilder.add(Maple_block.CHERRY_WOOD,"樱树木");
        translationBuilder.add(Maple_block.CHERRY_PLANKS,"樱木木板");
        translationBuilder.add(Maple_block.STRIPPED_CHERRY_WOOD,"去皮樱树木");
        translationBuilder.add(Maple_block.STRIPPED_CHERRY_LOG,"去皮樱树原木");
        translationBuilder.add(Maple_block.CHERRY_LEAVES,"樱树叶");
        translationBuilder.add(Maple_block.CHERRY_DOOR,"樱木门");
        translationBuilder.add(Maple_block.CHERRY_BUTTON,"樱木按钮");
        translationBuilder.add(Maple_block.CHERRY_FENCE,"樱木栏杆");
        translationBuilder.add(Maple_block.CHERRY_FENCE_GATE,"樱木栏杆门");
        translationBuilder.add(Maple_block.CHERRY_SLAB,"樱木台阶");
        translationBuilder.add(Maple_block.CHERRY_STAIRS,"樱木楼梯");
        translationBuilder.add(Maple_block.CHERRY_SAPLING,"樱木树苗");
        translationBuilder.add(MapleSignBlocks.CHERRY_SIGN,"樱木告示牌");
        translationBuilder.add(Maple_block.CHERRY_TRAPDOOR,"樱木活版门");
        translationBuilder.add(Maple_block.CHERRY_PRESSURE_PLATE,"樱木压力板");

        //BAMBOO
        translationBuilder.add(Maple_block.BAMBOO_BLOCK,"竹块");
        translationBuilder.add(Maple_block.BAMBOO_PLANKS,"竹制木板");
        translationBuilder.add(Maple_block.STRIPPED_BAMBOO_BLOCK,"去皮竹块");
        translationBuilder.add(Maple_block.BAMBOO_DOOR,"竹制木门");
        translationBuilder.add(Maple_block.BAMBOO_BUTTON,"竹制木按钮");
        translationBuilder.add(Maple_block.BAMBOO_FENCE,"竹制栏杆");
        translationBuilder.add(Maple_block.BAMBOO_FENCE_GATE,"竹制栏杆门");
        translationBuilder.add(Maple_block.BAMBOO_SLAB,"竹制台阶");
        translationBuilder.add(Maple_block.BAMBOO_STAIRS,"竹制楼梯");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC,"竹马赛克");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC_SLAB,"竹马赛克台阶");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC_STAIRS,"竹马赛克楼梯");
        translationBuilder.add(MapleSignBlocks.BAMBOO_SIGN,"竹制告示牌");
        translationBuilder.add(Maple_block.BAMBOO_TRAPDOOR,"竹制活版门");
        translationBuilder.add(Maple_block.BAMBOO_PRESSURE_PLATE,"竹制压力板");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"高玻璃杯");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"枫");


    }
}
