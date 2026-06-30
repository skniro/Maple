package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
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


    public static class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "cherry_logs"));
        public static final TagKey<Block> C_PLASTER = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "plaster"));

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        valueLookupBuilder(SAPLINGS)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.CHERRY_SAPLING);
        valueLookupBuilder(C_SAPLING)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.CHERRY_SAPLING);
        valueLookupBuilder(C_MAPLE_LOGS)
                .add(MapleBlocks.MAPLE_LOG);
        valueLookupBuilder(C_CHERRY_LOGS)
                .add(MapleBlocks.CHERRY_LOG);
        valueLookupBuilder(FENCES)
                .add(MapleBlocks.MAPLE_FENCE)
                .add(MapleBlocks.CHERRY_FENCE)
                .add(MapleBlocks.BAMBOO_FENCE);
        valueLookupBuilder(C_PLASTER)
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
        valueLookupBuilder(PICKAXE_MINEABLE)
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
                .add(MapleBlocks.RED_PLASTER)
                .add(MapleOreBlocks.Salt_Ore)
                .add(MapleOreBlocks.DEEPSLATE_Salt_Ore)
                .add(MapleNetherOresBlocks.Nether_Coal_Ore)
                .add(MapleNetherOresBlocks.Nether_Diamond_Ore)
                .add(MapleNetherOresBlocks.Nether_Copper_Ore)
                .add(MapleNetherOresBlocks.Nether_Emerald_Ore)
                .add(MapleNetherOresBlocks.Nether_Iron_Ore)
                .add(MapleNetherOresBlocks.Nether_Gold_Ore)
                .add(MapleNetherOresBlocks.Nether_Lapis_Ore)
                .add(MapleNetherOresBlocks.Nether_Redstone_Ore)
                .setReplace(false);
        valueLookupBuilder(CEILING_HANGING_SIGNS)
                .add(MapleSignBlocks.Maple_HANGING_SIGN)
                .add(MapleSignBlocks.GINKGO_HANGING_SIGN);
        valueLookupBuilder(WALL_HANGING_SIGNS)
                .add(MapleSignBlocks.Maple_WALL_HANGING_SIGN)
                .add(MapleSignBlocks.GINKGO_WALL_HANGING_SIGN);
        // minecraft:block/needs_stone_tool -> add mod ores that require stone
        valueLookupBuilder(NEEDS_STONE_TOOL)
                .add(MapleNetherOresBlocks.Nether_Iron_Ore)
                .add(MapleNetherOresBlocks.Nether_Lapis_Ore)
                .add(MapleNetherOresBlocks.Nether_Copper_Ore);
        // minecraft:block/needs_stone_tool -> add mod ores that require stone
        valueLookupBuilder(NEEDS_STONE_TOOL)
                .add(MapleNetherOresBlocks.Nether_Iron_Ore)
                .add(MapleNetherOresBlocks.Nether_Lapis_Ore)
                .add(MapleNetherOresBlocks.Nether_Copper_Ore);
        // minecraft:block/needs_iron_tool -> add mod ores that require iron
        valueLookupBuilder(NEEDS_IRON_TOOL)
                .add(MapleOreBlocks.DEEPSLATE_Salt_Ore)
                .add(MapleOreBlocks.Salt_Ore)
                .add(MapleNetherOresBlocks.Nether_Diamond_Ore)
                .add(MapleNetherOresBlocks.Nether_Emerald_Ore)
                .add(MapleNetherOresBlocks.Nether_Gold_Ore)
                .add(MapleNetherOresBlocks.Nether_Redstone_Ore)
                .setReplace(false);
        // minecraft:block/logs_that_burn -> maple/ginkgo logs
        valueLookupBuilder(LOGS_THAT_BURN)
                .add(MapleBlocks.MAPLE_LOG)
                .add(MapleBlocks.MAPLE_WOOD)
                .add(MapleBlocks.STRIPPED_MAPLE_LOG)
                .add(MapleBlocks.STRIPPED_MAPLE_WOOD)
                .add(MapleBlocks.GINKGO_LOG)
                .add(MapleBlocks.GINKGO_WOOD)
                .add(MapleBlocks.STRIPPED_GINKGO_LOG)
                .add(MapleBlocks.STRIPPED_GINKGO_WOOD)
                .setReplace(false);
        // minecraft:block/crops -> maples rice plant
        valueLookupBuilder(CROPS)
                .add(MapleBlocks.RICE)
                .setReplace(false);
    }
}
