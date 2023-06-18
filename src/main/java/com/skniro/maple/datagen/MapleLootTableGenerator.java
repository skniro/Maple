package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

import static com.skniro.maple.datagen.MapleBlockTagGeneration.ModBlockTags.CSAPLING;

public class MapleLootTableGenerator extends SimpleFabricLootTableProvider {
    public MapleLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.ENTITY);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        //CHERRY
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.CHERRY_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_wall_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.CHERRY_WALL_SIGN));

        //MAPLE
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.Maple_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_wall_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.Maple_WALL_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_log"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_wood"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_WOOD));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_door"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_sapling"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_SAPLING));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_leaves"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_LEAVES));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_button"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_BUTTON));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_fence"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_fence_gate"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_planks"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_PLANKS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_pressure_plate"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_slab"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_stairs"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_trapdoor"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/potted_maple_sapling"),
                BlockLootTableGenerator.drops(Maple_block.MAPLE_SAPLING,Blocks.FLOWER_POT));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/stripped_maple_log"),
                BlockLootTableGenerator.drops(Maple_block.STRIPPED_MAPLE_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/stripped_maple_wood"),
                BlockLootTableGenerator.drops(Maple_block.STRIPPED_MAPLE_WOOD));



        //BAMBOO
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_block"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.BAMBOO_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_wall_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.BAMBOO_WALL_SIGN));
    }
}
