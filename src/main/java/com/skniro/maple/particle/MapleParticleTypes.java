package com.skniro.maple.particle;

import com.mojang.serialization.Codec;
import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

public class MapleParticleTypes {
    public static final DefaultParticleType CHERRY_LEAVES = FabricParticleTypes.simple();
    public static final DefaultParticleType SAKURA_LEAVES = FabricParticleTypes.simple();

    static {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(Maple.MOD_ID,"cherry_leaves"), CHERRY_LEAVES);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(Maple.MOD_ID,"sakura_leaves"), SAKURA_LEAVES);
    }

    public static void registerParticleTypes() {
        Maple.LOGGER.info("register Maple Particle Types for"+ Maple.MOD_ID );
    }
}
