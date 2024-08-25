package com.skniro.maple.fluid.init;

import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.fluid.MapleFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MapleHotSpringFluid extends FlowingFluid {
    @Override
    protected boolean canConvertToSource(Level level) {
        return level.getGameRules().getBoolean(GameRules.RULE_WATER_SOURCE_CONVERSION);
    }

    @Override
    protected void beforeDestroyingBlock(LevelAccessor world, BlockPos pos, BlockState state) {
        final BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropResources(state, world, pos, blockEntity);
    }

    public void animateTick(Level world, BlockPos pos, @NotNull FluidState state, RandomSource random) {
        if (!state.isSource() && !(Boolean)state.getValue(FALLING)) {
            if (random.nextInt(64) == 0) {
                world.playLocalSound((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5, SoundEvents.WATER_AMBIENT, SoundSource.BLOCKS, random.nextFloat() * 0.25F + 0.75F, random.nextFloat() + 0.5F, false);
            }
        } else if (random.nextInt(10) == 0) {
            world.addParticle(ParticleTypes.UNDERWATER, (double)pos.getX() + random.nextDouble(), (double)pos.getY() + random.nextDouble(), (double)pos.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected int getSlopeFindDistance(LevelReader world) {
        return 4;
    }

    @Override
    protected int getDropOff(LevelReader world) {
        return 1;
    }

    @Override
    public boolean isSame(Fluid fluid) {
        return fluid == getSource() || fluid == getFlowing();
    }

    @Override
    public int getAmount(FluidState state) {
        return 0;
    }

    @Override
    public FluidType getFluidType() {
        return ForgeMod.WATER_TYPE.get();
    }


    @Override
    public int getTickDelay(LevelReader world) {
        return 5;
    }

    @Override
    protected float getExplosionResistance() {
        return 100f;
    }

    @Nullable
    protected ParticleOptions getDripParticle() {
        return null;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockGetter world, BlockPos pos, Fluid fluid, Direction direction) {
        return false;
    }

    @Override
    public Fluid getSource() {
        return MapleFluids.STILL_Hot_Spring.get();
    }

    @Override
    public Fluid getFlowing() {
        return MapleFluids.FLOWING_Hot_Spring.get();
    }

    @Override
    public Item getBucket() {
        return MapleFluidBlockOrItem.Hot_Spring_BUCKET.get();
    }

    @Override
    protected BlockState createLegacyBlock(FluidState state) {
        return MapleFluidBlockOrItem.Hot_Spring_BLOCK.get().defaultBlockState().setValue(BlockStateProperties.LEVEL, getLegacyLevel(state));
    }

    @Override
    public boolean isSource(FluidState state) {
        return false;
    }

    public static class Flowing extends MapleHotSpringFluid {
        @Override
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }
    }

    public static class Still extends MapleHotSpringFluid {
        @Override
        public int getAmount(FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
