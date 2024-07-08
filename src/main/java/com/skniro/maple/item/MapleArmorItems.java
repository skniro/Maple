package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.armor.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleAxeItem;
import com.skniro.maple.item.init.tool.MapleHoeItem;
import com.skniro.maple.item.init.tool.MaplePickaxeItem;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MapleArmorItems {
    //Ingot
    public static final Item Cherry_INGOT = registerItem("cherry_ingot",new Item(new Item.Settings()));
    public static final Item Cherry_NUGGET = registerItem("cherry_nugget",new Item(new Item.Settings()));


    //Tool
    public static final Item Cherry_SWORD = registerItem("cherry_sword", (new SwordItem(MapleToolMaterials.Cherry, 3, -2.4F, new Item.Settings())));
    public static final Item Cherry_SHOVEL = registerItem("cherry_shovel", (new ShovelItem(MapleToolMaterials.Cherry, 1.5F, -3.0F, new Item.Settings())));
    public static final Item Cherry_PICKAXE = registerItem("cherry_pickaxe", (new MaplePickaxeItem(MapleToolMaterials.Cherry, 1, -2.8F, new Item.Settings())));
    public static final Item Cherry_AXE = registerItem("cherry_axe", (new MapleAxeItem(MapleToolMaterials.Cherry, 5.0F, -3.0F, new Item.Settings())));
    public static final Item Cherry_HOE = registerItem("cherry_hoe", (new MapleHoeItem(MapleToolMaterials.Cherry, -3, 0.0F, new Item.Settings())));

    //Armor
    public static final Item Cherry_HELMET = registerItem("cherry_helmet", (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.HELMET, new Item.Settings())));
    public static final Item Cherry_CHESTPLATE = registerItem("cherry_chestplate", (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.CHESTPLATE, new Item.Settings())));
    public static final Item Cherry_LEGGINGS = registerItem("cherry_leggings", (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.LEGGINGS, new Item.Settings())));
    public static final Item Cherry_BOOTS = registerItem("cherry_boots", (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.BOOTS, new Item.Settings())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maple.MOD_ID, name),item);
    }

    public static void registerMapleArmorItems() {
        Maple.LOGGER.info("Registering Maple armor items for " + Maple.MOD_ID);
    }

}
