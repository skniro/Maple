package com.skniro.maple.fluid.init;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

public class MapleHotSpringFluidBlock extends LiquidBlock {
    public MapleHotSpringFluidBlock(FlowingFluid fluid, Properties settings) {
        super(fluid, settings);
    }

    @Override
    public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier handler) {
        if (entity instanceof LivingEntity && this.getFluidState(state).getType().isSource(this.getFluidState(state))) {
            if(!((LivingEntity) entity).hasEffect(MobEffects.REGENERATION)){
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10 * 6,1));
            }
        }
    }
}
