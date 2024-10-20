package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleWoodTypes;

import com.skniro.maple.block.init.MapleHangingSignBlock;
import com.skniro.maple.block.init.MapleStandingSignBlock;
import com.skniro.maple.block.init.MapleWallHangingSignBlock;
import com.skniro.maple.block.init.MapleWallSignBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleSignBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MODID);

    public static final RegistryObject<Block> CHERRY_SIGN = registerBlockWithoutItem("cherry_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), WoodType.CHERRY));
    public static final RegistryObject<Block> CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_LOG.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(CHERRY_SIGN.get()), WoodType.CHERRY));
    public static final RegistryObject<Block> Maple_SIGN = registerBlockWithoutItem("maple_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), MapleWoodTypes.MAPLE));
    public static final RegistryObject<Block> Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(Maple_SIGN.get()), MapleWoodTypes.MAPLE));
    public static final RegistryObject<Block> BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0f), WoodType.BAMBOO));
    public static final RegistryObject<Block> BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(BAMBOO_SIGN.get()), WoodType.BAMBOO));
   public static final RegistryObject<Block> GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign",
           ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), MapleWoodTypes.GINKGO));
    public static final RegistryObject<Block> GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(GINKGO_SIGN.get()), MapleWoodTypes.GINKGO));
    public static final RegistryObject<Block> Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign",
            ()-> new MapleHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), MapleWoodTypes.MAPLE));
    public static final RegistryObject<Block> GINKGO_HANGING_SIGN = registerBlockWithoutItem("ginkgo_hanging_sign",
            ()-> new MapleHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), MapleWoodTypes.GINKGO));
    public static final RegistryObject<Block> GINKGO_WALL_HANGING_SIGN = registerBlockWithoutItem("ginkgo_wall_hanging_sign",
            ()-> new MapleWallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(GINKGO_HANGING_SIGN.get()), MapleWoodTypes.GINKGO));
    public static final RegistryObject<Block> Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign",
            ()-> new MapleWallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().dropsLike(Maple_HANGING_SIGN.get()), MapleWoodTypes.MAPLE));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static void registerMapleSignBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
