package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class MapleFluidBlockOrItem {
    public static Block Hot_Spring_BLOCK;
    public static Item Hot_Spring_BUCKET;

    public static void registerFluidBlocks() {
        Hot_Spring_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Maple.MOD_ID, "hot_spring_block"),
                new MapleHotSpringFluidBlock(MapleFluids.STILL_Hot_Spring, FabricBlockSettings.copyOf(Blocks.WATER).luminance(7)) {
        });
    }
    public static void registerFluidItems() {
        Hot_Spring_BUCKET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Maple.MOD_ID, "hot_spring_bucket"),
                new BucketItem(MapleFluids.STILL_Hot_Spring, new FabricItemSettings().craftRemainder(Items.BUCKET).stacksTo(1)));
    }
}
