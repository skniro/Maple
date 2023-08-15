package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GlassCupItems {
    public static final Item HIGH_GLASS_CUP = registerItem("high_glass_cup",new GlassBottleItem(
            (new Item
                    .Settings()
            )));


    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maple.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Glass Items for " + Maple.MOD_ID);
    }

}
