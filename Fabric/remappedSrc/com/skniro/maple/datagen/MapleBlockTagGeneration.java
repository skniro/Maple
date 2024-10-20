package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import java.util.concurrent.CompletableFuture;

import static com.skniro.maple.datagen.MapleBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.tags.BlockTags.*;


public class MapleBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public MapleBlockTagGeneration(FabricDataOutput dataGenerator,CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }


    public static class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "cherry_logs"));
        public static final TagKey<Block> C_PLASTER = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "plaster"));

    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        tag(SAPLINGS)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.CHERRY_SAPLING);
        tag(C_SAPLING)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.CHERRY_SAPLING);
        tag(C_MAPLE_LOGS)
                .add(MapleBlocks.MAPLE_LOG);
        tag(C_CHERRY_LOGS)
                .add(MapleBlocks.CHERRY_LOG);
        tag(FENCES)
                .add(MapleBlocks.MAPLE_FENCE)
                .add(MapleBlocks.CHERRY_FENCE)
                .add(MapleBlocks.BAMBOO_FENCE);
        tag(C_PLASTER)
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
        tag(CEILING_HANGING_SIGNS)
                .add(MapleSignBlocks.Maple_HANGING_SIGN)
                .add(MapleSignBlocks.GINKGO_HANGING_SIGN);
        tag(WALL_HANGING_SIGNS)
                .add(MapleSignBlocks.Maple_WALL_HANGING_SIGN)
                .add(MapleSignBlocks.GINKGO_WALL_HANGING_SIGN);
    }
}
