package com.skniro.maple.entity.projectile.thrown;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class MapleConfusionSnowballEntity extends MapleSnowballEntity {
    private final Set<MobEffectInstance> effects = Sets.newHashSet();
    public MapleConfusionSnowballEntity(Level world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 4 : 0;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
        LivingEntity livingEntity = (LivingEntity) entityHitResult.getEntity();;
        livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,150,1));
    }
}
