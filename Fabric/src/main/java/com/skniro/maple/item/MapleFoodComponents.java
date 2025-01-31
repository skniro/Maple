package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.init.food.ItemBottle;
import net.minecraft.block.Block;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MapleFoodComponents {
    public static final Item Sanshoku_Dango =
            registerItem("sanshoku_dango", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Item Anko_Dango =
            registerItem("anko_dango", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));
    public static final Item Kinako_Dango =
            registerItem("kinako_dango", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Item Zunda_Dango =
            registerItem("zunda_dango", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Item Mochi =
            registerItem("mochi", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Item SakuraMochi =
            registerItem("sakura_mochi", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(6)
                                                    .saturationModifier(0.6f)
                                                    .build()
                                            )
                                    ));

    public static final Item TOFU =
            registerItem("tofu", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(1)
                                                    .saturationModifier(0.1f)
                                                    .build()
                                            )
                                    ));

    public static final Item MILK_ICECREAM =
            registerItem("milk_icecream", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(1)
                                                    .saturationModifier(0.1f)
                                                    .build()
                                            )
                                    ));

    public static final Item Cooked_Rice =
            registerItem("cooked_rice", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(2)
                                                    .saturationModifier(0.2f)
                                                    .build()
                                            )
                                    ));

    public static final Item Beef_Rice =
            registerItem("beef_rice", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(11)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));

    public static final Item Cheese =
            registerItem("cheese", Item::new,
                    (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(3)
                                                    .saturationModifier(0.3f)
                                                    .build()
                                            )
                                    ));

    public static final Item MILK_BOTTOM = registerItem("milk_bottom",ItemBottle::new,
            (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                            )
                    .maxCount(16)
    ));

    public static final Item MelonJuice = registerItem("melon_juice", ItemBottle::new,
            (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item AppleJuice = registerItem("apple_juice", ItemBottle::new,
            (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item CarrotJuice = registerItem("carrot_juice", ItemBottle::new,
            (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                            .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item Sweet_Berries_Juice = registerItem("sweet_berries_juice", ItemBottle::new,
            (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item Glow_Berries_Juice = registerItem("glow_berries_juice", ItemBottle::new,
            (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item Chorus_Juice = registerItem("chorus_juice", ItemBottle::new,
            (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item Green_Tea_Leaves = registerItem("green_tea_leaves",
            createBlockItemWithUniqueName(MapleBlocks.Tea_Block),
                    new Item
                            .Settings() .food
                                    (new FoodComponent
                                            .Builder()
                                            .nutrition(1)
                                            .saturationModifier(0.1f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .maxCount(64)
            );

    public static final Item Red_Tea_Leaves = registerItem("red_tea_leaves", Item::new,
            (
                    new Item
                            .Settings() .food
                                    (new FoodComponent
                                            .Builder()
                                            .nutrition(1)
                                            .saturationModifier(0.1f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .maxCount(64)
            ));

    public static final Item Red_Tea = registerItem("red_tea", Item::new,
            (
                    new Item
                            .Settings() .food
                                    (new FoodComponent
                                            .Builder()
                                            .nutrition(4)
                                            .saturationModifier(0.4f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .maxCount(1)
            ));

    public static final Item Green_Tea = registerItem("green_tea", Item::new,
            (
                    new Item
                            .Settings() .food
                                    (new FoodComponent
                                            .Builder()
                                            .nutrition(4)
                                            .saturationModifier(0.4f)
                                            .alwaysEdible()
                                            .build()
                                    )
                            .maxCount(1)
            ));

       /* public static final Item Mutton_Rice =
            registerItem("mutton_rice", Item::new,
            (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(9)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));


    public static final Item Chicken_Rice =
            registerItem("chicken_rice", Item::new,
            (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(9)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                    ));

    public static final Item Porkchop_Rice =
            registerItem("porkchop_rice", Item::new,
            (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(9)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));

    public static final Item Mushroom_Rice =
            registerItem("mushroom_rice", Item::new,
            (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(9)
                                                    .saturationModifier(0.7f)
                                                    .build()
                                            )
                                    ));

     public static final Item RICEBALL =
            registerItem("riceball", Item::new,
            (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(3)
                                                    .saturationModifier(0.3f)
                                                    .build()
                                            )
                                    ));

    public static final Item Mushroom_RICEBALL =
            registerItem("mushroom_riceball", Item::new,
            (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(4)
                                                    .saturationModifier(0.3f)
                                                    .build()
                                            )
                                    ));

    public static final Item Salmon_RICEBALL =
            registerItem("salmon_riceball", Item::new,
            (
                            new Item
                                    .Settings()
                                    .food
                                            (new FoodComponent
                                                    .Builder()
                                                    .nutrition(4)
                                                    .saturationModifier(0.3f)
                                                    .build()
                                            )
                                    ));*/




    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name))));
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name)), item);
    }

    private static Function<Item.Settings, Item> createBlockItemWithUniqueName(Block block) {
        return (settings) -> {
            return new BlockItem(block, settings.useItemPrefixedTranslationKey());
        };
    }


    public static void registerMapleFoodItems() {
        Maple.LOGGER.info("Registering Maple Food Items for " + Maple.MOD_ID);
    }
}
