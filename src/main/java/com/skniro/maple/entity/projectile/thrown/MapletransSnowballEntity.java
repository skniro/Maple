package com.skniro.maple.entity.projectile.thrown;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class MapletransSnowballEntity extends Snowball {
    public MapletransSnowballEntity(Level world, LivingEntity owner) {
        super(world, owner);
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
            if (serverPlayerEntity.connection.isAcceptingMessages()  && serverPlayerEntity.level() == this.level() && !serverPlayerEntity.isSleeping()) {

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
}
