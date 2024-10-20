package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.entity.custom.MapleBoatEntity;
import com.skniro.maple.item.init.MapleBoatItem;
import com.skniro.maple.item.init.snowball.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Maple.MODID);

    public static final Supplier<Item> CHERRY_SIGN = registerItem("cherry_sign",
            ()-> new SignItem(new Item.Properties().stacksTo(16),
                    MapleSignBlocks.CHERRY_SIGN.get(), MapleSignBlocks.CHERRY_WALL_SIGN.get()));
    public static final Supplier<Item> MAPLE_SIGN = registerItem("maple_sign",
            ()-> new SignItem(new Item.Properties().stacksTo(16),
                    MapleSignBlocks.Maple_SIGN.get(),MapleSignBlocks.Maple_WALL_SIGN.get()));
    public static final Supplier<Item> BAMBOO_SIGN = registerItem("bamboo_sign",
            ()-> new SignItem(new Item.Properties().stacksTo(16),
                    MapleSignBlocks.BAMBOO_SIGN.get(),MapleSignBlocks.BAMBOO_WALL_SIGN.get()));
    public static final Supplier<Item> GINKGO_SIGN = registerItem("ginkgo_sign",
            ()-> new SignItem(new Item.Properties().stacksTo(16),
                    MapleSignBlocks.GINKGO_SIGN.get(),MapleSignBlocks.GINKGO_WALL_SIGN.get()));
    public static final Supplier<Item> GINKGO_HANGING_SIGN = registerItem("ginkgo_hanging_sign",
            ()-> new HangingSignItem(MapleSignBlocks.GINKGO_HANGING_SIGN.get(), MapleSignBlocks.GINKGO_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final Supplier<Item> Maple_HANGING_SIGN = registerItem("maple_hanging_sign",
            ()-> new HangingSignItem(MapleSignBlocks.Maple_HANGING_SIGN.get(), MapleSignBlocks.Maple_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));


    public static final Supplier<Item> CHERRY_DOOR = registerItem("cherry_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.CHERRY_DOOR.get(), new Item.Properties().stacksTo(16)));
    public static final Supplier<Item> MAPLE_DOOR = registerItem("maple_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.MAPLE_DOOR.get(), new Item.Properties().stacksTo(16)));
    public static final Supplier<Item> BAMBOO_DOOR = registerItem("bamboo_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.BAMBOO_DOOR.get(), new Item.Properties().stacksTo(16)));
    public static final Supplier<Item> GINKGO_DOOR = registerItem("ginkgo_door",
            ()-> new DoubleHighBlockItem(MapleBlocks.GINKGO_DOOR.get(), new Item.Properties().stacksTo(16)));


    //Food Materials
    public static final Supplier<Item> Flour = registerItem("flour",
            ()-> new Item(new Item.Properties()));
    public static final Supplier<Item> MapleSyrup = registerItem("maple_syrup",
            ()-> new Item(new Item.Properties()));
    public static final Supplier<Item> Cream = registerItem("cream",
            ()-> new Item(new Item.Properties()));
    public static final Supplier<Item> MILK_BOTTOM = registerItem("milk_bottom",
            ()-> new MilkBucketItem(new Item.Properties().stacksTo(16)));
    public static final Supplier<Item> SOYBEAN = registerItem("soybean",
            ()-> new Item(new Item.Properties()));
    public static final Supplier<Item> Salt = registerItem("salt",
            ()-> new Item(new Item.Properties()));

    public static final Supplier<Item> MAPLE_BOAT = registerItem("maple_boat",
            ()->(new MapleBoatItem(false, MapleBoatEntity.Type.MAPLE, (new Item.Properties()).stacksTo(1))));
    public static final Supplier<Item> GINKGO_BOAT = registerItem("ginkgo_boat",
            ()->(new MapleBoatItem(false, MapleBoatEntity.Type.GINKGO, (new Item.Properties()).stacksTo(1))));

    public static final Supplier<Item> MAPLE_CHEST_BOAT = registerItem("maple_chest_boat",
            ()->(new MapleBoatItem(true, MapleBoatEntity.Type.MAPLE, (new Item.Properties()).stacksTo(1))));
    public static final Supplier<Item> GINKGO_CHEST_BOAT = registerItem("ginkgo_chest_boat",
            ()->(new MapleBoatItem(true, MapleBoatEntity.Type.GINKGO, (new Item.Properties()).stacksTo(1))));


    //Snowball
    public static final Supplier<Item> SNOWBALL_STONE = registerItem("snowball_stone",
            ()->new StoneSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_ICE = registerItem("snowball_ice",
            ()->new IceSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_IRON = registerItem("snowball_iron",
            ()->new IronSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Gold = registerItem("snowball_gold",
            ()->new GoldSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Diamond = registerItem("snowball_diamond",
            ()->new DiamondSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Compression = registerItem("snowball_compression",
            ()->new StoneSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Teleporting = registerItem("snowball_teleporting",
            ()->new TeleportingSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Confusion = registerItem("snowball_confusion",
            ()->new ConfusionSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Poison = registerItem("snowball_poison",
            ()->new PoisonSnowballItem(new Item.Properties().stacksTo(64)));
    public static final Supplier<Item> SNOWBALL_Instant_Health = registerItem("snowball_instant_health",
            ()->new InstantHealthSnowballItem(new Item.Properties().stacksTo(64)));



    //Tools
    public static final Supplier<Item> Food_Press = registerItem("food_press",
            ()-> new Item(new Item.Properties()));


    //Seed
    public static final Supplier<Item> Rice = registerItem("rice",
            ()-> new ItemNameBlockItem(MapleBlocks.RICE.get(), (new Item.Properties())));

    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}