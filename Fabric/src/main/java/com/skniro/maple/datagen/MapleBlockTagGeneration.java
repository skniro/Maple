package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import java.util.concurrent.CompletableFuture;

import static com.skniro.maple.datagen.MapleBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.tags.BlockTags.*;


public class MapleBlockTagGeneration extends FabricTagsProvider.BlockTagsProvider {
    public MapleBlockTagGeneration(FabricPackOutput dataGenerator,CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }


    public static class ModBlockTags {
        public static final TagKey<Block> C_PLASTER = TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("c", "plaster"));

    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        valueLookupBuilder(MINEABLE_WITH_AXE)
                .add(MapleBlocks.TATAMI)
                .add(MapleBlocks.TATAMI_SLAB);
        valueLookupBuilder(ConventionalBlockTags.COAL_ORES)
                .add(MapleNetherOresBlocks.Nether_Coal_Ore);
        valueLookupBuilder(ConventionalBlockTags.COPPER_ORES)
                .add(MapleNetherOresBlocks.Nether_Copper_Ore);
        valueLookupBuilder(ConventionalBlockTags.DIAMOND_ORES)
                .add(MapleNetherOresBlocks.Nether_Diamond_Ore);
        valueLookupBuilder(ConventionalBlockTags.EMERALD_ORES)
                .add(MapleNetherOresBlocks.Nether_Emerald_Ore);
        valueLookupBuilder(ConventionalBlockTags.IRON_ORES)
                .add(MapleNetherOresBlocks.Nether_Iron_Ore);
        valueLookupBuilder(ConventionalBlockTags.LAPIS_ORES)
                .add(MapleNetherOresBlocks.Nether_Lapis_Ore);
        valueLookupBuilder(ConventionalBlockTags.REDSTONE_ORES)
                .add(MapleNetherOresBlocks.Nether_Redstone_Ore);
        valueLookupBuilder(PLANKS)
                .add(MapleBlocks.MAPLE_PLANKS)
                .add(MapleBlocks.GINKGO_PLANKS);
        valueLookupBuilder(SAPLINGS)
                .add(MapleBlocks.MAPLE_SAPLING)
                .add(MapleBlocks.GINKGO_SAPLING)
                .add(MapleBlocks.SAKURA_LEAVES)
                .add(MapleBlocks.RED_MAPLE_SAPLING);
        valueLookupBuilder(LEAVES)
                .add(MapleBlocks.MAPLE_LEAVES)
                .add(MapleBlocks.GINKGO_LEAVES)
                .add(MapleBlocks.SAKURA_LEAVES)
                .add(MapleBlocks.RED_MAPLE_LEAVES);
        valueLookupBuilder(ConventionalBlockTags.OVERWORLD_NATURAL_LOGS)
                .add(MapleBlocks.MAPLE_LOG)
                .add(MapleBlocks.GINKGO_LOG);
        valueLookupBuilder(WOODEN_FENCES)
                .add(MapleBlocks.MAPLE_FENCE)
                .add(MapleBlocks.GINKGO_FENCE);
        valueLookupBuilder(WOODEN_BUTTONS)
                .add(MapleBlocks.MAPLE_BUTTON)
                .add(MapleBlocks.GINKGO_BUTTON);
        valueLookupBuilder(WOODEN_DOORS)
                .add(MapleBlocks.MAPLE_DOOR)
                .add(MapleBlocks.GINKGO_DOOR);
        valueLookupBuilder(WOODEN_PRESSURE_PLATES)
                .add(MapleBlocks.MAPLE_PRESSURE_PLATE)
                .add(MapleBlocks.GINKGO_PRESSURE_PLATE);
        valueLookupBuilder(WOODEN_SLABS)
                .add(MapleBlocks.MAPLE_SLAB)
                .add(MapleBlocks.GINKGO_SLAB);
        valueLookupBuilder(WOODEN_STAIRS)
                .add(MapleBlocks.MAPLE_STAIRS)
                .add(MapleBlocks.GINKGO_STAIRS);
        valueLookupBuilder(WOODEN_TRAPDOORS)
                .add(MapleBlocks.MAPLE_TRAPDOOR)
                .add(MapleBlocks.GINKGO_TRAPDOOR);
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
        valueLookupBuilder(MINEABLE_WITH_PICKAXE)
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
        valueLookupBuilder(STANDING_SIGNS)
                .add(MapleSignBlocks.Maple_SIGN)
                .add(MapleSignBlocks.GINKGO_SIGN);
        valueLookupBuilder(WALL_SIGNS)
                .add(MapleSignBlocks.Maple_WALL_SIGN)
                .add(MapleSignBlocks.GINKGO_WALL_SIGN);
        valueLookupBuilder(CEILING_HANGING_SIGNS)
                .add(MapleSignBlocks.Maple_HANGING_SIGN)
                .add(MapleSignBlocks.GINKGO_HANGING_SIGN);
        valueLookupBuilder(WALL_HANGING_SIGNS)
                .add(MapleSignBlocks.Maple_WALL_HANGING_SIGN)
                .add(MapleSignBlocks.GINKGO_WALL_HANGING_SIGN);
    }
}
