package com.skniro.maple.datagen;




import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.tag.MapleItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.skniro.maple.datagen.MapleItemTagGeneration.ModItemTags.C_CHERRY_LOGS;
import static net.minecraft.registry.tag.ItemTags.*;


public class MapleItemTagGeneration extends FabricTagProvider.ItemTagProvider{
    public MapleItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, completableFuture);
    }

    public static class ModItemTags {
        public static final TagKey<Item> C_SAPLING = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "saplings"));
        public static final TagKey<Item> C_MAPLE_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "maple_logs"));
        public static final TagKey<Item> C_CHERRY_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "cherry_logs"));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        valueLookupBuilder(MapleItemTags.REPAIRS_CHERRY_ARMOR)
                .add(MapleArmorItems.Cherry_INGOT);
        valueLookupBuilder(MapleItemTags.CHERRY_TOOL_MATERIALS)
                .add(MapleArmorItems.Cherry_INGOT);
        valueLookupBuilder(SAPLINGS)
                .add(Item.fromBlock(MapleBlocks.MAPLE_SAPLING))
                .add(Item.fromBlock(MapleBlocks.CHERRY_SAPLING))
                .add(Item.fromBlock(MapleBlocks.GINKGO_SAPLING))
                .add(Item.fromBlock(MapleBlocks.SAKURA_SAPLING))
                .add(Item.fromBlock(MapleBlocks.RED_MAPLE_SAPLING))
                .setReplace(false);
        valueLookupBuilder(C_CHERRY_LOGS)
                .add(Item.fromBlock(MapleBlocks.CHERRY_LOG));
        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(MapleArmorItems.Cherry_HELMET, MapleArmorItems.Cherry_CHESTPLATE, MapleArmorItems.Cherry_LEGGINGS, MapleArmorItems.Cherry_BOOTS)
                .setReplace(false);
        valueLookupBuilder(FOOT_ARMOR)
                .add(MapleArmorItems.Cherry_BOOTS)
                .setReplace(false);
        valueLookupBuilder(LEG_ARMOR)
                .add(MapleArmorItems.Cherry_LEGGINGS)
                .setReplace(false);
        valueLookupBuilder(CHEST_ARMOR)
                .add(MapleArmorItems.Cherry_CHESTPLATE)
                .setReplace(false);
        valueLookupBuilder(HEAD_ARMOR)
                .add(MapleArmorItems.Cherry_HELMET)
                .setReplace(false);
        valueLookupBuilder(SWORDS)
                .add(MapleArmorItems.Cherry_SWORD)
                .setReplace(false);
        valueLookupBuilder(AXES)
                .add(MapleArmorItems.Cherry_AXE)
                .setReplace(false);
        valueLookupBuilder(HOES)
                .add(MapleArmorItems.Cherry_HOE)
                .setReplace(false);
        valueLookupBuilder(PICKAXES)
                .add(MapleArmorItems.Cherry_PICKAXE)
                .setReplace(false);
        valueLookupBuilder(SHOVELS)
                .add(MapleArmorItems.Cherry_SHOVEL)
                .setReplace(false);
    }


}
