package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleWoodTypes;

import com.skniro.maple.block.init.MapleStandingSignBlock;
import com.skniro.maple.block.init.MapleWallSignBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleSignBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, Maple.MODID);

    public static final Supplier<Block> CHERRY_SIGN = registerBlockWithoutItem("cherry_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), WoodType.CHERRY));
    public static final Supplier<Block> CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_LOG.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(CHERRY_SIGN.get()), WoodType.CHERRY));
    public static final Supplier<Block> Maple_SIGN = registerBlockWithoutItem("maple_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), MapleWoodTypes.MAPLE));
    public static final Supplier<Block> Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(Maple_SIGN.get()), MapleWoodTypes.MAPLE));
    public static final Supplier<Block> BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0f), WoodType.BAMBOO));
    public static final Supplier<Block> BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(BAMBOO_SIGN.get()), WoodType.BAMBOO));
   public static final Supplier<Block> GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign",
           ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F), MapleWoodTypes.GINKGO));
    public static final Supplier<Block> GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).dropsLike(GINKGO_SIGN.get()), MapleWoodTypes.GINKGO));

    private static <T extends Block> Supplier<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static void registerMapleSignBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
