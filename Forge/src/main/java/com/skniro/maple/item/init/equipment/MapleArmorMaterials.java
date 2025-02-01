package com.skniro.maple.item.init.equipment;

import com.skniro.maple.tag.MapleItemTags;
import java.util.EnumMap;
import java.util.Map;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public interface MapleArmorMaterials
{
    ArmorMaterial Cherry = new ArmorMaterial(5, (Map)Util.make(new EnumMap(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 11);
    }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, MapleItemTags.CHERRY_TOOL_MATERIALS, MapleEquipmentAssetKeys.Cherry);

    public static final int Cherry_DURABILITY_MULTIPLIER = 37;
}
