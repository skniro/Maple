package com.skniro.maple.block.entity;

import com.skniro.maple.mixin.SignTypeAccessor;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;

public class MapleSignTypes {
    public static final WoodType CHERRY =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cherry", BlockSetType.CHERRY));
    public static final WoodType MAPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple", BlockSetType.CHERRY));
    public static final WoodType BAMBOO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("bamboo", BlockSetType.BAMBOO));
}
