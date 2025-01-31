package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MapleFluidBlockOrItem {
    public static Block Hot_Spring_BLOCK;
    public static Item Hot_Spring_BUCKET;

    public static void registerFluidBlocks() {
        Hot_Spring_BLOCK = registerBlockWithoutItem( "hot_spring_block",
                (settings)-> new MapleHotSpringFluidBlock(MapleFluids.STILL_Hot_Spring, settings), AbstractBlock.Settings.copy(Blocks.WATER).luminance((state)->{return 7;}));
    }
    public static void registerFluidItems() {
        Hot_Spring_BUCKET = registerItem("hot_spring_bucket",
                (settings)->  new BucketItem(MapleFluids.STILL_Hot_Spring, settings), new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));
    }

    private static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }

    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Maple.MOD_ID, name));
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name))));
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name)), item);
    }
}
