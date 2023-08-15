package com.skniro.maple.mixin;

import com.skniro.maple.entity.MapleBoatType;
import com.skniro.maple.item.MapleItems;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//CREDIT TO nyuppo/fabric-boat-example ON GITHUB

@Mixin(BoatEntity.class)
public class BoatDropsMixin {
    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.CHERRY) {
            ci.setReturnValue(MapleItems.CHERRY_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.BAMBOO) {
            ci.setReturnValue(MapleItems.BAMBOO_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == MapleBoatType.MAPLE) {
            ci.setReturnValue(MapleItems.MAPLE_BOAT);
        }
    }

    @Inject(method = "getMountedHeightOffset",at =@At("HEAD"),cancellable = true)
    public void MountedHeightOffset(CallbackInfoReturnable<Double> cir){
        cir.setReturnValue(((BoatEntity)(Object)this).getVariant() == BoatEntity.Type.BAMBOO ? 0.25D : -0.1D);
    }
}
