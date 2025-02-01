package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.tag.MapleItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.skniro.maple.datagen.MapleItemTagGeneration.ModItemTags.C_CHERRY_LOGS;
import static net.minecraft.tags.ItemTags.*;


public class MapleItemTagGeneration extends FabricTagProvider<Item> {
    public MapleItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, Registries.ITEM, completableFuture);
    }

    public static class ModItemTags {
        public static final TagKey<Item> C_SAPLING = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "saplings"));
        public static final TagKey<Item> C_MAPLE_LOGS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "maple_logs"));
        public static final TagKey<Item> C_CHERRY_LOGS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "cherry_logs"));
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        tag(MapleItemTags.REPAIRS_CHERRY_ARMOR)
                .add(MapleArmorItems.Cherry_INGOT);
        tag(MapleItemTags.CHERRY_TOOL_MATERIALS)
                .add(MapleArmorItems.Cherry_INGOT);
        tag(SAPLINGS)
                .add(Item.byBlock(MapleBlocks.MAPLE_SAPLING))
                .add(Item.byBlock(MapleBlocks.CHERRY_SAPLING))
                .add(Item.byBlock(MapleBlocks.GINKGO_SAPLING))
                .add(Item.byBlock(MapleBlocks.SAKURA_SAPLING))
                .add(Item.byBlock(MapleBlocks.RED_MAPLE_SAPLING))
                .setReplace(false);
        tag(C_CHERRY_LOGS)
                .add(Item.byBlock(MapleBlocks.CHERRY_LOG));
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(MapleArmorItems.Cherry_HELMET, MapleArmorItems.Cherry_CHESTPLATE, MapleArmorItems.Cherry_LEGGINGS, MapleArmorItems.Cherry_BOOTS)
                .setReplace(false);
        tag(FOOT_ARMOR)
                .add(MapleArmorItems.Cherry_BOOTS)
                .setReplace(false);
        tag(LEG_ARMOR)
                .add(MapleArmorItems.Cherry_LEGGINGS)
                .setReplace(false);
        tag(CHEST_ARMOR)
                .add(MapleArmorItems.Cherry_CHESTPLATE)
                .setReplace(false);
        tag(HEAD_ARMOR)
                .add(MapleArmorItems.Cherry_HELMET)
                .setReplace(false);
        tag(SWORDS)
                .add(MapleArmorItems.Cherry_SWORD)
                .setReplace(false);
        tag(AXES)
                .add(MapleArmorItems.Cherry_AXE)
                .setReplace(false);
        tag(HOES)
                .add(MapleArmorItems.Cherry_HOE)
                .setReplace(false);
        tag(PICKAXES)
                .add(MapleArmorItems.Cherry_PICKAXE)
                .setReplace(false);
        tag(SHOVELS)
                .add(MapleArmorItems.Cherry_SHOVEL)
                .setReplace(false);
    }


}
