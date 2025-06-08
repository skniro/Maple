package com.skniro.maple.entity.village;

import com.skniro.maple.Maple;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerType;

public class MapleVillagers {

    public static final VillagerType Cherry = registerProfession("cherry");

    private static VillagerType registerProfession(String name) {
        return Registry.register(BuiltInRegistries.VILLAGER_TYPE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name),
                new VillagerType());
    }
    public static void registerVillagerType() {
        Maple.LOGGER.info("Registering Villagers " + Maple.MOD_ID);
    }
}