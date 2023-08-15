package com.skniro.maple.datagen;

import com.skniro.maple.world.MapleConfiguredFeatures;
import com.skniro.maple.world.MaplePlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

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

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, MapleConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, MaplePlacedFeatures::bootstrap);
    }
}
