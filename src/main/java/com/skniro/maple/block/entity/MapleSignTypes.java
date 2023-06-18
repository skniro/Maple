package com.skniro.maple.block.entity;

import com.skniro.maple.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class MapleSignTypes {
    public static final SignType CHERRY =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cherry"));
    public static final SignType MAPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple"));
    public static final SignType BAMBOO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("bamboo"));
}
