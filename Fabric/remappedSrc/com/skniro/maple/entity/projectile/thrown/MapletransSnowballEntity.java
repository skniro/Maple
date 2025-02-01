package com.skniro.maple.entity.projectile.thrown;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.portal.TeleportTransition;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class MapletransSnowballEntity extends MapleSnowballEntity {
    public MapletransSnowballEntity(Level world, LivingEntity owner, ItemStack stack) {
        super(world, owner,stack);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 4 : 0;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
        entity.move(MoverType.SELF, new Vec3(5.0, 0.0, 5.0));
        if (entity instanceof ServerPlayer) {
            ServerPlayer serverPlayerEntity = (ServerPlayer) entity;
            if (serverPlayerEntity.connection.isAcceptingMessages() && serverPlayerEntity.level() == this.level() && !serverPlayerEntity.isSleeping()) {

                if (entity.isPassenger()) {
                    serverPlayerEntity.dismountTo(this.getX(), this.getY(), this.getZ());
                } else {
                    entity.teleportTo(this.getX(), this.getY(), this.getZ());
                }
                entity.resetFallDistance();
            } else if (entity != null) {
                entity.teleportTo(this.getX(), this.getY(), this.getZ());
                entity.resetFallDistance();
            }
            this.discard();
        }
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, EntityEvent.DEATH);
            this.discard();
        }
    }

    @Nullable
    public Entity teleport(TeleportTransition teleportTarget) {
        Entity entity = this.getOwner();
        if (entity != null && entity.level().dimension() != teleportTarget.newLevel().dimension()) {
            this.setOwner((Entity)null);
        }

        return super.teleport(teleportTarget);
    }
}
