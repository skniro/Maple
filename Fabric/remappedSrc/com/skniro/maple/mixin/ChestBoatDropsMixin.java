package com.skniro.maple.mixin;

import com.skniro.maple.entity.MapleBoatType;
import com.skniro.maple.item.MapleItems;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//CREDIT TO nyuppo/fabric-boat-example ON GITHUB

@Mixin(ChestBoat.class)
public class ChestBoatDropsMixin {
    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((Boat)(Object)this).getVariant() == Boat.Type.CHERRY) {
            ci.setReturnValue(MapleItems.CHERRY_CHEST_BOAT);
        }else if (((Boat)(Object)this).getVariant() == Boat.Type.BAMBOO) {
            ci.setReturnValue(MapleItems.BAMBOO_CHEST_BOAT);
        }else if (((Boat)(Object)this).getVariant() == MapleBoatType.MAPLE) {
            ci.setReturnValue(MapleItems.MAPLE_CHEST_BOAT);
        }else if (((Boat)(Object)this).getVariant() == MapleBoatType.GINKGO) {
            ci.setReturnValue(MapleItems.GINKGO_CHEST_BOAT);
        }
    }
}
