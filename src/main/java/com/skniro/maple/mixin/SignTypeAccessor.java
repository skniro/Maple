package com.skniro.maple.mixin;

import net.minecraft.block.WoodType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(WoodType.class)
public interface SignTypeAccessor {
    @Invoker("<init>")
    static WoodType newSignType(String name) {
        throw new AssertionError();
    }

    @Invoker("register")
    static WoodType registerNew(WoodType type) {
        throw new AssertionError();
    }
}
