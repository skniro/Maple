package com.skniro.maple.state.property;

import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class MapleProperties {
    public static final IntegerProperty FLOWER_AMOUNT;


    static {
        FLOWER_AMOUNT = IntegerProperty.create("flower_amount", 1, 4);

    }
}
