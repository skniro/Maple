package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MODID);

    public static final RegistryObject<Item> CHERRY_SIGN = registerItem("cherry_sign",
            ()-> new SignItem(new Item.Properties().tab(Maple.Maple_Group).stacksTo(16),
                    MapleSignBlocks.CHERRY_SIGN.get(), MapleSignBlocks.CHERRY_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAPLE_SIGN = registerItem("maple_sign",
            ()-> new SignItem(new Item.Properties().tab(Maple.Maple_Group).stacksTo(16),
                    MapleSignBlocks.Maple_SIGN.get(),MapleSignBlocks.Maple_WALL_SIGN.get()));
    public static final RegistryObject<Item> BAMBOO_SIGN = registerItem("bamboo_sign",
            ()-> new SignItem(new Item.Properties().tab(Maple.Maple_Group).stacksTo(16),
                    MapleSignBlocks.BAMBOO_SIGN.get(),MapleSignBlocks.BAMBOO_WALL_SIGN.get()));

    public static final RegistryObject<Item> CHERRY_DOOR = registerItem("cherry_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.CHERRY_DOOR.get(), new Item.Properties().tab(Maple.Maple_Group).stacksTo(16)));
    public static final RegistryObject<Item> MAPLE_DOOR = registerItem("maple_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.MAPLE_DOOR.get(), new Item.Properties().tab(Maple.Maple_Group).stacksTo(16)));
    public static final RegistryObject<Item> BAMBOO_DOOR = registerItem("bamboo_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.BAMBOO_DOOR.get(), new Item.Properties().tab(Maple.Maple_Group).stacksTo(16)));

    //Food Materials
    public static final RegistryObject<Item> Flour = registerItem("flour",
            ()-> new Item(new Item.Properties().tab(Maple.Maple_Group_Food)));
    public static final RegistryObject<Item> MapleSyrup = registerItem("maple_syrup",
            ()-> new Item(new Item.Properties().tab(Maple.Maple_Group_Food)));
    public static final RegistryObject<Item> Cream = registerItem("cream",
            ()-> new Item(new Item.Properties().tab(Maple.Maple_Group_Food)));
    public static final RegistryObject<Item> MILK_BOTTOM = registerItem("milk_bottom",
            ()-> new MilkBucketItem(new Item.Properties().stacksTo(16).tab(Maple.Maple_Group_Food)));
    public static final RegistryObject<Item> SOYBEAN = registerItem("soybean",
            ()-> new Item(new Item.Properties().tab(Maple.Maple_Group_Food)));
    public static final RegistryObject<Item> Salt = registerItem("salt",
            ()-> new Item(new Item.Properties().tab(Maple.Maple_Group_Food)));


    //Tools
    public static final RegistryObject<Item> Food_Press = registerItem("food_press",
            ()-> new Item(new Item.Properties()));


    //Seed
    public static final RegistryObject<Item> Rice = registerItem("rice",
            ()-> new ItemNameBlockItem(MapleBlocks.RICE.get(), (new Item.Properties().tab(Maple.Maple_Group_Food))));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}