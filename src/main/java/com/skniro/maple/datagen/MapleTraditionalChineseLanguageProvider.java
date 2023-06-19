package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.Maple_block;
import com.skniro.maple.item.GlassCupItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleTraditionalChineseLanguageProvider extends FabricLanguageProvider {
    public MapleTraditionalChineseLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"zh_tw");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        //Maple
        translationBuilder.add(Maple_block.MAPLE_PLANKS,"楓木木板");
        translationBuilder.add(Maple_block.MAPLE_LOG,"楓樹原木");
        translationBuilder.add(Maple_block.MAPLE_WOOD,"楓樹木");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_WOOD,"去皮楓樹木");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_LOG,"去皮楓樹原木");
        translationBuilder.add(Maple_block.MAPLE_LEAVES,"楓樹葉");
        translationBuilder.add(Maple_block.MAPLE_DOOR,"楓木門");
        translationBuilder.add(Maple_block.MAPLE_BUTTON,"楓木按鈕");
        translationBuilder.add(Maple_block.MAPLE_FENCE,"楓木欄杆");
        translationBuilder.add(Maple_block.MAPLE_FENCE_GATE,"楓木欄杆門");
        translationBuilder.add(Maple_block.MAPLE_SLAB,"楓木臺階");
        translationBuilder.add(Maple_block.MAPLE_STAIRS,"楓木樓梯");
        translationBuilder.add(Maple_block.MAPLE_SAPLING,"楓木樹苗");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"楓木告示牌");
        translationBuilder.add(Maple_block.MAPLE_TRAPDOOR,"楓木活版門");
        translationBuilder.add(Maple_block.MAPLE_PRESSURE_PLATE,"楓木壓力板");

        //Cherry
        translationBuilder.add(Maple_block.CHERRY_LOG,"櫻樹原木");
        translationBuilder.add(Maple_block.CHERRY_WOOD,"櫻樹木");
        translationBuilder.add(Maple_block.CHERRY_PLANKS,"櫻木木板");
        translationBuilder.add(Maple_block.STRIPPED_CHERRY_WOOD,"去皮櫻樹木");
        translationBuilder.add(Maple_block.STRIPPED_CHERRY_LOG,"去皮櫻樹原木");
        translationBuilder.add(Maple_block.CHERRY_LEAVES,"櫻樹葉");
        translationBuilder.add(Maple_block.CHERRY_DOOR,"櫻木門");
        translationBuilder.add(Maple_block.CHERRY_BUTTON,"櫻木按鈕");
        translationBuilder.add(Maple_block.CHERRY_FENCE,"櫻木欄杆");
        translationBuilder.add(Maple_block.CHERRY_FENCE_GATE,"櫻木欄杆門");
        translationBuilder.add(Maple_block.CHERRY_SLAB,"櫻木臺階");
        translationBuilder.add(Maple_block.CHERRY_STAIRS,"櫻木樓梯");
        translationBuilder.add(Maple_block.CHERRY_SAPLING,"櫻木樹苗");
        translationBuilder.add(MapleSignBlocks.CHERRY_SIGN,"櫻木告示牌");
        translationBuilder.add(Maple_block.CHERRY_TRAPDOOR,"櫻木活版門");
        translationBuilder.add(Maple_block.CHERRY_PRESSURE_PLATE,"櫻木壓力板");

        //BAMBOO
        translationBuilder.add(Maple_block.BAMBOO_BLOCK,"竹塊");
        translationBuilder.add(Maple_block.BAMBOO_PLANKS,"竹制木板");
        translationBuilder.add(Maple_block.STRIPPED_BAMBOO_BLOCK,"去皮竹塊");
        translationBuilder.add(Maple_block.BAMBOO_DOOR,"竹制木門");
        translationBuilder.add(Maple_block.BAMBOO_BUTTON,"竹制木按鈕");
        translationBuilder.add(Maple_block.BAMBOO_FENCE,"竹制欄杆");
        translationBuilder.add(Maple_block.BAMBOO_FENCE_GATE,"竹制欄杆門");
        translationBuilder.add(Maple_block.BAMBOO_SLAB,"竹制臺階");
        translationBuilder.add(Maple_block.BAMBOO_STAIRS,"竹制樓梯");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC,"竹馬賽克");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC_SLAB,"竹馬賽克臺階");
        translationBuilder.add(Maple_block.BAMBOO_MOSAIC_STAIRS,"竹馬賽克樓梯");
        translationBuilder.add(MapleSignBlocks.BAMBOO_SIGN,"竹制告示牌");
        translationBuilder.add(Maple_block.BAMBOO_TRAPDOOR,"竹制活版門");
        translationBuilder.add(Maple_block.BAMBOO_PRESSURE_PLATE,"竹制壓力板");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"高玻璃杯");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"楓");


    }
}
