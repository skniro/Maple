package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleChineseLanguageProvider extends FabricLanguageProvider {
    public MapleChineseLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        translationBuilder.add(Maple_block.MAPLE_PLANKS,"枫木木板");
        translationBuilder.add(Maple_block.MAPLE_LOG,"枫树原木");
        translationBuilder.add(Maple_block.MAPLE_WOOD,"枫树木");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_WOOD,"去皮枫树木");
        translationBuilder.add(Maple_block.STRIPPED_MAPLE_LOG,"去皮枫树原木");
        translationBuilder.add(Maple_block.MAPLE_LEAVES,"枫树叶");
        translationBuilder.add(Maple.Maple_Group,"枫");
    }
}
