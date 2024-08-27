package com.skniro.maple;


import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.util.MapleFlammableBlocks;
import com.skniro.maple.util.MapleLootTableModifiers;
import com.skniro.maple.util.MapleStrippableBlocks;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.feature.MapleBiomeFeatures;
import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import com.skniro.maple.world.gen.MapleLakeGeneration;
import com.skniro.maple.world.gen.MapleTreeGeneration;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.gen.MapleOreGeneration;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;


public class MapleContent {


    public static void registerItem(){
        MapleItems.registerModItems();
        GlassCupItems.registerModItems();
        MapleFoodComponents.registerMapleFoodItems();
        MapleArmorItems.registerMapleArmorItems();
    }
    public static void registerBlock(){
        MapleFlammableBlocks.registerFlammableBlocks();
        MapleStrippableBlocks.registerStrippables();
        MapleBlocks.registerMapleBlocks();
        MapleSignBlocks.registerMapleSignBlocks();
        MapleOreBlocks.registerMapleOreBlocks();
    }

    public static void CreativeTab() {
    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        MapleOreGeneration.generateOres();
        MapleBiomeKeys.registerBiome();
        MapleBiomeFeatures.registerBiomesFeatures();
        MapleLakeGeneration.generateHotSpringLake();
    }
    public static void registerMapleConfigured() {
        MapleConfiguredFeatures.registerConfiguredFeatures();
    }

    public static void registerBlockEntityType() {
        MapleBlockEntityType.registerMapleBlockEntityType();
        MapleParticleTypes.registerParticleTypes();
    }

    public static void registerFluid(){
        MapleFluids.registerFluids();
        MapleFluidBlockOrItem.registerFluidBlocks();
        MapleFluidBlockOrItem.registerFluidItems();
    }

    public static void registerMapleLootTable() {
        MapleLootTableModifiers.modifyLootTables();
    }

    public static void registerMapleCompostableItems() {
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.CHERRY_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.MAPLE_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.RED_MAPLE_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.SAKURA_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.GINKGO_SAPLING, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.CHERRY_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.MAPLE_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.RED_MAPLE_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.SAKURA_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.GINKGO_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.Maple_CARPET, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.RED_MAPLE_CARPET, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.GINKGO_CARPET, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleBlocks.SAKURA_CARPET, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleItems.Rice, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(MapleItems.SOYBEAN, 0.3f);
    }
}

