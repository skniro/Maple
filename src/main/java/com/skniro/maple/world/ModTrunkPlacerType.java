package com.skniro.maple.world;

import com.mojang.serialization.Codec;
import com.skniro.maple.mixin.TrunkPlacerTypeInvoker;
import com.skniro.maple.world.gen.CherryTrunkPlacer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import static com.skniro.maple.Maple.MOD_ID;

public class ModTrunkPlacerType<P extends TrunkPlacer> {

    public static final TrunkPlacerType<CherryTrunkPlacer> CHERRY_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("maple:cherry_trunk_placer", CherryTrunkPlacer.CODEC);
}
