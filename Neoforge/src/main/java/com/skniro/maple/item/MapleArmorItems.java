package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.equipment.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import java.util.function.Supplier;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class MapleArmorItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Maple.MOD_ID);

    //Ingot
    public static final Supplier<Item> Cherry_INGOT = registerItem("cherry_ingot",
            Item::new, (new Item.Properties()));
    public static final Supplier<Item> Cherry_NUGGET = registerItem("cherry_nugget",
            Item::new, (new Item.Properties()));

    //Tool
    public static final Supplier<Item> Cherry_SWORD = registerItem("cherry_sword", (properties)-> new SwordItem(MapleToolMaterials.Cherry,  3, -2.4F,properties), new Item.Properties());
    public static final Supplier<Item> Cherry_SHOVEL = registerItem("cherry_shovel", (properties)->  new ShovelItem(MapleToolMaterials.Cherry,2, -3.0F, properties), new Item.Properties());
    public static final Supplier<Item> Cherry_PICKAXE = registerItem("cherry_pickaxe", (properties)->  new PickaxeItem(MapleToolMaterials.Cherry,1, -2.8F, properties), new Item.Properties());
    public static final Supplier<Item> Cherry_AXE = registerItem("cherry_axe", (properties)->  new AxeItem(MapleToolMaterials.Cherry,5, -3.0F, properties), new Item.Properties());
    public static final Supplier<Item> Cherry_HOE = registerItem("cherry_hoe", (properties)->  new HoeItem(MapleToolMaterials.Cherry,-3, 0.0F, properties), new Item.Properties());

    //Armor
    public static final Supplier<Item> Cherry_HELMET = registerItem("cherry_helmet",
            (properties)->  new ArmorItem(MapleArmorMaterials.Cherry, ArmorType.HELMET, properties), new Item.Properties().durability(ArmorType.HELMET.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Supplier<Item> Cherry_CHESTPLATE = registerItem("cherry_chestplate",
            (properties)->  new ArmorItem(MapleArmorMaterials.Cherry, ArmorType.CHESTPLATE, properties), new Item.Properties().durability(ArmorType.CHESTPLATE.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Supplier<Item> Cherry_LEGGINGS = registerItem("cherry_leggings",
            (properties)->  new ArmorItem(MapleArmorMaterials.Cherry, ArmorType.LEGGINGS, properties), new Item.Properties().durability(ArmorType.LEGGINGS.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));
    public static final Supplier<Item> Cherry_BOOTS = registerItem("cherry_boots",
            (properties)->  new ArmorItem(MapleArmorMaterials.Cherry, ArmorType.BOOTS, properties), new Item.Properties().durability(ArmorType.BOOTS.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER)));


    private static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        DeferredItem<T> toReturn = ITEMS.registerItem(name, item, properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return toReturn;
    }

    public static void registerMapleArmorItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
