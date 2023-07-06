package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.state.property.Properties;

public class MapleModelProvider extends FabricModelProvider {
    public MapleModelProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        //Cube Block
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.MAPLE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.CHERRY_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.SAKURA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.BAMBOO_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.BAMBOO_MOSAIC);

        //LOG Block
        blockStateModelGenerator.registerLog(MapleBlocks.MAPLE_LOG).log(MapleBlocks.MAPLE_LOG).wood(MapleBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(MapleBlocks.STRIPPED_MAPLE_LOG).log(MapleBlocks.STRIPPED_MAPLE_LOG).wood(MapleBlocks.STRIPPED_MAPLE_WOOD);

        //Door
        blockStateModelGenerator.registerDoor(MapleBlocks.MAPLE_DOOR);
        blockStateModelGenerator.registerDoor(MapleBlocks.CHERRY_DOOR);
        blockStateModelGenerator.registerDoor(MapleBlocks.BAMBOO_DOOR);

        //TRAPDOOR
        blockStateModelGenerator.registerTrapdoor(MapleBlocks.CHERRY_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MapleBlocks.MAPLE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MapleBlocks.BAMBOO_TRAPDOOR);

        //SAPLING
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.CHERRY_SAPLING, MapleBlocks.POTTED_CHERRY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.MAPLE_SAPLING, MapleBlocks.POTTED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.SAKURA_SAPLING, MapleBlocks.POTTED_SAKURA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Crop
        blockStateModelGenerator.registerCrop(MapleBlocks.RICE, Properties.AGE_7, 0, 0, 0, 1, 1, 1, 1, 2);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(GlassCupItems.HIGH_GLASS_CUP, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MILK_BOTTOM, Models.GENERATED);
        itemModelGenerator.register(MapleItems.MapleSyrup, Models.GENERATED);
        itemModelGenerator.register(MapleItems.Flour, Models.GENERATED);
        itemModelGenerator.register(MapleItems.Cream, Models.GENERATED);
        itemModelGenerator.register(MapleItems.Food_Press, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SOYBEAN, Models.GENERATED);
    }
}
