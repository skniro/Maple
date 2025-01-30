package com.skniro.maple.state.property;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class MapleProperties {
    public static final IntegerProperty FLOWER_AMOUNT;
    public static final BooleanProperty SLOT_0_OCCUPIED;
    public static final BooleanProperty SLOT_1_OCCUPIED;
    public static final BooleanProperty SLOT_2_OCCUPIED;
    public static final BooleanProperty SLOT_3_OCCUPIED;
    public static final BooleanProperty SLOT_4_OCCUPIED;
    public static final BooleanProperty SLOT_5_OCCUPIED;


    static {
        FLOWER_AMOUNT = IntegerProperty.create("flower_amount", 1, 4);
        SLOT_0_OCCUPIED = BooleanProperty.create("slot_0_occupied");
        SLOT_1_OCCUPIED = BooleanProperty.create("slot_1_occupied");
        SLOT_2_OCCUPIED = BooleanProperty.create("slot_2_occupied");
        SLOT_3_OCCUPIED = BooleanProperty.create("slot_3_occupied");
        SLOT_4_OCCUPIED = BooleanProperty.create("slot_4_occupied");
        SLOT_5_OCCUPIED = BooleanProperty.create("slot_5_occupied");
    }
}
