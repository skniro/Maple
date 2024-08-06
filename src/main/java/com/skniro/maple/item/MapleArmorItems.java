package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.armor.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleAxeItem;
import com.skniro.maple.item.init.tool.MapleHoeItem;
import com.skniro.maple.item.init.tool.MaplePickaxeItem;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
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
            ()-> new Item(new Item.Properties().tab(Maple.Maple_Group)));


    //Tool
    public static final RegistryObject<Item> Cherry_SWORD = registerItem("cherry_sword",
            ()-> (new SwordItem(MapleToolMaterials.Cherry, 3, -2.4F, new Item.Properties().tab(Maple.Maple_Group))));
    public static final RegistryObject<Item> Cherry_SHOVEL = registerItem("cherry_shovel",
            ()-> (new ShovelItem(MapleToolMaterials.Cherry, 1.5F, -3.0F, new Item.Properties().tab(Maple.Maple_Group))));
    public static final RegistryObject<Item> Cherry_PICKAXE = registerItem("cherry_pickaxe",
            ()-> (new MaplePickaxeItem(MapleToolMaterials.Cherry, 1, -2.8F, new Item.Properties().tab(Maple.Maple_Group))));
    public static final RegistryObject<Item> Cherry_AXE = registerItem("cherry_axe",
            ()-> (new MapleAxeItem(MapleToolMaterials.Cherry, 5.0F, -3.0F, new Item.Properties().tab(Maple.Maple_Group))));
    public static final RegistryObject<Item> Cherry_HOE = registerItem("cherry_hoe",
            ()-> (new MapleHoeItem(MapleToolMaterials.Cherry, -3, 0.0F, new Item.Properties().tab(Maple.Maple_Group))));

    //Armor
    public static final RegistryObject<Item> Cherry_HELMET = registerItem("cherry_helmet",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, EquipmentSlot.HEAD,
                    new Item.Properties().tab(Maple.Maple_Group))));
    public static final RegistryObject<Item> Cherry_CHESTPLATE = registerItem("cherry_chestplate",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, EquipmentSlot.CHEST,
                    new Item.Properties().tab(Maple.Maple_Group))));
    public static final RegistryObject<Item> Cherry_LEGGINGS = registerItem("cherry_leggings",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, EquipmentSlot.LEGS,
                    new Item.Properties().tab(Maple.Maple_Group))));
    public static final RegistryObject<Item> Cherry_BOOTS = registerItem("cherry_boots",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, EquipmentSlot.FEET,
                    new Item.Properties().tab(Maple.Maple_Group))));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerMapleArmorItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
