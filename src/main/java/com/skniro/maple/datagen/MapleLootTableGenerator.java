package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleSignBlocks;
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
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_wood"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_WOOD));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_door"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_sapling"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_SAPLING));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_leaves"),
                BlockLootTableGenerator.leavesDrop(MapleBlocks.CHERRY_LEAVES, MapleBlocks.CHERRY_SAPLING,SAPLING_DROP_CHANCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_button"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_BUTTON));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_fence"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_fence_gate"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_planks"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_PLANKS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_pressure_plate"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_slab"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_stairs"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/cherry_trapdoor"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/potted_cherry_sapling"),
                BlockLootTableGenerator.drops(MapleBlocks.CHERRY_SAPLING,Blocks.FLOWER_POT));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/stripped_cherry_log"),
                BlockLootTableGenerator.drops(MapleBlocks.STRIPPED_CHERRY_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/stripped_cherry_wood"),
                BlockLootTableGenerator.drops(MapleBlocks.STRIPPED_CHERRY_WOOD));

        //MAPLE
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.Maple_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_wall_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.Maple_WALL_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_log"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_wood"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_WOOD));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_door"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_sapling"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_SAPLING));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_leaves"),
                BlockLootTableGenerator.leavesDrop(MapleBlocks.MAPLE_LEAVES, MapleBlocks.MAPLE_SAPLING,SAPLING_DROP_CHANCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_button"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_BUTTON));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_fence"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_fence_gate"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_planks"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_PLANKS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_pressure_plate"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_slab"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_stairs"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/maple_trapdoor"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/potted_maple_sapling"),
                BlockLootTableGenerator.drops(MapleBlocks.MAPLE_SAPLING,Blocks.FLOWER_POT));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/stripped_maple_log"),
                BlockLootTableGenerator.drops(MapleBlocks.STRIPPED_MAPLE_LOG));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/stripped_maple_wood"),
                BlockLootTableGenerator.drops(MapleBlocks.STRIPPED_MAPLE_WOOD));



        //BAMBOO
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_block"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_BLOCK));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.BAMBOO_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_wall_sign"),
                BlockLootTableGenerator.drops(MapleSignBlocks.BAMBOO_WALL_SIGN));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_mosaic"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_MOSAIC));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_door"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_DOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_button"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_BUTTON));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_fence"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_FENCE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_fence_gate"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_FENCE_GATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_planks"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_PLANKS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_pressure_plate"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_PRESSURE_PLATE));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_slab"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_stairs"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_mosaic_slab"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_MOSAIC_SLAB));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_mosaic_stairs"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_MOSAIC_STAIRS));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/bamboo_trapdoor"),
                BlockLootTableGenerator.drops(MapleBlocks.BAMBOO_TRAPDOOR));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks//stripped_bamboo_block"),
                BlockLootTableGenerator.drops(MapleBlocks.STRIPPED_BAMBOO_BLOCK));

        //SAKURA
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/potted_sakura_sapling"),
                BlockLootTableGenerator.drops(MapleBlocks.SAKURA_SAPLING,Blocks.FLOWER_POT));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/sakura_sapling"),
                BlockLootTableGenerator.drops(MapleBlocks.SAKURA_SAPLING));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID, "blocks/sakura_leaves"),
                BlockLootTableGenerator.leavesDrop(MapleBlocks.SAKURA_LEAVES, MapleBlocks.SAKURA_SAPLING,SAPLING_DROP_CHANCE));

        //Crop
        net.minecraft.loot.condition.LootCondition.Builder builder = BlockStatePropertyLootCondition.builder(MapleBlocks.RICE).properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 7));
        identifierBuilderBiConsumer.accept(new Identifier(Maple.MOD_ID,"blocks/rice_plant"),
                BlockLootTableGenerator.cropDrops(MapleBlocks.RICE, MapleItems.SOYBEAN,MapleItems.Rice,builder));

    }
}
