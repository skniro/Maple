package com.skniro.maple.block.entity;

import com.skniro.maple.block.init.MapleBlockSetType;
import com.skniro.maple.mixin.SignTypeAccessor;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MapleSignTypes {
    public static final WoodType MAPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple_maple", MapleBlockSetType.MAPLE));

    public static final WoodType GINKGO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple_ginkgo", MapleBlockSetType.GINKGO));
}
