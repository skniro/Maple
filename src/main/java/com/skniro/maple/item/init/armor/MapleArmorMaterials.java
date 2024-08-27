package com.skniro.maple.item.init.armor;

import com.skniro.maple.Maple;
import com.skniro.maple.item.MapleArmorItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum MapleArmorMaterials implements ArmorMaterial {
            Cherry("cherry", 25, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (p_266655_) -> {
                p_266655_.put(ArmorItem.Type.BOOTS, 3);
                p_266655_.put(ArmorItem.Type.LEGGINGS, 8);
                p_266655_.put(ArmorItem.Type.CHESTPLATE, 8);
                p_266655_.put(ArmorItem.Type.HELMET, 3);
            }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> {
                return Ingredient.of(new ItemLike[]{MapleArmorItems.Cherry_INGOT.get()});
            });

        private final String name;
        private final int durabilityMultiplier;
        private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
        private final int enchantability;
        private final SoundEvent equipSound;
        private final float toughness;
        private final float knockbackResistance;
        private final LazyLoadedValue<Ingredient> repairIngredient;

        private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (p_266653_) -> {
           p_266653_.put(ArmorItem.Type.BOOTS, 13);
           p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
          p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
           p_266653_.put(ArmorItem.Type.HELMET, 11);
        });
        MapleArmorMaterials(String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound,
                          float toughness, float knockbackResistance, Supplier repairIngredient) {
            this.name = name;
            this.durabilityMultiplier = durabilityMultiplier;
            this.protectionAmounts = protectionAmounts;
            this.enchantability = enchantability;
            this.equipSound = equipSound;
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
            this.repairIngredient = new LazyLoadedValue(repairIngredient);
        }

        @Override
        public int getDurabilityForType(ArmorItem.Type slot) {
            return HEALTH_FUNCTION_FOR_TYPE.get(slot) * this.durabilityMultiplier;
        }

        public int getDefenseForType(ArmorItem.Type slot) {
            return this.protectionAmounts.get(slot);
        }

        @Override
        public int getEnchantmentValue() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return this.equipSound;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return this.repairIngredient.get();
        }

        @Override
        public String getName() {
            return Maple.MODID + ":" + this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }
    }

