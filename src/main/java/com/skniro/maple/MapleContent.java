package com.skniro.maple;


import com.mojang.datafixers.schemas.Schema;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.misc.qsldatafixupper.api.QuiltDataFixerBuilder;
import com.skniro.maple.misc.qsldatafixupper.api.QuiltDataFixes;
import com.skniro.maple.misc.qsldatafixupper.api.SimpleFixes;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.util.MapleFlammableBlocks;
import com.skniro.maple.util.MapleStrippableBlocks;
import com.skniro.maple.world.feature.MapleConfiguredFeatures;
import com.skniro.maple.world.feature.MaplePlacedFeatures;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import com.skniro.maple.world.feature.MapleBiomeFeatures;
import com.skniro.maple.world.gamerules.MapleGameRules;
import com.skniro.maple.world.gen.MapleLakeGeneration;
import com.skniro.maple.world.gen.MapleOreGeneration;
import com.skniro.maple.world.gen.MapleTreeGeneration;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.datafixer.schema.IdentifierNormalizingSchema;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;


public class MapleContent {


    public static void registerItem(){
        MapleItems.registerModItems();
        GlassCupItems.registerModItems();
        MapleFoodComponents.registerMapleFoodItems();
    }
    public static void registerBlock(){
        MapleFlammableBlocks.registerFlammableBlocks();
        MapleStrippableBlocks.registerStrippables();
        MapleBlocks.registerMapleBlocks();
        MapleSignBlocks.registerMapleSignBlocks();
        MapleOreBlocks.registerMapleOreBlocks();
        MapleNetherOresBlocks.registerNetherOresBlock();
    }

    public static void registerFluid(){
        MapleFluids.registerFluids();
        MapleFluidBlockOrItem.registerFluidBlocks();
        MapleFluidBlockOrItem.registerFluidItems();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group).register(content -> {
            content.add(MapleBlocks.MAPLE_LOG);
            content.add(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(MapleBlocks.MAPLE_WOOD);
            content.add(MapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(MapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(MapleBlocks.MAPLE_SAPLING);
            content.add(MapleBlocks.RED_MAPLE_SAPLING);
            content.add(MapleBlocks.SAKURA_SAPLING);
            //content.add(MapleBlocks.SAKURA_CARPET);
            content.add(MapleBlocks.MAPLE_LEAVES);
            content.add(MapleBlocks.SAKURA_LEAVES);
            content.add(MapleBlocks.MAPLE_PLANKS);
            content.add(MapleBlocks.RED_MAPLE_LEAVES);
            content.add(MapleBlocks.MAPLE_BUTTON);
            content.add(MapleBlocks.MAPLE_STAIRS);
            content.add(MapleBlocks.MAPLE_SLAB);
            content.add(MapleBlocks.MAPLE_FENCE);
            content.add(MapleBlocks.MAPLE_FENCE_GATE);
            content.add(MapleBlocks.MAPLE_TRAPDOOR);
            content.add(MapleBlocks.MAPLE_PRESSURE_PLATE);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.WHITE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIME_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIME_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.PINK_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.RED_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.RED_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB);
            content.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS);
            content.add(MapleBlocks.GLASS_SLAB);
            content.add(MapleBlocks.GLASS_STAIRS);
            content.add(MapleItems.MAPLE_SIGN);
            content.add(MapleItems.MAPLE_DOOR);
            content.add(MapleItems.MAPLE_BOAT);
            content.add(MapleItems.MAPLE_CHEST_BOAT);
            content.add(MapleBlocks.GINKGO_LOG);
            content.add(MapleBlocks.STRIPPED_GINKGO_LOG);
            content.add(MapleBlocks.STRIPPED_GINKGO_WOOD);
            content.add(MapleBlocks.GINKGO_WOOD);
            content.add(MapleBlocks.STRIPPED_GINKGO_WOOD);
            content.add(MapleBlocks.STRIPPED_GINKGO_LOG);
            content.add(MapleBlocks.GINKGO_SAPLING);
            content.add(MapleBlocks.GINKGO_LEAVES);
            content.add(MapleBlocks.GINKGO_PLANKS);
            content.add(MapleBlocks.GINKGO_BUTTON);
            content.add(MapleBlocks.GINKGO_STAIRS);
            content.add(MapleBlocks.GINKGO_SLAB);
            content.add(MapleBlocks.GINKGO_FENCE);
            content.add(MapleBlocks.GINKGO_FENCE_GATE);
/*            content.add(MapleBlocks.GINKGO_TRAPDOOR);*/
            content.add(MapleBlocks.GINKGO_PRESSURE_PLATE);
            content.add(MapleItems.GINKGO_SIGN);
/*            content.add(MapleItems.GINKGO_DOOR);*/
            content.add(MapleItems.GINKGO_BOAT);
            content.add(MapleItems.GINKGO_CHEST_BOAT);
            content.add(MapleOreBlocks.Salt_Ore);
            content.add(MapleOreBlocks.DEEPSLATE_Salt_Ore);
            content.add(MapleItems.SNOWBALL_STONE);
            content.add(MapleItems.SNOWBALL_Diamond);
            content.add(MapleItems.SNOWBALL_Gold);
            content.add(MapleItems.SNOWBALL_ICE);
            content.add(MapleItems.SNOWBALL_IRON);
            content.add(MapleItems.SNOWBALL_Compression);
            content.add(MapleItems.SNOWBALL_Teleporting);
            content.add(MapleItems.SNOWBALL_Confusion);
            content.add(MapleItems.SNOWBALL_Instant_Health);
            content.add(MapleItems.SNOWBALL_Poison);
            content.add(MapleBlocks.TATAMI);
            content.add(MapleBlocks.TATAMI_SLAB);
            content.add(MapleFluidBlockOrItem.Hot_Spring_BUCKET);
            content.add(MapleNetherOresBlocks.Nether_Coal_Ore);
            content.add(MapleNetherOresBlocks.Nether_Copper_Ore);
            content.add(MapleNetherOresBlocks.Nether_Diamond_Ore);
            content.add(MapleNetherOresBlocks.Nether_Emerald_Ore);
            content.add(MapleNetherOresBlocks.Nether_Gold_Ore);
            content.add(MapleNetherOresBlocks.Nether_Iron_Ore);
            content.add(MapleNetherOresBlocks.Nether_Lapis_Ore);
            content.add(MapleNetherOresBlocks.Nether_Redstone_Ore);
        });

        ItemGroupEvents.modifyEntriesEvent(Maple.Maple_Group_Food).register(content -> {
            content.add(MapleItems.Flour);
            content.add(MapleItems.MapleSyrup);
            content.add(MapleItems.Cream);
            content.add(MapleItems.MILK_BOTTOM);
            content.add(MapleItems.SOYBEAN);
            content.add(MapleItems.Salt);
            content.add(MapleItems.Rice);
            content.add(MapleFoodComponents.Sanshoku_Dango);
            content.add(MapleFoodComponents.Anko_Dango);
            content.add(MapleFoodComponents.Zunda_Dango);
            content.add(MapleFoodComponents.Kinako_Dango);
            content.add(MapleFoodComponents.Mochi);
            content.add(MapleFoodComponents.SakuraMochi);
            content.add(MapleFoodComponents.TOFU);
            content.add(MapleFoodComponents.MILK_ICECREAM);
            content.add(MapleFoodComponents.Cooked_Rice);
        });


    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        MapleConfiguredFeatures.registerConfiguredFeatures();
        MaplePlacedFeatures.registerPlacedFeatures();
        MapleOreGeneration.generateOres();
        MapleBiomeKeys.registerBiome();
        MapleBiomeFeatures.registerBiomesFeatures();
        MapleLakeGeneration.generateHotSpringLake();
    }

