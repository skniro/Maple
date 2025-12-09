package com.skniro.maple.item.init.equipment;

import com.skniro.maple.Maple;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public interface MapleEquipmentAssetKeys {
    ResourceKey<EquipmentAsset> Cherry = register("cherry");

    static ResourceKey<EquipmentAsset> register(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,name));
    }
}