package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;

public class GlassCupItems {
    public static final Item HIGH_GLASS_CUP = registerItem("high_glass_cup",new BottleItem(
            (new Item
                    .Properties()
            )));


    private static Item registerItem(String name,Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Glass Items for " + Maple.MOD_ID);
    }

}
