package com.skniro.maple.entity.projectile.thrown;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.TeleportTarget;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MapletransSnowballEntity extends MapleSnowballEntity {
    public MapletransSnowballEntity(World world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof BlazeEntity ? 4 : 0;
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), i);
        entity.move(MovementType.SELF, new Vec3d(5.0, 0.0, 5.0));
        if (entity instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity) entity;
            if (serverPlayerEntity.networkHandler.isConnectionOpen() && serverPlayerEntity.getWorld() == this.getWorld() && !serverPlayerEntity.isSleeping()) {

                if (entity.hasVehicle()) {
                    serverPlayerEntity.requestTeleportAndDismount(this.getX(), this.getY(), this.getZ());
                } else {
                    entity.requestTeleport(this.getX(), this.getY(), this.getZ());
                }
                entity.onLanding();
            } else if (entity != null) {
                entity.requestTeleport(this.getX(), this.getY(), this.getZ());
                entity.onLanding();
            }
            this.discard();
        }
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.discard();
        }
    }

    @Nullable
    @Override
    public Entity teleportTo(TeleportTarget teleportTarget) {
        Entity entity = this.getOwner();
        if (entity != null && entity.getWorld().getRegistryKey() != teleportTarget.world().getRegistryKey()) {
            this.setOwner((Entity)null);
        }

        return super.teleportTo(teleportTarget);
    }
}
