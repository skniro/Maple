package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.Supplier;

import java.util.function.Supplier;

public class GlassCupItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MODID);
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
