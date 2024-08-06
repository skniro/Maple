package com.skniro.maple.item.init.armor;

import com.skniro.maple.Maple;
import com.skniro.maple.item.MapleArmorItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public enum MapleArmorMaterials implements ArmorMaterial {
        Cherry("cherry", 25, new int[] { 3, 8, 6, 3 }, 25,
                SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> Ingredient.of(new ItemLike[]{MapleArmorItems.Cherry_INGOT.get()}));

        private final String name;
        private final int durabilityMultiplier;
        private final int[] protectionAmounts;
        private final int enchantability;
        private final SoundEvent equipSound;
        private final float toughness;
        private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

        private static final int[] BASE_DURABILITY = { 13, 16, 16, 13 };

        MapleArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
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
        public int getDurabilityForSlot(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getIndex()] * this.durabilityMultiplier;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlot slot) {
            return this.protectionAmounts[slot.getIndex()];
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

