package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleFluids {

    public static RegistryObject<FlowingFluid> STILL_Hot_Spring;
        public static FlowableFluid FLOWING_Hot_Spring;

        public static void registerFluids() {
            STILL_Hot_Spring = Registry.register(Registry.FLUID,
                    new Identifier(Maple.MOD_ID, "hot_spring"), new MapleHotSpringFluid.Still());

            FLOWING_Hot_Spring = Registry.register(Registry.FLUID,
                    new Identifier(Maple.MOD_ID, "flowing_hot_spring_water"), new MapleHotSpringFluid.Flowing());
        }
    }

