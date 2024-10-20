package com.skniro.maple.world.Tree;

import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import java.util.Optional;
import net.minecraft.world.level.block.grower.TreeGrower;

public class CherrySaplingGenerator {
    public static final TreeGrower CherrySapling =
            new TreeGrower("cherrytreesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(MapleConfiguredFeatures.SAKURA_TREE),
                    Optional.of(MapleConfiguredFeatures.MAGE_SAKURA_TREE),
                    Optional.empty(),
                    Optional.empty());
}