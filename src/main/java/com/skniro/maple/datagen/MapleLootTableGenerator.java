package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;


public class MapleLootTableGenerator extends FabricBlockLootTableProvider {
    public MapleLootTableGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }
    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.048F, 0.0425F, 0.062333336F, 0.1F};

    @Override
    public void generate() {
        //CHERRY
        addDrop(MapleSignBlocks.CHERRY_SIGN);
        addDrop(MapleSignBlocks.CHERRY_WALL_SIGN);
        addDrop(MapleBlocks.CHERRY_LOG);
        addDrop(MapleBlocks.CHERRY_WOOD);
        addDrop(MapleBlocks.CHERRY_DOOR,doorDrops(MapleBlocks.CHERRY_DOOR));
        addDrop(MapleBlocks.CHERRY_SAPLING);
        addDrop(MapleBlocks.CHERRY_LEAVES,leavesDrops(MapleBlocks.CHERRY_LEAVES,MapleBlocks.CHERRY_SAPLING,SAPLING_DROP_CHANCE));
        addDrop(MapleBlocks.CHERRY_BUTTON);
        addDrop(MapleBlocks.CHERRY_FENCE);
        addDrop(MapleBlocks.CHERRY_FENCE_GATE);
        addDrop(MapleBlocks.CHERRY_PLANKS);
        addDrop(MapleBlocks.CHERRY_PRESSURE_PLATE);
        addDrop(MapleBlocks.CHERRY_SLAB);
        addDrop(MapleBlocks.CHERRY_STAIRS);
        addDrop(MapleBlocks.CHERRY_TRAPDOOR);
        addDrop(MapleBlocks.CHERRY_SAPLING,Blocks.FLOWER_POT);
        addDrop(MapleBlocks.STRIPPED_CHERRY_LOG);
        addDrop(MapleBlocks.STRIPPED_CHERRY_WOOD);

        //MAPLE
        addDrop(MapleSignBlocks.Maple_SIGN);
        addDrop(MapleSignBlocks.Maple_WALL_SIGN);
        addDrop(MapleBlocks.MAPLE_LOG);
        addDrop(MapleBlocks.MAPLE_WOOD);
        addDrop(MapleBlocks.MAPLE_DOOR,doorDrops(MapleBlocks.MAPLE_DOOR));
        addDrop(MapleBlocks.MAPLE_SAPLING);
        addDrop(MapleBlocks.MAPLE_LEAVES,leavesDrops(MapleBlocks.MAPLE_LEAVES,MapleBlocks.MAPLE_SAPLING,SAPLING_DROP_CHANCE));
        addDrop(MapleBlocks.RED_MAPLE_LEAVES,leavesDrops(MapleBlocks.RED_MAPLE_LEAVES,MapleBlocks.RED_MAPLE_SAPLING,SAPLING_DROP_CHANCE));
        addDrop(MapleBlocks.MAPLE_BUTTON);
        addDrop(MapleBlocks.MAPLE_FENCE);
        addDrop(MapleBlocks.MAPLE_FENCE_GATE);
        addDrop(MapleBlocks.MAPLE_PLANKS);
        addDrop(MapleBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(MapleBlocks.MAPLE_SLAB);
        addDrop(MapleBlocks.MAPLE_STAIRS);
        addDrop(MapleBlocks.MAPLE_TRAPDOOR);
        addDrop(MapleBlocks.MAPLE_SAPLING,Blocks.FLOWER_POT);
        addDrop(MapleBlocks.STRIPPED_MAPLE_LOG);
        addDrop(MapleBlocks.STRIPPED_MAPLE_WOOD);

        //GINKGO
        addDrop(MapleSignBlocks.GINKGO_SIGN);
        addDrop(MapleSignBlocks.GINKGO_WALL_SIGN);
        addDrop(MapleBlocks.GINKGO_LOG);
        addDrop(MapleBlocks.GINKGO_WOOD);
        addDrop(MapleBlocks.GINKGO_DOOR,doorDrops(MapleBlocks.GINKGO_DOOR));
        addDrop(MapleBlocks.MAPLE_SAPLING);
        addDrop(MapleBlocks.GINKGO_LEAVES,leavesDrops(MapleBlocks.GINKGO_LEAVES,MapleBlocks.GINKGO_SAPLING,SAPLING_DROP_CHANCE));
        addDrop(MapleBlocks.GINKGO_BUTTON);
        addDrop(MapleBlocks.GINKGO_FENCE);
        addDrop(MapleBlocks.GINKGO_FENCE_GATE);
        addDrop(MapleBlocks.GINKGO_PLANKS);
        addDrop(MapleBlocks.GINKGO_PRESSURE_PLATE);
        addDrop(MapleBlocks.GINKGO_SLAB);
        addDrop(MapleBlocks.GINKGO_STAIRS);
        addDrop(MapleBlocks.GINKGO_TRAPDOOR);
        addDrop(MapleBlocks.GINKGO_SAPLING,Blocks.FLOWER_POT);
        addDrop(MapleBlocks.STRIPPED_GINKGO_LOG);
        addDrop(MapleBlocks.STRIPPED_GINKGO_WOOD);




        //BAMBOO
        addDrop(MapleBlocks.BAMBOO_BLOCK);
        addDrop(MapleSignBlocks.BAMBOO_SIGN);
        addDrop(MapleSignBlocks.BAMBOO_WALL_SIGN);
        addDrop(MapleBlocks.BAMBOO_MOSAIC);
        addDrop(MapleBlocks.BAMBOO_DOOR,doorDrops(MapleBlocks.BAMBOO_DOOR));
        addDrop(MapleBlocks.BAMBOO_BUTTON);
        addDrop(MapleBlocks.BAMBOO_FENCE);
        addDrop(MapleBlocks.BAMBOO_FENCE_GATE);
        addDrop(MapleBlocks.BAMBOO_PLANKS);
        addDrop(MapleBlocks.BAMBOO_PRESSURE_PLATE);
        addDrop(MapleBlocks.BAMBOO_SLAB);
        addDrop(MapleBlocks.BAMBOO_STAIRS);
        addDrop(MapleBlocks.BAMBOO_MOSAIC_SLAB);
        addDrop(MapleBlocks.BAMBOO_MOSAIC_STAIRS);
        addDrop(MapleBlocks.BAMBOO_TRAPDOOR);
        addDrop(MapleBlocks.STRIPPED_BAMBOO_BLOCK);

        //SAKURA
        addDrop(MapleBlocks.SAKURA_SAPLING,Blocks.FLOWER_POT);
        addDrop(MapleBlocks.SAKURA_SAPLING);
        addDrop(MapleBlocks.SAKURA_LEAVES, leavesDrops(MapleBlocks.SAKURA_LEAVES,MapleBlocks.SAKURA_SAPLING, SAPLING_DROP_CHANCE));

        //Crop
        net.minecraft.loot.condition.LootCondition.Builder builder = BlockStatePropertyLootCondition.builder(MapleBlocks.RICE).properties(net.minecraft.predicate.StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 7));
        addDrop(MapleBlocks.RICE, cropDrops(MapleBlocks.RICE, MapleItems.SOYBEAN,MapleItems.Rice,builder));

        //Glass Block
        addDropWithSilkTouch(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.LIME_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.LIME_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.PINK_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.PINK_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.RED_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.RED_STAINED_GLASS_STAIRS);
        addDropWithSilkTouch(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
        addDropWithSilkTouch(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);

        addDrop(MapleBlocks.TATAMI);

    }
}
