package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.init.food.ItemBottle;
import net.minecraft.core.registries.Registries;
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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MapleFoodComponents {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Maple.MOD_ID);
    public static final RegistryObject<Item> Sanshoku_Dango =
            registerItem("sanshoku_dango",
                    Item::new, (
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

    public static final RegistryObject<Item> Anko_Dango =
            registerItem("anko_dango",
                    Item::new, (
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
    public static final RegistryObject<Item> Kinako_Dango =
            registerItem("kinako_dango",
                    Item::new, (
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

    public static final RegistryObject<Item> Zunda_Dango =
            registerItem("zunda_dango",
                    Item::new, (
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

    public static final RegistryObject<Item> Mochi =
            registerItem("mochi",
                    Item::new, (
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

    public static final RegistryObject<Item> SakuraMochi =
            registerItem("sakura_mochi",
                    Item::new, (
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

    public static final RegistryObject<Item> TOFU =
            registerItem("tofu",
                    Item::new, (
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

    public static final RegistryObject<Item> MILK_ICECREAM =
            registerItem("milk_icecream",
                    Item::new, (
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

    public static final RegistryObject<Item> Cooked_Rice =
            registerItem("cooked_rice",
                    Item::new, (
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

    public static final RegistryObject<Item> Beef_Rice =
            registerItem("beef_rice",
                    Item::new, (
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

    public static final RegistryObject<Item> Cheese =
            registerItem("cheese",
                    Item::new, (
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
    public static final RegistryObject<Item> MILK_BOTTOM = registerItem("milk_bottom",
            ItemBottle::new, (
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

    public static final RegistryObject<Item> MelonJuice = registerItem("melon_juice",
            ItemBottle::new, (
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

    public static final RegistryObject<Item> AppleJuice = registerItem("apple_juice",
            ItemBottle::new, (
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

    public static final RegistryObject<Item> CarrotJuice = registerItem("carrot_juice",
            ItemBottle::new, (
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible().build()
                                            , Consumables.defaultFood()
                                                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                                    )
                                                    .build()
                                    )
                            .craftRemainder(Items.GLASS_BOTTLE)
                            .stacksTo(1)
            ));

    public static final RegistryObject<Item> Sweet_Berries_Juice = registerItem("sweet_berries_juice",
            ItemBottle::new, (
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

    public static final RegistryObject<Item> Glow_Berries_Juice = registerItem("glow_berries_juice",
            ItemBottle::new, (
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

    public static final RegistryObject<Item> Chorus_Juice = registerItem("chorus_juice",
            ItemBottle::new, (
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

    public static final RegistryObject<Item> Green_Tea_Leaves = registerItem("green_tea_leaves",
            createBlockItemWithUniqueName(MapleBlocks.Tea_Block.get()),
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

    public static final RegistryObject<Item> Red_Tea_Leaves = registerItem("red_tea_leaves",
            Item::new, (
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

    public static final RegistryObject<Item> Red_Tea = registerItem("red_tea",
            Item::new, (
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

    public static final RegistryObject<Item> Green_Tea = registerItem("green_tea",
            Item::new, (
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



    public static <B extends Item> RegistryObject<Item> register(String name, Function<Item.Properties, ? extends B> func, Item.Properties props) {
        return ITEMS.register(name, () -> {
            return (Item)func.apply(props.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <T extends Item> RegistryObject<Item> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        RegistryObject<Item> toReturn = register(name, item, properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return toReturn;
    }

    private static Function<Item.Properties, Item> createBlockItemWithUniqueName(Block block) {
        return (properties) -> {
            return new BlockItem(block, properties.useItemDescriptionPrefix());
        };
    }

    public static void registerModFoodItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
