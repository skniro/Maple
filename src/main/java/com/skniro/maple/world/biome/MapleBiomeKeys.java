package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.OverworldBiomeCreator;

import static net.minecraft.util.registry.Registry.BIOME_KEY;

public class MapleBiomeKeys {
    public static final RegistryKey<Biome> CHERRY_GROVE = register("cherry_grove");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(BIOME_KEY, new Identifier(Maple.MOD_ID,name));
    }


    public static void registerBiome() {
        Maple.LOGGER.debug("Registering the MapleBiomeKeysFeatures for " + Maple.MOD_ID);
        registerBuiltinBiome(CHERRY_GROVE, OverworldBiomeCreator.createMeadow());
    }

    private static void registerBuiltinBiome(RegistryKey<Biome> key, Biome biome) {
        BuiltinRegistries.add(BuiltinRegistries.BIOME, key, biome);
    }
}
