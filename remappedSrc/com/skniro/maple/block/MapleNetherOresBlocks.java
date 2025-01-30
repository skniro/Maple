package com.skniro.maple.block;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;

public class MapleNetherOresBlocks {
    public static final Block Nether_Coal_Ore = registerBlock("coal_ore", new DropExperienceBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),CreativeModeTabs.NATURAL_BLOCKS);
    public static final Block Nether_Copper_Ore = registerBlock("copper_ore", new DropExperienceBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),CreativeModeTabs.NATURAL_BLOCKS);
    public static final Block Nether_Diamond_Ore = registerBlock("diamond_ore", new DropExperienceBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),CreativeModeTabs.NATURAL_BLOCKS);
    public static final Block Nether_Emerald_Ore = registerBlock("emerald_ore", new DropExperienceBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),CreativeModeTabs.NATURAL_BLOCKS);
    public static final Block Nether_Gold_Ore = registerBlock("gold_ore", new DropExperienceBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),CreativeModeTabs.NATURAL_BLOCKS);
    public static final Block Nether_Iron_Ore = registerBlock("iron_ore", new DropExperienceBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),CreativeModeTabs.NATURAL_BLOCKS);
    public static final Block Nether_Lapis_Ore = registerBlock("lapis_ore", new DropExperienceBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),CreativeModeTabs.NATURAL_BLOCKS);
    public static final Block Nether_Redstone_Ore = registerBlock("redstone_ore", new DropExperienceBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)), CreativeModeTabs.NATURAL_BLOCKS);



    private static Block registerBlock(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Maple.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Maple.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Maple.MOD_ID, name), block);
    }

    public static void registerNetherOresBlock() {
        Maple.LOGGER.info("register Mod Nether Ores Blocks"+ Maple.MOD_ID);
    }
}
