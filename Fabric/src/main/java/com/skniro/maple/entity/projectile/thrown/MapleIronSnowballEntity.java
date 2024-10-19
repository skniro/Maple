package com.skniro.maple.entity.projectile.thrown;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class MapleIronSnowballEntity extends MapleSnowballEntity {
    public MapleIronSnowballEntity(World world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof BlazeEntity ? 5 : 3;
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), i);
    }
}
