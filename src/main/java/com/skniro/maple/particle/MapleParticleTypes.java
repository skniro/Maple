package com.skniro.maple.particle;

import com.skniro.maple.Maple;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleParticleTypes {
    public static final DeferredRegister <ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Maple.MODID);
    public static final RegistryObject<SimpleParticleType> CHERRY_LEAVES = register("cherry_leaves",() -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> SAKURA_LEAVES = register("sakura_leaves",() -> new SimpleParticleType(true));

    public static <T extends ParticleType<?>> RegistryObject<T> register(String name, Supplier<T> particleType){
        return PARTICLE_TYPES.register(name, particleType);
    }


    public static void MapleParticleTypesRegister(IEventBus eventBus){
        PARTICLE_TYPES.register(eventBus);
    }
}
