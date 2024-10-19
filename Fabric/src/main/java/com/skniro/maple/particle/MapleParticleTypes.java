package com.skniro.maple.particle;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class MapleParticleTypes {
    public static final SimpleParticleType CHERRY_LEAVES = FabricParticleTypes.simple();
    public static final SimpleParticleType SAKURA_LEAVES = FabricParticleTypes.simple();

    static {
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Maple.MOD_ID,"cherry_leaves"), CHERRY_LEAVES);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Maple.MOD_ID,"sakura_leaves"), SAKURA_LEAVES);
    }

    public static void registerParticleTypes() {
        Maple.LOGGER.info("register Maple Particle Types for"+ Maple.MOD_ID );
    }
}
