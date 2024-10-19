package com.skniro.maple.block.init;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.Set;
import java.util.stream.Stream;
public record MapleBlockSetType(String name, BlockSoundGroup soundType, SoundEvent doorClose, SoundEvent doorOpen, SoundEvent trapdoorClose, SoundEvent trapdoorOpen, SoundEvent pressurePlateClickOff, SoundEvent pressurePlateClickOn, SoundEvent buttonClickOff, SoundEvent buttonClickOn) {
    private static final Set<net.minecraft.block.BlockSetType> VALUES = new ObjectArraySet<net.minecraft.block.BlockSetType>();
    public static final BlockSetType MAPLE = register(new BlockSetType("maple"));
    public static final BlockSetType GINKGO = register(new BlockSetType("ginkgo"));


    public MapleBlockSetType(String name) {
        this(name, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    }

    private static BlockSetType register(BlockSetType blockSetType) {
        VALUES.add(blockSetType);
        return blockSetType;
    }

    public static Stream<BlockSetType> stream() {
        return VALUES.stream();
    }
}
