package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.FlowingFluid;

    public class MapleFluids {
        public static FlowingFluid STILL_Hot_Spring;
        public static FlowingFluid FLOWING_Hot_Spring;

        public static void registerFluids() {
            STILL_Hot_Spring = Registry.register(BuiltInRegistries.FLUID,
                    new ResourceLocation(Maple.MOD_ID, "hot_spring"), new MapleHotSpringFluid.Still());

            FLOWING_Hot_Spring = Registry.register(BuiltInRegistries.FLUID,
                    new ResourceLocation(Maple.MOD_ID, "flowing_hot_spring_water"), new MapleHotSpringFluid.Flowing());
        }
    }

