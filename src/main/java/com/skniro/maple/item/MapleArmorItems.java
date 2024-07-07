package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MapleArmorItems {


    //Tool
    public static final Item RUBY_SWORD = registerItem("ruby_sword", (new SwordItem(MapleToolMaterials.RUBY, 3, -2.4F, new Item.Settings())));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", (new ShovelItem(MapleToolMaterials.RUBY, 1.5F, -3.0F, new Item.Settings())));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", (new MaplePickaxeItem(MapleToolMaterials.RUBY, 1, -2.8F, new Item.Settings())));
    public static final Item RUBY_AXE = registerItem("ruby_axe", (new MapleAxeItem(MapleToolMaterials.RUBY, 5.0F, -3.0F, new Item.Settings())));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", (new MapleHoeItem(MapleToolMaterials.RUBY, -3, 0.0F, new Item.Settings())));

    //Armor
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", (new ArmorItem(MapleArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Settings())));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", (new ArmorItem(MapleArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings())));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", (new ArmorItem(MapleArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings())));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", (new ArmorItem(MapleArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Settings())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maple.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Ruby Items for " + Maple.MOD_ID);
    }

}
