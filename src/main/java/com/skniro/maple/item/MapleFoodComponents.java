package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleFoodComponents {
    public static final Item Sanshoku_Dango =
            registerItem("sanshoku_dango",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item Anko_Dango =
            registerItem("anko_dango",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));
    public static final Item Kinako_Dango =
            registerItem("kinako_dango",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item Zunda_Dango =
            registerItem("zunda_dango",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item Mochi =
            registerItem("mochi",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item SakuraMochi =
            registerItem("sakura_mochi",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item TOFU =
            registerItem("tofu",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(1)
                                                    .saturationModifier(0.1f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item MILK_ICECREAM =
            registerItem("milk_icecream",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(1)
                                                    .saturationModifier(0.1f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item Cooked_Rice =
            registerItem("cooked_rice",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(2)
                                                    .saturationModifier(0.2f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item Beef_Rice =
            registerItem("beef_rice",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(11)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));

    public static final Item Cheese =
            registerItem("cheese",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(3)
                                                    .saturationModifier(0.3f)
                                                    .build()
                                            )
                                    .group(Maple.Maple_Group_Food)));




    private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name),item);
    }
    public static void registerMapleFoodItems() {
        Maple.LOGGER.info("Registering Maple Food Items for " + Maple.MOD_ID);
    }
}
