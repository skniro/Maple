package com.skniro.maple.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MapleHangingSignBlockEntity extends SignBlockEntity {
    public MapleHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(MapleBlockEntities.Maple_HANGING_SIGN.get(), pPos, pBlockState);
    }
    @Override
    public BlockEntityType<?> getType() {
        return MapleBlockEntities.Maple_HANGING_SIGN.get();
    }
}