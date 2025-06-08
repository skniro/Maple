package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.equipment.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MapleArmorItems {
    //Ingot
    public static final Item Cherry_INGOT = registerItem("cherry_ingot", Item::new, (new Item.Settings()));
    public static final Item Cherry_NUGGET = registerItem("cherry_nugget", Item::new, (new Item.Settings()));


    //Tool
    public static final Item Cherry_SWORD = registerItem("cherry_sword", Item::new, new Item.Settings().enchantable(25).sword(MapleToolMaterials.Cherry,  3, -2.4F));
    public static final Item Cherry_SHOVEL = registerItem("cherry_shovel", (settings)->  new ShovelItem(MapleToolMaterials.Cherry,2, -3.0F, settings), new Item.Settings());
    public static final Item Cherry_PICKAXE = registerItem("cherry_pickaxe", Item::new, new Item.Settings().enchantable(25).pickaxe(MapleToolMaterials.Cherry,1, -2.8F));
    public static final Item Cherry_AXE = registerItem("cherry_axe", (settings)->  new AxeItem(MapleToolMaterials.Cherry,5, -3.0F, settings), new Item.Settings());
    public static final Item Cherry_HOE = registerItem("cherry_hoe", (settings)->  new HoeItem(MapleToolMaterials.Cherry,-3, 0.0F, settings), new Item.Settings());

    //Armor
    public static final Item Cherry_HELMET = registerItem("cherry_helmet", Item::new, new Item.Settings().enchantable(25).armor(MapleArmorMaterials.Cherry, EquipmentType.HELMET).maxDamage(EquipmentType.HELMET.getMaxDamage(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Item Cherry_CHESTPLATE = registerItem("cherry_chestplate", Item::new, new Item.Settings().enchantable(25).armor(MapleArmorMaterials.Cherry, EquipmentType.CHESTPLATE).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Item Cherry_LEGGINGS = registerItem("cherry_leggings", Item::new, new Item.Settings().enchantable(25).armor(MapleArmorMaterials.Cherry, EquipmentType.LEGGINGS).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Item Cherry_BOOTS = registerItem("cherry_boots", Item::new, new Item.Settings().enchantable(25).armor(MapleArmorMaterials.Cherry, EquipmentType.BOOTS).maxDamage(EquipmentType.BOOTS.getMaxDamage(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));

    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name))));
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name)), item);
    }

    public static void registerMapleArmorItems() {
        Maple.LOGGER.info("Registering Maple armor items for " + Maple.MOD_ID);
    }

}
