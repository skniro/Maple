package com.skniro.maple.item.init.food;

import com.skniro.maple.item.MapleFoodComponents;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

public class ItemBottle
        extends Item {
    private static final int MAX_USE_TIME = 32;

    public ItemBottle(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity;
        super.finishUsing(stack, world, user);

        // Advancement check + stat
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }

        // Clear statuses (if milk)
        if (!world.isClient() && stack.isOf(MapleFoodComponents.MILK_BOTTOM))
            user.clearStatusEffects();

        if (user instanceof PlayerEntity && !(playerEntity = (PlayerEntity) user).isInCreativeMode()) {
            ItemStack itemStack = new ItemStack(Items.GLASS_BOTTLE);
            if (!playerEntity.getInventory().insertStack(itemStack)) {
                playerEntity.dropItem(itemStack, false);
            }
        }
        return stack;
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return MAX_USE_TIME;
    }
}
