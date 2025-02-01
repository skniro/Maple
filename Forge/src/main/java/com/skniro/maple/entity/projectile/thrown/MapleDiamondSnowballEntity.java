package com.skniro.maple.entity.projectile.thrown;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class MapleDiamondSnowballEntity extends Snowball {
    public MapleDiamondSnowballEntity(Level world, LivingEntity owner, ItemStack itemStack) {
        super(world, owner, itemStack);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof Blaze ? 8 : 6;
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), i);
    }
}
