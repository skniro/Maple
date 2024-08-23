package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.init.*;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.Tree.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class MapleBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MODID);

    //LOG_Block
    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).color(MaterialColor.COLOR_BROWN)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).color(MaterialColor.COLOR_BROWN)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).color(MaterialColor.COLOR_BROWN)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).color(MaterialColor.COLOR_BROWN)), Maple.Maple_Group);

    public static final RegistryObject<Block> CHERRY_LOG = registerBlock("cherry_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).color(MaterialColor.TERRACOTTA_PINK)), Maple.Maple_Group);
    public static final RegistryObject<Block> CHERRY_WOOD = registerBlock("cherry_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).color(MaterialColor.TERRACOTTA_PINK)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).color(MaterialColor.COLOR_PINK)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).color(MaterialColor.COLOR_PINK)), Maple.Maple_Group);

    public static final RegistryObject<Block> BAMBOO_BLOCK = registerBlock("bamboo_block",
            () -> createBambooBlock(MaterialColor.COLOR_YELLOW, MaterialColor.TERRACOTTA_GREEN, SoundType.WOOD), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK = registerBlock("stripped_bamboo_block",
            () -> createBambooBlock(MaterialColor.COLOR_YELLOW, MaterialColor.COLOR_YELLOW, SoundType.WOOD), Maple.Maple_Group);




    //SAPLING Block
    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling",
            () -> new SaplingBlock(new MapleSaplingGenerator(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final RegistryObject<Block> CHERRY_SAPLING = registerBlock("cherry_sapling",
            () -> new SaplingBlock(new CherrySaplingGenerator(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final RegistryObject<Block> SAKURA_SAPLING = registerBlock("sakura_sapling",
            () -> new SaplingBlock(new SakuraSaplingGenerator(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), Maple.Maple_Group);

    //LEAVES Block
    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).color(MaterialColor.TERRACOTTA_YELLOW))
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
            }, Maple.Maple_Group);

    public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).color(MaterialColor.COLOR_PINK))
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
            }, Maple.Maple_Group);

    public static final RegistryObject<Block> SAKURA_LEAVES = registerBlock("sakura_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).color(MaterialColor.COLOR_PINK).lightLevel((state) -> 8))
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
            }, Maple.Maple_Group);


    //PLANKS Block
    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).color(MaterialColor.COLOR_BROWN))
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
            }, Maple.Maple_Group);
    public static final RegistryObject<Block> CHERRY_PLANKS = registerBlock("cherry_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).color(MaterialColor.COLOR_PINK))
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
            }, Maple.Maple_Group);

    public static final RegistryObject<Block> BAMBOO_PLANKS = registerBlock("bamboo_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).color(MaterialColor.GOLD).strength(2.0f, 3.0f).sound(SoundType.WOOD))
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
            },Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).color(MaterialColor.GOLD).strength(2.0f, 3.0f).sound(SoundType.WOOD))
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
            },Maple.Maple_Group);

    //Potted
    public static final RegistryObject<Block> POTTED_CHERRY_SAPLING = registerBlockWithoutItem("potted_cherry_sapling",
            () -> new FlowerPotBlock(CHERRY_SAPLING.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_MAPLE_SAPLING = registerBlockWithoutItem("potted_maple_sapling",
            () -> new FlowerPotBlock(MAPLE_SAPLING.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_SAKURA_SAPLING = registerBlockWithoutItem("potted_sakura_sapling",
            () -> new FlowerPotBlock(SAKURA_SAPLING.get(), BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));


    //BUTTON
    public static final RegistryObject<Block> CHERRY_BUTTON = registerBlock("cherry_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).color(MaterialColor.COLOR_PINK).noCollission().strength(0.5F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).color(MaterialColor.COLOR_BROWN).noCollission().strength(0.5F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_BUTTON = registerBlock("bamboo_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).color(MaterialColor.COLOR_YELLOW).noCollission().strength(0.5F).sound(SoundType.WOOD)), Maple.Maple_Group);


    public static final RegistryObject<Block> PINK_PETALS = registerBlock("pink_petals",
            () -> new MapleFlowerbedBlock(BlockBehaviour.Properties.of(Material.PLANT).color(MaterialColor.COLOR_PINK).noCollission().sound(SoundType.GRASS)),Maple.Maple_Group);


    //STAIRS
    public static final RegistryObject<Block> CHERRY_STAIRS = registerBlock("cherry_stairs",
            () -> new StairBlock(CHERRY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(CHERRY_PLANKS.get())), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            () -> new StairBlock(CHERRY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(CHERRY_PLANKS.get())), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            () -> new StairBlock(BAMBOO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BAMBOO_PLANKS.get())), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs",
            () -> new StairBlock(BAMBOO_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(BAMBOO_MOSAIC.get())), Maple.Maple_Group);


   //SLAB
    public static final RegistryObject<Block> CHERRY_SLAB = registerBlock("cherry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_SLAB = registerBlock("bamboo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD,MaterialColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD,MaterialColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD)), Maple.Maple_Group);

    //FENCE
    public static final RegistryObject<Block> CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, CHERRY_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F)), Maple.Maple_Group);
    public static final RegistryObject<Block> CHERRY_FENCE = registerBlock("cherry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, CHERRY_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MAPLE_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MAPLE_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD,BAMBOO_PLANKS.get().defaultMaterialColor()).strength(2.0f, 3.0f)), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_FENCE = registerBlock("bamboo_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD,BAMBOO_PLANKS.get().defaultMaterialColor()).strength(2.0f, 3.0f).sound(SoundType.WOOD)), Maple.Maple_Group);


    //Door
    public static final RegistryObject<Block> MAPLE_DOOR = registerBlockWithoutItem("maple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MAPLE_PLANKS.get().defaultMaterialColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> CHERRY_DOOR = registerBlockWithoutItem("cherry_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, CHERRY_PLANKS.get().defaultMaterialColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> BAMBOO_DOOR = registerBlockWithoutItem("bamboo_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, BAMBOO_PLANKS.get().defaultMaterialColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));

    //TRAPDOOR
    public static final RegistryObject<Block> CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(3.0F).noOcclusion()), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BROWN).strength(3.0F).noOcclusion()), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD,MaterialColor.COLOR_YELLOW).strength(3.0f).noOcclusion()), Maple.Maple_Group);


    //PRESSURE_PLATE
    public static final RegistryObject<Block> CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.CHERRY_PLANKS.get().defaultMaterialColor()).noCollission().strength(0.5F)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.MAPLE_PLANKS.get().defaultMaterialColor()).noCollission().strength(0.5F)), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_PRESSURE_PLATE = registerBlock("bamboo_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.BAMBOO_PLANKS.get().defaultMaterialColor()).noCollission().strength(0.5f)), Maple.Maple_Group);

    //Plants Block
    public static final RegistryObject<Block> RICE = registerBlockWithoutItem("rice_plant",
            () -> new RiceBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

    //1.3.0
    public static final RegistryObject<Block> GINKGO_LOG = registerBlock("ginkgo_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).color(MaterialColor.SAND)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_GINKGO_LOG = registerBlock("stripped_ginkgo_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).color(MaterialColor.SAND)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_GINKGO_WOOD = registerBlock("stripped_ginkgo_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).color(MaterialColor.SAND)), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_WOOD = registerBlock("ginkgo_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).color(MaterialColor.SAND)), Maple.Maple_Group);
    public static final RegistryObject<Block> RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            () -> new SaplingBlock(new RedMapleSaplingGenerator(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_SAPLING = registerBlock("ginkgo_sapling",
            () -> new SaplingBlock(new GinkgoSaplingGenerator(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), Maple.Maple_Group);
    public static final RegistryObject<Block> RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).color(MaterialColor.COLOR_RED)), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_LEAVES = registerBlock("ginkgo_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).color(MaterialColor.TERRACOTTA_YELLOW)), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_PLANKS = registerBlock("ginkgo_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).color(MaterialColor.TERRACOTTA_YELLOW)), Maple.Maple_Group);
    public static final RegistryObject<Block> POTTED_GINKGO_SAPLING = registerBlockWithoutItem("potted_ginkgo_sapling",
            () -> new FlowerPotBlock(GINKGO_SAPLING.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ACACIA_SAPLING).instabreak().noOcclusion()));
    public static final RegistryObject<Block> POTTED_RED_MAPLE_SAPLING = registerBlockWithoutItem("potted_red_maple_sapling",
            () -> new FlowerPotBlock(RED_MAPLE_SAPLING.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ACACIA_SAPLING).instabreak().noOcclusion()));
    public static final RegistryObject<Block> GINKGO_BUTTON = registerBlock("ginkgo_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_YELLOW).noCollission().strength(0.5F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            () -> new StairBlock(GINKGO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(GINKGO_PLANKS.get())), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_SLAB = registerBlock("ginkgo_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_YELLOW).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).color(GINKGO_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F)), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_FENCE = registerBlock("ginkgo_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD,GINKGO_PLANKS.get().defaultMaterialColor()).strength(2.0f, 3.0f).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_DOOR = registerBlockWithoutItem("ginkgo_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_YELLOW).strength(3.0F).noOcclusion()), Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.GINKGO_PLANKS.get().defaultMaterialColor()).noCollission().strength(0.5F)), Maple.Maple_Group);

    public static final RegistryObject<Block> SAKURA_CARPET = registerBlock("sakura_carpet",
            () -> new MapleCarpetBlock(BlockBehaviour.Properties.copy(MapleBlocks.PINK_PETALS.get()).color(MaterialColor.COLOR_PINK)),Maple.Maple_Group);
    public static final RegistryObject<Block> Maple_CARPET = registerBlock("maple_carpet",
            () -> new MapleCarpetBlock(BlockBehaviour.Properties.copy(MapleBlocks.PINK_PETALS.get()).color(MaterialColor.TERRACOTTA_YELLOW)),Maple.Maple_Group);
    public static final RegistryObject<Block> RED_MAPLE_CARPET = registerBlock("red_maple_carpet",
            () -> new MapleCarpetBlock(BlockBehaviour.Properties.copy(MapleBlocks.PINK_PETALS.get()).color(MaterialColor.COLOR_RED)),Maple.Maple_Group);
    public static final RegistryObject<Block> GINKGO_CARPET= registerBlock("ginkgo_carpet",
            () -> new MapleCarpetBlock(BlockBehaviour.Properties.copy(MapleBlocks.PINK_PETALS.get()).color(MaterialColor.TERRACOTTA_YELLOW)),Maple.Maple_Group);

    //Glass Blocks
    public static final RegistryObject<Block> WHITE_STAINED_GLASS_SLAB = registerBlock("white_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> WHITE_STAINED_GLASS_STAIRS = registerBlock("white_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.WHITE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_SLAB = registerBlock("orange_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> ORANGE_STAINED_GLASS_STAIRS = registerBlock("orange_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.ORANGE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_SLAB = registerBlock("magenta_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAGENTA_STAINED_GLASS_STAIRS = registerBlock("magenta_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.MAGENTA_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock("light_blue_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock("light_blue_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_SLAB = registerBlock("yellow_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> YELLOW_STAINED_GLASS_STAIRS = registerBlock("yellow_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.YELLOW_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> LIME_STAINED_GLASS_SLAB = registerBlock("lime_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> LIME_STAINED_GLASS_STAIRS = registerBlock("lime_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.LIME_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> PINK_STAINED_GLASS_SLAB = registerBlock("pink_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> PINK_STAINED_GLASS_STAIRS = registerBlock("pink_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.PINK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> GRAY_STAINED_GLASS_SLAB = registerBlock("gray_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> GRAY_STAINED_GLASS_STAIRS = registerBlock("gray_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.GRAY_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock("light_gray_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock("light_gray_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> CYAN_STAINED_GLASS_SLAB = registerBlock("cyan_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> CYAN_STAINED_GLASS_STAIRS = registerBlock("cyan_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.CYAN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_SLAB = registerBlock("purple_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> PURPLE_STAINED_GLASS_STAIRS = registerBlock("purple_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.PURPLE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> BLUE_STAINED_GLASS_SLAB = registerBlock("blue_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> BLUE_STAINED_GLASS_STAIRS = registerBlock("blue_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.BLUE_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> BROWN_STAINED_GLASS_SLAB = registerBlock("brown_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> BROWN_STAINED_GLASS_STAIRS = registerBlock("brown_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.BROWN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> GREEN_STAINED_GLASS_SLAB = registerBlock("green_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> GREEN_STAINED_GLASS_STAIRS = registerBlock("green_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.GREEN_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> RED_STAINED_GLASS_SLAB = registerBlock("red_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> RED_STAINED_GLASS_STAIRS = registerBlock("red_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.RED_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> BLACK_STAINED_GLASS_SLAB = registerBlock("black_stained_glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> BLACK_STAINED_GLASS_STAIRS = registerBlock("black_stained_glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> GLASS_SLAB = registerBlock("glass_slab",
            () -> new MapleGlassSlabBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), Maple.Maple_Group);
    public static final RegistryObject<Block> GLASS_STAIRS = registerBlock("glass_stairs",
            () -> new MapleGlassStairsBlock(Blocks.BLACK_STAINED_GLASS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GLASS)), Maple.Maple_Group);


    public static final RegistryObject<Block> TATAMI =registerBlock("tatami",
            () -> new HayBlock(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).color(MaterialColor.COLOR_GREEN)),Maple.Maple_Group);
    public static final RegistryObject<Block> TATAMI_SLAB = registerBlock("tatami_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(MapleBlocks.TATAMI.get()).color(MaterialColor.COLOR_GREEN)), Maple.Maple_Group);

    //PLASTER
    public static final RegistryObject<Block> GREEN_PLASTER =registerBlock("green_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> PLASTER =registerBlock("plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> ORANGE_PLASTER =registerBlock("orange_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> MAGENTA_PLASTER =registerBlock("magenta_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER =registerBlock("light_blue_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> YELLOW_PLASTER =registerBlock("yellow_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> LIME_PLASTER =registerBlock("lime_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> PINK_PLASTER =registerBlock("pink_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> GRAY_PLASTER =registerBlock("gray_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> LIGHT_GRAY_PLASTER =registerBlock("light_gray_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> CYAN_PLASTER =registerBlock("cyan_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> PURPLE_PLASTER =registerBlock("purple_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> BLUE_PLASTER =registerBlock("blue_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> BROWN_PLASTER =registerBlock("brown_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)),Maple.Maple_Group);
    public static final RegistryObject<Block> RED_PLASTER =registerBlock("red_plaster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)),Maple.Maple_Group);

    //Sea Lantern
    public static final RegistryObject<Block> Iron_Sea_Lantern =registerBlock("iron_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)),Maple.Maple_Group);
    public static final RegistryObject<Block> Gold_Sea_Lantern =registerBlock("gold_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)),Maple.Maple_Group);


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static RotatedPillarBlock createBambooBlock(MaterialColor topMaterialColor, MaterialColor sideMaterialColor, SoundType soundGroup) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).color(sideMaterialColor).strength(2.0f).sound(soundGroup));
    }

    public static void registerMapleBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
