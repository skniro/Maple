package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

import static com.skniro.maple.datagen.MapleBlockTagGeneration.ModBlockTags.C_PLASTER;
import static net.minecraft.tags.BlockTags.*;


public class MapleBiomeTagGeneration extends FabricTagsProvider<Biome> {


    public MapleBiomeTagGeneration(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.BIOME, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        builder(BiomeTags.IS_FOREST)
                .add(MapleBiomeKeys.Maple_Grove);
        builder(BiomeTags.IS_MOUNTAIN)
                .add(MapleBiomeKeys.Sakura);
        builder(BiomeTags.IS_OVERWORLD)
                .add(MapleBiomeKeys.Sakura)
                .add(MapleBiomeKeys.Maple_Grove);
    }
}
