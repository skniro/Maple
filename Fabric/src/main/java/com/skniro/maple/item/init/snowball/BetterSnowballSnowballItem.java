package com.skniro.maple.item.init.snowball;

import com.skniro.maple.entity.projectile.thrown.*;
import com.skniro.maple.item.MapleItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class BetterSnowballSnowballItem
        extends Item implements ProjectileItem {
    public BetterSnowballSnowballItem(Item.Settings settings) {
        super(settings);
    }

    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
        if (world instanceof ServerWorld serverWorld) {
            if (itemStack.getItem() == MapleItems.SNOWBALL_STONE) {
                ProjectileEntity.spawnWithVelocity(MapleStoneSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_ICE) {
                ProjectileEntity.spawnWithVelocity(MapleStoneSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_IRON) {
                ProjectileEntity.spawnWithVelocity(MapleIronSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_Gold) {
                ProjectileEntity.spawnWithVelocity(MapleGoldSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_Diamond) {
                ProjectileEntity.spawnWithVelocity(MapleDiamondSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_Compression) {
                ProjectileEntity.spawnWithVelocity(MapleStoneSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_Teleporting) {
                ProjectileEntity.spawnWithVelocity(MapletransSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_Confusion) {
                ProjectileEntity.spawnWithVelocity(MapleConfusionSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_Poison) {
                ProjectileEntity.spawnWithVelocity(MaplePoisonSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else if (itemStack.getItem() == MapleItems.SNOWBALL_Instant_Health) {
                ProjectileEntity.spawnWithVelocity(MapleInstantHealthSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            } else {
                ProjectileEntity.spawnWithVelocity(MapleSnowballEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
            }
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        itemStack.decrementUnlessCreative(1, user);
        return ActionResult.SUCCESS;
    }

    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        return new MapleSnowballEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack);
    }
}