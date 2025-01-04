package com.skniro.maple.block.init;

import com.skniro.maple.block.entity.MapleHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MapleWallHangingSignBlock extends WallHangingSignBlock {
    public MapleWallHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MapleHangingSignBlockEntity(pPos, pState);
    }
}