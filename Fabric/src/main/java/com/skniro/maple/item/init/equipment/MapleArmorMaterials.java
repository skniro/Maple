package com.skniro.maple.item.init.equipment;

import com.skniro.maple.tag.MapleItemTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.Map;

public interface MapleArmorMaterials
{
    ArmorMaterial Cherry = new ArmorMaterial(5, (Map)Util.make(new EnumMap(EquipmentType.class), (map) -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, MapleItemTags.CHERRY_TOOL_MATERIALS, MapleEquipmentAssetKeys.Cherry);

    public static final int Cherry_DURABILITY_MULTIPLIER = 37;
}
