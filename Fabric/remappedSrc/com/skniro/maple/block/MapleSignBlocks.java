package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;
import net.minecraft.block.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.item.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import java.util.function.Function;

public class MapleSignBlocks {
    public static final Block CHERRY_SIGN = registerBlockWithoutItem("cherry_sign",(settings)->  new StandingSignBlock(WoodType.CHERRY, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava());
    public static final Block CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign",(settings)->  new WallSignBlock(WoodType.CHERRY, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().overrideLootTable((CHERRY_SIGN.getLootTable())));
    public static final Block Maple_SIGN = registerBlockWithoutItem("maple_sign",(settings)-> new StandingSignBlock(MapleSignTypes.MAPLE, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava());
    public static final Block Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",(settings)-> new WallSignBlock(MapleSignTypes.MAPLE, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().overrideLootTable((Maple_SIGN.getLootTable())));
    public static final Block BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign",(settings)->  new StandingSignBlock(WoodType.BAMBOO, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava());
    public static final Block BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",(settings)-> new WallSignBlock(WoodType.BAMBOO, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().overrideLootTable((BAMBOO_SIGN.getLootTable())));
    public static final Block GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign",(settings)->  new StandingSignBlock(MapleSignTypes.GINKGO, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava());
    public static final Block GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",(settings)-> new WallSignBlock(MapleSignTypes.GINKGO, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().overrideLootTable((GINKGO_SIGN.getLootTable())));
    public static final Block GINKGO_HANGING_SIGN = registerBlockWithoutItem("ginkgo_hanging_sign",(settings)-> new CeilingHangingSignBlock(MapleSignTypes.GINKGO, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava());
    public static final Block GINKGO_WALL_HANGING_SIGN = registerBlockWithoutItem("ginkgo_wall_hanging_sign",(settings)->  new WallHangingSignBlock(MapleSignTypes.GINKGO, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().overrideLootTable(GINKGO_HANGING_SIGN.getLootTable()));
    public static final Block Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign",(settings)-> new CeilingHangingSignBlock(MapleSignTypes.MAPLE, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava());
    public static final Block Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign",(settings)->  new WallHangingSignBlock(MapleSignTypes.MAPLE, settings),BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().overrideLootTable((Maple_HANGING_SIGN.getLootTable())));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, ResourceKey<CreativeModeTab> tab) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        registerBlockItem(name, block, tab);
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }

    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name));
    }

    public static void registerMapleSignBlocks() {
        Maple.LOGGER.debug("Registering MapleSignBlocks for " + Maple.MOD_ID);
    }
}
