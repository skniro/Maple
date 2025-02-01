package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.equipment.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.item.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.equipment.ArmorType;
import java.util.function.Function;

public class MapleArmorItems {
    //Ingot
    public static final Item Cherry_INGOT = registerItem("cherry_ingot", Item::new, (new Item.Properties()));
    public static final Item Cherry_NUGGET = registerItem("cherry_nugget", Item::new, (new Item.Properties()));


    //Tool
    public static final Item Cherry_SWORD = registerItem("cherry_sword", (settings)-> new SwordItem(MapleToolMaterials.Cherry,  3, -2.4F,settings), new Item.Properties());
    public static final Item Cherry_SHOVEL = registerItem("cherry_shovel", (settings)->  new ShovelItem(MapleToolMaterials.Cherry,2, -3.0F, settings), new Item.Properties());
    public static final Item Cherry_PICKAXE = registerItem("cherry_pickaxe", (settings)->  new PickaxeItem(MapleToolMaterials.Cherry,1, -2.8F, settings), new Item.Properties());
    public static final Item Cherry_AXE = registerItem("cherry_axe", (settings)->  new AxeItem(MapleToolMaterials.Cherry,5, -3.0F, settings), new Item.Properties());
    public static final Item Cherry_HOE = registerItem("cherry_hoe", (settings)->  new HoeItem(MapleToolMaterials.Cherry,-3, 0.0F, settings), new Item.Properties());

    //Armor
    public static final Item Cherry_HELMET = registerItem("cherry_helmet", (settings)->  new ArmorItem(MapleArmorMaterials.Cherry, ArmorType.HELMET, settings), new Item.Properties().durability(ArmorType.HELMET.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Item Cherry_CHESTPLATE = registerItem("cherry_chestplate", (settings)->  new ArmorItem(MapleArmorMaterials.Cherry, ArmorType.CHESTPLATE, settings), new Item.Properties().durability(ArmorType.CHESTPLATE.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Item Cherry_LEGGINGS = registerItem("cherry_leggings", (settings)->  new ArmorItem(MapleArmorMaterials.Cherry, ArmorType.LEGGINGS, settings), new Item.Properties().durability(ArmorType.LEGGINGS.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Item Cherry_BOOTS = registerItem("cherry_boots", (settings)->  new ArmorItem(MapleArmorMaterials.Cherry, ArmorType.BOOTS, settings), new Item.Properties().durability(ArmorType.BOOTS.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));

    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)), item);
    }

    public static void registerMapleArmorItems() {
        Maple.LOGGER.info("Registering Maple armor items for " + Maple.MOD_ID);
    }

}
