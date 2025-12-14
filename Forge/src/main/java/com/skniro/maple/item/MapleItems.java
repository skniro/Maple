package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.entity.MapleEntityType;
import com.skniro.maple.item.init.snowball.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MOD_ID);

    public static final RegistryObject<Item> CHERRY_SIGN = registerItem("cherry_sign",
            (properties)-> new SignItem(MapleSignBlocks.CHERRY_SIGN.get(), MapleSignBlocks.CHERRY_WALL_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistryObject<Item> MAPLE_SIGN = registerItem("maple_sign",
            (properties)-> new SignItem(MapleSignBlocks.Maple_SIGN.get(),MapleSignBlocks.Maple_WALL_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistryObject<Item> BAMBOO_SIGN = registerItem("bamboo_sign",
            (properties)-> new SignItem(MapleSignBlocks.BAMBOO_SIGN.get(),MapleSignBlocks.BAMBOO_WALL_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistryObject<Item> GINKGO_SIGN = registerItem("ginkgo_sign",
            (properties)-> new SignItem(MapleSignBlocks.GINKGO_SIGN.get(),MapleSignBlocks.GINKGO_WALL_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistryObject<Item> GINKGO_HANGING_SIGN = registerItem("ginkgo_hanging_sign",
            (properties)-> new HangingSignItem(MapleSignBlocks.GINKGO_HANGING_SIGN.get(), MapleSignBlocks.GINKGO_WALL_HANGING_SIGN.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistryObject<Item> Maple_HANGING_SIGN = registerItem("maple_hanging_sign",
            (properties)-> new HangingSignItem(MapleSignBlocks.Maple_HANGING_SIGN.get(), MapleSignBlocks.Maple_WALL_HANGING_SIGN.get(), properties), new Item.Properties().stacksTo(16));

    public static final RegistryObject<Item> CHERRY_DOOR = registerItem("cherry_door",
            (properties)-> new DoubleHighBlockItem(MapleBlocks.CHERRY_DOOR.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistryObject<Item> MAPLE_DOOR = registerItem("maple_door",
            (properties)-> new DoubleHighBlockItem(MapleBlocks.MAPLE_DOOR.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistryObject<Item> BAMBOO_DOOR = registerItem("bamboo_door",
            (properties)-> new DoubleHighBlockItem(MapleBlocks.BAMBOO_DOOR.get(), properties), new Item.Properties().stacksTo(16));
    public static final RegistryObject<Item> GINKGO_DOOR = registerItem("ginkgo_door",
            (properties)-> new DoubleHighBlockItem(MapleBlocks.GINKGO_DOOR.get(), properties), new Item.Properties().stacksTo(16));


    //Food Materials
    public static final RegistryObject<Item> Flour = registerItem("flour",
            Item::new, (new Item.Properties()));
    public static final RegistryObject<Item> MapleSyrup = registerItem("maple_syrup",
            Item::new, (new Item.Properties()));
    public static final RegistryObject<Item> Cream = registerItem("cream",
            Item::new, (new Item.Properties()));
    public static final RegistryObject<Item> SOYBEAN = registerItem("soybean",
            Item::new, (new Item.Properties()));
    public static final RegistryObject<Item> Salt = registerItem("salt",
            Item::new, (new Item.Properties()));


    //Boat
    public static final RegistryObject<Item> MAPLE_BOAT = registerItem("maple_boat",
            (properties)->(new BoatItem(MapleEntityType.Maple_BOAT.get(), properties)), (new Item.Properties()).stacksTo(1));
    public static final RegistryObject<Item> GINKGO_BOAT = registerItem("ginkgo_boat",
            (properties)->(new BoatItem(MapleEntityType.GINKGO_BOAT.get(), properties)), (new Item.Properties()).stacksTo(1));

    public static final RegistryObject<Item> MAPLE_CHEST_BOAT = registerItem("maple_chest_boat",
            (properties)->(new BoatItem(MapleEntityType.Maple_CHEST_BOAT.get(), properties)), (new Item.Properties()).stacksTo(1));
    public static final RegistryObject<Item> GINKGO_CHEST_BOAT = registerItem("ginkgo_chest_boat",
            (properties)->(new BoatItem(MapleEntityType.GINKGO_CHEST_BOAT.get(), properties)), (new Item.Properties()).stacksTo(1));



    //Snowball
    public static final RegistryObject<Item> SNOWBALL_STONE = registerItem("snowball_stone",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_ICE = registerItem("snowball_ice",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_IRON = registerItem("snowball_iron",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Gold = registerItem("snowball_gold",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Diamond = registerItem("snowball_diamond",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Compression = registerItem("snowball_compression",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Teleporting = registerItem("snowball_teleporting",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Confusion = registerItem("snowball_confusion",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Poison = registerItem("snowball_poison",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));
    public static final RegistryObject<Item> SNOWBALL_Instant_Health = registerItem("snowball_instant_health",
            BetterSnowballSnowballItem::new, new Item.Properties().stacksTo(64));



    //Seed
    public static final RegistryObject<Item> Rice = registerItem("rice",
            createBlockItemWithUniqueName(MapleBlocks.RICE), (new Item.Properties()));

    public static <B extends Item> RegistryObject<Item> register(String name, Function<Item.Properties, ? extends B> func, Item.Properties props) {
        return ITEMS.register(name, () -> {
            return (Item)func.apply(props.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <T extends Item> RegistryObject<Item> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        RegistryObject<Item> toReturn = register(name, item, properties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return toReturn;
    }

    private static Function<Item.Properties, Item> createBlockItemWithUniqueName(Supplier<Block> block) {
        return (properties) -> {
            return new BlockItem(block.get(), properties.useItemDescriptionPrefix());
        };
    }

    public static void registerModItems(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }
}