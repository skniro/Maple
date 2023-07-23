package com.skniro.maple.state.property;

import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;

public class MapleProperties {
    public static final IntProperty FLOWER_AMOUNT;
    public static final BooleanProperty SLOT_0_OCCUPIED;
    public static final BooleanProperty SLOT_1_OCCUPIED;
    public static final BooleanProperty SLOT_2_OCCUPIED;
    public static final BooleanProperty SLOT_3_OCCUPIED;
    public static final BooleanProperty SLOT_4_OCCUPIED;
    public static final BooleanProperty SLOT_5_OCCUPIED;


    static {
        FLOWER_AMOUNT = IntProperty.of("flower_amount", 1, 4);
        SLOT_0_OCCUPIED = BooleanProperty.of("slot_0_occupied");
        SLOT_1_OCCUPIED = BooleanProperty.of("slot_1_occupied");
        SLOT_2_OCCUPIED = BooleanProperty.of("slot_2_occupied");
        SLOT_3_OCCUPIED = BooleanProperty.of("slot_3_occupied");
        SLOT_4_OCCUPIED = BooleanProperty.of("slot_4_occupied");
        SLOT_5_OCCUPIED = BooleanProperty.of("slot_5_occupied");
    }
}
