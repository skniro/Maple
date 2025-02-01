package com.skniro.maple.datagen;

import com.skniro.maple.block.*;
import com.skniro.maple.block.api.registry.MapleModelDatagenHelper;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.item.init.equipment.MapleEquipmentAssetKeys;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class MapleModelProvider extends FabricModelProvider {
    public MapleModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator){
        BlockModelGenerators.BlockFamilyProvider GINKGOPool = blockStateModelGenerator.family(MapleBlocks.GINKGO_PLANKS);

        GINKGOPool.stairs(MapleBlocks.GINKGO_STAIRS);
        GINKGOPool.slab(MapleBlocks.GINKGO_SLAB);
        GINKGOPool.button(MapleBlocks.GINKGO_BUTTON);
        GINKGOPool.pressurePlate(MapleBlocks.GINKGO_PRESSURE_PLATE);
        GINKGOPool.fence(MapleBlocks.GINKGO_FENCE);
        GINKGOPool.fenceGate(MapleBlocks.GINKGO_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider MaplePool = blockStateModelGenerator.family(MapleBlocks.MAPLE_PLANKS);

        MaplePool.stairs(MapleBlocks.MAPLE_STAIRS);
        MaplePool.slab(MapleBlocks.MAPLE_SLAB);
        MaplePool.button(MapleBlocks.MAPLE_BUTTON);
        MaplePool.pressurePlate(MapleBlocks.MAPLE_PRESSURE_PLATE);
        MaplePool.fence(MapleBlocks.MAPLE_FENCE);
        MaplePool.fenceGate(MapleBlocks.MAPLE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider white =blockStateModelGenerator.family(Blocks.WHITE_STAINED_GLASS);
        white.slab(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
        white.stairs(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider orange =blockStateModelGenerator.family(Blocks.ORANGE_STAINED_GLASS);
        orange.slab(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
        orange.stairs(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider magenta =blockStateModelGenerator.family(Blocks.MAGENTA_STAINED_GLASS);
        magenta.slab(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
        magenta.stairs(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider light_blue =blockStateModelGenerator.family(Blocks.LIGHT_BLUE_STAINED_GLASS);
        light_blue.slab(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        light_blue.stairs(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider yellow =blockStateModelGenerator.family(Blocks.YELLOW_STAINED_GLASS);
        yellow.slab(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
        yellow.stairs(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider lime =blockStateModelGenerator.family(Blocks.LIME_STAINED_GLASS);
        lime.slab(MapleBlocks.LIME_STAINED_GLASS_SLAB);
        lime.stairs(MapleBlocks.LIME_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider pink =blockStateModelGenerator.family(Blocks.PINK_STAINED_GLASS);
        pink.slab(MapleBlocks.PINK_STAINED_GLASS_SLAB);
        pink.stairs(MapleBlocks.PINK_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider gray =blockStateModelGenerator.family(Blocks.GRAY_STAINED_GLASS);
        gray.slab(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
        gray.stairs(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider light_gray =blockStateModelGenerator.family(Blocks.LIGHT_GRAY_STAINED_GLASS);
        light_gray.slab(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        light_gray.stairs(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider cyan =blockStateModelGenerator.family(Blocks.CYAN_STAINED_GLASS);
        cyan.slab(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
        cyan.stairs(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider purple =blockStateModelGenerator.family(Blocks.PURPLE_STAINED_GLASS);
        purple.slab(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
        purple.stairs(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider blue =blockStateModelGenerator.family(Blocks.BLUE_STAINED_GLASS);
        blue.slab(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
        blue.stairs(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider brown =blockStateModelGenerator.family(Blocks.BROWN_STAINED_GLASS);
        brown.slab(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
        brown.stairs(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider green =blockStateModelGenerator.family(Blocks.GREEN_STAINED_GLASS);
        green.slab(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
        green.stairs(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider red =blockStateModelGenerator.family(Blocks.RED_STAINED_GLASS);
        red.slab(MapleBlocks.RED_STAINED_GLASS_SLAB);
        red.stairs(MapleBlocks.RED_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider black =blockStateModelGenerator.family(Blocks.BLACK_STAINED_GLASS);
        black.slab(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
        black.stairs(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);

        BlockModelGenerators.BlockFamilyProvider glass =blockStateModelGenerator.family(Blocks.GLASS);
        glass.slab(MapleBlocks.GLASS_SLAB);
        glass.stairs(MapleBlocks.GLASS_STAIRS);

        //Concrete
        BlockModelGenerators.BlockFamilyProvider white1 = blockStateModelGenerator.family(Blocks.WHITE_CONCRETE);
        white1.slab(MapleBlocks.WHITE_CONCRETE_SLAB);
        white1.stairs(MapleBlocks.WHITE_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider orange1 = blockStateModelGenerator.family(Blocks.ORANGE_CONCRETE);
        orange1.slab(MapleBlocks.ORANGE_CONCRETE_SLAB);
        orange1.stairs(MapleBlocks.ORANGE_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider magenta1 = blockStateModelGenerator.family(Blocks.MAGENTA_CONCRETE);
        magenta1.slab(MapleBlocks.MAGENTA_CONCRETE_SLAB);
        magenta1.stairs(MapleBlocks.MAGENTA_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider light_blue1 = blockStateModelGenerator.family(Blocks.LIGHT_BLUE_CONCRETE);
        light_blue1.slab(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        light_blue1.stairs(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider yellow1 = blockStateModelGenerator.family(Blocks.YELLOW_CONCRETE);
        yellow1.slab(MapleBlocks.YELLOW_CONCRETE_SLAB);
        yellow1.stairs(MapleBlocks.YELLOW_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider lime1 = blockStateModelGenerator.family(Blocks.LIME_CONCRETE);
        lime1.slab(MapleBlocks.LIME_CONCRETE_SLAB);
        lime1.stairs(MapleBlocks.LIME_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider pink1 = blockStateModelGenerator.family(Blocks.PINK_CONCRETE);
        pink1.slab(MapleBlocks.PINK_CONCRETE_SLAB);
        pink1.stairs(MapleBlocks.PINK_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider gray1 = blockStateModelGenerator.family(Blocks.GRAY_CONCRETE);
        gray1.slab(MapleBlocks.GRAY_CONCRETE_SLAB);
        gray1.stairs(MapleBlocks.GRAY_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider light_gray1 = blockStateModelGenerator.family(Blocks.LIGHT_GRAY_CONCRETE);
        light_gray1.slab(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        light_gray1.stairs(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider cyan1 = blockStateModelGenerator.family(Blocks.CYAN_CONCRETE);
        cyan1.slab(MapleBlocks.CYAN_CONCRETE_SLAB);
        cyan1.stairs(MapleBlocks.CYAN_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider purple1 = blockStateModelGenerator.family(Blocks.PURPLE_CONCRETE);
        purple1.slab(MapleBlocks.PURPLE_CONCRETE_SLAB);
        purple1.stairs(MapleBlocks.PURPLE_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider blue1 = blockStateModelGenerator.family(Blocks.BLUE_CONCRETE);
        blue1.slab(MapleBlocks.BLUE_CONCRETE_SLAB);
        blue1.stairs(MapleBlocks.BLUE_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider brown1 = blockStateModelGenerator.family(Blocks.BROWN_CONCRETE);
        brown1.slab(MapleBlocks.BROWN_CONCRETE_SLAB);
        brown1.stairs(MapleBlocks.BROWN_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider green1 = blockStateModelGenerator.family(Blocks.GREEN_CONCRETE);
        green1.slab(MapleBlocks.GREEN_CONCRETE_SLAB);
        green1.stairs(MapleBlocks.GREEN_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider red1 = blockStateModelGenerator.family(Blocks.RED_CONCRETE);
        red1.slab(MapleBlocks.RED_CONCRETE_SLAB);
        red1.stairs(MapleBlocks.RED_CONCRETE_STAIRS);

        BlockModelGenerators.BlockFamilyProvider black1 = blockStateModelGenerator.family(Blocks.BLACK_CONCRETE);
        black1.slab(MapleBlocks.BLACK_CONCRETE_SLAB);
        black1.stairs(MapleBlocks.BLACK_CONCRETE_STAIRS);

        //Cube Block
        blockStateModelGenerator.family(MapleBlocks.CHERRY_PLANKS);
        blockStateModelGenerator.family(MapleBlocks.BAMBOO_PLANKS);
        blockStateModelGenerator.family(MapleBlocks.BAMBOO_MOSAIC);
        blockStateModelGenerator.family(MapleOreBlocks.Salt_Ore);
        blockStateModelGenerator.family(MapleOreBlocks.DEEPSLATE_Salt_Ore);
        blockStateModelGenerator.family(MapleNetherOresBlocks.Nether_Coal_Ore);
        blockStateModelGenerator.family(MapleNetherOresBlocks.Nether_Copper_Ore);
        blockStateModelGenerator.family(MapleNetherOresBlocks.Nether_Diamond_Ore);
        blockStateModelGenerator.family(MapleNetherOresBlocks.Nether_Emerald_Ore);
        blockStateModelGenerator.family(MapleNetherOresBlocks.Nether_Gold_Ore);
        blockStateModelGenerator.family(MapleNetherOresBlocks.Nether_Iron_Ore);
        blockStateModelGenerator.family(MapleNetherOresBlocks.Nether_Lapis_Ore);
        blockStateModelGenerator.family(MapleNetherOresBlocks.Nether_Redstone_Ore);

        //LOG Block
        blockStateModelGenerator.woodProvider(MapleBlocks.MAPLE_LOG).logWithHorizontal(MapleBlocks.MAPLE_LOG).wood(MapleBlocks.MAPLE_WOOD);
        blockStateModelGenerator.woodProvider(MapleBlocks.STRIPPED_MAPLE_LOG).logWithHorizontal(MapleBlocks.STRIPPED_MAPLE_LOG).wood(MapleBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.woodProvider(MapleBlocks.GINKGO_LOG).logWithHorizontal(MapleBlocks.GINKGO_LOG).wood(MapleBlocks.GINKGO_WOOD);
        blockStateModelGenerator.woodProvider(MapleBlocks.STRIPPED_GINKGO_LOG).logWithHorizontal(MapleBlocks.STRIPPED_GINKGO_LOG).wood(MapleBlocks.STRIPPED_GINKGO_WOOD);

        //Door
        blockStateModelGenerator.createDoor(MapleBlocks.MAPLE_DOOR);
        blockStateModelGenerator.createDoor(MapleBlocks.CHERRY_DOOR);
        blockStateModelGenerator.createDoor(MapleBlocks.BAMBOO_DOOR);
        blockStateModelGenerator.createDoor(MapleBlocks.GINKGO_DOOR);

        //TRAPDOOR
        blockStateModelGenerator.createTrapdoor(MapleBlocks.CHERRY_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MapleBlocks.MAPLE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MapleBlocks.BAMBOO_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MapleBlocks.GINKGO_TRAPDOOR);

        //SAPLING
        blockStateModelGenerator.createPlantWithDefaultItem(MapleBlocks.CHERRY_SAPLING, MapleBlocks.POTTED_CHERRY_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(MapleBlocks.MAPLE_SAPLING, MapleBlocks.POTTED_MAPLE_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(MapleBlocks.RED_MAPLE_SAPLING, MapleBlocks.POTTED_RED_MAPLE_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(MapleBlocks.SAKURA_SAPLING, MapleBlocks.POTTED_SAKURA_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        blockStateModelGenerator.createPlantWithDefaultItem(MapleBlocks.GINKGO_SAPLING, MapleBlocks.POTTED_GINKGO_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);

        //Crop
        blockStateModelGenerator.createCropBlock(MapleBlocks.RICE, BlockStateProperties.AGE_7, 0, 0, 0, 1, 1, 1, 1, 2);
        MapleModelDatagenHelper mapleModelDatagenHelper = new MapleModelDatagenHelper(blockStateModelGenerator);
        mapleModelDatagenHelper.registerModSweetBerryBush(MapleFoodComponents.Green_Tea_Leaves, MapleBlocks.Tea_Block);

        //Block and Carpet
        blockStateModelGenerator.createFullAndCarpetBlocks(MapleBlocks.SAKURA_LEAVES,MapleBlocks.SAKURA_CARPET);
        blockStateModelGenerator.createFullAndCarpetBlocks(MapleBlocks.MAPLE_LEAVES,MapleBlocks.Maple_CARPET);
        blockStateModelGenerator.createFullAndCarpetBlocks(MapleBlocks.GINKGO_LEAVES,MapleBlocks.GINKGO_CARPET);
        blockStateModelGenerator.createFullAndCarpetBlocks(MapleBlocks.RED_MAPLE_LEAVES,MapleBlocks.RED_MAPLE_CARPET);


        BlockModelGenerators.BlockFamilyProvider tatami =blockStateModelGenerator.family(MapleBlocks.TATAMI);
        tatami.slab(MapleBlocks.TATAMI_SLAB);

        //PLASTER
        blockStateModelGenerator.family(MapleBlocks.GREEN_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.PLASTER);
        blockStateModelGenerator.family(MapleBlocks.ORANGE_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.MAGENTA_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.LIGHT_BLUE_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.YELLOW_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.LIME_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.PINK_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.GRAY_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.LIGHT_GRAY_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.CYAN_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.PURPLE_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.BLUE_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.BROWN_PLASTER);
        blockStateModelGenerator.family(MapleBlocks.RED_PLASTER);

        //Sea Lantern
        blockStateModelGenerator.family(MapleBlocks.Iron_Sea_Lantern);
        blockStateModelGenerator.family(MapleBlocks.Gold_Sea_Lantern);

        //Cushion
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_OAK_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_SPRUCE_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BIRCH_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_JUNGLE_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_ACACIA_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_DARK_OAK_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CRIMSON_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_WARPED_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MANGROVE_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_MAPLE_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_CHERRY_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_GINKGO_BLACK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_WHITE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_ORANGE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_MAGENTA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_LIGHT_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_YELLOW);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_LIME);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_PINK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_LIGHT_GRAY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_CYAN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_PURPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_BLUE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_BROWN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_GREEN);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_RED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.CUSHION_BAMBOO_BLACK);

        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_SPRUCE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_BIRCH);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_JUNGLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_ACACIA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_DARK_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_CRIMSON);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_WARPED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_MANGROVE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_BAMBOO);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_CHERRY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_MAPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.TABLE_GINKGO);

        //CoffeeTable
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_SPRUCE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_BIRCH);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_JUNGLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_ACACIA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_DARK_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_CRIMSON);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_WARPED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_MANGROVE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_BAMBOO);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_WOOD_CHERRY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_Wood_MAPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_Wood_GINKGO);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_SPRUCE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_BIRCH);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_JUNGLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_ACACIA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_DARK_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_CRIMSON);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_WARPED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_MANGROVE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_BAMBOO);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_CHERRY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_MAPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Coffee_Table_PLANK_GINKGO);

        //Chair
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_SPRUCE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_BIRCH);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_JUNGLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_ACACIA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_DARK_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_CRIMSON);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_WARPED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_MANGROVE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_BAMBOO);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_WOOD_CHERRY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_Wood_MAPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_Wood_GINKGO);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_SPRUCE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_BIRCH);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_JUNGLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_ACACIA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_DARK_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_CRIMSON);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_WARPED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_MANGROVE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_BAMBOO);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_CHERRY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_MAPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.Chair_PLANK_GINKGO);

        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_SPRUCE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_BIRCH);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_JUNGLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_ACACIA);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_DARK_OAK);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_CRIMSON);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_WARPED);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_MANGROVE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_BAMBOO);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_CHERRY);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_MAPLE);
        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleFurnitureBlocks.END_TABLE_GINKGO);

        blockStateModelGenerator.createNonTemplateHorizontalBlock(MapleBlocks.Maple_Juicer_Block);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(GlassCupItems.HIGH_GLASS_CUP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.MILK_BOTTOM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.MapleSyrup, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.Flour, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.Cream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SOYBEAN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.Salt, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.BAMBOO_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.BAMBOO_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Anko_Dango, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Beef_Rice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Cheese, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Mochi, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Cooked_Rice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Kinako_Dango, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.MILK_ICECREAM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.SakuraMochi, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Sanshoku_Dango, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.TOFU, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Zunda_Dango, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Chorus_Juice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.AppleJuice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.CarrotJuice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.MelonJuice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Sweet_Berries_Juice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Glow_Berries_Juice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.GINKGO_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.GINKGO_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.MAPLE_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.MAPLE_CHEST_BOAT, ModelTemplates.FLAT_ITEM);


        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_STONE, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_Diamond, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_Gold, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_ICE, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_IRON, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_Compression, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_Teleporting, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_Confusion, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_Instant_Health, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.SNOWBALL_Poison, Items.SNOWBALL, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(MapleFluidBlockOrItem.Hot_Spring_BUCKET, ModelTemplates.FLAT_ITEM);

        //Cherry tools
        itemModelGenerator.generateFlatItem(MapleArmorItems.Cherry_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleArmorItems.Cherry_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleArmorItems.Cherry_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(MapleArmorItems.Cherry_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(MapleArmorItems.Cherry_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(MapleArmorItems.Cherry_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(MapleArmorItems.Cherry_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

        //Cherry armors
        itemModelGenerator.generateTrimmableItem(MapleArmorItems.Cherry_HELMET, MapleEquipmentAssetKeys.Cherry,"helmet", false);
        itemModelGenerator.generateTrimmableItem(MapleArmorItems.Cherry_CHESTPLATE, MapleEquipmentAssetKeys.Cherry,"chestplate", false);
        itemModelGenerator.generateTrimmableItem(MapleArmorItems.Cherry_LEGGINGS, MapleEquipmentAssetKeys.Cherry,"leggings", false);
        itemModelGenerator.generateTrimmableItem(MapleArmorItems.Cherry_BOOTS, MapleEquipmentAssetKeys.Cherry,"boots", false);

        //Sign
        itemModelGenerator.generateFlatItem(MapleItems.Maple_HANGING_SIGN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.GINKGO_HANGING_SIGN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.MAPLE_SIGN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.GINKGO_SIGN, ModelTemplates.FLAT_ITEM);

        //Tea
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Green_Tea, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Red_Tea, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleFoodComponents.Red_Tea_Leaves, ModelTemplates.FLAT_ITEM);
    }
}
