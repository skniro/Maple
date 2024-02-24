package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

    public class MapleFluids {
        public static FlowableFluid STILL_Hot_Spring;
        public static FlowableFluid FLOWING_Hot_Spring;

        public static void registerFluids() {
            STILL_Hot_Spring = Registry.register(Registries.FLUID,
                    new Identifier(Maple.MOD_ID, "hot_spring"), new MapleHotSpringFluid.Still());

            FLOWING_Hot_Spring = Registry.register(Registries.FLUID,
                    new Identifier(Maple.MOD_ID, "flowing_hot_spring_water"), new MapleHotSpringFluid.Flowing());
        }
    }

