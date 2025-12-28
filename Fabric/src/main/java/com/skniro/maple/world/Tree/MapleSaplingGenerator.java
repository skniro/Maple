package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class MapleSaplingGenerator {
    public static final TreeGrower MapleSapling =
            new TreeGrower("mapletreesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(MapleConfiguredFeatures.Maple_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}