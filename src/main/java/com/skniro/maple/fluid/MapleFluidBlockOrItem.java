package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import com.skniro.maple.item.MapleItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleFluidBlockOrItem {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MODID);

    public static RegistryObject<Block> Hot_Spring_BLOCK = registerBlock("hot_spring_block",
            ()->   new MapleHotSpringFluidBlock(MapleFluids.STILL_Hot_Spring.get(), BlockBehaviour.Properties.copy(Blocks.WATER).lightLevel((state) -> 8)), Maple.Maple_Group);

    public static RegistryObject<Item> Hot_Spring_BUCKET;


    public static void registerFluidItems() {
        Hot_Spring_BUCKET = Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, "hot_spring_bucket"),
                new BucketItem(MapleFluids.STILL_Hot_Spring, new FabricItemSettings().recipeRemainder(Items.BUCKET).group(Maple.Maple_Group).maxCount(1)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void registerFluidItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static void registerFluidBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
