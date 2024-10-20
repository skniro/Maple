package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import java.util.concurrent.CompletableFuture;


public class MapleLootTableGenerator extends FabricBlockLootTableProvider {
    public MapleLootTableGenerator(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataGenerator, registryLookup);
    }
    public static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[]{0.048F, 0.0425F, 0.062333336F, 0.1F};

    @Override
    public void generate() {
        //CHERRY
        dropSelf(MapleSignBlocks.CHERRY_SIGN);
        dropSelf(MapleSignBlocks.CHERRY_WALL_SIGN);
        dropSelf(MapleBlocks.CHERRY_LOG);
        dropSelf(MapleBlocks.CHERRY_WOOD);
        add(MapleBlocks.CHERRY_DOOR,createDoorTable(MapleBlocks.CHERRY_DOOR));
        dropSelf(MapleBlocks.CHERRY_SAPLING);
        add(MapleBlocks.CHERRY_LEAVES,createLeavesDrops(MapleBlocks.CHERRY_LEAVES,MapleBlocks.CHERRY_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MapleBlocks.CHERRY_BUTTON);
        dropSelf(MapleBlocks.CHERRY_FENCE);
        dropSelf(MapleBlocks.CHERRY_FENCE_GATE);
        dropSelf(MapleBlocks.CHERRY_PLANKS);
        dropSelf(MapleBlocks.CHERRY_PRESSURE_PLATE);
        dropSelf(MapleBlocks.CHERRY_SLAB);
        dropSelf(MapleBlocks.CHERRY_STAIRS);
        dropSelf(MapleBlocks.CHERRY_TRAPDOOR);
        dropSelf(MapleBlocks.STRIPPED_CHERRY_LOG);
        dropSelf(MapleBlocks.STRIPPED_CHERRY_WOOD);

        //MAPLE
        dropSelf(MapleSignBlocks.Maple_SIGN);
        dropSelf(MapleSignBlocks.Maple_WALL_SIGN);
        dropSelf(MapleSignBlocks.Maple_HANGING_SIGN);
        dropSelf(MapleSignBlocks.Maple_WALL_HANGING_SIGN);
        dropSelf(MapleBlocks.MAPLE_LOG);
        dropSelf(MapleBlocks.MAPLE_WOOD);
        add(MapleBlocks.MAPLE_DOOR,createDoorTable(MapleBlocks.MAPLE_DOOR));
        dropSelf(MapleBlocks.MAPLE_SAPLING);
        dropSelf(MapleBlocks.RED_MAPLE_SAPLING);
        add(MapleBlocks.MAPLE_LEAVES,createLeavesDrops(MapleBlocks.MAPLE_LEAVES,MapleBlocks.MAPLE_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
        add(MapleBlocks.RED_MAPLE_LEAVES,createLeavesDrops(MapleBlocks.RED_MAPLE_LEAVES,MapleBlocks.RED_MAPLE_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MapleBlocks.MAPLE_BUTTON);
        dropSelf(MapleBlocks.MAPLE_FENCE);
        dropSelf(MapleBlocks.MAPLE_FENCE_GATE);
        dropSelf(MapleBlocks.MAPLE_PLANKS);
        dropSelf(MapleBlocks.MAPLE_PRESSURE_PLATE);
        dropSelf(MapleBlocks.MAPLE_SLAB);
        dropSelf(MapleBlocks.MAPLE_STAIRS);
        dropSelf(MapleBlocks.MAPLE_TRAPDOOR);
        dropSelf(MapleBlocks.STRIPPED_MAPLE_LOG);
        dropSelf(MapleBlocks.STRIPPED_MAPLE_WOOD);

        //GINKGO
        dropSelf(MapleSignBlocks.GINKGO_SIGN);
        dropSelf(MapleSignBlocks.GINKGO_WALL_SIGN);
        dropSelf(MapleSignBlocks.GINKGO_HANGING_SIGN);
        dropSelf(MapleSignBlocks.GINKGO_WALL_HANGING_SIGN);
        dropSelf(MapleBlocks.GINKGO_LOG);
        dropSelf(MapleBlocks.GINKGO_WOOD);
        add(MapleBlocks.GINKGO_DOOR,createDoorTable(MapleBlocks.GINKGO_DOOR));
        add(MapleBlocks.GINKGO_LEAVES,createLeavesDrops(MapleBlocks.GINKGO_LEAVES,MapleBlocks.GINKGO_SAPLING,NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(MapleBlocks.GINKGO_BUTTON);
        dropSelf(MapleBlocks.GINKGO_FENCE);
        dropSelf(MapleBlocks.GINKGO_FENCE_GATE);
        dropSelf(MapleBlocks.GINKGO_PLANKS);
        dropSelf(MapleBlocks.GINKGO_PRESSURE_PLATE);
        dropSelf(MapleBlocks.GINKGO_SLAB);
        dropSelf(MapleBlocks.GINKGO_STAIRS);
        dropSelf(MapleBlocks.GINKGO_TRAPDOOR);
        dropSelf(MapleBlocks.GINKGO_SAPLING);
        dropSelf(MapleBlocks.STRIPPED_GINKGO_LOG);
        dropSelf(MapleBlocks.STRIPPED_GINKGO_WOOD);




        //BAMBOO
        dropSelf(MapleBlocks.BAMBOO_BLOCK);
        dropSelf(MapleSignBlocks.BAMBOO_SIGN);
        dropSelf(MapleSignBlocks.BAMBOO_WALL_SIGN);
        dropSelf(MapleBlocks.BAMBOO_MOSAIC);
        add(MapleBlocks.BAMBOO_DOOR,createDoorTable(MapleBlocks.BAMBOO_DOOR));
        dropSelf(MapleBlocks.BAMBOO_BUTTON);
        dropSelf(MapleBlocks.BAMBOO_FENCE);
        dropSelf(MapleBlocks.BAMBOO_FENCE_GATE);
        dropSelf(MapleBlocks.BAMBOO_PLANKS);
        dropSelf(MapleBlocks.BAMBOO_PRESSURE_PLATE);
        dropSelf(MapleBlocks.BAMBOO_SLAB);
        dropSelf(MapleBlocks.BAMBOO_STAIRS);
        dropSelf(MapleBlocks.BAMBOO_MOSAIC_SLAB);
        dropSelf(MapleBlocks.BAMBOO_MOSAIC_STAIRS);
        dropSelf(MapleBlocks.BAMBOO_TRAPDOOR);
        dropSelf(MapleBlocks.STRIPPED_BAMBOO_BLOCK);

        //SAKURA
        dropSelf(MapleBlocks.SAKURA_SAPLING);
        add(MapleBlocks.SAKURA_LEAVES, createLeavesDrops(MapleBlocks.SAKURA_LEAVES,MapleBlocks.SAKURA_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));

        //Crop
        net.minecraft.world.level.storage.loot.predicates.LootItemCondition.Builder builder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(MapleBlocks.RICE).setProperties(net.minecraft.advancements.critereon.StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7));
        add(MapleBlocks.RICE, createCropDrops(MapleBlocks.RICE, MapleItems.SOYBEAN,MapleItems.Rice,builder));

        //Glass Block
        dropWhenSilkTouch(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.LIME_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.LIME_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.PINK_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.PINK_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.RED_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.RED_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);
        dropWhenSilkTouch(MapleBlocks.GLASS_SLAB);
        dropWhenSilkTouch(MapleBlocks.GLASS_STAIRS);

        dropSelf(MapleBlocks.TATAMI);
        dropSelf(MapleBlocks.TATAMI_SLAB);

        add(MapleNetherOresBlocks.Nether_Coal_Ore, createOreDrop(MapleNetherOresBlocks.Nether_Coal_Ore, Items.COAL));
        add(MapleNetherOresBlocks.Nether_Copper_Ore, createCopperOreDrops(MapleNetherOresBlocks.Nether_Copper_Ore));
        add(MapleNetherOresBlocks.Nether_Diamond_Ore, createOreDrop(MapleNetherOresBlocks.Nether_Diamond_Ore,Items.DIAMOND));
        add(MapleNetherOresBlocks.Nether_Emerald_Ore, createOreDrop(MapleNetherOresBlocks.Nether_Emerald_Ore,Items.EMERALD));
        add(MapleNetherOresBlocks.Nether_Gold_Ore, createOreDrop(MapleNetherOresBlocks.Nether_Gold_Ore,Items.RAW_GOLD));
        add(MapleNetherOresBlocks.Nether_Iron_Ore, createOreDrop(MapleNetherOresBlocks.Nether_Iron_Ore,Items.RAW_IRON));
        add(MapleNetherOresBlocks.Nether_Lapis_Ore, createLapisOreDrops(MapleNetherOresBlocks.Nether_Lapis_Ore));
        add(MapleNetherOresBlocks.Nether_Redstone_Ore,createRedstoneOreDrops(MapleNetherOresBlocks.Nether_Redstone_Ore));
        add(MapleNetherOresBlocks.Nether_Coal_Ore, createOreDrop(MapleNetherOresBlocks.Nether_Coal_Ore,Items.COAL));
        add(MapleOreBlocks.Salt_Ore, createSilkTouchDispatchTable(MapleOreBlocks.Salt_Ore, this.applyExplosionDecay(MapleOreBlocks.Salt_Ore, LootItem.lootTableItem(MapleItems.Salt).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F,1.0F))))));
        add(MapleOreBlocks.DEEPSLATE_Salt_Ore, createSilkTouchDispatchTable(MapleOreBlocks.DEEPSLATE_Salt_Ore, this.applyExplosionDecay(MapleOreBlocks.DEEPSLATE_Salt_Ore, LootItem.lootTableItem(MapleItems.Salt).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F))))));

        dropSelf(MapleBlocks.RED_MAPLE_CARPET);
        dropSelf(MapleBlocks.Maple_CARPET);
        dropSelf(MapleBlocks.GINKGO_CARPET);
        dropSelf(MapleBlocks.SAKURA_CARPET);

        //PLASTER
        dropSelf(MapleBlocks.GREEN_PLASTER);
        dropSelf(MapleBlocks.PLASTER);
        dropSelf(MapleBlocks.ORANGE_PLASTER);
        dropSelf(MapleBlocks.MAGENTA_PLASTER);
        dropSelf(MapleBlocks.LIGHT_BLUE_PLASTER);
        dropSelf(MapleBlocks.YELLOW_PLASTER);
        dropSelf(MapleBlocks.LIME_PLASTER);
        dropSelf(MapleBlocks.PINK_PLASTER);
        dropSelf(MapleBlocks.GRAY_PLASTER);
        dropSelf(MapleBlocks.LIGHT_GRAY_PLASTER);
        dropSelf(MapleBlocks.CYAN_PLASTER);
        dropSelf(MapleBlocks.PURPLE_PLASTER);
        dropSelf(MapleBlocks.BLUE_PLASTER);
        dropSelf(MapleBlocks.BROWN_PLASTER);
        dropSelf(MapleBlocks.RED_PLASTER);

        //Sea Lantern
        dropSelf(MapleBlocks.Iron_Sea_Lantern);
        dropSelf(MapleBlocks.Gold_Sea_Lantern);

        //Potted
        dropPottedContents(MapleBlocks.POTTED_SAKURA_SAPLING);
        dropPottedContents(MapleBlocks.POTTED_RED_MAPLE_SAPLING);
        dropPottedContents(MapleBlocks.POTTED_CHERRY_SAPLING);
        dropPottedContents(MapleBlocks.POTTED_GINKGO_SAPLING);
        dropPottedContents(MapleBlocks.POTTED_MAPLE_SAPLING);
    }
}
