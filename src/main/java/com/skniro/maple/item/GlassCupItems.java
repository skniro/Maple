package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class GlassCupItems {
    public static final Item HIGH_GLASS_CUP = registerItem("high_glass_cup",new GlassBottleItem(
            (new Item
                    .Settings()
                    .group(Maple.Maple_Group)
            )));


    private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Glass Items for " + Maple.MOD_ID);
    }

}
