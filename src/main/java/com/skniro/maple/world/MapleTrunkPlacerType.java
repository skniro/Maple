package com.skniro.maple.world;

import com.skniro.maple.mixin.TrunkPlacerTypeInvoker;
import com.skniro.maple.world.gen.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class MapleTrunkPlacerType<P extends TrunkPlacer> {

    public static final TrunkPlacerType<CherryTrunkPlacer> CHERRY_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("maple:cherry_trunk_placer", CherryTrunkPlacer.CODEC);
}
