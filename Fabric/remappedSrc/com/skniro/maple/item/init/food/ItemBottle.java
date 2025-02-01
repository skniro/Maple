package com.skniro.maple.item.init.food;

import com.skniro.maple.item.MapleFoodComponents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class ItemBottle
        extends Item {
    private static final int MAX_USE_TIME = 32;

    public ItemBottle(Properties settings) {
        super(settings);
    }


    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        if (!world.isClientSide && stack.is(MapleFoodComponents.MILK_BOTTOM)) {
            user.removeAllEffects();
        }
        ItemStack itemStack = super.finishUsingItem(stack, world, user);
        return user instanceof Player && ((Player)user).getAbilities().instabuild ? itemStack : new ItemStack(Items.GLASS_BOTTLE);
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity user) {
        return MAX_USE_TIME;
    }


}
