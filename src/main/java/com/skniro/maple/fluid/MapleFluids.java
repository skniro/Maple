package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleFluids {
        public static FlowableFluid STILL_Hot_Spring;
        public static FlowableFluid FLOWING_Hot_Spring;

        public static void registerFluids() {
            STILL_Hot_Spring = Registry.register(Registry.FLUID,
                    new Identifier(Maple.MOD_ID, "hot_spring"), new MapleHotSpringFluid.Still());

            FLOWING_Hot_Spring = Registry.register(Registry.FLUID,
                    new Identifier(Maple.MOD_ID, "flowing_hot_spring_water"), new MapleHotSpringFluid.Flowing());
        }
    }

