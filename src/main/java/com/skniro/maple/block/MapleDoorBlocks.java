package com.skniro.maple.block;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleDoorBlocks {
    public static final Block MAPLE_DOOR = registerBlockWithoutItem("maple_door", new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block CHERRY_DOOR = registerBlockWithoutItem("cherry_door", new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
    public static final Block CHERRY_PRESSURE_PLATE = registerBlockWithoutItem("cherry_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD, Maple_block.CHERRY_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F)));
    public static final Block CHERRY_TRAPDOOR = registerBlockWithoutItem("cherry_trapdoor", new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(3.0F).nonOpaque()));



    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModDoorBlocks() {
        Maple.LOGGER.debug("Registering ModBlocks for " + Maple.MOD_ID);
    }
}