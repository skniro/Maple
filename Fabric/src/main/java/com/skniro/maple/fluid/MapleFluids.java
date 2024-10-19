package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

    public class MapleFluids {
        public static FlowableFluid STILL_Hot_Spring;
        public static FlowableFluid FLOWING_Hot_Spring;

        public static void registerFluids() {
            STILL_Hot_Spring = Registry.register(Registries.FLUID,
                    Identifier.of(Maple.MOD_ID, "hot_spring"), new MapleHotSpringFluid.Still());

            FLOWING_Hot_Spring = Registry.register(Registries.FLUID,
                    Identifier.of(Maple.MOD_ID, "flowing_hot_spring_water"), new MapleHotSpringFluid.Flowing());
        }
    }

