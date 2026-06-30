package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleItems;
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
        public static final TagKey<Item> MAPLE_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, "maple_logs"));
        public static final TagKey<Item> GINKGO_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of(Maple.MOD_ID, "ginkgo_logs"));
        // minecraft namespace tags used by the game that we need to extend
        public static final TagKey<Item> NEEDS_IRON_TOOL_ITEM = TagKey.of(RegistryKeys.ITEM, Identifier.of("minecraft", "needs_iron_tool"));
        public static final TagKey<Item> LOGS_THAT_BURN_ITEM = TagKey.of(RegistryKeys.ITEM, Identifier.of("minecraft", "logs_that_burn"));
        public static final TagKey<Item> STANDING_SIGNS_ITEM = TagKey.of(RegistryKeys.ITEM, Identifier.of("minecraft", "standing_signs"));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        valueLookupBuilder(MapleItemTags.REPAIRS_CHERRY_ARMOR)
                .add(MapleArmorItems.Cherry_INGOT);
        valueLookupBuilder(MapleItemTags.CHERRY_TOOL_MATERIALS)
                .add(MapleArmorItems.Cherry_INGOT);
        valueLookupBuilder(LEAVES)
                .add(Item.fromBlock(MapleBlocks.MAPLE_LEAVES))
                .add(Item.fromBlock(MapleBlocks.GINKGO_LEAVES))
                .add(Item.fromBlock(MapleBlocks.SAKURA_LEAVES))
                .add(Item.fromBlock(MapleBlocks.RED_MAPLE_LEAVES));
        valueLookupBuilder(ModItemTags.MAPLE_LOGS)
                .add(Item.fromBlock(MapleBlocks.MAPLE_LOG))
                .add(Item.fromBlock(MapleBlocks.MAPLE_WOOD))
                .add(Item.fromBlock(MapleBlocks.STRIPPED_MAPLE_LOG))
                .add(Item.fromBlock(MapleBlocks.STRIPPED_MAPLE_WOOD));
        valueLookupBuilder(ModItemTags.GINKGO_LOGS)
                .add(Item.fromBlock(MapleBlocks.GINKGO_LOG))
                .add(Item.fromBlock(MapleBlocks.GINKGO_WOOD))
                .add(Item.fromBlock(MapleBlocks.STRIPPED_GINKGO_LOG))
                .add(Item.fromBlock(MapleBlocks.STRIPPED_GINKGO_WOOD));
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
        // minecraft:item/villager_plantable_seeds -> maple:rice
        valueLookupBuilder(VILLAGER_PLANTABLE_SEEDS)
                .add(MapleItems.Rice)
                .setReplace(false);
        // minecraft:item/standing_signs -> maple signs
        valueLookupBuilder(ModItemTags.STANDING_SIGNS_ITEM)
                .add(Item.fromBlock(MapleSignBlocks.Maple_SIGN))
                .add(Item.fromBlock(MapleSignBlocks.GINKGO_SIGN))
                .setReplace(false);
        // minecraft:item/needs_iron_tool -> item forms of ore blocks
        valueLookupBuilder(ModItemTags.NEEDS_IRON_TOOL_ITEM)
                .add(Item.fromBlock(MapleOreBlocks.DEEPSLATE_Salt_Ore))
                .add(Item.fromBlock(MapleOreBlocks.Salt_Ore))
                .setReplace(false);
        // minecraft:item/logs_that_burn -> maple/ginkgo log items
        valueLookupBuilder(ModItemTags.LOGS_THAT_BURN_ITEM)
                .add(Item.fromBlock(MapleBlocks.MAPLE_LOG))
                .add(Item.fromBlock(MapleBlocks.MAPLE_WOOD))
                .add(Item.fromBlock(MapleBlocks.STRIPPED_MAPLE_LOG))
                .add(Item.fromBlock(MapleBlocks.STRIPPED_MAPLE_WOOD))
                .add(Item.fromBlock(MapleBlocks.GINKGO_LOG))
                .add(Item.fromBlock(MapleBlocks.GINKGO_WOOD))
                .add(Item.fromBlock(MapleBlocks.STRIPPED_GINKGO_LOG))
                .add(Item.fromBlock(MapleBlocks.STRIPPED_GINKGO_WOOD))
                .setReplace(false);
    }


}
