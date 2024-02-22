package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
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
        public static Block Hot_Spring_BLOCK;
        public static Item Hot_Spring_BUCKET;

        public static void registerFluids() {
            STILL_Hot_Spring = Registry.register(Registries.FLUID,
                    new Identifier(Maple.MOD_ID, "hot_spring"), new MapleHotSpringFluid.Still());

            FLOWING_Hot_Spring = Registry.register(Registries.FLUID,
                    new Identifier(Maple.MOD_ID, "plowing_hot_spring_water"), new MapleHotSpringFluid.Flowing());

            Hot_Spring_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Maple.MOD_ID, "hot_spring_block"),
                    new FluidBlock(MapleFluids.STILL_Hot_Spring, FabricBlockSettings.copyOf(Blocks.WATER)){ });
            Hot_Spring_BUCKET = Registry.register(Registries.ITEM, new Identifier(Maple.MOD_ID, "hot_spring_bucket"),
                    new BucketItem(MapleFluids.STILL_Hot_Spring, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
    }

