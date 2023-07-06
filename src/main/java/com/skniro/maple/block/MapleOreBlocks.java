package com.skniro.maple.block;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class MapleOreBlocks {
    public static final Block Salt_Ore =registerBlock("salt_ore",new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)),Maple.Maple_Group);
    public static final Block DEEPSLATE_Salt_Ore =registerBlock("deepslate_salt_ore",new OreBlock(AbstractBlock.Settings.copy(Salt_Ore).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)),Maple.Maple_Group);

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
}
