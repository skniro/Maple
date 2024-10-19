package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import com.skniro.maple.item.MapleItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleFluidBlockOrItem {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, Maple.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Maple.MODID);

    public static Supplier<Block> Hot_Spring_BLOCK = registerBlock("hot_spring_block",
            ()->   new MapleHotSpringFluidBlock(MapleFluids.STILL_Hot_Spring.get(), BlockBehaviour.Properties.ofLegacyCopy(Blocks.WATER).lightLevel((state) -> 8)));

    public static Supplier<Item> Hot_Spring_BUCKET = registerItem("hot_spring_bucket",
            ()-> new BucketItem(MapleFluids.STILL_Hot_Spring.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    private static <T extends Block> Supplier<Item> registerBlockItem(String name, Supplier<T> block
                                                                            ) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerFluidItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static void registerFluidBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
