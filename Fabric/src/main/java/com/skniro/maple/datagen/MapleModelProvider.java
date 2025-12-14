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
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import static net.minecraft.client.data.ItemModelGenerator.*;

public class MapleModelProvider extends FabricModelProvider {
    public MapleModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        BlockStateModelGenerator.BlockTexturePool GINKGOPool = blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.GINKGO_PLANKS);

        GINKGOPool.stairs(MapleBlocks.GINKGO_STAIRS);
        GINKGOPool.slab(MapleBlocks.GINKGO_SLAB);
        GINKGOPool.button(MapleBlocks.GINKGO_BUTTON);
        GINKGOPool.pressurePlate(MapleBlocks.GINKGO_PRESSURE_PLATE);
        GINKGOPool.fence(MapleBlocks.GINKGO_FENCE);
        GINKGOPool.fenceGate(MapleBlocks.GINKGO_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool MaplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.MAPLE_PLANKS);

        MaplePool.stairs(MapleBlocks.MAPLE_STAIRS);
        MaplePool.slab(MapleBlocks.MAPLE_SLAB);
        MaplePool.button(MapleBlocks.MAPLE_BUTTON);
        MaplePool.pressurePlate(MapleBlocks.MAPLE_PRESSURE_PLATE);
        MaplePool.fence(MapleBlocks.MAPLE_FENCE);
        MaplePool.fenceGate(MapleBlocks.MAPLE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool white =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_STAINED_GLASS);
        white.slab(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
        white.stairs(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool orange =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_STAINED_GLASS);
        orange.slab(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
        orange.stairs(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool magenta =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_STAINED_GLASS);
        magenta.slab(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
        magenta.stairs(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool light_blue =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_STAINED_GLASS);
        light_blue.slab(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
        light_blue.stairs(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool yellow =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_STAINED_GLASS);
        yellow.slab(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
        yellow.stairs(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool lime =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_STAINED_GLASS);
        lime.slab(MapleBlocks.LIME_STAINED_GLASS_SLAB);
        lime.stairs(MapleBlocks.LIME_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool pink =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_STAINED_GLASS);
        pink.slab(MapleBlocks.PINK_STAINED_GLASS_SLAB);
        pink.stairs(MapleBlocks.PINK_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool gray =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_STAINED_GLASS);
        gray.slab(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
        gray.stairs(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool light_gray =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_STAINED_GLASS);
        light_gray.slab(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
        light_gray.stairs(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool cyan =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_STAINED_GLASS);
        cyan.slab(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
        cyan.stairs(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool purple =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_STAINED_GLASS);
        purple.slab(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
        purple.stairs(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool blue =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_STAINED_GLASS);
        blue.slab(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
        blue.stairs(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool brown =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_STAINED_GLASS);
        brown.slab(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
        brown.stairs(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool green =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_STAINED_GLASS);
        green.slab(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
        green.stairs(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool red =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_STAINED_GLASS);
        red.slab(MapleBlocks.RED_STAINED_GLASS_SLAB);
        red.stairs(MapleBlocks.RED_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool black =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_STAINED_GLASS);
        black.slab(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
        black.stairs(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);

        BlockStateModelGenerator.BlockTexturePool glass =blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GLASS);
        glass.slab(MapleBlocks.GLASS_SLAB);
        glass.stairs(MapleBlocks.GLASS_STAIRS);

        //Concrete
        BlockStateModelGenerator.BlockTexturePool white1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        white1.slab(MapleBlocks.WHITE_CONCRETE_SLAB);
        white1.stairs(MapleBlocks.WHITE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool orange1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        orange1.slab(MapleBlocks.ORANGE_CONCRETE_SLAB);
        orange1.stairs(MapleBlocks.ORANGE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool magenta1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        magenta1.slab(MapleBlocks.MAGENTA_CONCRETE_SLAB);
        magenta1.stairs(MapleBlocks.MAGENTA_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool light_blue1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        light_blue1.slab(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        light_blue1.stairs(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool yellow1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        yellow1.slab(MapleBlocks.YELLOW_CONCRETE_SLAB);
        yellow1.stairs(MapleBlocks.YELLOW_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool lime1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        lime1.slab(MapleBlocks.LIME_CONCRETE_SLAB);
        lime1.stairs(MapleBlocks.LIME_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool pink1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        pink1.slab(MapleBlocks.PINK_CONCRETE_SLAB);
        pink1.stairs(MapleBlocks.PINK_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool gray1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        gray1.slab(MapleBlocks.GRAY_CONCRETE_SLAB);
        gray1.stairs(MapleBlocks.GRAY_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool light_gray1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        light_gray1.slab(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        light_gray1.stairs(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool cyan1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        cyan1.slab(MapleBlocks.CYAN_CONCRETE_SLAB);
        cyan1.stairs(MapleBlocks.CYAN_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool purple1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        purple1.slab(MapleBlocks.PURPLE_CONCRETE_SLAB);
        purple1.stairs(MapleBlocks.PURPLE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool blue1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        blue1.slab(MapleBlocks.BLUE_CONCRETE_SLAB);
        blue1.stairs(MapleBlocks.BLUE_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool brown1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        brown1.slab(MapleBlocks.BROWN_CONCRETE_SLAB);
        brown1.stairs(MapleBlocks.BROWN_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool green1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        green1.slab(MapleBlocks.GREEN_CONCRETE_SLAB);
        green1.stairs(MapleBlocks.GREEN_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool red1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        red1.slab(MapleBlocks.RED_CONCRETE_SLAB);
        red1.stairs(MapleBlocks.RED_CONCRETE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool black1 = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        black1.slab(MapleBlocks.BLACK_CONCRETE_SLAB);
        black1.stairs(MapleBlocks.BLACK_CONCRETE_STAIRS);

        //Cube Block
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.CHERRY_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.BAMBOO_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.BAMBOO_MOSAIC);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleOreBlocks.Salt_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleOreBlocks.DEEPSLATE_Salt_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleNetherOresBlocks.Nether_Coal_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleNetherOresBlocks.Nether_Copper_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleNetherOresBlocks.Nether_Diamond_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleNetherOresBlocks.Nether_Emerald_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleNetherOresBlocks.Nether_Gold_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleNetherOresBlocks.Nether_Iron_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleNetherOresBlocks.Nether_Lapis_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleNetherOresBlocks.Nether_Redstone_Ore);

        //LOG Block
        blockStateModelGenerator.createLogTexturePool(MapleBlocks.MAPLE_LOG).log(MapleBlocks.MAPLE_LOG).wood(MapleBlocks.MAPLE_WOOD);
        blockStateModelGenerator.createLogTexturePool(MapleBlocks.STRIPPED_MAPLE_LOG).log(MapleBlocks.STRIPPED_MAPLE_LOG).wood(MapleBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.createLogTexturePool(MapleBlocks.GINKGO_LOG).log(MapleBlocks.GINKGO_LOG).wood(MapleBlocks.GINKGO_WOOD);
        blockStateModelGenerator.createLogTexturePool(MapleBlocks.STRIPPED_GINKGO_LOG).log(MapleBlocks.STRIPPED_GINKGO_LOG).wood(MapleBlocks.STRIPPED_GINKGO_WOOD);

        //Door
        blockStateModelGenerator.registerDoor(MapleBlocks.MAPLE_DOOR);
        blockStateModelGenerator.registerDoor(MapleBlocks.CHERRY_DOOR);
        blockStateModelGenerator.registerDoor(MapleBlocks.BAMBOO_DOOR);
        blockStateModelGenerator.registerDoor(MapleBlocks.GINKGO_DOOR);

        //TRAPDOOR
        blockStateModelGenerator.registerTrapdoor(MapleBlocks.CHERRY_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MapleBlocks.MAPLE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MapleBlocks.BAMBOO_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MapleBlocks.GINKGO_TRAPDOOR);

        //SAPLING
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MapleBlocks.CHERRY_SAPLING, MapleBlocks.POTTED_CHERRY_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MapleBlocks.MAPLE_SAPLING, MapleBlocks.POTTED_MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MapleBlocks.RED_MAPLE_SAPLING, MapleBlocks.POTTED_RED_MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MapleBlocks.SAKURA_SAPLING, MapleBlocks.POTTED_SAKURA_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(MapleBlocks.GINKGO_SAPLING, MapleBlocks.POTTED_GINKGO_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        //Crop
        blockStateModelGenerator.registerCrop(MapleBlocks.RICE, Properties.AGE_7, 0, 0, 0, 1, 1, 1, 1, 2);
        MapleModelDatagenHelper mapleModelDatagenHelper = new MapleModelDatagenHelper(blockStateModelGenerator);
        mapleModelDatagenHelper.registerModSweetBerryBush(MapleFoodComponents.Green_Tea_Leaves, MapleBlocks.Tea_Block);

        //Block and Carpet
        blockStateModelGenerator.registerWoolAndCarpet(MapleBlocks.SAKURA_LEAVES,MapleBlocks.SAKURA_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(MapleBlocks.MAPLE_LEAVES,MapleBlocks.Maple_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(MapleBlocks.GINKGO_LEAVES,MapleBlocks.GINKGO_CARPET);
        blockStateModelGenerator.registerWoolAndCarpet(MapleBlocks.RED_MAPLE_LEAVES,MapleBlocks.RED_MAPLE_CARPET);


        BlockStateModelGenerator.BlockTexturePool tatami =blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.TATAMI);
        tatami.slab(MapleBlocks.TATAMI_SLAB);

        //PLASTER
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.GREEN_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.ORANGE_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.MAGENTA_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.LIGHT_BLUE_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.YELLOW_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.LIME_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.PINK_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.GRAY_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.LIGHT_GRAY_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.CYAN_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.PURPLE_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.BLUE_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.BROWN_PLASTER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.RED_PLASTER);

        //Sea Lantern
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.Iron_Sea_Lantern);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.Gold_Sea_Lantern);

        //Cushion
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_OAK_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_SPRUCE_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BIRCH_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_JUNGLE_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_ACACIA_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_DARK_OAK_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CRIMSON_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_WARPED_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MANGROVE_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_MAPLE_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_CHERRY_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_GINKGO_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.CUSHION_BAMBOO_BLACK);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_SPRUCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_BIRCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_JUNGLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_ACACIA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_DARK_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_CRIMSON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_WARPED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_MANGROVE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_BAMBOO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_CHERRY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_MAPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.TABLE_GINKGO);

        //CoffeeTable
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_SPRUCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_BIRCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_JUNGLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_ACACIA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_DARK_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_CRIMSON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_WARPED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_MANGROVE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_BAMBOO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_WOOD_CHERRY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_Wood_MAPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_Wood_GINKGO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_SPRUCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_BIRCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_JUNGLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_ACACIA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_DARK_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_CRIMSON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_WARPED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_MANGROVE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_BAMBOO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_CHERRY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_MAPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Coffee_Table_PLANK_GINKGO);

        //Chair
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_SPRUCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_BIRCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_JUNGLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_ACACIA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_DARK_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_CRIMSON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_WARPED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_MANGROVE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_BAMBOO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_WOOD_CHERRY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_Wood_MAPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_Wood_GINKGO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_SPRUCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_BIRCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_JUNGLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_ACACIA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_DARK_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_CRIMSON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_WARPED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_MANGROVE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_BAMBOO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_CHERRY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_MAPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.Chair_PLANK_GINKGO);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_SPRUCE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_BIRCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_JUNGLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_ACACIA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_DARK_OAK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_CRIMSON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_WARPED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_MANGROVE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_BAMBOO);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_CHERRY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_MAPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleFurnitureBlocks.END_TABLE_GINKGO);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(MapleBlocks.Maple_Juicer_Block);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(GlassCupItems.HIGH_GLASS_CUP, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.MILK_BOTTOM, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MapleSyrup, Models.GENERATED);
        itemModelGenerator.register(MapleItems.Flour, Models.GENERATED);
        itemModelGenerator.register(MapleItems.Cream, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SOYBEAN, Models.GENERATED);
        itemModelGenerator.register(MapleItems.Salt, Models.GENERATED);
        itemModelGenerator.register(MapleItems.BAMBOO_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleItems.BAMBOO_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Anko_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Beef_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Cheese, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Mochi, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Cooked_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Kinako_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.MILK_ICECREAM, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.SakuraMochi, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Sanshoku_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.TOFU, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Zunda_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Chorus_Juice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.AppleJuice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.CarrotJuice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.MelonJuice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Sweet_Berries_Juice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Glow_Berries_Juice, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MAPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MAPLE_CHEST_BOAT, Models.GENERATED);


        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_STONE, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_Diamond, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_Gold, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_ICE, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_IRON, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_Compression, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_Teleporting, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_Confusion, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_Instant_Health, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.registerWithTextureSource(MapleItems.SNOWBALL_Poison, Items.SNOWBALL, Models.GENERATED);

        itemModelGenerator.register(MapleFluidBlockOrItem.Hot_Spring_BUCKET, Models.GENERATED);

        //Cherry tools
        itemModelGenerator.register(MapleArmorItems.Cherry_NUGGET, Models.GENERATED);
        itemModelGenerator.register(MapleArmorItems.Cherry_INGOT, Models.GENERATED);
        itemModelGenerator.register(MapleArmorItems.Cherry_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(MapleArmorItems.Cherry_AXE, Models.HANDHELD);
        itemModelGenerator.register(MapleArmorItems.Cherry_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(MapleArmorItems.Cherry_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MapleArmorItems.Cherry_HOE, Models.HANDHELD);

        //Cherry armors
        itemModelGenerator.registerArmor(MapleArmorItems.Cherry_HELMET, MapleEquipmentAssetKeys.Cherry, HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(MapleArmorItems.Cherry_CHESTPLATE, MapleEquipmentAssetKeys.Cherry, CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(MapleArmorItems.Cherry_LEGGINGS, MapleEquipmentAssetKeys.Cherry, LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(MapleArmorItems.Cherry_BOOTS, MapleEquipmentAssetKeys.Cherry, BOOTS_TRIM_ID_PREFIX, false);

        //Sign
        itemModelGenerator.register(MapleItems.Maple_HANGING_SIGN, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_HANGING_SIGN, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MAPLE_SIGN, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_SIGN, Models.GENERATED);

        //Tea
        itemModelGenerator.register(MapleFoodComponents.Green_Tea, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Red_Tea, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Red_Tea_Leaves, Models.GENERATED);
    }
}
