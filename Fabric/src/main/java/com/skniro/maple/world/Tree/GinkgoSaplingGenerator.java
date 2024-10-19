package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class GinkgoSaplingGenerator {
    public static final SaplingGenerator GinkgoSapling =
            new SaplingGenerator("ginkgotreesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(MapleConfiguredFeatures.GINKGO_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
    }