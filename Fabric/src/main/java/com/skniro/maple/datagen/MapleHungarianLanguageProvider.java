package com.skniro.maple.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class MapleHungarianLanguageProvider extends FabricLanguageProvider {
    public MapleHungarianLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataGenerator,"hu_hu", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        // Load an existing language file.
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/maple/lang/hu_hu.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
