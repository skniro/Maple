package com.skniro.maple.particle;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;


public class MapleParticleTypes {
    public static final SimpleParticleType CHERRY_LEAVES = FabricParticleTypes.simple();
    public static final SimpleParticleType SAKURA_LEAVES = FabricParticleTypes.simple();
    public static final SimpleParticleType HOT_SPRING = FabricParticleTypes.simple();

    static {
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,"cherry_leaves"), CHERRY_LEAVES);
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,"sakura_leaves"), SAKURA_LEAVES);
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,"hot_spring"), HOT_SPRING);
    }

    public static void registerParticleTypes() {
        Maple.LOGGER.info("register Maple Particle Types for"+ Maple.MOD_ID );
    }
}
