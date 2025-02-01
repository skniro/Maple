package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.item.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import java.util.function.Function;

public class MapleFluidBlockOrItem {
    public static Block Hot_Spring_BLOCK;
    public static Item Hot_Spring_BUCKET;

    public static void registerFluidBlocks() {
        Hot_Spring_BLOCK = registerBlockWithoutItem( "hot_spring_block",
                (settings)-> new MapleHotSpringFluidBlock(MapleFluids.STILL_Hot_Spring, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).lightLevel((state)->{return 7;}));
    }
    public static void registerFluidItems() {
        Hot_Spring_BUCKET = registerItem("hot_spring_bucket",
                (settings)->  new BucketItem(MapleFluids.STILL_Hot_Spring, settings), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1));
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }

    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name));
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)), item);
    }
}
