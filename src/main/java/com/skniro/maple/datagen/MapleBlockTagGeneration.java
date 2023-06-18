package com.skniro.maple.datagen;

import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.skniro.maple.datagen.MapleBlockTagGeneration.ModBlockTags.CSAPLING;
import static net.minecraft.tag.BlockTags.SAPLINGS;


public class MapleBlockTagGeneration extends FabricTagProvider<Block> {
    public MapleBlockTagGeneration(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK);
    }

    public class ModBlockTags {
        public static final TagKey<Block> CSAPLING = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "saplings"));
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(SAPLINGS)
                .add(Maple_block.MAPLE_SAPLING)
                .add(Maple_block.CHERRY_SAPLING);
        getOrCreateTagBuilder(CSAPLING)
                .add(Maple_block.MAPLE_SAPLING)
                .add(Maple_block.CHERRY_SAPLING);
    }
}
