package com.skniro.maple.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MapleDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(MapleModelProvider::new);
        fabricDataGenerator.addProvider(MapleSimplifiedChineseLanguageProvider::new);
        fabricDataGenerator.addProvider(MapleTraditionalChineseLanguageProvider::new);
        fabricDataGenerator.addProvider(MapleEnglishLanguageProvider::new);
        fabricDataGenerator.addProvider(MapleItemTagGeneration::new);
        fabricDataGenerator.addProvider(MapleBlockTagGeneration::new);
        fabricDataGenerator.addProvider(MapleLootTableGenerator::new);
        fabricDataGenerator.addProvider(MapleRecipeGeneration::new);
    }
}
