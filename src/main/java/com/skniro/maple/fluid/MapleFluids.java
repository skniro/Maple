package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Maple.MODID);
    public static RegistryObject<FlowingFluid> STILL_Hot_Spring= registerfluid("hot_spring",
            () -> new MapleHotSpringFluid.Still());

    public static RegistryObject<FlowingFluid> FLOWING_Hot_Spring= registerfluid("flowing_hot_spring_water",
            () -> new MapleHotSpringFluid.Flowing());

    private static <T extends Fluid> RegistryObject<T> registerfluid(String name, Supplier<T> fluid) {
        RegistryObject<T> toReturn = FLUIDS.register(name, fluid);
        return toReturn;
    }

    public static void registerFluids(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}

