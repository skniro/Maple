package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.Instrument;
import net.minecraft.item.Instruments;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class MapleSignBlocks {
    public static final Block CHERRY_SIGN = registerBlockWithoutItem("cherry_sign", new SignBlock(WoodType.CHERRY, AbstractBlock.Settings.create().mapColor(MapleBlocks.CHERRY_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()),Maple.Maple_Group);
    public static final Block CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign", new WallSignBlock(WoodType.CHERRY, AbstractBlock.Settings.create().mapColor(MapleBlocks.CHERRY_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(CHERRY_SIGN)),Maple.Maple_Group);
    public static final Block Maple_SIGN = registerBlockWithoutItem("maple_sign",new SignBlock(MapleSignTypes.MAPLE, AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()),Maple.Maple_Group);
    public static final Block Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",new WallSignBlock(MapleSignTypes.MAPLE, AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(Maple_SIGN)),Maple.Maple_Group);
    public static final Block BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign", new SignBlock(WoodType.BAMBOO, AbstractBlock.Settings.create().mapColor(MapleBlocks.BAMBOO_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()),Maple.Maple_Group);
    public static final Block BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",new WallSignBlock(WoodType.BAMBOO, AbstractBlock.Settings.create().mapColor(MapleBlocks.BAMBOO_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(BAMBOO_SIGN)),Maple.Maple_Group);
    public static final Block GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign", new SignBlock(MapleSignTypes.GINKGO, AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()),Maple.Maple_Group);
    public static final Block GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",new WallSignBlock(MapleSignTypes.GINKGO, AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(GINKGO_SIGN)),Maple.Maple_Group);
    public static final Block GINKGO_HANGING_SIGN = registerBlockWithoutItem("ginkgo_hanging_sign", new HangingSignBlock(MapleSignTypes.GINKGO, AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()),Maple.Maple_Group);
    public static final Block GINKGO_WALL_HANGING_SIGN = registerBlockWithoutItem("ginkgo_wall_hanging_sign", new WallHangingSignBlock(MapleSignTypes.GINKGO, AbstractBlock.Settings.create().mapColor(MapleBlocks.GINKGO_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(GINKGO_HANGING_SIGN)),Maple.Maple_Group);
    public static final Block Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign", new HangingSignBlock(MapleSignTypes.MAPLE, AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable()),Maple.Maple_Group);
    public static final Block Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign", new WallHangingSignBlock(MapleSignTypes.MAPLE, AbstractBlock.Settings.create().mapColor(MapleBlocks.MAPLE_LEAVES.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(Maple_HANGING_SIGN)), Maple.Maple_Group);



    private static Block registerBlockWithoutItem(String name, Block block, RegistryKey<ItemGroup> group) {
        return Registry.register(Registries.BLOCK, Identifier.of(Maple.MOD_ID, name), block);
    }

    public static void registerMapleSignBlocks() {
        Maple.LOGGER.debug("Registering MapleSignBlocks for " + Maple.MOD_ID);
    }
}
