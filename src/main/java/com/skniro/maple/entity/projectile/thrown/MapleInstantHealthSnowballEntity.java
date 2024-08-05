package com.skniro.maple.entity.projectile.thrown;

import com.google.common.collect.Sets;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

import java.util.Set;

public class MapleInstantHealthSnowballEntity extends Snowball {
    private final Set<MobEffectInstance> effects = Sets.newHashSet();
    public MapleInstantHealthSnowballEntity(Level world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 4 : 0;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
        LivingEntity playerEntity = (LivingEntity) entityHitResult.getEntity();;
        playerEntity.addEffect(new MobEffectInstance(MobEffects.HEAL,1));
    }
}
