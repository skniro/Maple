package com.skniro.maple.entity.village;

import com.skniro.maple.Maple;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerTypeHelper;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerType;
import net.minecraft.world.biome.BiomeKeys;

public class MapleVillagers {

    public static final VillagerType Cherry = registerProfession("cherry");

    private static VillagerType registerProfession(String name) {
        return Registry.register(Registries.VILLAGER_TYPE, new Identifier(Maple.MOD_ID, name),
                new VillagerType(name));
    }
    public static void registerVillagerType() {
        VillagerTypeHelper.addVillagerTypeToBiome(BiomeKeys.CHERRY_GROVE, Cherry);
        VillagerTypeHelper.addVillagerTypeToBiome(MapleBiomeKeys.Sakura, Cherry);
        Maple.LOGGER.info("Registering Villagers " + Maple.MOD_ID);
    }
}