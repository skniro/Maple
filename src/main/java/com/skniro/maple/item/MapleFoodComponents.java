package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

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
                                    ));

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
                                    ));
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
                                    ));

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
                                    ));

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
                                    ));

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
                                    ));

    public static final Item RICEBALL =
            registerItem("riceball",
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
                                    ));

    public static final Item Mushroom_RICEBALL =
            registerItem("mushroom_riceball",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(4)
                                                    .saturationModifier(0.3f)
                                                    .build()
                                            )
                                    ));

    public static final Item Salmon_RICEBALL =
            registerItem("salmon_riceball",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(4)
                                                    .saturationModifier(0.3f)
                                                    .build()
                                            )
                                    ));

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
                                    ));

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
                                    ));

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
                                    ));

    public static final Item Chicken_Rice =
            registerItem("chicken_rice",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(9)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));

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
                                    ));

    public static final Item Mutton_Rice =
            registerItem("mutton_rice",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(9)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));

    public static final Item Porkchop_Rice =
            registerItem("porkchop_rice",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(9)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));

    public static final Item Mushroom_Rice =
            registerItem("mushroom_rice",
                    new Item(
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .hunger(9)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));

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
                                    ));




    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Maple.MOD_ID, name),item);
    }
    public static void registerMapleFoodItems() {
        Maple.LOGGER.info("Registering Maple Food Items for " + Maple.MOD_ID);
    }
}
