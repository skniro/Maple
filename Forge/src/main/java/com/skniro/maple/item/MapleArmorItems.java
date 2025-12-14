package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.equipment.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class MapleArmorItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MOD_ID);

    //Ingot
    public static final RegistryObject<Item> Cherry_INGOT = registerItem("cherry_ingot",
            Item::new, (new Item.Properties()));
    public static final RegistryObject<Item> Cherry_NUGGET = registerItem("cherry_nugget",
            Item::new, (new Item.Properties()));
    //Armor


    //Tool
    public static final RegistryObject<Item> Cherry_SWORD = registerItem("cherry_sword", (properties)-> new Item(MapleToolMaterials.Cherry.applySwordProperties(properties, 3, 2.4F).enchantable(25)), new Item.Properties());
    public static final RegistryObject<Item> Cherry_SHOVEL = registerItem("cherry_shovel", (properties)->  new ShovelItem(MapleToolMaterials.Cherry,2, -3.0F, properties), new Item.Properties());
    public static final RegistryObject<Item> Cherry_PICKAXE = registerItem("cherry_pickaxe", (properties)->  new Item(MapleToolMaterials.Cherry.applyToolProperties(properties, BlockTags.MINEABLE_WITH_PICKAXE,1, -2.8F, 0.0F).enchantable(25)), new Item.Properties());
    public static final RegistryObject<Item> Cherry_AXE = registerItem("cherry_axe", (properties)->  new AxeItem(MapleToolMaterials.Cherry,5, -3.0F, properties), new Item.Properties());
    public static final RegistryObject<Item> Cherry_HOE = registerItem("cherry_hoe", (properties)->  new HoeItem(MapleToolMaterials.Cherry,-3, 0.0F, properties), new Item.Properties());

    //Armor
    public static final RegistryObject<Item> Cherry_HELMET = registerItem("cherry_helmet", (settings) -> new Item(settings.humanoidArmor(MapleArmorMaterials.Cherry, ArmorType.HELMET).enchantable(25).durability(ArmorType.HELMET.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER))), new Item.Properties());
    public static final RegistryObject<Item> Cherry_CHESTPLATE = registerItem("cherry_chestplate", (settings) -> new Item(settings.enchantable(25).humanoidArmor(MapleArmorMaterials.Cherry, ArmorType.CHESTPLATE).durability(ArmorType.CHESTPLATE.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER))), new Item.Properties());
    public static final RegistryObject<Item> Cherry_LEGGINGS = registerItem("cherry_leggings", (settings) -> new Item(settings.enchantable(25).humanoidArmor(MapleArmorMaterials.Cherry, ArmorType.LEGGINGS).durability(ArmorType.LEGGINGS.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER))), new Item.Properties());
    public static final RegistryObject<Item> Cherry_BOOTS = registerItem("cherry_boots", (settings) -> new Item(settings.enchantable(25).humanoidArmor(MapleArmorMaterials.Cherry, ArmorType.BOOTS).durability(ArmorType.BOOTS.getDurability(MapleArmorMaterials.Cherry_DURABILITY_MULTIPLIER))), new Item.Properties());


    public static <B extends Item> RegistryObject<Item> register(String name, Function<Item.Properties, ? extends B> func, Item.Properties props) {
        return ITEMS.register(name, () -> {
            return (Item)func.apply(props.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <T extends Item> RegistryObject<Item> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        RegistryObject<Item> toReturn = register(name, item, properties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return toReturn;
    }

    public static void registerMapleArmorItems(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }
}
