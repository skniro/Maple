package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class GlassCupItems {
    public static final Item HIGH_GLASS_CUP = registerItem("high_glass_cup", GlassBottleItem::new,(
            (new Item
                    .Settings()
            )));


    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name))));
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name)), item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Glass Items for " + Maple.MOD_ID);
    }

}
