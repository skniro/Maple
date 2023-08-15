package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.skniro.maple.datagen.MapleBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.registry.tag.BlockTags.FENCES;
import static net.minecraft.registry.tag.BlockTags.SAPLINGS;


public class MapleBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public MapleBlockTagGeneration(FabricDataOutput dataGenerator,CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

    }

    public class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "cherry_logs"));

    }


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
