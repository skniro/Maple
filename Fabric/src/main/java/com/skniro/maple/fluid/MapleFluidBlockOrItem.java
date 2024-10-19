package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MapleFluidBlockOrItem {
    public static Block Hot_Spring_BLOCK;
    public static Item Hot_Spring_BUCKET;

    public static void registerFluidBlocks() {
        Hot_Spring_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(Maple.MOD_ID, "hot_spring_block"),
                new MapleHotSpringFluidBlock(MapleFluids.STILL_Hot_Spring, FabricBlockSettings.copyOf(Blocks.WATER).luminance(7)) {
        });
    }
    public static void registerFluidItems() {
        Hot_Spring_BUCKET = Registry.register(Registries.ITEM, Identifier.of(Maple.MOD_ID, "hot_spring_bucket"),
                new BucketItem(MapleFluids.STILL_Hot_Spring, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}
