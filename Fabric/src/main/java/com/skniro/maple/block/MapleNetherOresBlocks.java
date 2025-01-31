package com.skniro.maple.block;

import com.skniro.maple.Maple;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;

public class MapleNetherOresBlocks {
    public static final Block Nether_Coal_Ore = registerBlock("coal_ore", (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), settings),AbstractBlock.Settings.copy(Blocks.COAL_ORE),ItemGroups.NATURAL);
    public static final Block Nether_Copper_Ore = registerBlock("copper_ore", (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), settings),AbstractBlock.Settings.copy(Blocks.COAL_ORE),ItemGroups.NATURAL);
    public static final Block Nether_Diamond_Ore = registerBlock("diamond_ore", (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), settings),AbstractBlock.Settings.copy(Blocks.COAL_ORE),ItemGroups.NATURAL);
    public static final Block Nether_Emerald_Ore = registerBlock("emerald_ore", (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), settings),AbstractBlock.Settings.copy(Blocks.COAL_ORE),ItemGroups.NATURAL);
    public static final Block Nether_Gold_Ore = registerBlock("gold_ore", (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), settings),AbstractBlock.Settings.copy(Blocks.COAL_ORE),ItemGroups.NATURAL);
    public static final Block Nether_Iron_Ore = registerBlock("iron_ore", (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), settings),AbstractBlock.Settings.copy(Blocks.COAL_ORE),ItemGroups.NATURAL);
    public static final Block Nether_Lapis_Ore = registerBlock("lapis_ore", (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), settings),AbstractBlock.Settings.copy(Blocks.COAL_ORE),ItemGroups.NATURAL);
    public static final Block Nether_Redstone_Ore = registerBlock("redstone_ore", (settings)-> new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), settings), AbstractBlock.Settings.copy(Blocks.COAL_ORE), ItemGroups.NATURAL);


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, RegistryKey<ItemGroup> tab) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name)),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }

    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Maple.MOD_ID, name));
    }

    public static void registerNetherOresBlock() {
        Maple.LOGGER.info("register Mod Nether Ores Blocks"+ Maple.MOD_ID);
    }
}
