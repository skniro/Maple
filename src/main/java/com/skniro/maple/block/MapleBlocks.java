package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.init.MapleFlammableRotatedPillarBlock;
import com.skniro.maple.block.init.MapleFlowerbedBlock;
import com.skniro.maple.block.init.RiceBlock;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.Tree.CherrySaplingGenerator;
import com.skniro.maple.world.Tree.MapleSaplingGenerator;
import com.skniro.maple.world.Tree.SakuraSaplingGenerator;
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
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), Maple.Maple_Group);

    public static final RegistryObject<Block> CHERRY_LOG = registerBlock("cherry_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), Maple.Maple_Group);
    public static final RegistryObject<Block> CHERRY_WOOD = registerBlock("cherry_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), Maple.Maple_Group);
    public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            () -> new MapleFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), Maple.Maple_Group);

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
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
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
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES))
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
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).lightLevel((state) -> 8))
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
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
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
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
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
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> BAMBOO_BUTTON = registerBlock("bamboo_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), Maple.Maple_Group);


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
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Maple.Maple_Group);
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
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> CHERRY_DOOR = registerBlockWithoutItem("cherry_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> BAMBOO_DOOR = registerBlockWithoutItem("bamboo_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD,BAMBOO_PLANKS.get().defaultMaterialColor()).strength(3.0f).sound(SoundType.WOOD).noOcclusion()));

    //TRAPDOOR
    public static final RegistryObject<Block> CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).strength(3.0F).noOcclusion()), Maple.Maple_Group);
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).strength(3.0F).noOcclusion()), Maple.Maple_Group);
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
