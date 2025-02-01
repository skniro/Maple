package com.skniro.maple.fluid.init;

import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult.Type;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.FluidUtil;

public class MapleBucketItem extends Item implements DispensibleContainerItem {
    public final Fluid content;

    public MapleBucketItem(Supplier<FlowingFluid> p_40689_, Properties p_40690_) {
        super(p_40690_);
        this.content = p_40689_.get();
    }

    public InteractionResult use(Level p_40703_, Player p_40704_, InteractionHand p_40705_) {
        ItemStack itemstack = p_40704_.getItemInHand(p_40705_);
        BlockHitResult blockhitresult = getPlayerPOVHitResult(p_40703_, p_40704_, this.content == Fluids.EMPTY ? net.minecraft.world.level.ClipContext.Fluid.SOURCE_ONLY : net.minecraft.world.level.ClipContext.Fluid.NONE);
        if (blockhitresult.getType() == Type.MISS) {
            return InteractionResult.PASS;
        } else if (blockhitresult.getType() != Type.BLOCK) {
            return InteractionResult.PASS;
        } else {
            BlockPos blockpos = blockhitresult.getBlockPos();
            Direction direction = blockhitresult.getDirection();
            BlockPos blockpos1 = blockpos.relative(direction);
            if (p_40703_.mayInteract(p_40704_, blockpos) && p_40704_.mayUseItemAt(blockpos1, direction, itemstack)) {
                BlockState blockstate1;
                ItemStack itemstack3;
                if (this.content == Fluids.EMPTY) {
                    blockstate1 = p_40703_.getBlockState(blockpos);
                    Block var14 = blockstate1.getBlock();
                    if (var14 instanceof BucketPickup) {
                        BucketPickup bucketpickup = (BucketPickup)var14;
                        itemstack3 = bucketpickup.pickupBlock(p_40704_, p_40703_, blockpos, blockstate1);
                        if (!itemstack3.isEmpty()) {
                            p_40704_.awardStat(Stats.ITEM_USED.get(this));
                            bucketpickup.getPickupSound(blockstate1).ifPresent((p_150709_) -> {
                                p_40704_.playSound(p_150709_, 1.0F, 1.0F);
                            });
                            p_40703_.gameEvent(p_40704_, GameEvent.FLUID_PICKUP, blockpos);
                            ItemStack itemstack2 = ItemUtils.createFilledResult(itemstack, p_40704_, itemstack3);
                            if (!p_40703_.isClientSide) {
                                CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayer)p_40704_, itemstack3);
                            }

                            return InteractionResult.SUCCESS.heldItemTransformedTo(itemstack2);
                        }
                    }

                    return InteractionResult.FAIL;
                } else {
                    blockstate1 = p_40703_.getBlockState(blockpos);
                    BlockPos blockpos2 = this.canBlockContainFluid(p_40704_, p_40703_, blockpos, blockstate1) ? blockpos : blockpos1;
                    if (this.emptyContents(p_40704_, p_40703_, blockpos2, blockhitresult, itemstack)) {
                        this.checkExtraContent(p_40704_, p_40703_, itemstack, blockpos2);
                        if (p_40704_ instanceof ServerPlayer) {
                            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer)p_40704_, blockpos2, itemstack);
                        }

                        p_40704_.awardStat(Stats.ITEM_USED.get(this));
                        itemstack3 = ItemUtils.createFilledResult(itemstack, p_40704_, getEmptySuccessItem(itemstack, p_40704_));
                        return InteractionResult.SUCCESS.heldItemTransformedTo(itemstack3);
                    } else {
                        return InteractionResult.FAIL;
                    }
                }
            } else {
                return InteractionResult.FAIL;
            }
        }
    }

    public static ItemStack getEmptySuccessItem(ItemStack p_40700_, Player p_40701_) {
        return !p_40701_.hasInfiniteMaterials() ? new ItemStack(Items.BUCKET) : p_40700_;
    }

    public void checkExtraContent(@Nullable Player p_150711_, Level p_150712_, ItemStack p_150713_, BlockPos p_150714_) {
    }

    /** @deprecated */
    @Deprecated
    public boolean emptyContents(@Nullable Player p_150716_, Level p_150717_, BlockPos p_150718_, @Nullable BlockHitResult p_150719_) {
        return this.emptyContents(p_150716_, p_150717_, p_150718_, p_150719_, (ItemStack)null);
    }

    public boolean emptyContents(@Nullable Player p_150716_, Level p_150717_, BlockPos p_150718_, @Nullable BlockHitResult p_150719_, @Nullable ItemStack container) {
        Fluid var7 = this.content;
        if (!(var7 instanceof FlowingFluid flowingfluid)) {
            return false;
        } else {
            boolean $$8;
            BlockState blockstate;
            boolean flag2;
            Block $$7;
            label78: {
                label77: {
                    blockstate = p_150717_.getBlockState(p_150718_);
                    $$7 = blockstate.getBlock();
                    $$8 = blockstate.canBeReplaced(this.content);
                    if (!blockstate.isAir() && !$$8) {
                        if (!($$7 instanceof LiquidBlockContainer)) {
                            break label77;
                        }

                        LiquidBlockContainer liquidblockcontainer = (LiquidBlockContainer)$$7;
                        if (!liquidblockcontainer.canPlaceLiquid(p_150716_, p_150717_, p_150718_, blockstate, this.content)) {
                            break label77;
                        }
                    }

                    flag2 = true;
                    break label78;
                }

                flag2 = false;
            }

            Optional<FluidStack> containedFluidStack = Optional.ofNullable(container).flatMap(FluidUtil::getFluidContained);
            if (!flag2) {
                return p_150719_ != null && this.emptyContents(p_150716_, p_150717_, p_150719_.getBlockPos().relative(p_150719_.getDirection()), (BlockHitResult)null, container);
            } else if (containedFluidStack.isPresent() && this.content.getFluidType().isVaporizedOnPlacement(p_150717_, p_150718_, (FluidStack)containedFluidStack.get())) {
                this.content.getFluidType().onVaporize(p_150716_, p_150717_, p_150718_, (FluidStack)containedFluidStack.get());
                return true;
            } else if (p_150717_.dimensionType().ultraWarm() && this.content.is(FluidTags.WATER)) {
                int l = p_150718_.getX();
                int i = p_150718_.getY();
                int j = p_150718_.getZ();
                p_150717_.playSound(p_150716_, p_150718_, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 0.5F, 2.6F + (p_150717_.random.nextFloat() - p_150717_.random.nextFloat()) * 0.8F);

                for(int k = 0; k < 8; ++k) {
                    p_150717_.addParticle(ParticleTypes.LARGE_SMOKE, (double)l + Math.random(), (double)i + Math.random(), (double)j + Math.random(), 0.0, 0.0, 0.0);
                }

                return true;
            } else {
                if ($$7 instanceof LiquidBlockContainer) {
                    LiquidBlockContainer liquidblockcontainer1 = (LiquidBlockContainer)$$7;
                    if (liquidblockcontainer1.canPlaceLiquid(p_150716_, p_150717_, p_150718_, blockstate, this.content)) {
                        liquidblockcontainer1.placeLiquid(p_150717_, p_150718_, blockstate, flowingfluid.getSource(false));
                        this.playEmptySound(p_150716_, p_150717_, p_150718_);
                        return true;
                    }
                }

                if (!p_150717_.isClientSide && $$8 && !blockstate.liquid()) {
                    p_150717_.destroyBlock(p_150718_, true);
                }

                if (!p_150717_.setBlock(p_150718_, this.content.defaultFluidState().createLegacyBlock(), 11) && !blockstate.getFluidState().isSource()) {
                    return false;
                } else {
                    this.playEmptySound(p_150716_, p_150717_, p_150718_);
                    return true;
                }
            }
        }
    }

    protected void playEmptySound(@Nullable Player p_40696_, LevelAccessor p_40697_, BlockPos p_40698_) {
        SoundEvent soundevent = this.content.getFluidType().getSound(p_40696_, p_40697_, p_40698_, SoundActions.BUCKET_EMPTY);
        if (soundevent == null) {
            soundevent = this.content.is(FluidTags.LAVA) ? SoundEvents.BUCKET_EMPTY_LAVA : SoundEvents.BUCKET_EMPTY;
        }

        p_40697_.playSound(p_40696_, p_40698_, soundevent, SoundSource.BLOCKS, 1.0F, 1.0F);
        p_40697_.gameEvent(p_40696_, GameEvent.FLUID_PLACE, p_40698_);
    }

    protected boolean canBlockContainFluid(@Nullable Player player, Level worldIn, BlockPos posIn, BlockState blockstate) {
        return blockstate.getBlock() instanceof LiquidBlockContainer && ((LiquidBlockContainer)blockstate.getBlock()).canPlaceLiquid(player, worldIn, posIn, blockstate, this.content);
    }
}
