package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public MapleSimplifiedChineseLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        //Maple
        translationBuilder.add(MapleBlocks.MAPLE_PLANKS,"枫木木板");
        translationBuilder.add(MapleBlocks.MAPLE_LOG,"枫树原木");
        translationBuilder.add(MapleBlocks.MAPLE_WOOD,"枫树木");
        translationBuilder.add(MapleBlocks.STRIPPED_MAPLE_WOOD,"去皮枫树木");
        translationBuilder.add(MapleBlocks.STRIPPED_MAPLE_LOG,"去皮枫树原木");
        translationBuilder.add(MapleBlocks.MAPLE_LEAVES,"枫树叶");
        translationBuilder.add(MapleBlocks.MAPLE_DOOR,"枫木门");
        translationBuilder.add(MapleBlocks.MAPLE_BUTTON,"枫木按钮");
        translationBuilder.add(MapleBlocks.MAPLE_FENCE,"枫木栏杆");
        translationBuilder.add(MapleBlocks.MAPLE_FENCE_GATE,"枫木栏杆门");
        translationBuilder.add(MapleBlocks.MAPLE_SLAB,"枫木台阶");
        translationBuilder.add(MapleBlocks.MAPLE_STAIRS,"枫木楼梯");
        translationBuilder.add(MapleBlocks.MAPLE_SAPLING,"枫木树苗");
        translationBuilder.add(MapleBlocks.POTTED_MAPLE_SAPLING,"枫木树苗盆栽");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"枫木告示牌");
        translationBuilder.add(MapleBlocks.MAPLE_TRAPDOOR,"枫木活版门");
        translationBuilder.add(MapleBlocks.MAPLE_PRESSURE_PLATE,"枫木压力板");

        //Cherry
        translationBuilder.add(MapleBlocks.CHERRY_LOG,"樱树原木");
        translationBuilder.add(MapleBlocks.CHERRY_WOOD,"樱树木");
        translationBuilder.add(MapleBlocks.CHERRY_PLANKS,"樱木木板");
        translationBuilder.add(MapleBlocks.STRIPPED_CHERRY_WOOD,"去皮樱树木");
        translationBuilder.add(MapleBlocks.STRIPPED_CHERRY_LOG,"去皮樱树原木");
        translationBuilder.add(MapleBlocks.CHERRY_LEAVES,"樱树叶");
        translationBuilder.add(MapleBlocks.CHERRY_DOOR,"樱木门");
        translationBuilder.add(MapleBlocks.CHERRY_BUTTON,"樱木按钮");
        translationBuilder.add(MapleBlocks.CHERRY_FENCE,"樱木栏杆");
        translationBuilder.add(MapleBlocks.CHERRY_FENCE_GATE,"樱木栏杆门");
        translationBuilder.add(MapleBlocks.CHERRY_SLAB,"樱木台阶");
        translationBuilder.add(MapleBlocks.CHERRY_STAIRS,"樱木楼梯");
        translationBuilder.add(MapleBlocks.CHERRY_SAPLING,"樱木树苗");
        translationBuilder.add(MapleBlocks.POTTED_CHERRY_SAPLING,"樱木树苗盆栽");
        translationBuilder.add(MapleSignBlocks.CHERRY_SIGN,"樱木告示牌");
        translationBuilder.add(MapleBlocks.CHERRY_TRAPDOOR,"樱木活版门");
        translationBuilder.add(MapleBlocks.CHERRY_PRESSURE_PLATE,"樱木压力板");

        //BAMBOO
        translationBuilder.add(MapleBlocks.BAMBOO_BLOCK,"竹块");
        translationBuilder.add(MapleBlocks.BAMBOO_PLANKS,"竹制木板");
        translationBuilder.add(MapleBlocks.STRIPPED_BAMBOO_BLOCK,"去皮竹块");
        translationBuilder.add(MapleBlocks.BAMBOO_DOOR,"竹制木门");
        translationBuilder.add(MapleBlocks.BAMBOO_BUTTON,"竹制木按钮");
        translationBuilder.add(MapleBlocks.BAMBOO_FENCE,"竹制栏杆");
        translationBuilder.add(MapleBlocks.BAMBOO_FENCE_GATE,"竹制栏杆门");
        translationBuilder.add(MapleBlocks.BAMBOO_SLAB,"竹制台阶");
        translationBuilder.add(MapleBlocks.BAMBOO_STAIRS,"竹制楼梯");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC,"竹马赛克");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC_SLAB,"竹马赛克台阶");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC_STAIRS,"竹马赛克楼梯");
        translationBuilder.add(MapleSignBlocks.BAMBOO_SIGN,"竹制告示牌");
        translationBuilder.add(MapleBlocks.BAMBOO_TRAPDOOR,"竹制活版门");
        translationBuilder.add(MapleBlocks.BAMBOO_PRESSURE_PLATE,"竹制压力板");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"高玻璃杯");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"枫");
        translationBuilder.add(Maple.Maple_Group_Food,"枫-食物");

        //Sakura
        translationBuilder.add(MapleBlocks.SAKURA_LEAVES,"樱花");
        translationBuilder.add(MapleBlocks.SAKURA_SAPLING,"樱花树苗");
        translationBuilder.add(MapleBlocks.POTTED_SAKURA_SAPLING,"樱花树苗盆栽");

        //Salt Ore
        translationBuilder.add(MapleOreBlocks.DEEPSLATE_Salt_Ore,"深板岩盐矿石");
        translationBuilder.add(MapleOreBlocks.Salt_Ore,"盐矿石");

        //Crop
        translationBuilder.add(MapleBlocks.RICE,"稻米作物");

        //Food Materials
        translationBuilder.add(MapleItems.MILK_BOTTOM,"瓶装牛奶");
        translationBuilder.add(MapleItems.Cream,"奶油");
        translationBuilder.add(MapleItems.Flour,"面粉");
        translationBuilder.add(MapleItems.Rice,"稻米");
        translationBuilder.add(MapleItems.SOYBEAN,"黄豆");
        translationBuilder.add(MapleItems.Salt,"盐");
        translationBuilder.add(MapleItems.MapleSyrup,"枫糖浆");

        //Food
        translationBuilder.add(MapleFoodComponents.Anko_Dango,"豆沙团子");
        translationBuilder.add(MapleFoodComponents.Sanshoku_Dango,"三彩团子");
        translationBuilder.add(MapleFoodComponents.Kinako_Dango,"豆粉团子");
        translationBuilder.add(MapleFoodComponents.Zunda_Dango,"豆打团子");
        translationBuilder.add(MapleFoodComponents.Cooked_Rice,"熟米饭");
        translationBuilder.add(MapleFoodComponents.TOFU,"豆腐");
        translationBuilder.add(MapleFoodComponents.MILK_ICECREAM,"牛奶冰激凌");
        translationBuilder.add(MapleFoodComponents.Mochi,"麻糬");
        translationBuilder.add(MapleFoodComponents.SakuraMochi,"樱花麻糬");

        //Boat
        translationBuilder.add(MapleItems.CHERRY_BOAT,"樱木船");
        translationBuilder.add(MapleItems.CHERRY_CHEST_BOAT,"樱木箱船");
        translationBuilder.add(MapleItems.MAPLE_BOAT,"枫木船");
        translationBuilder.add(MapleItems.MAPLE_CHEST_BOAT,"枫木箱船");

    }
}
