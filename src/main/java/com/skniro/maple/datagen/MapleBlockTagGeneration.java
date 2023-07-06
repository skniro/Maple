package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.skniro.maple.datagen.MapleBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.tag.BlockTags.FENCES;
import static net.minecraft.tag.BlockTags.SAPLINGS;


public class MapleBlockTagGeneration extends FabricTagProvider<Block> {
    public MapleBlockTagGeneration(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK);
    }

    public class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "cherry_logs"));

    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(SAPLINGS)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.CHERRY_SAPLING);
        getOrCreateTagBuilder(C_SAPLING)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.CHERRY_SAPLING);
        getOrCreateTagBuilder(C_MAPLE_LOGS)
                .add(MapleBlocks.MAPLE_LOG);
        getOrCreateTagBuilder(C_CHERRY_LOGS)
                .add(MapleBlocks.CHERRY_LOG);
        getOrCreateTagBuilder(FENCES)
                .add(MapleBlocks.MAPLE_FENCE)
                .add(MapleBlocks.CHERRY_FENCE)
                .add(MapleBlocks.BAMBOO_FENCE);

    }
}
