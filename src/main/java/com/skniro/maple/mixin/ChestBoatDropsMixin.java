package com.skniro.maple.mixin;

import com.skniro.maple.entity.MapleBoatType;
import com.skniro.maple.item.MapleItems;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//CREDIT TO nyuppo/fabric-boat-example ON GITHUB

@Mixin(ChestBoatEntity.class)
public class ChestBoatDropsMixin {
    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.CHERRY) {
            ci.setReturnValue(MapleItems.CHERRY_CHEST_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.BAMBOO) {
            ci.setReturnValue(MapleItems.BAMBOO_CHEST_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == MapleBoatType.MAPLE) {
            ci.setReturnValue(MapleItems.MAPLE_CHEST_BOAT);
        }
    }
}
