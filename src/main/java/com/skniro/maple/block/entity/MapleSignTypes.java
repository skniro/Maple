package com.skniro.maple.block.entity;

import com.skniro.maple.mixin.SignTypeAccessor;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;

public class MapleSignTypes {
    public static final WoodType MAPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple_maple", BlockSetType.CHERRY));

    public static final WoodType GINKGO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple_ginkgo", BlockSetType.CHERRY));
}
