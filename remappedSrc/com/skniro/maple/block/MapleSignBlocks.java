package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;
import net.minecraft.block.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MapleSignBlocks {
    public static final Block CHERRY_SIGN = registerBlockWithoutItem("cherry_sign", new StandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), WoodType.CHERRY),Maple.Maple_Group);
    public static final Block CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign", new WallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(CHERRY_SIGN), WoodType.CHERRY),Maple.Maple_Group);
    public static final Block Maple_SIGN = registerBlockWithoutItem("maple_sign",new StandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(),MapleSignTypes.MAPLE),Maple.Maple_Group);
    public static final Block Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",new WallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(Maple_SIGN),MapleSignTypes.MAPLE),Maple.Maple_Group);
    public static final Block BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign", new StandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), WoodType.BAMBOO),Maple.Maple_Group);
    public static final Block BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",new WallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(BAMBOO_SIGN),WoodType.BAMBOO),Maple.Maple_Group);
    public static final Block GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign", new StandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), MapleSignTypes.GINKGO),Maple.Maple_Group);
    public static final Block GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",new WallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(GINKGO_SIGN),MapleSignTypes.GINKGO),Maple.Maple_Group);
    public static final Block GINKGO_HANGING_SIGN = registerBlockWithoutItem("ginkgo_hanging_sign", new CeilingHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), MapleSignTypes.GINKGO),Maple.Maple_Group);
    public static final Block GINKGO_WALL_HANGING_SIGN = registerBlockWithoutItem("ginkgo_wall_hanging_sign", new WallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(GINKGO_HANGING_SIGN), MapleSignTypes.GINKGO),Maple.Maple_Group);
    public static final Block Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign", new CeilingHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), MapleSignTypes.MAPLE),Maple.Maple_Group);
    public static final Block Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign", new WallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(Maple_HANGING_SIGN), MapleSignTypes.MAPLE),Maple.Maple_Group);


    private static Block registerBlockWithoutItem(String name, Block block, ResourceKey<CreativeModeTab> group) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Maple.MOD_ID, name), block);
    }

    public static void registerMapleSignBlocks() {
        Maple.LOGGER.debug("Registering MapleSignBlocks for " + Maple.MOD_ID);
    }
}
