package com.skniro.maple.block.entity;

import com.skniro.maple.mixin.SignTypeAccessor;
import net.minecraft.world.level.block.state.properties.WoodType;


public class MapleSignTypes {
    public static final WoodType CHERRY =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple_cherry"));
    public static final WoodType MAPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple_maple"));
    public static final WoodType BAMBOO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple_bamboo"));
}
