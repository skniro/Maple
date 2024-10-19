package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.init.snowball.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MODID);

    public static final RegistryObject<Item> CHERRY_SIGN = registerItem("cherry_sign",
            ()-> new SignItem(new Item.Properties().stacksTo(16),
                    MapleSignBlocks.CHERRY_SIGN.get(), MapleSignBlocks.CHERRY_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAPLE_SIGN = registerItem("maple_sign",
            ()-> new SignItem(new Item.Properties().stacksTo(16),
                    MapleSignBlocks.Maple_SIGN.get(),MapleSignBlocks.Maple_WALL_SIGN.get()));
    public static final RegistryObject<Item> BAMBOO_SIGN = registerItem("bamboo_sign",
            ()-> new SignItem(new Item.Properties().stacksTo(16),
                    MapleSignBlocks.BAMBOO_SIGN.get(),MapleSignBlocks.BAMBOO_WALL_SIGN.get()));
    public static final RegistryObject<Item> GINKGO_SIGN = registerItem("ginkgo_sign",
            ()-> new SignItem(new Item.Properties().stacksTo(16),
                    MapleSignBlocks.GINKGO_SIGN.get(),MapleSignBlocks.GINKGO_WALL_SIGN.get()));


    public static final RegistryObject<Item> CHERRY_DOOR = registerItem("cherry_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.CHERRY_DOOR.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MAPLE_DOOR = registerItem("maple_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.MAPLE_DOOR.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BAMBOO_DOOR = registerItem("bamboo_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.BAMBOO_DOOR.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GINKGO_DOOR = registerItem("ginkgo_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.GINKGO_DOOR.get(), new Item.Properties().stacksTo(16)));


    //Food Materials
    public static final RegistryObject<Item> Flour = registerItem("flour",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MapleSyrup = registerItem("maple_syrup",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Cream = registerItem("cream",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MILK_BOTTOM = registerItem("milk_bottom",
            ()-> new MilkBucketItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SOYBEAN = registerItem("soybean",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Salt = registerItem("salt",
            ()-> new Item(new Item.Properties()));

/*
    //Boat
    public static final Item CHERRY_BOAT = registerItem("cherry_boat", (new BoatItem(false, MapleBoatType.CHERRY, (new Item.Properties()).stacksTo(1).group(Maple.Maple_Group))));
    public static final Item MAPLE_BOAT = registerItem("maple_boat", (new BoatItem(false, MapleBoatType.MAPLE, (new Item.Properties()).stacksTo(1).group(Maple.Maple_Group))));
    public static final Item BAMBOO_BOAT = registerItem("bamboo_boat", (new BoatItem(false, MapleBoatType.BAMBOO, (new Item.Properties()).stacksTo(1))));
    public static final Item GINKGO_BOAT = registerItem("ginkgo_boat", (new BoatItem(false, MapleBoatType.GINKGO, (new Item.Properties()).stacksTo(1))));

    public static final Item CHERRY_CHEST_BOAT = registerItem("cherry_chest_boat", (new BoatItem(true, MapleBoatType.CHERRY, (new Item.Properties()).stacksTo(1).group(Maple.Maple_Group))));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat", (new BoatItem(true, MapleBoatType.MAPLE, (new Item.Properties()).stacksTo(1).group(Maple.Maple_Group))));
    public static final Item BAMBOO_CHEST_BOAT = registerItem("bamboo_chest_boat", (new BoatItem(true, MapleBoatType.BAMBOO, (new Item.Properties()).stacksTo(1))));
    public static final Item GINKGO_CHEST_BOAT = registerItem("ginkgo_chest_boat", (new BoatItem(true, MapleBoatType.GINKGO, (new Item.Properties()).stacksTo(1))));
*/


    //Snowball
    public static final RegistryObject<Item> SNOWBALL_STONE = registerItem("snowball_stone",
            ()->new StoneSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_ICE = registerItem("snowball_ice",
            ()->new IceSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_IRON = registerItem("snowball_iron",
            ()->new IronSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_Gold = registerItem("snowball_gold",
            ()->new GoldSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_Diamond = registerItem("snowball_diamond",
            ()->new DiamondSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_Compression = registerItem("snowball_compression",
            ()->new StoneSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_Teleporting = registerItem("snowball_teleporting",
            ()->new TeleportingSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_Confusion = registerItem("snowball_confusion",
            ()->new ConfusionSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_Poison = registerItem("snowball_poison",
            ()->new PoisonSnowballItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> SNOWBALL_Instant_Health = registerItem("snowball_instant_health",
            ()->new InstantHealthSnowballItem(new Item.Properties().stacksTo(64)));



    //Tools
    public static final RegistryObject<Item> Food_Press = registerItem("food_press",
            ()-> new Item(new Item.Properties()));


    //Seed
    public static final RegistryObject<Item> Rice = registerItem("rice",
            ()-> new ItemNameBlockItem(MapleBlocks.RICE.get(), (new Item.Properties())));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}