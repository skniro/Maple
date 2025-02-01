package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.init.food.ItemBottle;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.item.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.level.block.Block;
import java.util.function.Function;

public class MapleFoodComponents {
    public static final Item Sanshoku_Dango =
            registerItem("sanshoku_dango", Item::new,
                    (
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

    public static final Item Anko_Dango =
            registerItem("anko_dango", Item::new,
                    (
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
    public static final Item Kinako_Dango =
            registerItem("kinako_dango", Item::new,
                    (
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

    public static final Item Zunda_Dango =
            registerItem("zunda_dango", Item::new,
                    (
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

    public static final Item Mochi =
            registerItem("mochi", Item::new,
                    (
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

    public static final Item SakuraMochi =
            registerItem("sakura_mochi", Item::new,
                    (
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

    public static final Item TOFU =
            registerItem("tofu", Item::new,
                    (
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

    public static final Item MILK_ICECREAM =
            registerItem("milk_icecream", Item::new,
                    (
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

    public static final Item Cooked_Rice =
            registerItem("cooked_rice", Item::new,
                    (
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

    public static final Item Beef_Rice =
            registerItem("beef_rice", Item::new,
                    (
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

    public static final Item Cheese =
            registerItem("cheese", Item::new,
                    (
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

    public static final Item MILK_BOTTOM = registerItem("milk_bottom",ItemBottle::new,
            (
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

    public static final Item MelonJuice = registerItem("melon_juice", ItemBottle::new,
            (
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

    public static final Item AppleJuice = registerItem("apple_juice", ItemBottle::new,
            (
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

    public static final Item CarrotJuice = registerItem("carrot_juice", ItemBottle::new,
            (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                            .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                            )
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));

    public static final Item Sweet_Berries_Juice = registerItem("sweet_berries_juice", ItemBottle::new,
            (
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

    public static final Item Glow_Berries_Juice = registerItem("glow_berries_juice", ItemBottle::new,
            (
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

    public static final Item Chorus_Juice = registerItem("chorus_juice", ItemBottle::new,
            (
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

    public static final Item Green_Tea_Leaves = registerItem("green_tea_leaves",
            createBlockItemWithUniqueName(MapleBlocks.Tea_Block),
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
            );

    public static final Item Red_Tea_Leaves = registerItem("red_tea_leaves", Item::new,
            (
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

    public static final Item Red_Tea = registerItem("red_tea", Item::new,
            (
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

    public static final Item Green_Tea = registerItem("green_tea", Item::new,
            (
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




    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {
        Item item = factory.apply(settings.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)), item);
    }

    private static Function<Item.Properties, Item> createBlockItemWithUniqueName(Block block) {
        return (settings) -> {
            return new BlockItem(block, settings.useItemDescriptionPrefix());
        };
    }


    public static void registerMapleFoodItems() {
        Maple.LOGGER.info("Registering Maple Food Items for " + Maple.MOD_ID);
    }
}
