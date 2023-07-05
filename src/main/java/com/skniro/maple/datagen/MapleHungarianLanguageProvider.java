package com.skniro.maple.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class MapleHungarianLanguageProvider extends FabricLanguageProvider {
    public MapleHungarianLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"hu_hu");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // Load an existing language file.
        try {
            Path existingFilePath = dataGenerator.getModContainer().findPath("assets/maple/lang/hu_hu.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
