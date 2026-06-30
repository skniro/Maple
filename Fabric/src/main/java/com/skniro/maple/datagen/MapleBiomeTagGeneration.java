package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;


import java.util.concurrent.CompletableFuture;



public class MapleBiomeTagGeneration extends FabricTagProvider<Biome> {


    public MapleBiomeTagGeneration(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BIOME, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BiomeTags.IS_FOREST)
                .add(MapleBiomeKeys.Maple_Grove);
        getOrCreateTagBuilder(BiomeTags.IS_MOUNTAIN)
                .add(MapleBiomeKeys.Sakura);
        getOrCreateTagBuilder(BiomeTags.IS_OVERWORLD)
                .add(MapleBiomeKeys.Sakura)
                .add(MapleBiomeKeys.Maple_Grove);

        // generate tags under data/maple/tags/worldgen/biome/has_structure/
        TagKey<Biome> villageSakura = TagKey.of(RegistryKeys.BIOME, Identifier.of(Maple.MOD_ID, "has_structure/village_sakura"));
        getOrCreateTagBuilder(villageSakura).add(RegistryKey.of(RegistryKeys.BIOME, Identifier.of("minecraft", "cherry_grove")));

        TagKey<Biome> hotSpringBaths = TagKey.of(RegistryKeys.BIOME, Identifier.of(Maple.MOD_ID, "has_structure/hot_spring_baths"));
        getOrCreateTagBuilder(hotSpringBaths).add(MapleBiomeKeys.Sakura);
    }
}
