package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.MapleHotSpringFluidBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleFluidBlockOrItem {
    public static Block Hot_Spring_BLOCK;
    public static Item Hot_Spring_BUCKET;

    public static void registerFluidBlocks() {
        Hot_Spring_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, "hot_spring_block"),
                new MapleHotSpringFluidBlock(MapleFluids.STILL_Hot_Spring, FabricBlockSettings.copyOf(Blocks.WATER).luminance(7)) {
        });
    }
    public static void registerFluidItems() {
        Hot_Spring_BUCKET = Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, "hot_spring_bucket"),
                new BucketItem(MapleFluids.STILL_Hot_Spring, new FabricItemSettings().recipeRemainder(Items.BUCKET).group(Maple.Maple_Group).maxCount(1)));
    }
}
