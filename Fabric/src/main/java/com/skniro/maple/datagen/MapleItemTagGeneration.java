package com.skniro.maple.datagen;




import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.tag.MapleItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.tags.ItemTags.*;


public class MapleItemTagGeneration extends FabricTagsProvider.ItemTagsProvider{
    public MapleItemTagGeneration(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }

    public static class ModItemTags {
        public static final TagKey<Item> C_SAPLING = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", "saplings"));
        public static final TagKey<Item> C_MAPLE_LOGS = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", "maple_logs"));
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        valueLookupBuilder(MapleItemTags.REPAIRS_CHERRY_ARMOR)
                .add(MapleArmorItems.Cherry_INGOT);
        valueLookupBuilder(MapleItemTags.CHERRY_TOOL_MATERIALS)
                .add(MapleArmorItems.Cherry_INGOT);
        valueLookupBuilder(LEAVES)
                .add(Item.byBlock(MapleBlocks.MAPLE_LEAVES))
                .add(Item.byBlock(MapleBlocks.GINKGO_LEAVES))
                .add(Item.byBlock(MapleBlocks.SAKURA_LEAVES))
                .add(Item.byBlock(MapleBlocks.RED_MAPLE_LEAVES));
        valueLookupBuilder(SAPLINGS)
                .add(Item.byBlock(MapleBlocks.MAPLE_SAPLING))
                .add(Item.byBlock(MapleBlocks.GINKGO_SAPLING))
                .add(Item.byBlock(MapleBlocks.SAKURA_SAPLING))
                .add(Item.byBlock(MapleBlocks.RED_MAPLE_SAPLING))
                .setReplace(false);
        valueLookupBuilder(PLANKS)
                .add(Item.byBlock(MapleBlocks.MAPLE_PLANKS))
                .add(Item.byBlock(MapleBlocks.GINKGO_PLANKS));
        valueLookupBuilder(TRIMMABLE_ARMOR)
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
            valueLookupBuilder(ConventionalItemTags.OVERWORLD_NATURAL_LOGS)
                .add(Item.byBlock(MapleBlocks.MAPLE_LOG))
                .add(Item.byBlock(MapleBlocks.GINKGO_LOG));
        valueLookupBuilder(WOODEN_FENCES)
                .add(Item.byBlock(MapleBlocks.MAPLE_FENCE))
                .add(Item.byBlock(MapleBlocks.GINKGO_FENCE));
        valueLookupBuilder(WOODEN_BUTTONS)
                .add(Item.byBlock(MapleBlocks.MAPLE_BUTTON))
                .add(Item.byBlock(MapleBlocks.GINKGO_BUTTON));
        valueLookupBuilder(WOODEN_DOORS)
                .add(Item.byBlock(MapleBlocks.MAPLE_DOOR))
                .add(Item.byBlock(MapleBlocks.GINKGO_DOOR));
        valueLookupBuilder(WOODEN_PRESSURE_PLATES)
                .add(Item.byBlock(MapleBlocks.MAPLE_PRESSURE_PLATE))
                .add(Item.byBlock(MapleBlocks.GINKGO_PRESSURE_PLATE));
        valueLookupBuilder(WOODEN_SLABS)
                .add(Item.byBlock(MapleBlocks.MAPLE_SLAB))
                .add(Item.byBlock(MapleBlocks.GINKGO_SLAB));
        valueLookupBuilder(WOODEN_STAIRS)
                .add(Item.byBlock(MapleBlocks.MAPLE_STAIRS))
                .add(Item.byBlock(MapleBlocks.GINKGO_STAIRS));
        valueLookupBuilder(WOODEN_TRAPDOORS)
                .add(Item.byBlock(MapleBlocks.MAPLE_TRAPDOOR))
                .add(Item.byBlock(MapleBlocks.GINKGO_TRAPDOOR));
    }


}
