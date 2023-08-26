package com.skniro.maple.entity.projectile.thrown;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

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
    }
}
