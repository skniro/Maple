package com.skniro.maple.block.entity;

import net.minecraft.world.level.block.state.properties.WoodType;


public class MapleWoodTypes {
    public static final WoodType MAPLE =
            WoodType.register(new WoodType("maple_maple", MapleBlockSetType.MAPLE));
    public static final WoodType GINKGO =
            WoodType.register(new WoodType("maple_ginkgo", MapleBlockSetType.GINKGO));
}
