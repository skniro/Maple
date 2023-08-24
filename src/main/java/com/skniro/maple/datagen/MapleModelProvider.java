package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.state.property.Properties;

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

        //Cube Block
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.MAPLE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.CHERRY_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.SAKURA_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.BAMBOO_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.BAMBOO_MOSAIC);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleOreBlocks.Salt_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleOreBlocks.DEEPSLATE_Salt_Ore);

        //LOG Block
        blockStateModelGenerator.registerLog(MapleBlocks.MAPLE_LOG).log(MapleBlocks.MAPLE_LOG).wood(MapleBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(MapleBlocks.STRIPPED_MAPLE_LOG).log(MapleBlocks.STRIPPED_MAPLE_LOG).wood(MapleBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(MapleBlocks.GINKGO_LOG).log(MapleBlocks.GINKGO_LOG).wood(MapleBlocks.GINKGO_WOOD);
        blockStateModelGenerator.registerLog(MapleBlocks.STRIPPED_GINKGO_LOG).log(MapleBlocks.STRIPPED_GINKGO_LOG).wood(MapleBlocks.STRIPPED_GINKGO_WOOD);

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
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.CHERRY_SAPLING, MapleBlocks.POTTED_CHERRY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.MAPLE_SAPLING, MapleBlocks.POTTED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.SAKURA_SAPLING, MapleBlocks.POTTED_SAKURA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.GINKGO_SAPLING, MapleBlocks.POTTED_GINKGO_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

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
        itemModelGenerator.register(MapleItems.Salt, Models.GENERATED);
        itemModelGenerator.register(MapleItems.BAMBOO_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleItems.BAMBOO_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Anko_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Beef_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Cheese, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Mochi, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Chicken_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Cooked_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Kinako_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.MILK_ICECREAM, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Mushroom_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Mushroom_RICEBALL, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Mutton_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Porkchop_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.RICEBALL, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.SakuraMochi, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Salmon_RICEBALL, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Sanshoku_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.TOFU, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Zunda_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_CHEST_BOAT, Models.GENERATED);
    }
}
