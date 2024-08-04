package com.skniro.maple.block.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;


public class MapleBlockEntityType {
    public static final BlockEntityType<ChiseledBookshelfBlockEntity> CHISELED_BOOKSHELF;
/*    public static final BlockEntityType<MapleHangingSignBlockEntity> HANGING_SIGN;*/

    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return (BlockEntityType) Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Maple.MOD_ID,id), builder.build(type));
    }

    static {
        CHISELED_BOOKSHELF = create("chiseled_bookshelf", BlockEntityType.Builder.create(ChiseledBookshelfBlockEntity::new, MapleBlocks.CHISELED_BOOKSHELF));
/*        HANGING_SIGN = create("hanging_sign", BlockEntityType.Builder.create(MapleHangingSignBlockEntity::new, Blocks.OAK_HANGING_SIGN, Blocks.SPRUCE_HANGING_SIGN, Blocks.BIRCH_HANGING_SIGN, Blocks.ACACIA_HANGING_SIGN, Blocks.CHERRY_HANGING_SIGN, Blocks.JUNGLE_HANGING_SIGN, Blocks.DARK_OAK_HANGING_SIGN, Blocks.CRIMSON_HANGING_SIGN, Blocks.WARPED_HANGING_SIGN, Blocks.MANGROVE_HANGING_SIGN, Blocks.BAMBOO_HANGING_SIGN, Blocks.OAK_WALL_HANGING_SIGN, Blocks.SPRUCE_WALL_HANGING_SIGN, Blocks.BIRCH_WALL_HANGING_SIGN, Blocks.ACACIA_WALL_HANGING_SIGN, Blocks.CHERRY_WALL_HANGING_SIGN, Blocks.JUNGLE_WALL_HANGING_SIGN, Blocks.DARK_OAK_WALL_HANGING_SIGN, Blocks.CRIMSON_WALL_HANGING_SIGN, Blocks.WARPED_WALL_HANGING_SIGN, Blocks.MANGROVE_WALL_HANGING_SIGN, Blocks.BAMBOO_WALL_HANGING_SIGN));
    */
    }

    public static void registerMapleBlockEntityType() {
        Maple.LOGGER.debug("Registering MapleBlockEntityType for " + Maple.MOD_ID);
    }

}
