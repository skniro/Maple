package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class GlassCupItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Maple.MOD_ID);
    public static final Supplier<Item> HIGH_GLASS_CUP = registerItem("high_glass_cup",
             BottleItem::new,(
            (new Item
                    .Properties()
            )));


    public static <B extends Item> Supplier<Item> register(String name, Function<Item.Properties, ? extends B> func, Item.Properties props) {
        return ITEMS.register(name, () -> {
            return (Item)func.apply(props.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <T extends Item> Supplier<Item> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        Supplier<Item> toReturn = register(name, item, properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return toReturn;
    }

    public static void registerMapleGlassItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
