package com.skniro.maple.item;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class FoodComponents {


    public static final Item SPEED_APPLE = new Item
            (new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,6000,2),1.0F)
                                    .build()
                            )
            );

    public static final Item HEALTH_BOOST_APPLE = new Item
            (new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,3000,1),1.0F)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,300,2),1.0F)
                                    .build()
                            )
            );

    public static final Item FIRE_RESISTANCE_APPLE = new Item
            (new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,6000,2),1.0F)
                                    .build()
                            )
            );

    public static final Item HERO_VILLAGE_APPLE = new Item
            (new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,6000,2),1.0F)
                                    .build()
                            )
            );

    public static final Item STRENGTH_APPLE = new Item
            (new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,6000,2),1.0F)
                                    .build()
                            )
            );

    public static final Item NIGHT_VISION_APPLE = new Item
            (new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,6000,2),1.0F)
                                    .build()
                            )
            );

    public static final Item JUMP_BOOST_APPLE  = new Item
            (new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST ,6000,1),1.0F)
                                    .build()
                            )
            );
    public static final Item SUPER_APPLE =
            new EnchantedGoldenAppleItem(
                    (
                    new Item.Settings()
                            .rarity(Rarity.EPIC)
                            .food(
                                    new FoodComponent.Builder()
                                            .hunger(8)
                                            .saturationModifier(0.6f)
                                            .alwaysEdible()
                                            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,12000,2),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,12000,2),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,12000,2),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,1200,2),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000,2),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,12000,1),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,12000,2),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,12000,2),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,6000,2),1.0F)
                                            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,1200,2),1.0F)
                                            .build()
                            )
                    )
            );

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name),item);
    }
}
