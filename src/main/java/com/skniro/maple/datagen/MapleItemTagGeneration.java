package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.skniro.maple.datagen.MapleItemTagGeneration.ModItemTags.*;
import static net.minecraft.tag.ItemTags.SAPLINGS;


public class MapleItemTagGeneration extends FabricTagProvider<Item> {
    public MapleItemTagGeneration(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }

    public class ModItemTags {
        public static final TagKey<Item> C_SAPLING = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "saplings"));
        public static final TagKey<Item> C_MAPLE_LOGS = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "maple_logs"));
        public static final TagKey<Item> C_CHERRY_LOGS = TagKey.of(Registry.ITEM_KEY, new Identifier("c", "cherry_logs"));
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(SAPLINGS)
                .add(Item.fromBlock(MapleBlocks.MAPLE_SAPLING))
                .add(Item.fromBlock(MapleBlocks.CHERRY_SAPLING));
        getOrCreateTagBuilder(C_CHERRY_LOGS)
                .add(Item.fromBlock(MapleBlocks.CHERRY_LOG));

    }
}
