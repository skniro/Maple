package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class RedMapleSaplingGenerator {
    public static final TreeGrower RedMapleSapling =
            new TreeGrower("redmapletreesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(MapleConfiguredFeatures.Red_Maple_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
    }