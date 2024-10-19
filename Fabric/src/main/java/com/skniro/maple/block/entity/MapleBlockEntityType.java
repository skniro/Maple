package com.skniro.maple.block.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;


public class MapleBlockEntityType {


    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return (BlockEntityType) Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Maple.MOD_ID,id), builder.build(type));
    }

    static {
    }

    public static void registerMapleBlockEntityType() {
        Maple.LOGGER.debug("Registering MapleBlockEntityType for " + Maple.MOD_ID);
    }

}
