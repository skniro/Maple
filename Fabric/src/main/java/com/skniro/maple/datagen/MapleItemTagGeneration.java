package com.skniro.maple.datagen;

import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleArmorItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


import java.util.concurrent.CompletableFuture;

import static com.skniro.maple.datagen.MapleItemTagGeneration.ModItemTags.C_CHERRY_LOGS;
import static net.minecraft.registry.tag.ItemTags.SAPLINGS;


public class MapleItemTagGeneration extends FabricTagProvider<Item> {
    public MapleItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, RegistryKeys.ITEM, completableFuture);
    }

    public class ModItemTags {
        public static final TagKey<Item> C_SAPLING = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "saplings"));
        public static final TagKey<Item> C_MAPLE_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "maple_logs"));
        public static final TagKey<Item> C_CHERRY_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "cherry_logs"));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(SAPLINGS)
                .add(Item.fromBlock(MapleBlocks.MAPLE_SAPLING))
                .add(Item.fromBlock(MapleBlocks.CHERRY_SAPLING));
        getOrCreateTagBuilder(C_CHERRY_LOGS)
                .add(Item.fromBlock(MapleBlocks.CHERRY_LOG));
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(MapleArmorItems.Cherry_HELMET, MapleArmorItems.Cherry_CHESTPLATE, MapleArmorItems.Cherry_LEGGINGS, MapleArmorItems.Cherry_BOOTS);
    }


}
