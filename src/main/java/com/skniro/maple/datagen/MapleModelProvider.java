package com.skniro.maple.datagen;

import com.skniro.maple.block.Maple_block;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class MapleModelProvider extends FabricModelProvider {
    public MapleModelProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        //Cube Block
        blockStateModelGenerator.registerCubeAllModelTexturePool(Maple_block.MAPLE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Maple_block.CHERRY_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Maple_block.MAPLE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Maple_block.SAKURA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Maple_block.BAMBOO_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(Maple_block.BAMBOO_MOSAIC);

        //LOG Block
        blockStateModelGenerator.registerLog(Maple_block.MAPLE_LOG).log(Maple_block.MAPLE_LOG).wood(Maple_block.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(Maple_block.STRIPPED_MAPLE_LOG).log(Maple_block.STRIPPED_MAPLE_LOG).wood(Maple_block.STRIPPED_MAPLE_WOOD);

        //Door
        blockStateModelGenerator.registerDoor(Maple_block.MAPLE_DOOR);
        blockStateModelGenerator.registerDoor(Maple_block.CHERRY_DOOR);
        blockStateModelGenerator.registerDoor(Maple_block.BAMBOO_DOOR);

        //TRAPDOOR
        blockStateModelGenerator.registerTrapdoor(Maple_block.CHERRY_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(Maple_block.MAPLE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(Maple_block.BAMBOO_TRAPDOOR);

        blockStateModelGenerator.registerFlowerPotPlant(Maple_block.CHERRY_SAPLING,Maple_block.POTTED_CHERRY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Maple_block.MAPLE_SAPLING,Maple_block.POTTED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(Maple_block.SAKURA_SAPLING,Maple_block.POTTED_SAKURA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(GlassCupItems.HIGH_GLASS_CUP, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MILK_BOTTOM, Models.GENERATED);
    }
}
