package com.skniro.maple.state.property;

import net.minecraft.state.property.IntProperty;

public class MapleProperties {
    public static final IntProperty FLOWER_AMOUNT;


    static {
        FLOWER_AMOUNT = IntProperty.of("flower_amount", 1, 4);
    }
}
