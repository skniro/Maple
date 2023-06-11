package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleSignBlocks {
    public static final Block CHERRY_SIGN = registerBlockWithoutItem("cherry_sign", new SignBlock(AbstractBlock.Settings.of(Material.WOOD, Maple_block.CHERRY_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F), MapleSignTypes.CHERRY),Maple.Maple_Group);
    public static final Block CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign", new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD, Maple_block.CHERRY_LOG.getDefaultMapColor()).noCollision().strength(1.0F).dropsLike(CHERRY_SIGN), MapleSignTypes.CHERRY),Maple.Maple_Group);

    private static Block registerBlockWithoutItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }

    public static void registerMapleSignBlocks() {
        Maple.LOGGER.debug("Registering MapleSignBlocks for " + Maple.MOD_ID);
    }
}
