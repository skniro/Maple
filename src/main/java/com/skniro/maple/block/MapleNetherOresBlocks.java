package com.skniro.maple.block;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
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
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class MapleNetherOresBlocks {
    public static final Block Nether_Coal_Ore = registerBlock("coal_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)),ItemGroups.NATURAL);
    public static final Block Nether_Copper_Ore = registerBlock("copper_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)),ItemGroups.NATURAL);
    public static final Block Nether_Diamond_Ore = registerBlock("diamond_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)),ItemGroups.NATURAL);
    public static final Block Nether_Emerald_Ore = registerBlock("emerald_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)),ItemGroups.NATURAL);
    public static final Block Nether_Gold_Ore = registerBlock("gold_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)),ItemGroups.NATURAL);
    public static final Block Nether_Iron_Ore = registerBlock("iron_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)),ItemGroups.NATURAL);
    public static final Block Nether_Lapis_Ore = registerBlock("lapis_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)),ItemGroups.NATURAL);
    public static final Block Nether_Redstone_Ore = registerBlock("redstone_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)), ItemGroups.NATURAL);

    //TechReborn
    public static final Block Nether_Iridium_Ore = registerBlock("iridium_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)), ItemGroups.NATURAL);
    public static final Block Nether_Ruby_Ore = registerBlock("ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)), ItemGroups.NATURAL);
    public static final Block Nether_Lead_Ore = registerBlock("lead_ore", new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.COAL_ORE), UniformIntProvider.create(2, 4)), ItemGroups.NATURAL);




    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, new Identifier(Maple.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }

    public static void registerNetherOresBlock() {
        Maple.LOGGER.info("register Mod Nether Ores Blocks"+ Maple.MOD_ID);
    }
}
