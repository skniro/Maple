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
import static net.minecraft.registry.tag.BlockTags.*;


public class MapleBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public MapleBlockTagGeneration(FabricDataOutput dataGenerator,CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, completableFuture);
    }


    public class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "cherry_logs"));
        public static final TagKey<Block> C_PLASTER = TagKey.of(RegistryKeys.BLOCK, new Identifier("c", "plaster"));

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
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
        getOrCreateTagBuilder(C_PLASTER)
                .add(MapleBlocks.GREEN_PLASTER)
                .add(MapleBlocks.PLASTER)
                .add(MapleBlocks.ORANGE_PLASTER)
                .add(MapleBlocks.MAGENTA_PLASTER)
                .add(MapleBlocks.LIGHT_BLUE_PLASTER)
                .add(MapleBlocks.YELLOW_PLASTER)
                .add(MapleBlocks.LIME_PLASTER)
                .add(MapleBlocks.PINK_PLASTER)
                .add(MapleBlocks.GRAY_PLASTER)
                .add(MapleBlocks.LIGHT_GRAY_PLASTER)
                .add(MapleBlocks.CYAN_PLASTER)
                .add(MapleBlocks.PURPLE_PLASTER)
                .add(MapleBlocks.BLUE_PLASTER)
                .add(MapleBlocks.BROWN_PLASTER)
                .add(MapleBlocks.RED_PLASTER);
    }
}
