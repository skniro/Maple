package com.skniro.maple.item.init.armor;

import com.skniro.maple.Maple;
import com.skniro.maple.item.MapleArmorItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class MapleArmorMaterials {
    public static final Holder<ArmorMaterial> Cherry = register("cherry", Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 8);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.BODY, 11);
    }), 25, SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, () -> Ingredient.of(MapleArmorItems.Cherry_INGOT.get()));

    public static final int Ruby_DURABILITY_MULTIPLIER = 37;
    private static Holder<ArmorMaterial> register(
            String p_334359_,
            EnumMap<ArmorItem.Type, Integer> p_329993_,
            int p_332696_,
            Holder<SoundEvent> p_333975_,
            float p_329381_,
            float p_334853_,
            Supplier<Ingredient> p_333678_
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(Maple.MODID, p_334359_)));
        return register(p_334359_, p_329993_, p_332696_, p_333975_, p_329381_, p_334853_, p_333678_, list);
    }

    private static Holder<ArmorMaterial> register(
            String p_332406_,
            EnumMap<ArmorItem.Type, Integer> p_331524_,
            int p_331490_,
            Holder<SoundEvent> p_331648_,
            float p_327988_,
            float p_328616_,
            Supplier<Ingredient> p_334412_,
            List<ArmorMaterial.Layer> p_330855_
    ) {
        EnumMap<ArmorItem.Type, Integer> enummap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
            enummap.put(armoritem$type, p_331524_.get(armoritem$type));
        }

        return Registry.registerForHolder(
                BuiltInRegistries.ARMOR_MATERIAL,
                ResourceLocation.fromNamespaceAndPath(Maple.MODID, p_332406_),
                new ArmorMaterial(enummap, p_331490_, p_331648_, p_334412_, p_330855_, p_327988_, p_328616_)
        );
    }
}
