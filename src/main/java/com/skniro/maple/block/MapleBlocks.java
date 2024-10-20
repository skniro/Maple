package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;
import com.skniro.maple.block.init.*;
import com.skniro.maple.world.Tree.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class MapleBlocks {
    //LOG_Block
    public static final Block MAPLE_LOG = registerBlock("maple_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).mapColor(MapColor.BROWN)), Maple.Maple_Group);

    public static final Block CHERRY_LOG = registerBlock("cherry_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).mapColor(MapColor.TERRACOTTA_PINK)), Maple.Maple_Group);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).mapColor(MapColor.TERRACOTTA_PINK)), Maple.Maple_Group);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.PINK)), Maple.Maple_Group);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.PINK)), Maple.Maple_Group);

    public static final Block BAMBOO_BLOCK = registerBlock("bamboo_block", createBambooBlock(MapColor.YELLOW, MapColor.DARK_GREEN, BlockSoundGroup.WOOD), Maple.Maple_Group);
    public static final Block STRIPPED_BAMBOO_BLOCK = registerBlock("stripped_bamboo_block", createBambooBlock(MapColor.YELLOW, MapColor.YELLOW, BlockSoundGroup.WOOD), Maple.Maple_Group);




    //SAPLING Block
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",new SaplingBlock(new MapleSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",new SaplingBlock(new CherrySaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block SAKURA_SAPLING = registerBlock("sakura_sapling",new SaplingBlock(new SakuraSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);


    //LEAVES Block
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            new MapleCherryLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.PINK)), Maple.Maple_Group);
    public static final Block SAKURA_LEAVES = registerBlock("sakura_leaves",
            new MapleSakuraLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.PINK).luminance((state) -> 8)), Maple.Maple_Group);

    //PLANKS Block
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PINK)), Maple.Maple_Group);
    public static final Block BAMBOO_PLANKS = registerBlock("bamboo_planks",
            new Block(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)),Maple.Maple_Group);
    public static final Block BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            new Block(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)),Maple.Maple_Group);

    //Potted
    public static final Block POTTED_CHERRY_SAPLING = registerBlockWithoutItem("potted_cherry_sapling",
            new FlowerPotBlock(CHERRY_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).mapColor(MapColor.BROWN).breakInstantly().nonOpaque()));
    public static final Block POTTED_MAPLE_SAPLING = registerBlockWithoutItem("potted_maple_sapling",
            new FlowerPotBlock(MAPLE_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).mapColor(MapColor.PINK).breakInstantly().nonOpaque()));
    public static final Block POTTED_SAKURA_SAPLING = registerBlockWithoutItem("potted_sakura_sapling",
            new FlowerPotBlock(SAKURA_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).mapColor(MapColor.PINK).breakInstantly().nonOpaque()));


    //BUTTON
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).mapColor(MapColor.PINK).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).mapColor(MapColor.BROWN).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block BAMBOO_BUTTON = registerBlock("bamboo_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).mapColor(MapColor.YELLOW).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);


    //STAIRS
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            new StairsBlock(CHERRY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(CHERRY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(MAPLE_PLANKS)), Maple.Maple_Group);
    public static final Block BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            new StairsBlock(BAMBOO_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs",
            new StairsBlock(BAMBOO_MOSAIC.getDefaultState(), AbstractBlock.Settings.copy(BAMBOO_MOSAIC)), Maple.Maple_Group);


   //SLAB
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block BAMBOO_SLAB = registerBlock("bamboo_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD,MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD,MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);

    //FENCE
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD, CHERRY_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F)), Maple.Maple_Group);
    public static final Block CHERRY_FENCE = registerBlock("cherry_fence",
            new FenceBlock(AbstractBlock.Settings.of(Material.WOOD, CHERRY_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD, MAPLE_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F)), Maple.Maple_Group);
    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(AbstractBlock.Settings.of(Material.WOOD, MAPLE_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD,BAMBOO_PLANKS.getDefaultMapColor()).strength(2.0f, 3.0f)), Maple.Maple_Group);
    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence",
            new FenceBlock(AbstractBlock.Settings.of(Material.WOOD,BAMBOO_PLANKS.getDefaultMapColor()).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);


    //Door
    public static final Block MAPLE_DOOR = registerBlockWithoutItem("maple_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).mapColor(MapColor.BROWN).nonOpaque()));
    public static final Block CHERRY_DOOR = registerBlockWithoutItem("cherry_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).mapColor(MapColor.PINK).nonOpaque()));
    public static final Block BAMBOO_DOOR = registerBlockWithoutItem("bamboo_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD,BAMBOO_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));

    //TRAPDOOR
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_PINK).strength(3.0F).nonOpaque()), Maple.Maple_Group);
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_BROWN).strength(3.0F).nonOpaque()), Maple.Maple_Group);
    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD,MapColor.YELLOW).strength(3.0f).nonOpaque()), Maple.Maple_Group);


    //PRESSURE_PLATE
    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.CHERRY_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F)), Maple.Maple_Group);
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F)), Maple.Maple_Group);
    public static final Block BAMBOO_PRESSURE_PLATE = registerBlock("bamboo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.BAMBOO_PLANKS.getDefaultMapColor()).noCollision().strength(0.5f)), Maple.Maple_Group);

    //Plants Block
    public static final Block RICE = registerBlockWithoutItem("rice_plant",new RiceBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));

    //FlowerBlock
    public static final Block PINK_PETALS = registerBlock("pink_petals", new MapleFlowerbedBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.PINK).noCollision().sounds(BlockSoundGroup.GRASS)),Maple.Maple_Group);


    public static final Block CHISELED_BOOKSHELF = registerBlock("chiseled_bookshelf", new ChiseledBookshelfBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.OAK_TAN).strength(1.5F).sounds(BlockSoundGroup.WOOD)),Maple.Maple_Group);

    //1.3.0
    public static final Block GINKGO_LOG = registerBlock("ginkgo_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).mapColor(MapColor.PALE_YELLOW)), Maple.Maple_Group);
    public static final Block STRIPPED_GINKGO_LOG = registerBlock("stripped_ginkgo_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.PALE_YELLOW)), Maple.Maple_Group);
    public static final Block STRIPPED_GINKGO_WOOD = registerBlock("stripped_ginkgo_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.PALE_YELLOW)), Maple.Maple_Group);
    public static final Block GINKGO_WOOD = registerBlock("ginkgo_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).mapColor(MapColor.PALE_YELLOW)), Maple.Maple_Group);
    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",new SaplingBlock(new RedMapleSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block GINKGO_SAPLING = registerBlock("ginkgo_sapling",new SaplingBlock(new GinkgoSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.RED)), Maple.Maple_Group);
    public static final Block GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW)), Maple.Maple_Group);
    public static final Block GINKGO_PLANKS = registerBlock("ginkgo_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_YELLOW)), Maple.Maple_Group);
    public static final Block POTTED_GINKGO_SAPLING = registerBlockWithoutItem("potted_ginkgo_sapling",
            new FlowerPotBlock(GINKGO_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_ACACIA_SAPLING).breakInstantly().nonOpaque()));
    public static final Block POTTED_RED_MAPLE_SAPLING = registerBlockWithoutItem("potted_red_maple_sapling",
            new FlowerPotBlock(RED_MAPLE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_ACACIA_SAPLING).breakInstantly().nonOpaque()));
    public static final Block GINKGO_BUTTON = registerBlock("ginkgo_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).mapColor(MapColor.TERRACOTTA_YELLOW).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            new StairsBlock(GINKGO_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(GINKGO_PLANKS)), Maple.Maple_Group);
    public static final Block GINKGO_SLAB = registerBlock("ginkgo_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(GINKGO_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F)), Maple.Maple_Group);
    public static final Block GINKGO_FENCE = registerBlock("ginkgo_fence",
            new FenceBlock(AbstractBlock.Settings.of(Material.WOOD,GINKGO_PLANKS.getDefaultMapColor()).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block GINKGO_DOOR = registerBlockWithoutItem("ginkgo_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.TERRACOTTA_WHITE).strength(3.0F).nonOpaque()), Maple.Maple_Group);
    public static final Block GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.GINKGO_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F)), Maple.Maple_Group);

    public static final Block SAKURA_CARPET = registerBlock("sakura_carpet", new MapleCarpetBlock(AbstractBlock.Settings.copy(MapleBlocks.PINK_PETALS).mapColor(MapColor.PINK)),Maple.Maple_Group);
    public static final Block Maple_CARPET = registerBlock("maple_carpet", new MapleCarpetBlock(AbstractBlock.Settings.copy(MapleBlocks.PINK_PETALS).mapColor(MapColor.TERRACOTTA_YELLOW)),Maple.Maple_Group);
    public static final Block RED_MAPLE_CARPET = registerBlock("red_maple_carpet",new MapleCarpetBlock(AbstractBlock.Settings.copy(MapleBlocks.PINK_PETALS).mapColor(MapColor.RED)),Maple.Maple_Group);
    public static final Block GINKGO_CARPET= registerBlock("ginkgo_carpet",new MapleCarpetBlock(AbstractBlock.Settings.copy(MapleBlocks.PINK_PETALS).mapColor(MapColor.TERRACOTTA_YELLOW)),Maple.Maple_Group);

    //Glass Blocks
    public static final Block WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.WHITE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.ORANGE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.YELLOW_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.LIME_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.PINK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.CYAN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.PURPLE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.BROWN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.GREEN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.RED_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block GLASS_SLAB = registerBlock("glass_slab",
            new MapleGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS)), Maple.Maple_Group);
    public static final Block GLASS_STAIRS = registerBlock("glass_stairs",
            new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GLASS)), Maple.Maple_Group);


    public static final Block TATAMI =registerBlock("tatami",
            new HayBlock(AbstractBlock.Settings.copy(Blocks.HAY_BLOCK).mapColor(MapColor.GREEN)),Maple.Maple_Group);
    public static final Block TATAMI_SLAB = registerBlock("tatami_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MapleBlocks.TATAMI).mapColor(MapColor.GREEN)), Maple.Maple_Group);

    //PLASTER
    public static final Block GREEN_PLASTER =registerBlock("green_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)),Maple.Maple_Group);
    public static final Block PLASTER =registerBlock("plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)),Maple.Maple_Group);
    public static final Block ORANGE_PLASTER =registerBlock("orange_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)),Maple.Maple_Group);
    public static final Block MAGENTA_PLASTER =registerBlock("magenta_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)),Maple.Maple_Group);
    public static final Block LIGHT_BLUE_PLASTER =registerBlock("light_blue_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)),Maple.Maple_Group);
    public static final Block YELLOW_PLASTER =registerBlock("yellow_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)),Maple.Maple_Group);
    public static final Block LIME_PLASTER =registerBlock("lime_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)),Maple.Maple_Group);
    public static final Block PINK_PLASTER =registerBlock("pink_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)),Maple.Maple_Group);
    public static final Block GRAY_PLASTER =registerBlock("gray_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)),Maple.Maple_Group);
    public static final Block LIGHT_GRAY_PLASTER =registerBlock("light_gray_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)),Maple.Maple_Group);
    public static final Block CYAN_PLASTER =registerBlock("cyan_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)),Maple.Maple_Group);
    public static final Block PURPLE_PLASTER =registerBlock("purple_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)),Maple.Maple_Group);
    public static final Block BLUE_PLASTER =registerBlock("blue_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)),Maple.Maple_Group);
    public static final Block BROWN_PLASTER =registerBlock("brown_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)),Maple.Maple_Group);
    public static final Block RED_PLASTER =registerBlock("red_plaster",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)),Maple.Maple_Group);

    //Sea Lantern
    public static final Block Iron_Sea_Lantern =registerBlock("iron_sea_lantern",
            new Block(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)),Maple.Maple_Group);
    public static final Block Gold_Sea_Lantern =registerBlock("gold_sea_lantern",
            new Block(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)),Maple.Maple_Group);

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    private static PillarBlock createBambooBlock(MapColor topMapColor, MapColor sideMapColor, BlockSoundGroup soundGroup) {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(sideMapColor).strength(2.0f).sounds(soundGroup));
    }

    public static void registerMapleBlocks() {
        Maple.LOGGER.debug("Registering ModBlocks for " + Maple.MOD_ID);
    }

}
