package com.skniro.maple.world.biome;

import com.skniro.maple.Maple;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;


public class MapleBiomeKeys {
    public static final RegistryKey<Biome> CHERRY_GROVE = register("cherry_grove");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(Maple.MOD_ID,name));
    }


    public static void registerBiome() {
        Maple.LOGGER.debug("Registering the MapleBiomeKeysFeatures for " + Maple.MOD_ID);
        registerBuiltinBiome(CHERRY_GROVE, MapleOverworldBiomes.createCherryGrove());
    }

    private static void registerBuiltinBiome(RegistryKey<Biome> key, Biome biome) {
        Registry.register(BuiltinRegistries.createWrapperLookup() ,key,biome);
    }
}
