package com.skniro.maple.block.entity;

import com.skniro.maple.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class ModSignTypes {
    public static final SignType CHERRY =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cherry"));
}
