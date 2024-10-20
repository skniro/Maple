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
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.ArmorItem;
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

        //Cube Block
        blockStateModelGenerator.family(MapleBlocks.MAPLE_PLANKS);
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
        blockStateModelGenerator.createPlant(MapleBlocks.CHERRY_SAPLING, MapleBlocks.POTTED_CHERRY_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(MapleBlocks.MAPLE_SAPLING, MapleBlocks.POTTED_MAPLE_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(MapleBlocks.RED_MAPLE_SAPLING, MapleBlocks.POTTED_RED_MAPLE_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(MapleBlocks.SAKURA_SAPLING, MapleBlocks.POTTED_SAKURA_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createPlant(MapleBlocks.GINKGO_SAPLING, MapleBlocks.POTTED_GINKGO_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);

        //Crop
        blockStateModelGenerator.createCropBlock(MapleBlocks.RICE, BlockStateProperties.AGE_7, 0, 0, 0, 1, 1, 1, 1, 2);

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

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(GlassCupItems.HIGH_GLASS_CUP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.MILK_BOTTOM, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.MapleSyrup, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.Flour, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.Cream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.Food_Press, ModelTemplates.FLAT_ITEM);
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
        itemModelGenerator.generateFlatItem(MapleItems.GINKGO_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.GINKGO_CHEST_BOAT, ModelTemplates.FLAT_ITEM);


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
        itemModelGenerator.generateArmorTrims(((ArmorItem) MapleArmorItems.Cherry_HELMET));
        itemModelGenerator.generateArmorTrims(((ArmorItem) MapleArmorItems.Cherry_CHESTPLATE));
        itemModelGenerator.generateArmorTrims(((ArmorItem) MapleArmorItems.Cherry_LEGGINGS));
        itemModelGenerator.generateArmorTrims(((ArmorItem) MapleArmorItems.Cherry_BOOTS));

        //Sign
        itemModelGenerator.generateFlatItem(MapleItems.Maple_HANGING_SIGN, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MapleItems.GINKGO_HANGING_SIGN, ModelTemplates.FLAT_ITEM);
    }
}
