package com.skniro.maple.item.init.equipment;

import com.skniro.maple.Maple;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public interface MapleEquipmentAssetKeys {
    ResourceKey<EquipmentAsset> Cherry = register("cherry");

    static ResourceKey<EquipmentAsset> register(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(Maple.MOD_ID,name));
    }

    public static void registerMapleArmorAssetsKeys() {
        Maple.LOGGER.info("Registering Maple armor assets Keys for " + Maple.MOD_ID);
    }
}