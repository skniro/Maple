package com.skniro.maple.block;

import com.skniro.maple.Maple;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class MapleOreBlocks {
    public static final Block Salt_Ore =registerBlock("salt_ore",new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.create().requiresTool().strength(3.0F, 3.0F)),Maple.Maple_Group);
    public static final Block DEEPSLATE_Salt_Ore =registerBlock("deepslate_salt_ore",new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Salt_Ore).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)),Maple.Maple_Group);

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Maple.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, Identifier.of(Maple.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, Identifier.of(Maple.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerMapleOreBlocks() {
        Maple.LOGGER.debug("Registering ModBlocks for " + Maple.MOD_ID);
    }
}
