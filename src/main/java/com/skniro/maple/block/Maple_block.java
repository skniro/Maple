package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.init.RiceBlock;
import com.skniro.maple.world.Tree.CherrySaplingGenerator;
import com.skniro.maple.world.Tree.MapleSaplingGenerator;
import com.skniro.maple.world.Tree.SakuraSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Maple_block {
    Block block;
    //LOG_Block
    public static final Block MAPLE_LOG = registerBlock("maple_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), Maple.Maple_Group);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), Maple.Maple_Group);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), Maple.Maple_Group);

    public static final Block CHERRY_LOG = registerBlock("cherry_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), Maple.Maple_Group);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), Maple.Maple_Group);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), Maple.Maple_Group);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), Maple.Maple_Group);

    public static final Block BAMBOO_BLOCK = registerBlock("bamboo_block", createBambooBlock(MapColor.YELLOW, MapColor.DARK_GREEN, BlockSoundGroup.WOOD), Maple.Maple_Group);
    public static final Block STRIPPED_BAMBOO_BLOCK = registerBlock("stripped_bamboo_block", createBambooBlock(MapColor.YELLOW, MapColor.YELLOW, BlockSoundGroup.WOOD), Maple.Maple_Group);




    //SAPLING Block
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",new SaplingBlock(new MapleSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",new SaplingBlock(new CherrySaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block SAKURA_SAPLING = registerBlock("sakura_sapling",new SaplingBlock(new SakuraSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);

    //LEAVES Block
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), Maple.Maple_Group);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), Maple.Maple_Group);
    public static final Block SAKURA_LEAVES = registerBlock("sakura_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).luminance((state) -> {
                return 3;})), Maple.Maple_Group);

    //PLANKS Block
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block BAMBOO_PLANKS = registerBlock("bamboo_planks",
            new Block(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)),Maple.Maple_Group);
    public static final Block BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            new Block(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)),Maple.Maple_Group);

    //Potted
    public static final Block POTTED_CHERRY_SAPLING = registerBlockWithoutItem("potted_cherry_sapling",
            new FlowerPotBlock(CHERRY_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque()));
    public static final Block POTTED_MAPLE_SAPLING = registerBlockWithoutItem("potted_maple_sapling",
            new FlowerPotBlock(MAPLE_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque()));
    public static final Block POTTED_SAKURA_SAPLING = registerBlockWithoutItem("potted_sakura_sapling",
            new FlowerPotBlock(SAKURA_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque()));


    //BUTTON
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block BAMBOO_BUTTON = registerBlock("bamboo_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);


    //STAIRS
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            new StairsBlock(CHERRY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(CHERRY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(CHERRY_PLANKS)), Maple.Maple_Group);
    public static final Block BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            new StairsBlock(BAMBOO_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(BAMBOO_PLANKS)), Maple.Maple_Group);
    public static final Block BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs",
            new StairsBlock(BAMBOO_MOSAIC.getDefaultState(), AbstractBlock.Settings.copy(BAMBOO_MOSAIC)), Maple.Maple_Group);


   //SLAB
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
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
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block CHERRY_DOOR = registerBlockWithoutItem("cherry_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block BAMBOO_DOOR = registerBlockWithoutItem("bamboo_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD,BAMBOO_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));

    //TRAPDOOR
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(3.0F).nonOpaque()), Maple.Maple_Group);
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(3.0F).nonOpaque()), Maple.Maple_Group);
    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD,MapColor.YELLOW).strength(3.0f).nonOpaque()), Maple.Maple_Group);


    //PRESSURE_PLATE
    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, Maple_block.CHERRY_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F)), Maple.Maple_Group);
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, Maple_block.MAPLE_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F)), Maple.Maple_Group);
    public static final Block BAMBOO_PRESSURE_PLATE = registerBlock("bamboo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, Maple_block.BAMBOO_PLANKS.getDefaultMapColor()).noCollision().strength(0.5f)), Maple.Maple_Group);

    //Plants Block
    public static final Block RICE = registerBlockWithoutItem("rice_plant",new RiceBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));


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
