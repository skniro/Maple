package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class MapleSignBlocks {
    public static final Block CHERRY_SIGN = registerBlockWithoutItem("cherry_sign",(settings)->  new SignBlock(WoodType.CHERRY, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.CHERRY_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable());
    public static final Block CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign",(settings)->  new WallSignBlock(WoodType.CHERRY, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.CHERRY_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().lootTable((CHERRY_SIGN.getLootTableKey())));
    public static final Block Maple_SIGN = registerBlockWithoutItem("maple_sign",(settings)-> new SignBlock(MapleSignTypes.MAPLE, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable());
    public static final Block Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",(settings)-> new WallSignBlock(MapleSignTypes.MAPLE, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().lootTable((Maple_SIGN.getLootTableKey())));
    public static final Block BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign",(settings)->  new SignBlock(WoodType.BAMBOO, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.BAMBOO_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable());
    public static final Block BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",(settings)-> new WallSignBlock(WoodType.BAMBOO, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.BAMBOO_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().lootTable((BAMBOO_SIGN.getLootTableKey())));
    public static final Block GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign",(settings)->  new SignBlock(MapleSignTypes.GINKGO, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable());
    public static final Block GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",(settings)-> new WallSignBlock(MapleSignTypes.GINKGO, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().lootTable((GINKGO_SIGN.getLootTableKey())));
    public static final Block GINKGO_HANGING_SIGN = registerBlockWithoutItem("ginkgo_hanging_sign",(settings)-> new HangingSignBlock(MapleSignTypes.GINKGO, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable());
    public static final Block GINKGO_WALL_HANGING_SIGN = registerBlockWithoutItem("ginkgo_wall_hanging_sign",(settings)->  new WallHangingSignBlock(MapleSignTypes.GINKGO, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().lootTable(GINKGO_HANGING_SIGN.getLootTableKey()));
    public static final Block Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign",(settings)-> new HangingSignBlock(MapleSignTypes.MAPLE, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable());
    public static final Block Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign",(settings)->  new WallHangingSignBlock(MapleSignTypes.MAPLE, settings),AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().lootTable((Maple_HANGING_SIGN.getLootTableKey())));


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

    public static void registerMapleSignBlocks() {
        Maple.LOGGER.debug("Registering MapleSignBlocks for " + Maple.MOD_ID);
    }
}
