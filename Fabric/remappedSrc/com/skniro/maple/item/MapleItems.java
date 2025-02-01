package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.entity.MapleBoatType;
import com.skniro.maple.entity.MapleEntityType;
import com.skniro.maple.item.init.snowball.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.item.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import java.util.function.Function;

public class MapleItems {
    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            (settings)-> new SignItem(MapleSignBlocks.CHERRY_SIGN, MapleSignBlocks.CHERRY_WALL_SIGN, settings), new Item.Properties().stacksTo(16));
    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            (settings)-> new SignItem(MapleSignBlocks.Maple_SIGN,MapleSignBlocks.Maple_WALL_SIGN, settings), new Item.Properties().stacksTo(16));
    public static final Item BAMBOO_SIGN = registerItem("bamboo_sign",
            (settings)-> new SignItem(MapleSignBlocks.BAMBOO_SIGN,MapleSignBlocks.BAMBOO_WALL_SIGN, settings), new Item.Properties().stacksTo(16));
    public static final Item GINKGO_SIGN = registerItem("ginkgo_sign",
            (settings)-> new SignItem(MapleSignBlocks.GINKGO_SIGN, MapleSignBlocks.GINKGO_WALL_SIGN, settings), new Item.Properties().stacksTo(16));

    public static final Item GINKGO_HANGING_SIGN = registerItem("ginkgo_hanging_sign", (settings)-> new HangingSignItem(
            MapleSignBlocks.GINKGO_HANGING_SIGN, MapleSignBlocks.GINKGO_WALL_HANGING_SIGN, settings), new Item.Properties().stacksTo(16));
    public static final Item Maple_HANGING_SIGN = registerItem("maple_hanging_sign", (settings)->  new HangingSignItem(
            MapleSignBlocks.Maple_HANGING_SIGN, MapleSignBlocks.Maple_WALL_HANGING_SIGN, settings), new Item.Properties().stacksTo(16));

    public static final Item CHERRY_DOOR = registerItem("cherry_door", (settings)-> new DoubleHighBlockItem(MapleBlocks.CHERRY_DOOR, settings),  new Item.Properties().stacksTo(16));
    public static final Item MAPLE_DOOR = registerItem("maple_door", (settings)-> new DoubleHighBlockItem(MapleBlocks.MAPLE_DOOR, settings), new Item.Properties().stacksTo(16));
    public static final Item BAMBOO_DOOR = registerItem("bamboo_door", (settings)-> new DoubleHighBlockItem(MapleBlocks.BAMBOO_DOOR, settings), new Item.Properties().stacksTo(16));
    public static final Item GINKGO_DOOR = registerItem("ginkgo_door", (settings)-> new DoubleHighBlockItem(MapleBlocks.GINKGO_DOOR, settings), new Item.Properties().stacksTo(16));
    //Food Materials
    public static final Item Flour = registerItem("flour", Item::new, (new Item.Properties()));
    public static final Item MapleSyrup = registerItem("maple_syrup", Item::new, (new Item.Properties()));
    public static final Item Cream = registerItem("cream", Item::new, (new Item.Properties()));
    public static final Item SOYBEAN = registerItem("soybean", Item::new, (new Item.Properties()));
    public static final Item Salt = registerItem("salt", Item::new, (new Item.Properties()));

    //Seed
    public static final Item Rice = registerItem("rice", createBlockItemWithUniqueName(MapleBlocks.RICE), (new Item.Properties()));

    //Boat
    public static final Item CHERRY_BOAT = registerItem("cherry_boat", (settings) -> new BoatItem(EntityType.CHERRY_BOAT, settings), new Item.Properties().stacksTo(1));
    public static final Item MAPLE_BOAT = registerItem("maple_boat", (settings) -> new BoatItem(MapleEntityType.Maple_BOAT, settings), new Item.Properties().stacksTo(1));
    public static final Item BAMBOO_BOAT = registerItem("bamboo_boat", (settings) -> new BoatItem(EntityType.BAMBOO_RAFT, settings), new Item.Properties().stacksTo(1));
    public static final Item GINKGO_BOAT = registerItem("ginkgo_boat", (settings) -> new BoatItem(MapleEntityType.GINKGO_BOAT, settings), new Item.Properties().stacksTo(1));

    public static final Item CHERRY_CHEST_BOAT = registerItem("cherry_chest_boat", (settings) -> new BoatItem(EntityType.CHERRY_CHEST_BOAT, settings), new Item.Properties().stacksTo(1));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat", (settings) -> new BoatItem(MapleEntityType.Maple_CHEST_BOAT, settings), new Item.Properties().stacksTo(1));
    public static final Item BAMBOO_CHEST_BOAT = registerItem("bamboo_chest_boat", (settings) -> new BoatItem(EntityType.BAMBOO_CHEST_RAFT, settings), new Item.Properties().stacksTo(1));
    public static final Item GINKGO_CHEST_BOAT = registerItem("ginkgo_chest_boat", (settings) -> new BoatItem(MapleEntityType.GINKGO_CHEST_BOAT, settings), new Item.Properties().stacksTo(1));


    //Snowball
    public static final Item SNOWBALL_STONE = registerItem("snowball_stone", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_ICE = registerItem("snowball_ice", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_IRON = registerItem("snowball_iron", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Gold = registerItem("snowball_gold", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Diamond = registerItem("snowball_diamond",  BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Compression = registerItem("snowball_compression", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Teleporting = registerItem("snowball_teleporting", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Confusion = registerItem("snowball_confusion", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Poison = registerItem("snowball_poison", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final Item SNOWBALL_Instant_Health = registerItem("snowball_instant_health", BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));

    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)), item);
    }

    private static Function<Item.Properties, Item> createBlockItemWithUniqueName(Block block) {
        return (settings) -> {
            return new BlockItem(block, settings.useItemDescriptionPrefix());
        };
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Mod Items for " + Maple.MOD_ID);
    }
}