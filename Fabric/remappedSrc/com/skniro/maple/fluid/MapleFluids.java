package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.FlowingFluid;

    public class MapleFluids {
        public static FlowingFluid STILL_Hot_Spring;
        public static FlowingFluid FLOWING_Hot_Spring;

        public static void registerFluids() {
            STILL_Hot_Spring = Registry.register(BuiltInRegistries.FLUID,
                    ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "hot_spring"), new MapleHotSpringFluid.Still());

            FLOWING_Hot_Spring = Registry.register(BuiltInRegistries.FLUID,
                    ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "flowing_hot_spring_water"), new MapleHotSpringFluid.Flowing());
        }
    }

