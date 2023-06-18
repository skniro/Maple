package com.skniro.maple.datagen;

import com.skniro.maple.block.Maple_block;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.tag.ItemTags.SAPLINGS;


public class MapleItemTagGeneration extends FabricTagProvider<Item> {
    public MapleItemTagGeneration(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }

    public class ModBlockTags {
        public static final TagKey<Block> EXAMPLE_ORES = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "saplingS"));
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(SAPLINGS)
                .add(Item.fromBlock(Maple_block.MAPLE_SAPLING))
                .add(Item.fromBlock(Maple_block.CHERRY_SAPLING));

    }
}
