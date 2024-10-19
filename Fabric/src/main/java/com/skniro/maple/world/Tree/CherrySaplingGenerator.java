package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Optional;

public class CherrySaplingGenerator {
    public static final SaplingGenerator CherrySapling =
            new SaplingGenerator("cherrytreesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(MapleConfiguredFeatures.CHERRY_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}