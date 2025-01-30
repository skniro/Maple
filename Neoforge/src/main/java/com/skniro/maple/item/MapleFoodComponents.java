package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.init.food.ItemBottle;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleFoodComponents {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, Maple.MODID);
    public static final Supplier<Item> Sanshoku_Dango =
            registerItem("sanshoku_dango",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> Anko_Dango =
            registerItem("anko_dango",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));
    public static final Supplier<Item> Kinako_Dango =
            registerItem("kinako_dango",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> Zunda_Dango =
            registerItem("zunda_dango",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> Mochi =
            registerItem("mochi",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> SakuraMochi =
            registerItem("sakura_mochi",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> TOFU =
            registerItem("tofu",
                    ()->  new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(1)
                                                    .saturationModifier(0.1f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> MILK_ICECREAM =
            registerItem("milk_icecream",
                    ()->  new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(1)
                                                    .saturationModifier(0.1f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> Cooked_Rice =
            registerItem("cooked_rice",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(2)
                                                    .saturationModifier(0.2f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> Beef_Rice =
            registerItem("beef_rice",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(11)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> Cheese =
            registerItem("cheese",
                    ()-> new Item(
                            new Item
                                    .Properties()
                                    .food
                                            (new FoodProperties
                                                    .Builder()
                                                    .nutrition(3)
                                                    .saturationModifier(0.3f)
                                                    .build()
                                            )
                                    ));

    public static final Supplier<Item> MILK_BOTTOM = registerItem("milk_bottom",
            ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .stacksTo(16)
            ));

    public static final Supplier<Item> MelonJuice = registerItem("melon_juice",
            ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .craftRemainder(Items.GLASS_BOTTLE)
                            .stacksTo(1)
            ));

    public static final Supplier<Item> AppleJuice = registerItem("apple_juice",
            ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .craftRemainder(Items.GLASS_BOTTLE)
                            .stacksTo(1)
            ));

    public static final Supplier<Item> CarrotJuice = registerItem("carrot_juice",
            ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible()
                                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                            .build()
                                    )
                            .craftRemainder(Items.GLASS_BOTTLE)
                            .stacksTo(1)
            ));

    public static final Supplier<Item> Sweet_Berries_Juice = registerItem("sweet_berries_juice",
            ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .craftRemainder(Items.GLASS_BOTTLE)
                            .stacksTo(1)
            ));

    public static final Supplier<Item> Glow_Berries_Juice = registerItem("glow_berries_juice",
            ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .craftRemainder(Items.GLASS_BOTTLE)
                            .stacksTo(1)
            ));

    public static final Supplier<Item> Chorus_Juice = registerItem("chorus_juice",
            ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .craftRemainder(Items.GLASS_BOTTLE)
                            .stacksTo(1)
            ));

    public static final Supplier<Item> Green_Tea_Leaves = registerItem("green_tea_leaves",
            ()-> new ItemNameBlockItem(MapleBlocks.Tea_Block.get(),
                    new Item
                            .Properties() .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(1)
                                            .saturationModifier(0.1f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .stacksTo(64)
            ));

    public static final Supplier<Item> Red_Tea_Leaves = registerItem("red_tea_leaves",
            ()-> new Item(
                    new Item
                            .Properties() .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(1)
                                            .saturationModifier(0.1f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .stacksTo(64)
            ));

    public static final Supplier<Item> Red_Tea = registerItem("red_tea",
            ()-> new Item(
                    new Item
                            .Properties() .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(4)
                                            .saturationModifier(0.4f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .stacksTo(1)
            ));

    public static final Supplier<Item> Green_Tea = registerItem("green_tea",
            ()-> new Item(
                    new Item
                            .Properties() .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(4)
                                            .saturationModifier(0.4f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .stacksTo(1)
            ));



    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModFoodItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
