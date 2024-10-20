package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class GinkgoSaplingGenerator {
    public static final TreeGrower GinkgoSapling =
            new TreeGrower("ginkgotreesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(MapleConfiguredFeatures.GINKGO_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
    }