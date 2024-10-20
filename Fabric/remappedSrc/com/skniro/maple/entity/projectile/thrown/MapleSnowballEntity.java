package com.skniro.maple.entity.projectile.thrown;

import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class MapleSnowballEntity
        extends ThrowableItemProjectile {
    public MapleSnowballEntity(EntityType<? extends MapleSnowballEntity> entityType, Level world) {
        super((EntityType<? extends ThrowableItemProjectile>)entityType, world);
    }

    public MapleSnowballEntity(Level world, LivingEntity owner) {
        super((EntityType<? extends ThrowableItemProjectile>)EntityType.SNOWBALL, owner, world);
    }

    public MapleSnowballEntity(Level world, double x, double y, double z) {
        super((EntityType<? extends ThrowableItemProjectile>)EntityType.SNOWBALL, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.SNOWBALL;
    }

    private ParticleOptions getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return itemStack.isEmpty() ? ParticleTypes.ITEM_SNOWBALL : new ItemParticleOption(ParticleTypes.ITEM, itemStack);
    }

    @Override
    public void handleEntityEvent(byte status) {
        if (status == EntityEvent.DEATH) {
            ParticleOptions particleEffect = this.getParticleParameters();
            for (int i = 0; i < 8; ++i) {
                this.level().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 3 : 0;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, EntityEvent.DEATH);
            this.discard();
        }
    }
}
