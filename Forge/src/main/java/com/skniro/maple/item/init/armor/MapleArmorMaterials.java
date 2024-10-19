package com.skniro.maple.item.init.armor;

import com.skniro.maple.Maple;
import com.skniro.maple.item.MapleArmorItems;
import net.minecraft.Util;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
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
import java.util.List;
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

    public static final int Ruby_DURABILITY_MULTIPLIER = 37;

    private static RegistryAccess.RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        List<Layer> list = List.of(new ArmorMaterial.Layer(ResourceLocation.ofVanilla(id)));
        return register(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }

    private static RegistryAccess.RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap(ArmorItem.Type.class);
        ArmorItem.Type[] var9 = ArmorItem.Type.values();
        int var10 = var9.length;

        for(int var11 = 0; var11 < var10; ++var11) {
            ArmorItem.Type type = var9[var11];
            enumMap.put(type, (Integer)defense.get(type));
        }

        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.ofVanilla(id), new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }
}
