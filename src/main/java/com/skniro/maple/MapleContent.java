package com.skniro.maple;


import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.optics.profunctors.GetterP;
import com.mojang.datafixers.schemas.Schema;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.client.particle.MapleCherryLeavesParticle;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.misc.qsldatafixupper.api.QuiltDataFixerBuilder;
import com.skniro.maple.misc.qsldatafixupper.api.QuiltDataFixes;
import com.skniro.maple.misc.qsldatafixupper.api.SimpleFixes;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.util.MapleFlammableBlocks;
import com.skniro.maple.util.MapleStrippableBlocks;
import com.skniro.maple.world.MapleConfiguredFeatures;
import com.skniro.maple.world.MaplePlacedFeatures;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.gen.MapleOreGeneration;
import com.skniro.maple.world.gen.MapleTreeGeneration;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.SharedConstants;
import net.minecraft.block.Block;
import net.minecraft.datafixer.DataFixTypes;
import net.minecraft.datafixer.Schemas;
import net.minecraft.datafixer.fix.BlockNameFix;
import net.minecraft.datafixer.fix.ItemNameFix;
import net.minecraft.datafixer.schema.IdentifierNormalizingSchema;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;


public class MapleContent {


    public static void registerItem(){
        MapleItems.registerModItems();
        GlassCupItems.registerModItems();
        MapleFoodComponents.registerMapleFoodItems();
    }
    public static void registerBlock(){
        MapleFlammableBlocks.registerFlammableBlocks();
        MapleStrippableBlocks.registerStrippables();
        MapleBlocks.registerMapleBlocks();
        MapleSignBlocks.registerMapleSignBlocks();
        MapleOreBlocks.registerMapleOreBlocks();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group).register(content -> {
            content.add(MapleBlocks.MAPLE_LOG);
            content.add(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(MapleBlocks.MAPLE_WOOD);
            content.add(MapleBlocks.CHERRY_LOG);
            content.add(MapleBlocks.CHERRY_WOOD);
            content.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(MapleBlocks.BAMBOO_BLOCK);
            content.add(MapleBlocks.STRIPPED_BAMBOO_BLOCK);
            content.add(MapleBlocks.MAPLE_SAPLING);
            content.add(MapleBlocks.CHERRY_SAPLING);
            content.add(MapleBlocks.SAKURA_SAPLING);
            content.add(MapleBlocks.MAPLE_LEAVES);
            content.add(MapleBlocks.CHERRY_LEAVES);
            content.add(MapleBlocks.SAKURA_LEAVES);
            content.add(MapleBlocks.MAPLE_PLANKS);
            content.add(MapleBlocks.CHERRY_PLANKS);
            content.add(MapleBlocks.BAMBOO_PLANKS);
            content.add(MapleBlocks.BAMBOO_MOSAIC);
            content.add(MapleBlocks.CHERRY_BUTTON);
            content.add(MapleBlocks.MAPLE_BUTTON);
            content.add(MapleBlocks.BAMBOO_BUTTON);
            content.add(MapleBlocks.CHERRY_STAIRS);
            content.add(MapleBlocks.MAPLE_STAIRS);
            content.add(MapleBlocks.BAMBOO_STAIRS);
            content.add(MapleBlocks.BAMBOO_MOSAIC_STAIRS);
            content.add(MapleBlocks.CHERRY_SLAB);
            content.add(MapleBlocks.MAPLE_SLAB);
            content.add(MapleBlocks.BAMBOO_SLAB);
            content.add(MapleBlocks.BAMBOO_MOSAIC_SLAB);
            content.add(MapleBlocks.CHERRY_FENCE);
            content.add(MapleBlocks.CHERRY_FENCE_GATE);
            content.add(MapleBlocks.MAPLE_FENCE);
            content.add(MapleBlocks.MAPLE_FENCE_GATE);
            content.add(MapleBlocks.BAMBOO_FENCE);
            content.add(MapleBlocks.BAMBOO_FENCE_GATE);
            content.add(MapleBlocks.CHERRY_TRAPDOOR);
            content.add(MapleBlocks.MAPLE_TRAPDOOR);
            content.add(MapleBlocks.BAMBOO_TRAPDOOR);
            content.add(MapleBlocks.CHERRY_PRESSURE_PLATE);
            content.add(MapleBlocks.MAPLE_PRESSURE_PLATE);
            content.add(MapleBlocks.BAMBOO_PRESSURE_PLATE);
            content.add(MapleBlocks.PINK_PETALS);
            content.add(MapleBlocks.CHISELED_BOOKSHELF);
            content.add(MapleItems.CHERRY_SIGN);
            content.add(MapleItems.MAPLE_SIGN);
            content.add(MapleItems.BAMBOO_SIGN);
            content.add(MapleItems.CHERRY_DOOR);
            content.add(MapleItems.MAPLE_DOOR);
            content.add(MapleItems.BAMBOO_DOOR);
            content.add(MapleItems.CHERRY_BOAT);
            content.add(MapleItems.MAPLE_BOAT);
            content.add(MapleItems.BAMBOO_BOAT);
            content.add(MapleItems.CHERRY_CHEST_BOAT);
            content.add(MapleItems.MAPLE_CHEST_BOAT);
            content.add(MapleItems.BAMBOO_CHEST_BOAT);
            content.add(MapleOreBlocks.Salt_Ore);
            content.add(MapleOreBlocks.DEEPSLATE_Salt_Ore);
        });

        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group_Food).register(content -> {
            content.add(MapleItems.Flour);
            content.add(MapleItems.MapleSyrup);
            content.add(MapleItems.Cream);
            content.add(MapleItems.MILK_BOTTOM);
            content.add(MapleItems.SOYBEAN);
            content.add(MapleItems.Salt);
            content.add(MapleItems.Rice);
            content.add(MapleFoodComponents.Sanshoku_Dango);
            content.add(MapleFoodComponents.Anko_Dango);
            content.add(MapleFoodComponents.Zunda_Dango);
            content.add(MapleFoodComponents.Kinako_Dango);
            content.add(MapleFoodComponents.Mochi);
            content.add(MapleFoodComponents.SakuraMochi);
            content.add(MapleFoodComponents.TOFU);
            content.add(MapleFoodComponents.MILK_ICECREAM);
            content.add(MapleFoodComponents.Cooked_Rice);
        });


    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        MapleConfiguredFeatures.registerConfiguredFeatures();
        MaplePlacedFeatures.registerPlacedFeatures();
        MapleOreGeneration.generateOres();
    }

    public static void registerBlockEntityType() {
        MapleBlockEntityType.registerMapleBlockEntityType();
        MapleParticleTypes.registerParticleTypes();
    }

    private static final int DATA_VERSION = 3;
    public static void datafix(final @NotNull ModContainer mod) {
        QuiltDataFixerBuilder builder = new QuiltDataFixerBuilder(DATA_VERSION);
        builder.addSchema(0, QuiltDataFixes.BASE_SCHEMA);
        Schema schemaV1 = builder.addSchema(3, IdentifierNormalizingSchema::new);
        SimpleFixes.addItemRenameFix(builder, "Rename old_item to new_item",
                new Identifier(Maple.MOD_ID, "cherry_log"), new Identifier(Maple.MOD_ID, "cherry_log"), schemaV1);
        SimpleFixes.addBlockRenameFix(builder, "Rename cherry_log to vanilla",
                new Identifier(Maple.MOD_ID, "cherry_log"), new Identifier(Maple.MOD_ID, "cherry_log"), schemaV1);
/*        Schema schemaV2 = builder.addSchema(2, IdentifierNormalizingSchema::new);
        SimpleFixes.addItemRenameFix(builder, "Rename new_item to fine_item",
                new Identifier(Maple.MOD_ID, "new_item"), new Identifier(Maple.MOD_ID, "fine_item"), schemaV2);
        SimpleFixes.addBlockRenameFix(builder, "Rename old_block to cool_block",
                new Identifier(Maple.MOD_ID, "old_block"), new Identifier(Maple.MOD_ID, "cool_block"), schemaV2);*/
        QuiltDataFixes.buildAndRegisterFixer(mod,new QuiltDataFixerBuilder(3));
    }



}

