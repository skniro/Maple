package com.skniro.maple.item.init.food;

import com.skniro.maple.item.MapleFoodComponents;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class ItemBottle
        extends Item {
    private static final int MAX_USE_TIME = 32;

    public ItemBottle(Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        Player playerEntity;
        super.finishUsingItem(stack, world, user);

        // Advancement check + stat
        if (user instanceof ServerPlayer serverPlayerEntity) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.awardStat(Stats.ITEM_USED.get(this));
        }

        // Clear statuses (if milk)
        if (!world.isClientSide && stack.is(MapleFoodComponents.MILK_BOTTOM.get()))
            user.removeAllEffects();


        if (user instanceof Player && !(playerEntity = (Player)user).hasInfiniteMaterials()) {
            ItemStack itemStack = new ItemStack(Items.GLASS_BOTTLE);
            if (!playerEntity.getInventory().add(itemStack)) {
                playerEntity.drop(itemStack, false);
            }
        }
        return stack;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity user) {
        return MAX_USE_TIME;
    }

    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }
}
