package com.skniro.maple.item.init.sign;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class MapleSignItem extends StandingAndWallBlockItem {
    public MapleSignItem(Supplier<Block> p_43127_, Supplier<Block> p_43128_, Item.Properties p_43126_) {
        super(p_43127_.get(), p_43128_.get(), Direction.DOWN, p_43126_);
    }

    public MapleSignItem(Item.Properties p_278081_, Block p_277743_, Block p_277375_, Direction p_278052_) {
        super(p_277743_, p_277375_, p_278052_, p_278081_);
    }

    protected boolean updateCustomBlockEntityTag(BlockPos p_43130_, Level p_43131_, @Nullable Player p_43132_, ItemStack p_43133_, BlockState p_43134_) {
        boolean flag = super.updateCustomBlockEntityTag(p_43130_, p_43131_, p_43132_, p_43133_, p_43134_);
        if (!p_43131_.isClientSide() && !flag && p_43132_ != null) {
            BlockEntity var9 = p_43131_.getBlockEntity(p_43130_);
            if (var9 instanceof SignBlockEntity) {
                SignBlockEntity signblockentity = (SignBlockEntity)var9;
                Block var10 = p_43131_.getBlockState(p_43130_).getBlock();
                if (var10 instanceof SignBlock) {
                    SignBlock signblock = (SignBlock)var10;
                    signblock.openTextEdit(p_43132_, signblockentity, true);
                }
            }
        }

        return flag;
    }
}
