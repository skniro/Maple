package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;
import com.skniro.maple.block.init.*;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.world.Tree.*;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MapleBlocks {
    //LOG_Block
    public static final Block MAPLE_LOG = registerBlock("maple_log",PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.OAK_LOG).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.OAK_WOOD).mapColor(MapColor.BROWN)), Maple.Maple_Group);

    public static final Block GINKGO_LOG = registerBlock("ginkgo_log",PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.OAK_LOG).mapColor(MapColor.PALE_YELLOW)), Maple.Maple_Group);
    public static final Block STRIPPED_GINKGO_LOG = registerBlock("stripped_ginkgo_log",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.PALE_YELLOW)), Maple.Maple_Group);
    public static final Block STRIPPED_GINKGO_WOOD = registerBlock("stripped_ginkgo_wood",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.PALE_YELLOW)), Maple.Maple_Group);
    public static final Block GINKGO_WOOD = registerBlock("ginkgo_wood",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.OAK_WOOD).mapColor(MapColor.PALE_YELLOW)), Maple.Maple_Group);


    public static final Block CHERRY_LOG = registerBlock("cherry_log",PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.OAK_LOG)), Maple.Maple_Group);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.OAK_WOOD)), Maple.Maple_Group);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)), Maple.Maple_Group);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            PillarBlock::new, (AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)), Maple.Maple_Group);

    public static final Block BAMBOO_BLOCK = registerBlock("bamboo_block", PillarBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).strength(2.0f).sounds(BlockSoundGroup.WOOD),Maple.Maple_Group);
    public static final Block STRIPPED_BAMBOO_BLOCK = registerBlock("stripped_bamboo_block", PillarBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(2.0f).sounds(BlockSoundGroup.WOOD) ,Maple.Maple_Group);




    //SAPLING Block
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",(settings)-> new SaplingBlock(MapleSaplingGenerator.MapleSapling, settings), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), Maple.Maple_Group);
    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",(settings)-> new SaplingBlock(RedMapleSaplingGenerator.RedMapleSapling, settings), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), Maple.Maple_Group);
    public static final Block GINKGO_SAPLING = registerBlock("ginkgo_sapling",(settings)-> new SaplingBlock(GinkgoSaplingGenerator.GinkgoSapling, settings), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), Maple.Maple_Group);
    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",(settings)-> new SaplingBlock(CherrySaplingGenerator.CherrySapling, settings), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), Maple.Maple_Group);
    public static final Block SAKURA_SAPLING = registerBlock("sakura_sapling",(settings)-> new SaplingBlock(SakuraSaplingGenerator.SakuraSapling, settings), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), Maple.Maple_Group);

    //LEAVES Block
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            (settings)-> new TintedParticleLeavesBlock(0.1f, settings), (AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW)), Maple.Maple_Group);
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            (settings)-> new TintedParticleLeavesBlock(0.1f, settings), (AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.RED)), Maple.Maple_Group);

    public static final Block GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            (settings)-> new TintedParticleLeavesBlock(0.1f, settings), (AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW)), Maple.Maple_Group);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            (settings)-> new UntintedParticleLeavesBlock(0.1f, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.PINK), Maple.Maple_Group);
    public static final Block SAKURA_LEAVES = registerBlock("sakura_leaves",
            (settings)-> new UntintedParticleLeavesBlock(0.1f, MapleParticleTypes.SAKURA_LEAVES, settings), (AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.PINK).luminance((state) -> 8)), Maple.Maple_Group);

    //PLANKS Block
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            Block::new, (AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.BROWN)), Maple.Maple_Group);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            Block::new, (AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PINK)), Maple.Maple_Group);
    public static final Block GINKGO_PLANKS = registerBlock("ginkgo_planks",
            Block::new, (AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_YELLOW)), Maple.Maple_Group);
    public static final Block BAMBOO_PLANKS = registerBlock("bamboo_planks",
            Block::new, (AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)),Maple.Maple_Group);
    public static final Block BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            Block::new, (AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)),Maple.Maple_Group);

    //Potted
    public static final Block POTTED_GINKGO_SAPLING = registerBlockWithoutItem("potted_ginkgo_sapling",
            (settings)-> new FlowerPotBlock(GINKGO_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_CHERRY_SAPLING = registerBlockWithoutItem("potted_cherry_sapling",
            (settings)-> new FlowerPotBlock(CHERRY_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_MAPLE_SAPLING = registerBlockWithoutItem("potted_maple_sapling",
            (settings)-> new FlowerPotBlock(MAPLE_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());

    public static final Block POTTED_RED_MAPLE_SAPLING = registerBlockWithoutItem("potted_red_maple_sapling",
            (settings)-> new FlowerPotBlock(RED_MAPLE_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());
    public static final Block POTTED_SAKURA_SAPLING = registerBlockWithoutItem("potted_sakura_sapling",
            (settings)-> new FlowerPotBlock(SAKURA_SAPLING, settings), AbstractBlock.Settings.create().breakInstantly().nonOpaque());


    //BUTTON
    public static final Block GINKGO_BUTTON = registerBlock("ginkgo_button",
            (settings)-> new ButtonBlock(MapleBlockSetType.GINKGO,30, settings), Blocks.createButtonSettings(), Maple.Maple_Group);
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            (settings)-> new ButtonBlock(BlockSetType.CHERRY,30, settings), Blocks.createButtonSettings(), Maple.Maple_Group);
    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            (settings)-> new ButtonBlock(MapleBlockSetType.MAPLE,30, settings), Blocks.createButtonSettings(), Maple.Maple_Group);
    public static final Block BAMBOO_BUTTON = registerBlock("bamboo_button",
            (settings)-> new ButtonBlock(BlockSetType.BAMBOO,30, settings), Blocks.createButtonSettings(), Maple.Maple_Group);


    //STAIRS
    public static final Block GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            (settings)-> new StairsBlock(GINKGO_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(GINKGO_PLANKS), Maple.Maple_Group);
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            (settings)-> new StairsBlock(CHERRY_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(CHERRY_PLANKS), Maple.Maple_Group);
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            (settings)-> new StairsBlock(CHERRY_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(CHERRY_PLANKS), Maple.Maple_Group);
    public static final Block BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            (settings)-> new StairsBlock(BAMBOO_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(BAMBOO_PLANKS), Maple.Maple_Group);
    public static final Block BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs",
            (settings)-> new StairsBlock(BAMBOO_MOSAIC.getDefaultState(), settings), AbstractBlock.Settings.copy(BAMBOO_MOSAIC), Maple.Maple_Group);


   //SLAB
   public static final Block GINKGO_SLAB = registerBlock("ginkgo_slab",
           SlabBlock::new, (AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            SlabBlock::new, (AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            SlabBlock::new, (AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block BAMBOO_SLAB = registerBlock("bamboo_slab",
            SlabBlock::new, (AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab",
            SlabBlock::new, (AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);

    //FENCE
    public static final Block GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            (settings)-> new FenceGateBlock(MapleSignTypes.GINKGO, settings),  AbstractBlock.Settings.create().mapColor(GINKGO_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F), Maple.Maple_Group);
    public static final Block GINKGO_FENCE = registerBlock("ginkgo_fence",
            FenceBlock::new, (AbstractBlock.Settings.create().mapColor(GINKGO_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            (settings)-> new FenceGateBlock(WoodType.CHERRY, settings),  AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F), Maple.Maple_Group);
    public static final Block CHERRY_FENCE = registerBlock("cherry_fence",
            FenceBlock::new, (AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            (settings)-> new FenceGateBlock(MapleSignTypes.MAPLE, settings),  AbstractBlock.Settings.create().mapColor(MAPLE_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F), Maple.Maple_Group);
    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            FenceBlock::new, (AbstractBlock.Settings.create().mapColor(MAPLE_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);
    public static final Block BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            (settings)-> new FenceGateBlock(WoodType.BAMBOO, settings),  AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).strength(2.0f, 3.0f), Maple.Maple_Group);
    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence",
            FenceBlock::new, (AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), Maple.Maple_Group);


    //Door
    public static final Block GINKGO_DOOR = registerBlockWithoutItem("ginkgo_door",
            (settings)-> new DoorBlock(MapleBlockSetType.GINKGO, settings), AbstractBlock.Settings.create().mapColor(GINKGO_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final Block MAPLE_DOOR = registerBlockWithoutItem("maple_door",
            (settings)-> new DoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.create().mapColor(MAPLE_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final Block CHERRY_DOOR = registerBlockWithoutItem("cherry_door",
            (settings)-> new DoorBlock(MapleBlockSetType.MAPLE, settings), AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final Block BAMBOO_DOOR = registerBlockWithoutItem("bamboo_door",
            (settings)-> new DoorBlock(BlockSetType.BAMBOO, settings), AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque());

    //TRAPDOOR
    public static final Block GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            (settings)-> new TrapdoorBlock(MapleBlockSetType.GINKGO,settings), AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_YELLOW).strength(3.0F).nonOpaque(), Maple.Maple_Group);
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            (settings)-> new TrapdoorBlock(BlockSetType.CHERRY, settings),AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_PINK).strength(3.0F).nonOpaque(), Maple.Maple_Group);
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            (settings)-> new TrapdoorBlock(MapleBlockSetType.MAPLE, settings),AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(3.0F).nonOpaque(), Maple.Maple_Group);
    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            (settings)-> new TrapdoorBlock(BlockSetType.BAMBOO, settings), AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(3.0f).nonOpaque(), Maple.Maple_Group);


    //PRESSURE_PLATE
    public static final Block GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            (settings)-> new PressurePlateBlock(MapleBlockSetType.GINKGO, settings), AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY), Maple.Maple_Group);
    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            (settings)-> new PressurePlateBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.create().mapColor(MapleBlocks.CHERRY_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY), Maple.Maple_Group);
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            (settings)-> new PressurePlateBlock(MapleBlockSetType.MAPLE, settings), AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY), Maple.Maple_Group);
    public static final Block BAMBOO_PRESSURE_PLATE = registerBlock("bamboo_pressure_plate",
            (settings)-> new PressurePlateBlock(BlockSetType.BAMBOO, settings), AbstractBlock.Settings.create().mapColor(MapleBlocks.BAMBOO_PLANKS.getDefaultMapColor()).noCollision().strength(0.5f).burnable().instrument(NoteBlockInstrument.BASS).pistonBehavior(PistonBehavior.DESTROY), Maple.Maple_Group);
    //Plants Block
    public static final Block RICE = registerBlockWithoutItem("rice_plant",RiceBlock::new, (AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));

    //FlowerBlock
    public static final Block PINK_PETALS = registerBlock("pink_petals", FlowerbedBlock::new, (AbstractBlock.Settings.create().mapColor(MapColor.PINK).noCollision().sounds(BlockSoundGroup.GRASS)),Maple.Maple_Group);


    public static final Block CHISELED_BOOKSHELF = registerBlock("chiseled_bookshelf", ChiseledBookshelfBlock::new, (AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(1.5F).sounds(BlockSoundGroup.WOOD)),Maple.Maple_Group);

    public static final Block SAKURA_CARPET = registerBlock("sakura_carpet", MapleCarpetBlock::new, (AbstractBlock.Settings.copy(Blocks.PINK_PETALS).mapColor(MapColor.PINK)),Maple.Maple_Group);
    public static final Block Maple_CARPET = registerBlock("maple_carpet", MapleCarpetBlock::new, (AbstractBlock.Settings.copy(Blocks.PINK_PETALS).mapColor(MapColor.TERRACOTTA_YELLOW)),Maple.Maple_Group);
    public static final Block RED_MAPLE_CARPET = registerBlock("red_maple_carpet",MapleCarpetBlock::new, (AbstractBlock.Settings.copy(Blocks.PINK_PETALS).mapColor(MapColor.RED)),Maple.Maple_Group);
    public static final Block GINKGO_CARPET= registerBlock("ginkgo_carpet",MapleCarpetBlock::new, (AbstractBlock.Settings.copy(Blocks.PINK_PETALS).mapColor(MapColor.TERRACOTTA_YELLOW)),Maple.Maple_Group);

    //Glass Blocks
    public static final Block WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.WHITE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS), Maple.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.ORANGE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS), Maple.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS), Maple.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS), Maple.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.YELLOW_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS), Maple.Maple_Group);
    public static final Block LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.LIME_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS), Maple.Maple_Group);
    public static final Block PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.PINK_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS), Maple.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.GRAY_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS), Maple.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS), Maple.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.CYAN_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS), Maple.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.PURPLE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS), Maple.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.BLUE_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS), Maple.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.BROWN_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS), Maple.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.GREEN_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS), Maple.Maple_Group);
    public static final Block RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.RED_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS), Maple.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)), Maple.Maple_Group);
    public static final Block BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS), Maple.Maple_Group);
    public static final Block GLASS_SLAB = registerBlock("glass_slab",
            MapleGlassSlabBlock::new, (AbstractBlock.Settings.copy(Blocks.GLASS)), Maple.Maple_Group);
    public static final Block GLASS_STAIRS = registerBlock("glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GLASS), Maple.Maple_Group);


    public static final Block TATAMI =registerBlock("tatami",
            HayBlock::new, (AbstractBlock.Settings.copy(Blocks.HAY_BLOCK).mapColor(MapColor.GREEN)),Maple.Maple_Group);
    public static final Block TATAMI_SLAB = registerBlock("tatami_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(MapleBlocks.TATAMI).mapColor(MapColor.GREEN)), Maple.Maple_Group);

    //PLASTER
    public static final Block GREEN_PLASTER =registerBlock("green_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)),Maple.Maple_Group);
    public static final Block PLASTER =registerBlock("plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)),Maple.Maple_Group);
    public static final Block ORANGE_PLASTER =registerBlock("orange_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)),Maple.Maple_Group);
    public static final Block MAGENTA_PLASTER =registerBlock("magenta_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)),Maple.Maple_Group);
    public static final Block LIGHT_BLUE_PLASTER =registerBlock("light_blue_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)),Maple.Maple_Group);
    public static final Block YELLOW_PLASTER =registerBlock("yellow_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)),Maple.Maple_Group);
    public static final Block LIME_PLASTER =registerBlock("lime_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)),Maple.Maple_Group);
    public static final Block PINK_PLASTER =registerBlock("pink_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)),Maple.Maple_Group);
    public static final Block GRAY_PLASTER =registerBlock("gray_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)),Maple.Maple_Group);
    public static final Block LIGHT_GRAY_PLASTER =registerBlock("light_gray_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)),Maple.Maple_Group);
    public static final Block CYAN_PLASTER =registerBlock("cyan_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)),Maple.Maple_Group);
    public static final Block PURPLE_PLASTER =registerBlock("purple_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)),Maple.Maple_Group);
    public static final Block BLUE_PLASTER =registerBlock("blue_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)),Maple.Maple_Group);
    public static final Block BROWN_PLASTER =registerBlock("brown_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)),Maple.Maple_Group);
    public static final Block RED_PLASTER =registerBlock("red_plaster",
            Block::new, (AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)),Maple.Maple_Group);

    //Sea Lantern
    public static final Block Iron_Sea_Lantern =registerBlock("iron_sea_lantern",
            Block::new, (AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)),Maple.Maple_Group);
    public static final Block Gold_Sea_Lantern =registerBlock("gold_sea_lantern",
            Block::new, (AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)),Maple.Maple_Group);

    //Concrete
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE), Maple.Maple_Group);
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)), Maple.Maple_Group);

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE), Maple.Maple_Group);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)), Maple.Maple_Group);

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE), Maple.Maple_Group);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), Maple.Maple_Group);

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE), Maple.Maple_Group);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)), Maple.Maple_Group);

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE), Maple.Maple_Group);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)), Maple.Maple_Group);

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE), Maple.Maple_Group);
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)), Maple.Maple_Group);

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE), Maple.Maple_Group);
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)), Maple.Maple_Group);

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE), Maple.Maple_Group);
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)), Maple.Maple_Group);

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE), Maple.Maple_Group);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)), Maple.Maple_Group);

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE), Maple.Maple_Group);
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)), Maple.Maple_Group);

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE), Maple.Maple_Group);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)), Maple.Maple_Group);

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE), Maple.Maple_Group);
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)), Maple.Maple_Group);

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE), Maple.Maple_Group);
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)), Maple.Maple_Group);

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE), Maple.Maple_Group);
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)), Maple.Maple_Group);

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE), Maple.Maple_Group);
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)), Maple.Maple_Group);

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            (settings)-> new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE), Maple.Maple_Group);
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            SlabBlock::new, (AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)), Maple.Maple_Group);

    //MapleJuicer
    public static final Block Maple_Juicer_Block =registerBlock("maple_juicer_block", MapleJuicerBlock::new, AbstractBlock.Settings.create().nonOpaque().requiresTool().strength(3.0F, 3.0F), Maple.Maple_Group);

    //Tea
    public static final Block Tea_Block =registerBlock("tea_block", MapleTeaBlock::new,AbstractBlock.Settings.create().nonOpaque().requiresTool().strength(3.0F, 3.0F), Maple.Maple_Group);


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, RegistryKey<ItemGroup> tab) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name)),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }

    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Maple.MOD_ID, name));
    }

    public static void registerMapleBlocks() {
        Maple.LOGGER.debug("Registering ModBlocks for " + Maple.MOD_ID);
    }

}
