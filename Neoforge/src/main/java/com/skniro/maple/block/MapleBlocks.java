package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleBlockSetType;
import com.skniro.maple.block.entity.MapleWoodTypes;
import com.skniro.maple.block.init.*;
import com.skniro.maple.item.MapleCreativeModeTabs;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.Tree.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class MapleBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, Maple.MODID);

    //LOG_Block
    public static final Supplier<Block> MAPLE_LOG = registerBlock("maple_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_BROWN)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.COLOR_BROWN)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.COLOR_BROWN)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAPLE_WOOD = registerBlock("maple_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_BROWN)), MapleCreativeModeTabs.Maple_Group);

    public static final Supplier<Block> CHERRY_LOG = registerBlock("cherry_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_LOG).mapColor(MapColor.TERRACOTTA_PINK)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> CHERRY_WOOD = registerBlock("cherry_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_WOOD).mapColor(MapColor.TERRACOTTA_PINK)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.COLOR_PINK)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.COLOR_PINK)), MapleCreativeModeTabs.Maple_Group);

    public static final Supplier<Block> BAMBOO_BLOCK = registerBlock("bamboo_block",
            () -> createBambooBlock(MapColor.COLOR_YELLOW, MapColor.TERRACOTTA_GREEN, SoundType.WOOD), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> STRIPPED_BAMBOO_BLOCK = registerBlock("stripped_bamboo_block",
            () -> createBambooBlock(MapColor.COLOR_YELLOW, MapColor.COLOR_YELLOW, SoundType.WOOD), MapleCreativeModeTabs.Maple_Group);




    //SAPLING Block
    public static final Supplier<Block> MAPLE_SAPLING = registerBlock("maple_sapling",
            () -> new SaplingBlock(MapleSaplingGenerator.MapleSapling,BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> CHERRY_SAPLING = registerBlock("cherry_sapling",
            () -> new SaplingBlock(CherrySaplingGenerator.CherrySapling,BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> SAKURA_SAPLING = registerBlock("sakura_sapling",
            () -> new SaplingBlock(SakuraSaplingGenerator.SakuraSapling,BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING)), MapleCreativeModeTabs.Maple_Group);

    //LEAVES Block
    public static final Supplier<Block> MAPLE_LEAVES = registerBlock("maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, MapleCreativeModeTabs.Maple_Group);

    public static final Supplier<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PINK))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, MapleCreativeModeTabs.Maple_Group);

    public static final Supplier<Block> SAKURA_LEAVES = registerBlock("sakura_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PINK).lightLevel((state) -> 8))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, MapleCreativeModeTabs.Maple_Group);


    //PLANKS Block
    public static final Supplier<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_BROWN))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            }, MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> CHERRY_PLANKS = registerBlock("cherry_planks",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_PINK))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            }, MapleCreativeModeTabs.Maple_Group);

    public static final Supplier<Block> BAMBOO_PLANKS = registerBlock("bamboo_planks",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).strength(2.0f, 3.0f).sound(SoundType.WOOD))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            },MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).strength(2.0f, 3.0f).sound(SoundType.WOOD))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            },MapleCreativeModeTabs.Maple_Group);

    //Potted
    public static final Supplier<Block> POTTED_CHERRY_SAPLING = registerBlockWithoutItem("potted_cherry_sapling",
            () -> new FlowerPotBlock(CHERRY_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final Supplier<Block> POTTED_MAPLE_SAPLING = registerBlockWithoutItem("potted_maple_sapling",
            () -> new FlowerPotBlock(MAPLE_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));
    public static final Supplier<Block> POTTED_SAKURA_SAPLING = registerBlockWithoutItem("potted_sakura_sapling",
            () -> new FlowerPotBlock(SAKURA_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion()));


    //BUTTON
    public static final Supplier<Block> CHERRY_BUTTON = registerBlock("cherry_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 30, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().strength(0.5F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAPLE_BUTTON = registerBlock("maple_button",
            () -> new ButtonBlock(MapleBlockSetType.MAPLE, 30, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).noCollission().strength(0.5F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_BUTTON = registerBlock("bamboo_button",
            () -> new ButtonBlock(BlockSetType.BAMBOO, 30, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().strength(0.5F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);


    public static final Supplier<Block> PINK_PETALS = registerBlock("pink_petals",
            () -> new MapleFlowerbedBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().sound(SoundType.GRASS)),MapleCreativeModeTabs.Maple_Group);


    //STAIRS
    public static final Supplier<Block> CHERRY_STAIRS = registerBlock("cherry_stairs",
            () -> new StairBlock(CHERRY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(CHERRY_PLANKS.get())), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            () -> new StairBlock(CHERRY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(CHERRY_PLANKS.get())), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            () -> new StairBlock(BAMBOO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(BAMBOO_PLANKS.get())), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs",
            () -> new StairBlock(BAMBOO_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(BAMBOO_MOSAIC.get())), MapleCreativeModeTabs.Maple_Group);


   //SLAB
    public static final Supplier<Block> CHERRY_SLAB = registerBlock("cherry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_SLAB = registerBlock("bamboo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);

    //FENCE
    public static final Supplier<Block> CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of().mapColor(CHERRY_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> CHERRY_FENCE = registerBlock("cherry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(CHERRY_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            () -> new FenceGateBlock(MapleWoodTypes.MAPLE, BlockBehaviour.Properties.of().mapColor(MAPLE_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAPLE_FENCE = registerBlock("maple_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MAPLE_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().mapColor(BAMBOO_PLANKS.get().defaultMapColor()).strength(2.0f, 3.0f)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_FENCE = registerBlock("bamboo_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(BAMBOO_PLANKS.get().defaultMapColor()).strength(2.0f, 3.0f).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);


    //Door
    public static final Supplier<Block> MAPLE_DOOR = registerBlockWithoutItem("maple_door",
            () -> new DoorBlock(MapleBlockSetType.MAPLE, BlockBehaviour.Properties.of().mapColor(MAPLE_PLANKS.get().defaultMapColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> CHERRY_DOOR = registerBlockWithoutItem("cherry_door",
            () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().mapColor(CHERRY_PLANKS.get().defaultMapColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> BAMBOO_DOOR = registerBlockWithoutItem("bamboo_door",
            () -> new DoorBlock(BlockSetType.BAMBOO, BlockBehaviour.Properties.of().mapColor(BAMBOO_PLANKS.get().defaultMapColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));

    //TRAPDOOR
    public static final Supplier<Block> CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK).strength(3.0F).noOcclusion()), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            () -> new TrapDoorBlock(MapleBlockSetType.MAPLE, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(3.0F).noOcclusion()), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            () -> new TrapDoorBlock(MapleBlockSetType.GINKGO, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(3.0f).noOcclusion()), MapleCreativeModeTabs.Maple_Group);


    //PRESSURE_PLATE
    public static final Supplier<Block> CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            () -> new PressurePlateBlock(MapleBlockSetType.MAPLE, BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BAMBOO_PRESSURE_PLATE = registerBlock("bamboo_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.BAMBOO, BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(0.5f)), MapleCreativeModeTabs.Maple_Group);

    //Plants Block
    public static final Supplier<Block> RICE = registerBlockWithoutItem("rice_plant",
            () -> new RiceBlock(BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

    //1.3.0
    public static final Supplier<Block> GINKGO_LOG = registerBlock("ginkgo_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_LOG).mapColor(MapColor.SAND)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> STRIPPED_GINKGO_LOG = registerBlock("stripped_ginkgo_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.SAND)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> STRIPPED_GINKGO_WOOD = registerBlock("stripped_ginkgo_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.SAND)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_WOOD = registerBlock("ginkgo_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_WOOD).mapColor(MapColor.SAND)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            () -> new SaplingBlock(RedMapleSaplingGenerator.RedMapleSapling,BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_SAPLING = registerBlock("ginkgo_sapling",
            () -> new SaplingBlock(GinkgoSaplingGenerator.GinkgoSapling,BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_SAPLING)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_RED)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_PLANKS = registerBlock("ginkgo_planks",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_YELLOW)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> POTTED_GINKGO_SAPLING = registerBlockWithoutItem("potted_ginkgo_sapling",
            () -> new FlowerPotBlock(GINKGO_SAPLING.get(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.POTTED_ACACIA_SAPLING).instabreak().noOcclusion()));
    public static final Supplier<Block> POTTED_RED_MAPLE_SAPLING = registerBlockWithoutItem("potted_red_maple_sapling",
            () -> new FlowerPotBlock(RED_MAPLE_SAPLING.get(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.POTTED_ACACIA_SAPLING).instabreak().noOcclusion()));
    public static final Supplier<Block> GINKGO_BUTTON = registerBlock("ginkgo_button",
            () -> new ButtonBlock(MapleBlockSetType.GINKGO, 30, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).noCollission().strength(0.5F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            () -> new StairBlock(GINKGO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(GINKGO_PLANKS.get())), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_SLAB = registerBlock("ginkgo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            () -> new FenceGateBlock(MapleWoodTypes.GINKGO, BlockBehaviour.Properties.of().mapColor(GINKGO_PLANKS.get().defaultMapColor()).strength(2.0F, 3.0F)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_FENCE = registerBlock("ginkgo_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(GINKGO_PLANKS.get().defaultMapColor()).strength(2.0f, 3.0f).sound(SoundType.WOOD)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_DOOR = registerBlockWithoutItem("ginkgo_door",
            () -> new DoorBlock(MapleBlockSetType.GINKGO, BlockBehaviour.Properties.of().strength(3.0f).sound(SoundType.WOOD).noOcclusion()));
    public static final Supplier<Block> GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            () -> new TrapDoorBlock(MapleBlockSetType.GINKGO, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).strength(3.0F).noOcclusion()), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            () -> new PressurePlateBlock(MapleBlockSetType.GINKGO, BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(0.5F)), MapleCreativeModeTabs.Maple_Group);

    public static final Supplier<Block> SAKURA_CARPET = registerBlock("sakura_carpet",
            () -> new MapleCarpetBlock(BlockBehaviour.Properties.ofLegacyCopy(MapleBlocks.PINK_PETALS.get()).mapColor(MapColor.COLOR_PINK)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> Maple_CARPET = registerBlock("maple_carpet",
            () -> new MapleCarpetBlock(BlockBehaviour.Properties.ofLegacyCopy(MapleBlocks.PINK_PETALS.get()).mapColor(MapColor.TERRACOTTA_YELLOW)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> RED_MAPLE_CARPET = registerBlock("red_maple_carpet",
            () -> new MapleCarpetBlock(BlockBehaviour.Properties.ofLegacyCopy(MapleBlocks.PINK_PETALS.get()).mapColor(MapColor.COLOR_RED)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GINKGO_CARPET= registerBlock("ginkgo_carpet",
            () -> new MapleCarpetBlock(BlockBehaviour.Properties.ofLegacyCopy(MapleBlocks.PINK_PETALS.get()).mapColor(MapColor.TERRACOTTA_YELLOW)),MapleCreativeModeTabs.Maple_Group);

    //Glass Blocks
    public static final Supplier<Block> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.WHITE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.ORANGE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.ORANGE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.ORANGE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.MAGENTA_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.MAGENTA_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.MAGENTA_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.YELLOW_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.YELLOW_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.YELLOW_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIME_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.LIME_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIME_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.PINK_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.PINK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.PINK_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GRAY_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.GRAY_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.GRAY_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CYAN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.CYAN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.CYAN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.PURPLE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.PURPLE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.PURPLE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.BLUE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.BLUE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.BLUE_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.BROWN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.BROWN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.BROWN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GREEN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.GREEN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.GREEN_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.RED_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.RED_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.RED_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.BLACK_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.BLACK_STAINED_GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GLASS_SLAB = registerBlock("glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GLASS)), MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GLASS_STAIRS = registerBlock("glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.GLASS)), MapleCreativeModeTabs.Maple_Group);


    public static final Supplier<Block> TATAMI =registerBlock("tatami",
            () -> new HayBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_GREEN)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> TATAMI_SLAB = registerBlock("tatami_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofLegacyCopy(MapleBlocks.TATAMI.get()).mapColor(MapColor.COLOR_GREEN)), MapleCreativeModeTabs.Maple_Group);

    //PLASTER
    public static final Supplier<Block> GREEN_PLASTER =registerBlock("green_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GREEN_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> PLASTER =registerBlock("plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.WHITE_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> ORANGE_PLASTER =registerBlock("orange_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.ORANGE_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> MAGENTA_PLASTER =registerBlock("magenta_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.MAGENTA_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIGHT_BLUE_PLASTER =registerBlock("light_blue_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIGHT_BLUE_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> YELLOW_PLASTER =registerBlock("yellow_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.YELLOW_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIME_PLASTER =registerBlock("lime_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIME_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> PINK_PLASTER =registerBlock("pink_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.PINK_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> GRAY_PLASTER =registerBlock("gray_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.GRAY_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> LIGHT_GRAY_PLASTER =registerBlock("light_gray_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.LIGHT_GRAY_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> CYAN_PLASTER =registerBlock("cyan_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CYAN_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> PURPLE_PLASTER =registerBlock("purple_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.PURPLE_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BLUE_PLASTER =registerBlock("blue_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.BLUE_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> BROWN_PLASTER =registerBlock("brown_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.BROWN_CONCRETE)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> RED_PLASTER =registerBlock("red_plaster",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.RED_CONCRETE)),MapleCreativeModeTabs.Maple_Group);

    //Sea Lantern
    public static final Supplier<Block> Iron_Sea_Lantern =registerBlock("iron_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.SEA_LANTERN)),MapleCreativeModeTabs.Maple_Group);
    public static final Supplier<Block> Gold_Sea_Lantern =registerBlock("gold_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.ofLegacyCopy(Blocks.SEA_LANTERN)),MapleCreativeModeTabs.Maple_Group);


    private static <T extends Block> Supplier<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block,  Supplier<CreativeModeTab> tab) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> Supplier<Item> registerBlockItem(String name, Supplier<T> block,
                                                                            Supplier<CreativeModeTab> tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static RotatedPillarBlock createBambooBlock(MapColor topMaterialColor, MapColor sideMaterialColor, SoundType soundGroup) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(sideMaterialColor).strength(2.0f).sound(soundGroup));
    }

    public static void registerMapleBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
