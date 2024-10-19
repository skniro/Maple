package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class RedMapleSaplingGenerator {
    public static final SaplingGenerator RedMapleSapling =
            new SaplingGenerator("redmapletreesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(MapleConfiguredFeatures.Red_Maple_TREE),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
    }