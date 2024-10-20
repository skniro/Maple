package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.armor.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.item.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;

public class MapleArmorItems {
    //Ingot
    public static final Item Cherry_INGOT = registerItem("cherry_ingot",new Item(new Item.Properties()));
    public static final Item Cherry_NUGGET = registerItem("cherry_nugget",new Item(new Item.Properties()));


    //Tool
    public static final Item Cherry_SWORD = registerItem("cherry_sword", (new SwordItem(MapleToolMaterials.Cherry,  new Item.Properties().attributes(SwordItem.createAttributes(MapleToolMaterials.Cherry, 3, -2.4F)))));
    public static final Item Cherry_SHOVEL = registerItem("cherry_shovel", (new ShovelItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(ShovelItem.createAttributes(MapleToolMaterials.Cherry, 2, -3.0F)))));
    public static final Item Cherry_PICKAXE = registerItem("cherry_pickaxe", (new PickaxeItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(PickaxeItem.createAttributes(MapleToolMaterials.Cherry, 1, -2.8F)))));
    public static final Item Cherry_AXE = registerItem("cherry_axe", (new AxeItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(AxeItem.createAttributes(MapleToolMaterials.Cherry, 5, -3.0F)))));
    public static final Item Cherry_HOE = registerItem("cherry_hoe", (new HoeItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(HoeItem.createAttributes(MapleToolMaterials.Cherry, 3, 0F)))));

    //Armor
    public static final Item Cherry_HELMET = registerItem("cherry_helmet", (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final Item Cherry_CHESTPLATE = registerItem("cherry_chestplate", (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final Item Cherry_LEGGINGS = registerItem("cherry_leggings", (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final Item Cherry_BOOTS = registerItem("cherry_boots", (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.BOOTS, new Item.Properties())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name),item);
    }

    public static void registerMapleArmorItems() {
        Maple.LOGGER.info("Registering Maple armor items for " + Maple.MOD_ID);
    }

}
