package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleBlockSetType;
import com.skniro.maple.block.entity.MapleWoodTypes;
import com.skniro.maple.block.init.*;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.world.Tree.*;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;


public class MapleBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MOD_ID);

    //LOG_Block
    public static final Supplier<Block> MAPLE_LOG = registerBlock("maple_log",RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_BROWN)));
    public static final Supplier<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.COLOR_BROWN)));
    public static final Supplier<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.COLOR_BROWN)));
    public static final Supplier<Block> MAPLE_WOOD = registerBlock("maple_wood",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BROWN)));

    public static final Supplier<Block> GINKGO_LOG = registerBlock("ginkgo_log",RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).mapColor(MapColor.SAND)));
    public static final Supplier<Block> STRIPPED_GINKGO_LOG = registerBlock("stripped_ginkgo_log",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.SAND)));
    public static final Supplier<Block> STRIPPED_GINKGO_WOOD = registerBlock("stripped_ginkgo_wood",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.SAND)));
    public static final Supplier<Block> GINKGO_WOOD = registerBlock("ginkgo_wood",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).mapColor(MapColor.SAND)));


    public static final Supplier<Block> CHERRY_LOG = registerBlock("cherry_log",RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final Supplier<Block> CHERRY_WOOD = registerBlock("cherry_wood",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final Supplier<Block> STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final Supplier<Block> STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            RotatedPillarBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Supplier<Block> BAMBOO_BLOCK = registerBlock("bamboo_block", RotatedPillarBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(2.0f).sound(SoundType.WOOD));
    public static final Supplier<Block> STRIPPED_BAMBOO_BLOCK = registerBlock("stripped_bamboo_block", RotatedPillarBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0f).sound(SoundType.WOOD) );




    //SAPLING Block
    public static final Supplier<Block> MAPLE_SAPLING = registerBlock("maple_sapling",(settings)-> new SaplingBlock(MapleSaplingGenerator.MapleSapling, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",(settings)-> new SaplingBlock(RedMapleSaplingGenerator.RedMapleSapling, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> GINKGO_SAPLING = registerBlock("ginkgo_sapling",(settings)-> new SaplingBlock(GinkgoSaplingGenerator.GinkgoSapling, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> CHERRY_SAPLING = registerBlock("cherry_sapling",(settings)-> new SaplingBlock(CherrySaplingGenerator.CherrySapling, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final Supplier<Block> SAKURA_SAPLING = registerBlock("sakura_sapling",(settings)-> new SaplingBlock(SakuraSaplingGenerator.SakuraSapling, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    //LEAVES Block
    public static final Supplier<Block> MAPLE_LEAVES = registerBlock("maple_leaves",
            (settings)-> new TintedParticleLeavesBlock(0.1f, settings), (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Supplier<Block> RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            (settings)-> new TintedParticleLeavesBlock(0.1f, settings), (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_RED)));

    public static final Supplier<Block> GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            (settings)-> new TintedParticleLeavesBlock(0.1f, settings), (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Supplier<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            (settings)-> new UntintedParticleLeavesBlock(10, ParticleTypes.CHERRY_LEAVES, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PINK));
    public static final Supplier<Block> SAKURA_LEAVES = registerBlock("sakura_leaves",
            (settings)-> new UntintedParticleLeavesBlock(0.1f, MapleParticleTypes.SAKURA_LEAVES.get(), settings), (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PINK).lightLevel((state) -> 8)));

    //PLANKS Block
    public static final Supplier<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_BROWN)));
    public static final Supplier<Block> CHERRY_PLANKS = registerBlock("cherry_planks",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_PINK)));
    public static final Supplier<Block> GINKGO_PLANKS = registerBlock("ginkgo_planks",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Supplier<Block> BAMBOO_PLANKS = registerBlock("bamboo_planks",
            Block::new, (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final Supplier<Block> BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            Block::new, (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    //Potted
    public static final Supplier<Block> POTTED_GINKGO_SAPLING = registerBlockWithoutItem("potted_ginkgo_sapling",
            (settings)-> new FlowerPotBlock(GINKGO_SAPLING.get(), settings), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_CHERRY_SAPLING = registerBlockWithoutItem("potted_cherry_sapling",
            (settings)-> new FlowerPotBlock(CHERRY_SAPLING.get(), settings), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_MAPLE_SAPLING = registerBlockWithoutItem("potted_maple_sapling",
            (settings)-> new FlowerPotBlock(MAPLE_SAPLING.get(), settings), BlockBehaviour.Properties.of().instabreak().noOcclusion());

    public static final Supplier<Block> POTTED_RED_MAPLE_SAPLING = registerBlockWithoutItem("potted_red_maple_sapling",
            (settings)-> new FlowerPotBlock(RED_MAPLE_SAPLING.get(), settings), BlockBehaviour.Properties.of().instabreak().noOcclusion());
    public static final Supplier<Block> POTTED_SAKURA_SAPLING = registerBlockWithoutItem("potted_sakura_sapling",
            (settings)-> new FlowerPotBlock(SAKURA_SAPLING.get(), settings), BlockBehaviour.Properties.of().instabreak().noOcclusion());


    //BUTTON
    public static final Supplier<Block> GINKGO_BUTTON = registerBlock("ginkgo_button",
            (settings)-> new ButtonBlock(MapleBlockSetType.GINKGO,30, settings), buttonProperties());
    public static final Supplier<Block> CHERRY_BUTTON = registerBlock("cherry_button",
            (settings)-> new ButtonBlock(BlockSetType.CHERRY,30, settings), buttonProperties());
    public static final Supplier<Block> MAPLE_BUTTON = registerBlock("maple_button",
            (settings)-> new ButtonBlock(MapleBlockSetType.MAPLE,30, settings), buttonProperties());
    public static final Supplier<Block> BAMBOO_BUTTON = registerBlock("bamboo_button",
            (settings)-> new ButtonBlock(BlockSetType.BAMBOO,30, settings), buttonProperties());


    //STAIRS
    public static final Supplier<Block> GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            (settings)-> new StairBlock(Blocks.CHERRY_PLANKS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS));
    public static final Supplier<Block> CHERRY_STAIRS = registerBlock("cherry_stairs",
            (settings)-> new StairBlock(Blocks.CHERRY_PLANKS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS));
    public static final Supplier<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            (settings)-> new StairBlock(Blocks.CHERRY_PLANKS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS));
    public static final Supplier<Block> BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            (settings)-> new StairBlock(Blocks.BAMBOO_PLANKS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS));
    public static final Supplier<Block> BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs",
            (settings)-> new StairBlock(Blocks.BAMBOO_MOSAIC.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_MOSAIC));


    //SLAB
    public static final Supplier<Block> GINKGO_SLAB = registerBlock("ginkgo_slab",
            SlabBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> CHERRY_SLAB = registerBlock("cherry_slab",
            SlabBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> MAPLE_SLAB = registerBlock("maple_slab",
            SlabBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> BAMBOO_SLAB = registerBlock("bamboo_slab",
            SlabBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final Supplier<Block> BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab",
            SlabBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    //FENCE
    public static final Supplier<Block> GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            (settings)-> new FenceGateBlock(MapleWoodTypes.GINKGO, settings),  BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0F, 3.0F));
    public static final Supplier<Block> GINKGO_FENCE = registerBlock("ginkgo_fence",
            FenceBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            (settings)-> new FenceGateBlock(WoodType.CHERRY, settings),  BlockBehaviour.Properties.of().mapColor(Blocks.CHERRY_PLANKS.defaultMapColor()).strength(2.0F, 3.0F));
    public static final Supplier<Block> CHERRY_FENCE = registerBlock("cherry_fence",
            FenceBlock::new, (BlockBehaviour.Properties.of().mapColor(Blocks.CHERRY_PLANKS.defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            (settings)-> new FenceGateBlock(MapleWoodTypes.MAPLE, settings),  BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F));
    public static final Supplier<Block> MAPLE_FENCE = registerBlock("maple_fence",
            FenceBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final Supplier<Block> BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            (settings)-> new FenceGateBlock(WoodType.BAMBOO, settings),  BlockBehaviour.Properties.of().mapColor(Blocks.BAMBOO_PLANKS.defaultMapColor()).strength(2.0f, 3.0f));
    public static final Supplier<Block> BAMBOO_FENCE = registerBlock("bamboo_fence",
            FenceBlock::new, (BlockBehaviour.Properties.of().mapColor(Blocks.BAMBOO_PLANKS.defaultMapColor()).strength(2.0f, 3.0f).sound(SoundType.WOOD)));


    //Door
    public static final Supplier<Block> GINKGO_DOOR = registerBlockWithoutItem("ginkgo_door",
            (settings)-> new DoorBlock(MapleBlockSetType.GINKGO, settings), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(3.0f).sound(SoundType.WOOD).noOcclusion());
    public static final Supplier<Block> MAPLE_DOOR = registerBlockWithoutItem("maple_door",
            (settings)-> new DoorBlock(BlockSetType.CHERRY, settings), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(3.0f).sound(SoundType.WOOD).noOcclusion());
    public static final Supplier<Block> CHERRY_DOOR = registerBlockWithoutItem("cherry_door",
            (settings)-> new DoorBlock(MapleBlockSetType.MAPLE, settings), BlockBehaviour.Properties.of().mapColor(Blocks.CHERRY_PLANKS.defaultMapColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion());
    public static final Supplier<Block> BAMBOO_DOOR = registerBlockWithoutItem("bamboo_door",
            (settings)-> new DoorBlock(BlockSetType.BAMBOO, settings), BlockBehaviour.Properties.of().mapColor(Blocks.BAMBOO_PLANKS.defaultMapColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion());

    //TRAPDOOR
    public static final Supplier<Block> GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            (settings)-> new TrapDoorBlock(MapleBlockSetType.GINKGO,settings), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).strength(3.0F).noOcclusion());
    public static final Supplier<Block> CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            (settings)-> new TrapDoorBlock(BlockSetType.CHERRY, settings),BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK).strength(3.0F).noOcclusion());
    public static final Supplier<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            (settings)-> new TrapDoorBlock(MapleBlockSetType.MAPLE, settings),BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(3.0F).noOcclusion());
    public static final Supplier<Block> BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            (settings)-> new TrapDoorBlock(BlockSetType.BAMBOO, settings), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(3.0f).noOcclusion());


    //PRESSURE_PLATE
    public static final Supplier<Block> GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            (settings)-> new PressurePlateBlock(MapleBlockSetType.GINKGO, settings), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            (settings)-> new PressurePlateBlock(BlockSetType.CHERRY, settings), BlockBehaviour.Properties.of().mapColor(Blocks.CHERRY_PLANKS.defaultMapColor()).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            (settings)-> new PressurePlateBlock(MapleBlockSetType.MAPLE, settings), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).noCollission().strength(0.5F).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> BAMBOO_PRESSURE_PLATE = registerBlock("bamboo_pressure_plate",
            (settings)-> new PressurePlateBlock(BlockSetType.BAMBOO, settings), BlockBehaviour.Properties.of().mapColor(Blocks.BAMBOO_PLANKS.defaultMapColor()).noCollission().strength(0.5f).ignitedByLava().instrument(NoteBlockInstrument.BASS).pushReaction(PushReaction.DESTROY));
    //Plants Block
    public static final Supplier<Block> RICE = registerBlockWithoutItem("rice_plant", RiceBlock::new, (BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

    //FlowerBlock
    public static final Supplier<Block> PINK_PETALS = registerBlock("pink_petals", FlowerBedBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().sound(SoundType.GRASS)));


    public static final Supplier<Block> CHISELED_BOOKSHELF = registerBlock("chiseled_bookshelf", ChiseledBookShelfBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.WOOD)));

    public static final Supplier<Block> SAKURA_CARPET = registerBlock("sakura_carpet", MapleCarpetBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(MapColor.COLOR_PINK)));
    public static final Supplier<Block> Maple_CARPET = registerBlock("maple_carpet", MapleCarpetBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Supplier<Block> RED_MAPLE_CARPET = registerBlock("red_maple_carpet",MapleCarpetBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(MapColor.COLOR_RED)));
    public static final Supplier<Block> GINKGO_CARPET= registerBlock("ginkgo_carpet",MapleCarpetBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(MapColor.TERRACOTTA_YELLOW)));

    //Glass Blocks
    public static final Supplier<Block> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));
    public static final Supplier<Block> WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.WHITE_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS));
    public static final Supplier<Block> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Supplier<Block> ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.ORANGE_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS));
    public static final Supplier<Block> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Supplier<Block> MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.MAGENTA_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS));
    public static final Supplier<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Supplier<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS));
    public static final Supplier<Block> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Supplier<Block> YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.YELLOW_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS));
    public static final Supplier<Block> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)));
    public static final Supplier<Block> LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.LIME_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS));
    public static final Supplier<Block> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)));
    public static final Supplier<Block> PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.PINK_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS));
    public static final Supplier<Block> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)));
    public static final Supplier<Block> GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.GRAY_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS));
    public static final Supplier<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Supplier<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS));
    public static final Supplier<Block> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)));
    public static final Supplier<Block> CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.CYAN_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS));
    public static final Supplier<Block> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Supplier<Block> PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.PURPLE_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS));
    public static final Supplier<Block> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)));
    public static final Supplier<Block> BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.BLUE_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS));
    public static final Supplier<Block> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)));
    public static final Supplier<Block> BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.BROWN_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS));
    public static final Supplier<Block> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)));
    public static final Supplier<Block> GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.GREEN_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS));
    public static final Supplier<Block> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)));
    public static final Supplier<Block> RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.RED_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS));
    public static final Supplier<Block> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)));
    public static final Supplier<Block> BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS));
    public static final Supplier<Block> GLASS_SLAB = registerBlock("glass_slab",
            MapleGlassSlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)));
    public static final Supplier<Block> GLASS_STAIRS = registerBlock("glass_stairs",
            (settings)-> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS));


    public static final Supplier<Block> TATAMI =registerBlock("tatami",
            HayBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_GREEN)));
    public static final Supplier<Block> TATAMI_SLAB = registerBlock("tatami_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_GREEN)));

    //PLASTER
    public static final Supplier<Block> GREEN_PLASTER =registerBlock("green_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final Supplier<Block> PLASTER =registerBlock("plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final Supplier<Block> ORANGE_PLASTER =registerBlock("orange_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final Supplier<Block> MAGENTA_PLASTER =registerBlock("magenta_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final Supplier<Block> LIGHT_BLUE_PLASTER =registerBlock("light_blue_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Supplier<Block> YELLOW_PLASTER =registerBlock("yellow_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final Supplier<Block> LIME_PLASTER =registerBlock("lime_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final Supplier<Block> PINK_PLASTER =registerBlock("pink_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final Supplier<Block> GRAY_PLASTER =registerBlock("gray_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final Supplier<Block> LIGHT_GRAY_PLASTER =registerBlock("light_gray_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Supplier<Block> CYAN_PLASTER =registerBlock("cyan_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final Supplier<Block> PURPLE_PLASTER =registerBlock("purple_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final Supplier<Block> BLUE_PLASTER =registerBlock("blue_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final Supplier<Block> BROWN_PLASTER =registerBlock("brown_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final Supplier<Block> RED_PLASTER =registerBlock("red_plaster",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));

    //Sea Lantern
    public static final Supplier<Block> Iron_Sea_Lantern =registerBlock("iron_sea_lantern",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN)));
    public static final Supplier<Block> Gold_Sea_Lantern =registerBlock("gold_sea_lantern",
            Block::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN)));

    //Concrete
    public static final Supplier<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            (settings)-> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE));
    public static final Supplier<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));

    public static final Supplier<Block> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            (settings)-> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE));
    public static final Supplier<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));

    public static final Supplier<Block> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            (settings)-> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE));
    public static final Supplier<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));

    public static final Supplier<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            (settings)-> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE));
    public static final Supplier<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));

    public static final Supplier<Block> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            (settings)-> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE));
    public static final Supplier<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));

    public static final Supplier<Block> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            (settings)-> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE));
    public static final Supplier<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));

    public static final Supplier<Block> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            (settings)-> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE));
    public static final Supplier<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));

    public static final Supplier<Block> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            (settings)-> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE));
    public static final Supplier<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));

    public static final Supplier<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            (settings)-> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE));
    public static final Supplier<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Supplier<Block> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            (settings)-> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE));
    public static final Supplier<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));

    public static final Supplier<Block> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            (settings)-> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE));
    public static final Supplier<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));

    public static final Supplier<Block> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            (settings)-> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE));
    public static final Supplier<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));

    public static final Supplier<Block> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            (settings)-> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE));
    public static final Supplier<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));

    public static final Supplier<Block> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            (settings)-> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE));
    public static final Supplier<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));

    public static final Supplier<Block> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            (settings)-> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE));
    public static final Supplier<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));

    public static final Supplier<Block> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            (settings)-> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE));
    public static final Supplier<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            SlabBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));

    //MapleJuicer
    public static final Supplier<Block> Maple_Juicer_Block =registerBlock("maple_juicer_block", MapleJuicerBlock::new, BlockBehaviour.Properties.of().noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 3.0F));

    //Tea
    public static final Supplier<Block> Tea_Block =registerBlock("tea_block", MapleTeaBlock::new,BlockBehaviour.Properties.of().noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 3.0F));


    public static <B extends Block> RegistryObject<Block> register(String name, Function<BlockBehaviour.Properties, ? extends B> func, BlockBehaviour.Properties props) {
        return BLOCKS.register(name, () -> {
            return (Block)func.apply(props.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <B extends Block> RegistryObject<Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> register = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> bRegistryObject = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bRegistryObject);
        return bRegistryObject;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)))));
    }

    private static RotatedPillarBlock createBambooBlock(MapColor topMaterialColor, MapColor sideMaterialColor, SoundType soundGroup) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(sideMaterialColor).strength(2.0f).sound(soundGroup));
    }

    private static BlockBehaviour.Properties buttonProperties() {
        return BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY);
    }

    public static void registerMapleBlocks(BusGroup eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
