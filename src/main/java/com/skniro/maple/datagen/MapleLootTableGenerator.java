package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.Maple_block;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;


public class MapleLootTableGenerator extends SimpleFabricLootTableProvider {
    public MapleLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.ENTITY);
    }
    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.048F, 0.0425F, 0.062333336F, 0.1F};

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        //CHERRY
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.CHERRY_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_wall_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.CHERRY_WALL_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_log"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_wood"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_WOOD));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_door"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_sapling"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_SAPLING));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_leaves"),
                BlockLootTableGenerator.leavesDrop(Maple_block.CHERRY_LEAVES,Maple_block.CHERRY_SAPLING,SAPLING_DROP_CHANCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_button"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_BUTTON));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_fence"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_fence_gate"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_planks"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_PLANKS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_pressure_plate"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_slab"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_stairs"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_trapdoor"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/potted_cherry_sapling"),
                BlockLootTableGenerator.drops(Maple_block.CHERRY_SAPLING,Blocks.FLOWER_POT));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/stripped_cherry_log"),
                BlockLootTableGenerator.drops(Maple_block.STRIPPED_CHERRY_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/stripped_cherry_wood"),
                BlockLootTableGenerator.drops(Maple_block.STRIPPED_CHERRY_WOOD));

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
                BlockLootTableGenerator.leavesDrop(Maple_block.MAPLE_LEAVES,Maple_block.MAPLE_SAPLING,SAPLING_DROP_CHANCE));
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
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_mosaic"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_MOSAIC));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_door"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_button"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_BUTTON));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_fence"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_fence_gate"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_planks"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_PLANKS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_pressure_plate"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_slab"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_stairs"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_mosaic_slab"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_MOSAIC_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_mosaic_stairs"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_MOSAIC_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_trapdoor"),
                BlockLootTableGenerator.drops(Maple_block.BAMBOO_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks//stripped_bamboo_block"),
                BlockLootTableGenerator.drops(Maple_block.STRIPPED_BAMBOO_BLOCK));

        //SAKURA
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/potted_sakura_sapling"),
                BlockLootTableGenerator.drops(Maple_block.SAKURA_SAPLING,Blocks.FLOWER_POT));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/sakura_sapling"),
                BlockLootTableGenerator.drops(Maple_block.SAKURA_SAPLING));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/sakura_leaves"),
                BlockLootTableGenerator.leavesDrop(Maple_block.SAKURA_LEAVES,Maple_block.SAKURA_SAPLING,SAPLING_DROP_CHANCE));

        //Crop
        net.minecraft.loot.condition.LootCondition.Builder builder = BlockStatePropertyLootCondition.builder(Maple_block.RICE).properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 7));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID,"blocks/rice_plant"),
                BlockLootTableGenerator.cropDrops(Maple_block.RICE, MapleItems.Rice,MapleItems.Rice,builder));
    }
}