    public static void registerBlockEntityType() {
        MapleBlockEntityType.registerMapleBlockEntityType();
        MapleParticleTypes.registerParticleTypes();
    }

    public static void registerCommand() {
        MapleGameRules.maplegamerule();
    }

    private static final int DATA_VERSION = 3;
    public static void datafix(final @NotNull ModContainer mod) {
        QuiltDataFixerBuilder builder = new QuiltDataFixerBuilder(DATA_VERSION);
        builder.addSchema(0, QuiltDataFixes.BASE_SCHEMA);
        Schema schemaV1 = builder.addSchema(3, IdentifierNormalizingSchema::new);
        SimpleFixes.addItemRenameFix(builder, "Rename old_item to new_item",
                new Identifier(Maple.MOD_ID, "cherry_log"), new Identifier(Maple.MOD_ID, "cherry_log"), schemaV1);
        SimpleFixes.addBlockRenameFix(builder, "Rename cherry_log to vanilla",
                new Identifier(Maple.MOD_ID, "cherry_log"), new Identifier(Maple.MOD_ID, "cherry_log"), schemaV1);
/*        Schema schemaV2 = builder.addSchema(2, IdentifierNormalizingSchema::new);
        SimpleFixes.addItemRenameFix(builder, "Rename new_item to fine_item",
                new Identifier(Maple.MOD_ID, "new_item"), new Identifier(Maple.MOD_ID, "fine_item"), schemaV2);
        SimpleFixes.addBlockRenameFix(builder, "Rename old_block to cool_block",
                new Identifier(Maple.MOD_ID, "old_block"), new Identifier(Maple.MOD_ID, "cool_block"), schemaV2);*/
        QuiltDataFixes.buildAndRegisterFixer(mod,new QuiltDataFixerBuilder(3));
    }



}

