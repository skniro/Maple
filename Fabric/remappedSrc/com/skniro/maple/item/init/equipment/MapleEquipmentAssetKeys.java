package com.skniro.maple.item.init.equipment;

import com.skniro.maple.Maple;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;

public interface MapleEquipmentAssetKeys {
    ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,"equipment_asset"));
    ResourceKey<EquipmentAsset> Cherry = register("cherry");

    static ResourceKey<EquipmentAsset> register(String name) {
        return ResourceKey.create(REGISTRY_KEY, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,name));
    }

    public static void registerMapleArmorAssetsKeys() {
        Maple.LOGGER.info("Registering Maple armor assets Keys for " + Maple.MOD_ID);
    }
}