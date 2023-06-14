package com.skniro.maple.datagen;

import com.skniro.maple.block.Maple_block;
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
        translationBuilder.add(Maple_block.MAPLE_PLANKS,"maple_planks");

    }
}
