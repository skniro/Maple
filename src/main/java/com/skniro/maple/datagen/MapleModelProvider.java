package com.skniro.maple.datagen;

import com.skniro.maple.block.Maple_block;
import com.skniro.maple.item.GlassCupItems;
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

        //LOG Block
        blockStateModelGenerator.registerLog(Maple_block.MAPLE_LOG).log(Maple_block.MAPLE_LOG).wood(Maple_block.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(Maple_block.STRIPPED_MAPLE_LOG).log(Maple_block.STRIPPED_MAPLE_LOG).wood(Maple_block.STRIPPED_MAPLE_WOOD);

        //Door
        blockStateModelGenerator.registerDoor(Maple_block.MAPLE_DOOR);
        blockStateModelGenerator.registerDoor(Maple_block.CHERRY_DOOR);

        //TRAPDOOR
        blockStateModelGenerator.registerTrapdoor(Maple_block.CHERRY_TRAPDOOR);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(GlassCupItems.HIGH_GLASS_CUP, Models.GENERATED);
    }
}
