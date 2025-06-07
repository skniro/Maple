package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleBucketItem;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import com.skniro.maple.item.MapleItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class MapleFluidBlockOrItem {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MOD_ID);

    public static Supplier<Block> Hot_Spring_BLOCK = registerBlock("hot_spring_block",
            (properties)->   new MapleHotSpringFluidBlock(MapleFluids.STILL_Hot_Spring, properties), BlockBehaviour.Properties.ofLegacyCopy(Blocks.WATER).lightLevel((state) -> 8));

    public static Supplier<Item> Hot_Spring_BUCKET = registerItem("hot_spring_bucket",
            (properties)-> new MapleBucketItem(MapleFluids.STILL_Hot_Spring, properties), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1));



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

    public static <B extends Item> RegistryObject<Item> register(String name, Function<Item.Properties, ? extends B> func, Item.Properties props) {
        return ITEMS.register(name, () -> {
            return (Item)func.apply(props.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <T extends Item> RegistryObject<Item> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        RegistryObject<Item> toReturn = register(name, item, properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)))));
    }

    public static void registerFluidItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static void registerFluidBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
