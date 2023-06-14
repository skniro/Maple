package com.skniro.maple.datagen;

import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleLanguageProvider extends FabricLanguageProvider {
    public MapleLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        translationBuilder.add(Maple_block.MAPLE_PLANKS,"枫木木板");
    }
}
