package com.skniro.maple.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MapleDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MapleModelProvider::new);
        pack.addProvider(MapleSimplifiedChineseLanguageProvider::new);
        pack.addProvider(MapleTraditionalChineseLanguageProvider::new);
        pack.addProvider(MapleEnglishLanguageProvider::new);
        pack.addProvider(MapleItemTagGeneration::new);
        pack.addProvider(MapleBlockTagGeneration::new);
        pack.addProvider(MapleLootTableGenerator::new);
        pack.addProvider(MapleRecipeGeneration::new);
        pack.addProvider(MapleHungarianLanguageProvider::new);
    }
}
