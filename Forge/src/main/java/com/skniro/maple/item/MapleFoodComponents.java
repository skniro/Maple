package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleFoodComponents {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MODID);
    public static final RegistryObject<Item> Sanshoku_Dango =
            registerItem("sanshoku_dango",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationMod(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> Anko_Dango =
            registerItem("anko_dango",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationMod(0.6f)
                                                    .build()
                                            )
                                    ));
    public static final RegistryObject<Item> Kinako_Dango =
            registerItem("kinako_dango",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationMod(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> Zunda_Dango =
            registerItem("zunda_dango",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationMod(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> Mochi =
            registerItem("mochi",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationMod(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> SakuraMochi =
            registerItem("sakura_mochi",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationMod(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> TOFU =
            registerItem("tofu",
                    ()->  new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(1)
                                                    .saturationMod(0.1f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> MILK_ICECREAM =
            registerItem("milk_icecream",
                    ()->  new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(1)
                                                    .saturationMod(0.1f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> Cooked_Rice =
            registerItem("cooked_rice",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(2)
                                                    .saturationMod(0.2f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> Beef_Rice =
            registerItem("beef_rice",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(11)
                                                    .saturationMod(0.7f)
                                                    .build()
                                            )
                                    ));

    public static final RegistryObject<Item> Cheese =
            registerItem("cheese",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(3)
                                                    .saturationMod(0.3f)
                                                    .build()
                                            )
                                    ));




    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModFoodItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
