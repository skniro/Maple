package com.skniro.maple.item.init.equipment;

import com.skniro.maple.Maple;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public interface MapleEquipmentAssetKeys {
    RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.of(Maple.MOD_ID,"equipment_asset"));
    RegistryKey<EquipmentAsset> Cherry = register("cherry");

    static RegistryKey<EquipmentAsset> register(String name) {
        return RegistryKey.of(REGISTRY_KEY, Identifier.of(Maple.MOD_ID,name));
    }

    public static void registerMapleArmorAssetsKeys() {
        Maple.LOGGER.info("Registering Maple armor assets Keys for " + Maple.MOD_ID);
    }
}