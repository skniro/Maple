package com.skniro.maple.entity.projectile.thrown;

import com.skniro.maple.Maple;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class MapleStoneSnowballEntity extends MapleSnowballEntity {
    public MapleStoneSnowballEntity(Level world, LivingEntity owner) {
        super(world, owner);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 4 : 1;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
    }
}
