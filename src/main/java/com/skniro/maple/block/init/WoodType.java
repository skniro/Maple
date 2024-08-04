package com.skniro.maple.block.init;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.Set;
import java.util.stream.Stream;

public record WoodType(String name, BlockSetType setType, BlockSoundGroup soundType, BlockSoundGroup hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen) {
    private static final Set<WoodType> VALUES = new ObjectArraySet();
    public static final WoodType OAK;
    public static final WoodType SPRUCE;
    public static final WoodType BIRCH;
    public static final WoodType ACACIA;
    public static final WoodType CHERRY;
    public static final WoodType JUNGLE;
    public static final WoodType DARK_OAK;
    public static final WoodType CRIMSON;
    public static final WoodType WARPED;
    public static final WoodType MANGROVE;
    public static final WoodType BAMBOO;

    public WoodType(String name, BlockSetType setType) {
        this(name, setType, BlockSoundGroup.WOOD, BlockSoundGroup.WOOD, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    }

    public WoodType(String name, BlockSetType setType, BlockSoundGroup soundType, BlockSoundGroup hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen) {
        this.name = name;
        this.setType = setType;
        this.soundType = soundType;
        this.hangingSignSoundType = hangingSignSoundType;
        this.fenceGateClose = fenceGateClose;
        this.fenceGateOpen = fenceGateOpen;
    }

    private static WoodType register(WoodType type) {
        VALUES.add(type);
        return type;
    }

    public static Stream<WoodType> stream() {
        return VALUES.stream();
    }

    public String name() {
        return this.name;
    }

    public BlockSetType setType() {
        return this.setType;
    }

    public BlockSoundGroup soundType() {
        return this.soundType;
    }

    public BlockSoundGroup hangingSignSoundType() {
        return this.hangingSignSoundType;
    }

    public SoundEvent fenceGateClose() {
        return this.fenceGateClose;
    }

    public SoundEvent fenceGateOpen() {
        return this.fenceGateOpen;
    }

    static {
        OAK = register(new WoodType("oak", BlockSetType.OAK));
        SPRUCE = register(new WoodType("spruce", BlockSetType.SPRUCE));
        BIRCH = register(new WoodType("birch", BlockSetType.BIRCH));
        ACACIA = register(new WoodType("acacia", BlockSetType.ACACIA));
        CHERRY = register(new WoodType("cherry", BlockSetType.CHERRY, BlockSoundGroup.WOOD, BlockSoundGroup.WOOD, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN));
        JUNGLE = register(new WoodType("jungle", BlockSetType.JUNGLE));
        DARK_OAK = register(new WoodType("dark_oak", BlockSetType.DARK_OAK));
        CRIMSON = register(new WoodType("crimson", BlockSetType.CRIMSON, BlockSoundGroup.WOOD, BlockSoundGroup.WOOD, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN));
        WARPED = register(new WoodType("warped", BlockSetType.WARPED, BlockSoundGroup.WOOD, BlockSoundGroup.WOOD, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN));
        MANGROVE = register(new WoodType("mangrove", BlockSetType.MANGROVE));
        BAMBOO = register(new WoodType("bamboo", BlockSetType.BAMBOO, BlockSoundGroup.WOOD, BlockSoundGroup.WOOD, SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN));
    }
}
