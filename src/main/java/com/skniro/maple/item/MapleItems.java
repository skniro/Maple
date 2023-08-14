package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.entity.MapleBoatType;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleItems {
    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.CHERRY_SIGN, MapleSignBlocks.CHERRY_WALL_SIGN));
    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.Maple_SIGN,MapleSignBlocks.Maple_WALL_SIGN));
    public static final Item BAMBOO_SIGN = registerItem("bamboo_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.BAMBOO_SIGN,MapleSignBlocks.BAMBOO_WALL_SIGN));

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

    //Boat
    public static final Item CHERRY_BOAT = registerItem("cherry_boat", (new BoatItem(false, MapleBoatType.CHERRY, (new Item.Settings()).maxCount(1).group(Maple.Maple_Group))));
    public static final Item MAPLE_BOAT = registerItem("maple_boat", (new BoatItem(false, MapleBoatType.MAPLE, (new Item.Settings()).maxCount(1).group(Maple.Maple_Group))));
    public static final Item BAMBOO_BOAT = registerItem("bamboo_boat", (new BoatItem(false, MapleBoatType.BAMBOO, (new Item.Settings()).maxCount(1))));

    public static final Item CHERRY_CHEST_BOAT = registerItem("cherry_chest_boat", (new BoatItem(true, MapleBoatType.CHERRY, (new Item.Settings()).maxCount(1).group(Maple.Maple_Group))));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat", (new BoatItem(true, MapleBoatType.MAPLE, (new Item.Settings()).maxCount(1).group(Maple.Maple_Group))));
    public static final Item BAMBOO_CHEST_BOAT = registerItem("bamboo_chest_boat", (new BoatItem(true, MapleBoatType.BAMBOO, (new Item.Settings()).maxCount(1))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Mod Items for " + Maple.MOD_ID);
    }
}