package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.world.Tree.CherrySaplingGenerator;
import com.skniro.maple.world.Tree.MapleSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Maple_block {
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

    //SAPLING Block
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",new SaplingBlock(new MapleSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",new SaplingBlock(new CherrySaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Maple.Maple_Group);

    //LEAVES Block
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), Maple.Maple_Group);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), Maple.Maple_Group);


    //PLANKS Block
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), Maple.Maple_Group);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), Maple.Maple_Group);

    //Potted
    public static final Block POTTED_CHERRY_SAPLING = registerBlock("potted_cherry_sapling",
            new FlowerPotBlock(CHERRY_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque()), Maple.Maple_Group);
    public static final Block POTTED_MAPLE_SAPLING = registerBlock("potted_maple_sapling",
            new FlowerPotBlock(MAPLE_SAPLING, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque()), Maple.Maple_Group);


    //BUTTON
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new WoodenButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);

    //STAIRS
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            new StairsBlock(CHERRY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(CHERRY_PLANKS)), Maple.Maple_Group);

   //SLAB
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);

    //FENCE
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD, CHERRY_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F)), Maple.Maple_Group);
    public static final Block CHERRY_FENCE = registerBlock("cherry_fence",
            new FenceBlock(AbstractBlock.Settings.of(Material.WOOD, CHERRY_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);

    //Door
    public static final Block MAPLE_DOOR = registerBlockWithoutItem("maple_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block CHERRY_DOOR = registerBlockWithoutItem("cherry_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));

    //TRAPDOOR
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(3.0F).nonOpaque()), Maple.Maple_Group);


    //PRESSURE_PLATE
    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, Maple_block.CHERRY_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F)), Maple.Maple_Group);




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
    public static void registerMapleBlocks() {
        Maple.LOGGER.debug("Registering ModBlocks for " + Maple.MOD_ID);
    }
}
