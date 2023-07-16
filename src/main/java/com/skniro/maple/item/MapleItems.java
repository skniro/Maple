package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MODID);

    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.CHERRY_SIGN, MapleSignBlocks.CHERRY_WALL_SIGN));
    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.Maple_SIGN,MapleSignBlocks.Maple_WALL_SIGN));
    public static final Item BAMBOO_SIGN = registerItem("bamboo_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.BAMBOO_SIGN,MapleSignBlocks.Maple_WALL_SIGN));

    public static final Item CHERRY_DOOR = registerItem("cherry_door",new TallBlockItem(MapleBlocks.CHERRY_DOOR, new FabricItemSettings().group(Maple.Maple_Group).maxCount(16)));
    public static final Item MAPLE_DOOR = registerItem("maple_door",new TallBlockItem(MapleBlocks.MAPLE_DOOR, new FabricItemSettings().group(Maple.Maple_Group).maxCount(16)));
    public static final Item BAMBOO_DOOR = registerItem("bamboo_door",new TallBlockItem(MapleBlocks.BAMBOO_DOOR, new FabricItemSettings().group(Maple.Maple_Group).maxCount(16)));

    //Food Materials
    public static final Item Flour = registerItem("flour",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));
    public static final Item MapleSyrup = registerItem("maple_syrup",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));
    public static final Item Cream = registerItem("cream",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));
    public static final Item MILK_BOTTOM = registerItem("milk_bottom",new MilkBucketItem(new Item.Settings().maxCount(16).group(Maple.Maple_Group_Food)));
    public static final Item SOYBEAN = registerItem("soybean",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));
    public static final Item Salt = registerItem("salt",new Item(new Item.Settings().group(Maple.Maple_Group_Food)));


    //Tools
    public static final Item Food_Press = registerItem("food_press",new Item(new Item.Settings()));


    //Seed
    public static final Item Rice = registerItem("rice",new AliasedBlockItem(MapleBlocks.RICE, (new FabricItemSettings()).group(Maple.Maple_Group_Food)));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item, CreativeModeTab tab) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}