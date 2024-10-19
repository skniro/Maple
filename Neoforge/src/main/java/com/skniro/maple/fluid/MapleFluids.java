package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, Maple.MODID);
    public static Supplier<FlowingFluid> STILL_Hot_Spring= registerfluid("hot_spring",
            () -> new MapleHotSpringFluid.Still());

    public static Supplier<FlowingFluid> FLOWING_Hot_Spring= registerfluid("flowing_hot_spring_water",
            () -> new MapleHotSpringFluid.Flowing());

    private static <T extends Fluid> Supplier<T> registerfluid(String name, Supplier<T> fluid) {
        Supplier<T> toReturn = FLUIDS.register(name, fluid);
        return toReturn;
    }

    public static void registerFluids(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}

