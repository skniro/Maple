package com.skniro.maple.item;

import com.skniro.maple.Maple;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;

public class GlassCupItems {
    public static final Item HIGH_GLASS_CUP = registerItem("high_glass_cup", BottleItem::new,(
            (new Item
                    .Properties()
            )));


    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)), item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Glass Items for " + Maple.MOD_ID);
    }

}
