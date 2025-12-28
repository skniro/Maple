package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.entity.MapleEntityType;
import com.skniro.maple.item.init.MapleBlockItem;
import com.skniro.maple.item.init.sign.MapleDoubleHighBlockItem;
import com.skniro.maple.item.init.sign.MapleHangingSignItem;
import com.skniro.maple.item.init.sign.MapleSignItem;
import com.skniro.maple.item.init.snowball.BetterSnowballSnowballItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
public class MapleItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Maple.MOD_ID);

    public static final Supplier<Item> CHERRY_SIGN = registerItem("cherry_sign",
            (properties)-> new MapleSignItem(MapleSignBlocks.CHERRY_SIGN, MapleSignBlocks.CHERRY_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Supplier<Item> MAPLE_SIGN = registerItem("maple_sign",
            (properties)-> new MapleSignItem(MapleSignBlocks.Maple_SIGN,MapleSignBlocks.Maple_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Supplier<Item> BAMBOO_SIGN = registerItem("bamboo_sign",
            (properties)-> new MapleSignItem(MapleSignBlocks.BAMBOO_SIGN,MapleSignBlocks.BAMBOO_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Supplier<Item> GINKGO_SIGN = registerItem("ginkgo_sign",
            (properties)-> new MapleSignItem(MapleSignBlocks.GINKGO_SIGN,MapleSignBlocks.GINKGO_WALL_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Supplier<Item> GINKGO_HANGING_SIGN = registerItem("ginkgo_hanging_sign",
            (properties)-> new MapleHangingSignItem(MapleSignBlocks.GINKGO_HANGING_SIGN, MapleSignBlocks.GINKGO_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));
    public static final Supplier<Item> Maple_HANGING_SIGN = registerItem("maple_hanging_sign",
            (properties)-> new MapleHangingSignItem(MapleSignBlocks.Maple_HANGING_SIGN, MapleSignBlocks.Maple_WALL_HANGING_SIGN, properties), new Item.Properties().stacksTo(16));

    public static final Supplier<Item> CHERRY_DOOR = registerItem("cherry_door",
            (properties)-> new MapleDoubleHighBlockItem(MapleBlocks.CHERRY_DOOR, properties), new Item.Properties().stacksTo(16));
    public static final Supplier<Item> MAPLE_DOOR = registerItem("maple_door",
            (properties)-> new MapleDoubleHighBlockItem(MapleBlocks.MAPLE_DOOR, properties), new Item.Properties().stacksTo(16));
    public static final Supplier<Item> BAMBOO_DOOR = registerItem("bamboo_door",
            (properties)-> new MapleDoubleHighBlockItem(MapleBlocks.BAMBOO_DOOR, properties), new Item.Properties().stacksTo(16));
    public static final Supplier<Item> GINKGO_DOOR = registerItem("ginkgo_door",
            (properties)-> new MapleDoubleHighBlockItem(MapleBlocks.GINKGO_DOOR, properties), new Item.Properties().stacksTo(16));


    //Food Materials
    public static final Supplier<Item> Flour = registerItem("flour",
            Item::new, (new Item.Properties()));
    public static final Supplier<Item> MapleSyrup = registerItem("maple_syrup",
            Item::new, (new Item.Properties()));
    public static final Supplier<Item> Cream = registerItem("cream",
            Item::new, (new Item.Properties()));
    public static final Supplier<Item> SOYBEAN = registerItem("soybean",
            Item::new, (new Item.Properties()));
    public static final Supplier<Item> Salt = registerItem("salt",
            Item::new, (new Item.Properties()));


    //Boat
    public static final Supplier<Item> MAPLE_BOAT = registerItem("maple_boat",
            (properties)->(new BoatItem(MapleEntityType.Maple_BOAT.get(), properties)), (new Item.Properties()).stacksTo(1));
    public static final Supplier<Item> GINKGO_BOAT = registerItem("ginkgo_boat",
            (properties)->(new BoatItem(MapleEntityType.GINKGO_BOAT.get(), properties)), (new Item.Properties()).stacksTo(1));

    public static final Supplier<Item> MAPLE_CHEST_BOAT = registerItem("maple_chest_boat",
            (properties)->(new BoatItem(MapleEntityType.Maple_CHEST_BOAT.get(), properties)), (new Item.Properties()).stacksTo(1));
    public static final Supplier<Item> GINKGO_CHEST_BOAT = registerItem("ginkgo_chest_boat",
            (properties)->(new BoatItem(MapleEntityType.GINKGO_CHEST_BOAT.get(), properties)), (new Item.Properties()).stacksTo(1));



    //Snowball
    public static final Supplier<Item> SNOWBALL_STONE = registerItem("snowball_stone",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_ICE = registerItem("snowball_ice",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_IRON = registerItem("snowball_iron",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_Gold = registerItem("snowball_gold",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_Diamond = registerItem("snowball_diamond",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_Compression = registerItem("snowball_compression",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_Teleporting = registerItem("snowball_teleporting",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_Confusion = registerItem("snowball_confusion",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_Poison = registerItem("snowball_poison",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Supplier<Item> SNOWBALL_Instant_Health = registerItem("snowball_instant_health",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));



    //Seed
    public static final Supplier<Item> Rice = registerItem("rice",
            createBlockItemWithUniqueName(MapleBlocks.RICE), (new Item.Properties()));

    private static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        DeferredItem<T> toReturn = ITEMS.registerItem(name, item, ()-> properties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return toReturn;
    }

    private static Function<Item.Properties, Item> createBlockItemWithUniqueName(Supplier<Block> block) {
        return (properties) -> {
            return new MapleBlockItem(block, properties.useItemDescriptionPrefix());
        };
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}