package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelProvider;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
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

        //Cube Block
        blockStateModelGenerator.registerCubeAllModelTexturePool(MapleBlocks.MAPLE_PLANKS);
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
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.RED_MAPLE_SAPLING, MapleBlocks.POTTED_RED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.SAKURA_SAPLING, MapleBlocks.POTTED_SAKURA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(MapleBlocks.GINKGO_SAPLING, MapleBlocks.POTTED_GINKGO_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Crop
        blockStateModelGenerator.registerCrop(MapleBlocks.RICE, Properties.AGE_7, 0, 0, 0, 1, 1, 1, 1, 2);

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
        itemModelGenerator.register(MapleFoodComponents.Cooked_Rice, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Kinako_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.MILK_ICECREAM, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.SakuraMochi, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Sanshoku_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.TOFU, Models.GENERATED);
        itemModelGenerator.register(MapleFoodComponents.Zunda_Dango, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_BOAT, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_CHEST_BOAT, Models.GENERATED);


        itemModelGenerator.register(MapleItems.SNOWBALL_STONE, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_Diamond, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_Gold, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_ICE, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_IRON, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_Compression, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_Teleporting, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_Confusion, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_Instant_Health, Items.SNOWBALL, Models.GENERATED);
        itemModelGenerator.register(MapleItems.SNOWBALL_Poison, Items.SNOWBALL, Models.GENERATED);

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
        itemModelGenerator.registerArmor(((ArmorItem) MapleArmorItems.Cherry_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) MapleArmorItems.Cherry_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) MapleArmorItems.Cherry_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) MapleArmorItems.Cherry_BOOTS));

        //Sign
        itemModelGenerator.register(MapleItems.Maple_HANGING_SIGN, Models.GENERATED);
        itemModelGenerator.register(MapleItems.GINKGO_HANGING_SIGN, Models.GENERATED);
    }
}
