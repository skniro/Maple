package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class GlassCupItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MOD_ID);
    public static final RegistryObject<Item> HIGH_GLASS_CUP = registerItem("high_glass_cup",
             BottleItem::new,(
            (new Item
                    .Properties()
            )));


    public static <B extends Item> RegistryObject<Item> register(String name, Function<Item.Properties, ? extends B> func, Item.Properties props) {
        return ITEMS.register(name, () -> {
            return (Item)func.apply(props.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <T extends Item> RegistryObject<Item> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        RegistryObject<Item> toReturn = register(name, item, properties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return toReturn;
    }

    public static void registerMapleGlassItems(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }
}
