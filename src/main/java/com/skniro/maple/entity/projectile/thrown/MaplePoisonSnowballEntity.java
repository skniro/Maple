package com.skniro.maple.entity.projectile.thrown;

import com.google.common.collect.Sets;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

import java.util.Set;

public class MaplePoisonSnowballEntity extends MapleSnowballEntity {
    private final Set<StatusEffectInstance> effects = Sets.newHashSet();
    public MaplePoisonSnowballEntity(World world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof BlazeEntity ? 4 : 0;
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), i);
        LivingEntity livingEntity = (LivingEntity) entityHitResult.getEntity();;
        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON,30,1));
    }
}
