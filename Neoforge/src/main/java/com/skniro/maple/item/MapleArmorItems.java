package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.item.init.armor.MapleArmorMaterials;
import com.skniro.maple.item.init.tool.MapleAxeItem;
import com.skniro.maple.item.init.tool.MapleHoeItem;
import com.skniro.maple.item.init.tool.MaplePickaxeItem;
import com.skniro.maple.item.init.tool.MapleToolMaterials;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleArmorItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Maple.MODID);

    //Ingot
    public static final Supplier<Item> Cherry_INGOT = registerItem("cherry_ingot",
            ()-> new Item(new Item.Properties()));
    public static final Supplier<Item> Cherry_NUGGET = registerItem("cherry_nugget",
            ()-> new Item(new Item.Properties()));


    //Tool
    public static final Supplier<Item> Cherry_SWORD = registerItem("cherry_sword",
            ()-> (new SwordItem(MapleToolMaterials.Cherry, 3, -2.4F, new Item.Properties())));
    public static final Supplier<Item> Cherry_SHOVEL = registerItem("cherry_shovel",
            ()-> (new ShovelItem(MapleToolMaterials.Cherry, 1.5F, -3.0F, new Item.Properties())));
    public static final Supplier<Item> Cherry_PICKAXE = registerItem("cherry_pickaxe",
            ()-> (new MaplePickaxeItem(MapleToolMaterials.Cherry, 1, -2.8F, new Item.Properties())));
    public static final Supplier<Item> Cherry_AXE = registerItem("cherry_axe",
            ()-> (new MapleAxeItem(MapleToolMaterials.Cherry, 5.0F, -3.0F, new Item.Properties())));
    public static final Supplier<Item> Cherry_HOE = registerItem("cherry_hoe",
            ()-> (new MapleHoeItem(MapleToolMaterials.Cherry, -3, 0.0F, new Item.Properties())));

    //Armor
    public static final Supplier<Item> Cherry_HELMET = registerItem("cherry_helmet",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.HELMET,
                    new Item.Properties())));
    public static final Supplier<Item> Cherry_CHESTPLATE = registerItem("cherry_chestplate",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties())));
    public static final Supplier<Item> Cherry_LEGGINGS = registerItem("cherry_leggings",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.LEGGINGS,
                    new Item.Properties())));
    public static final Supplier<Item> Cherry_BOOTS = registerItem("cherry_boots",
            ()-> (new ArmorItem(MapleArmorMaterials.Cherry, ArmorItem.Type.BOOTS,
                    new Item.Properties())));

    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerMapleArmorItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
