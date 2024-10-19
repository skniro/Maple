package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.armor.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleArmorItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MODID);

    //Ingot
    public static final RegistryObject<Item> Cherry_INGOT = registerItem("cherry_ingot",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Cherry_NUGGET = registerItem("cherry_nugget",
            ()-> new Item(new Item.Properties()));


    //Tool
    public static final RegistryObject<Item> Cherry_SWORD = registerItem("cherry_sword",
            ()-> (new SwordItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(SwordItem.createAttributes(MapleToolMaterials.Cherry, 3, -2.4F)))));
    public static final RegistryObject<Item> Cherry_SHOVEL = registerItem("cherry_shovel",
            ()-> (new ShovelItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(ShovelItem.createAttributes(MapleToolMaterials.Cherry, 1.5F, -3.0F)))));
    public static final RegistryObject<Item> Cherry_PICKAXE = registerItem("cherry_pickaxe",
            ()-> (new PickaxeItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(PickaxeItem.createAttributes(MapleToolMaterials.Cherry, 1, -2.8F)))));
    public static final RegistryObject<Item> Cherry_AXE = registerItem("cherry_axe",
            ()-> (new AxeItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(AxeItem.createAttributes(MapleToolMaterials.Cherry, 5.0F, -3.0F)))));
    public static final RegistryObject<Item> Cherry_HOE = registerItem("cherry_hoe",
            ()-> (new HoeItem(MapleToolMaterials.Cherry, new Item.Properties().attributes(HoeItem.createAttributes(MapleToolMaterials.Cherry, -3, 0.0F)))));

    //Armor
    public static final RegistryObject<Item> Cherry_HELMET = registerItem("cherry_helmet",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.HELMET,
                    new Item.Properties())));
    public static final RegistryObject<Item> Cherry_CHESTPLATE = registerItem("cherry_chestplate",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties())));
    public static final RegistryObject<Item> Cherry_LEGGINGS = registerItem("cherry_leggings",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.LEGGINGS,
                    new Item.Properties())));
    public static final RegistryObject<Item> Cherry_BOOTS = registerItem("cherry_boots",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.BOOTS,
                    new Item.Properties())));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerMapleArmorItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
