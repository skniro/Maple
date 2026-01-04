package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class MapleTraditionalChineseLanguageProvider extends FabricLanguageProvider {
    public MapleTraditionalChineseLanguageProvider(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup){
        super(dataGenerator,"zh_tw", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder translationBuilder) {
        //Maple
        translationBuilder.add(MapleBlocks.MAPLE_PLANKS,"楓木木板");
        translationBuilder.add(MapleBlocks.MAPLE_LOG,"楓樹原木");
        translationBuilder.add(MapleBlocks.MAPLE_WOOD,"楓樹木");
        translationBuilder.add(MapleBlocks.STRIPPED_MAPLE_WOOD,"去皮楓樹木");
        translationBuilder.add(MapleBlocks.STRIPPED_MAPLE_LOG,"去皮楓樹原木");
        translationBuilder.add(MapleBlocks.MAPLE_LEAVES,"楓樹葉");
        translationBuilder.add(MapleBlocks.MAPLE_DOOR,"楓木門");
        translationBuilder.add(MapleBlocks.MAPLE_BUTTON,"楓木按鈕");
        translationBuilder.add(MapleBlocks.MAPLE_FENCE,"楓木欄杆");
        translationBuilder.add(MapleBlocks.MAPLE_FENCE_GATE,"楓木欄杆門");
        translationBuilder.add(MapleBlocks.MAPLE_SLAB,"楓木臺階");
        translationBuilder.add(MapleBlocks.MAPLE_STAIRS,"楓木樓梯");
        translationBuilder.add(MapleBlocks.MAPLE_SAPLING,"楓木樹苗");
        translationBuilder.add(MapleBlocks.POTTED_MAPLE_SAPLING,"楓木樹苗盆栽");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"楓木告示牌");
        translationBuilder.add(MapleBlocks.MAPLE_TRAPDOOR,"楓木活版門");
        translationBuilder.add(MapleBlocks.MAPLE_PRESSURE_PLATE,"楓木壓力板");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"高玻璃杯");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"楓");
        translationBuilder.add(Maple.Maple_Group_Food,"楓-食物");

        //Sakura
        translationBuilder.add(MapleBlocks.SAKURA_LEAVES,"櫻花");
        translationBuilder.add(MapleBlocks.SAKURA_SAPLING,"櫻花樹苗");
        translationBuilder.add(MapleBlocks.POTTED_SAKURA_SAPLING,"櫻花樹苗盆栽");

        //Salt Ore
        translationBuilder.add(MapleOreBlocks.DEEPSLATE_Salt_Ore,"深板岩鹽礦石");
        translationBuilder.add(MapleOreBlocks.Salt_Ore,"鹽礦石");

        //Crop
        translationBuilder.add(MapleBlocks.RICE,"稻米作物");

        //Food Materials
        translationBuilder.add(MapleFoodComponents.MILK_BOTTOM,"瓶裝牛奶");
        translationBuilder.add(MapleItems.Cream,"奶油");
        translationBuilder.add(MapleItems.Flour,"麵粉");
        translationBuilder.add(MapleItems.Rice,"稻米");
        translationBuilder.add(MapleItems.SOYBEAN,"黃豆");
        translationBuilder.add(MapleItems.Salt,"鹽");
        translationBuilder.add(MapleItems.MapleSyrup,"楓糖漿");

        //Food
        translationBuilder.add(MapleFoodComponents.Anko_Dango,"豆沙團子");
        translationBuilder.add(MapleFoodComponents.Sanshoku_Dango,"三彩團子");
        translationBuilder.add(MapleFoodComponents.Kinako_Dango,"豆粉糰子");
        translationBuilder.add(MapleFoodComponents.Zunda_Dango,"豆打團子");
        translationBuilder.add(MapleFoodComponents.Cooked_Rice,"熟米飯");
        translationBuilder.add(MapleFoodComponents.TOFU,"豆腐");
        translationBuilder.add(MapleFoodComponents.MILK_ICECREAM,"牛奶冰激凌");
        translationBuilder.add(MapleFoodComponents.Mochi,"麻糬");
        translationBuilder.add(MapleFoodComponents.SakuraMochi,"櫻花麻糬");

        //Boat
        translationBuilder.add(MapleItems.MAPLE_BOAT,"楓木船");
        translationBuilder.add(MapleItems.MAPLE_CHEST_BOAT,"楓木箱船");

    }
}
