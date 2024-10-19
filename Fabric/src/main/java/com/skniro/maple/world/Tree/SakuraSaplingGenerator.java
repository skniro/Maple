package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Optional;

public class SakuraSaplingGenerator {
    public static final SaplingGenerator SakuraSapling =
            new SaplingGenerator("sakuratreesapling", 0f, Optional.empty(),
                    Optional.of(MapleConfiguredFeatures.MAGE_SAKURA_TREE),
                    Optional.of(MapleConfiguredFeatures.SAKURA_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}