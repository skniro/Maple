package com.skniro.maple.entity.projectile.thrown;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class MapleInstantHealthSnowballEntity extends MapleSnowballEntity {
    private final Set<MobEffectInstance> effects = Sets.newHashSet();
    public MapleInstantHealthSnowballEntity(Level world, LivingEntity owner, ItemStack stack) {
        super(world, owner, stack);
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
