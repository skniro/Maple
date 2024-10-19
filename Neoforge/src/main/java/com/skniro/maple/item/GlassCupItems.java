package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class GlassCupItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Maple.MODID);
    public static final Supplier<Item> HIGH_GLASS_CUP = registerItem("high_glass_cup",
            ()-> new BottleItem(
            (new Item
                    .Properties()
            )));


    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerMapleGlassItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
