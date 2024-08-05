package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;

import com.skniro.maple.block.init.MapleStandingSignBlock;
import com.skniro.maple.block.init.MapleWallSignBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleSignBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MODID);

    public static final RegistryObject<Block> CHERRY_SIGN = registerBlockWithoutItem("cherry_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.CHERRY_PLANKS.get().defaultMaterialColor()).noCollission().strength(1.0F), MapleSignTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.CHERRY_LOG.get().defaultMaterialColor()).noCollission().strength(1.0F).dropsLike(CHERRY_SIGN.get()), MapleSignTypes.CHERRY));
    public static final RegistryObject<Block> Maple_SIGN = registerBlockWithoutItem("maple_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.MAPLE_PLANKS.get().defaultMaterialColor()).noCollission().strength(1.0F),MapleSignTypes.MAPLE));
    public static final RegistryObject<Block> Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.MAPLE_PLANKS.get().defaultMaterialColor()).noCollission().strength(1.0F).dropsLike(Maple_SIGN.get()),MapleSignTypes.MAPLE));
    public static final RegistryObject<Block> BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign",
            ()-> new MapleStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.BAMBOO_PLANKS.get().defaultMaterialColor()).noCollission().strength(1.0f), MapleSignTypes.BAMBOO));
    public static final RegistryObject<Block> BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",
            ()-> new MapleWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MapleBlocks.BAMBOO_PLANKS.get().defaultMaterialColor()).noCollission().strength(1.0F).dropsLike(BAMBOO_SIGN.get()),MapleSignTypes.BAMBOO));
    public static final Block CHERRY_SIGN = registerBlockWithoutItem("cherry_sign",
            new SignBlock(AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.CHERRY_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F), MapleSignTypes.CHERRY),Maple.Maple_Group);
    public static final Block CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign",
            new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.CHERRY_LOG.getDefaultMapColor()).noCollision().strength(1.0F).dropsLike(CHERRY_SIGN), MapleSignTypes.CHERRY),Maple.Maple_Group);
    public static final Block Maple_SIGN = registerBlockWithoutItem("maple_sign",
            new SignBlock(AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F),MapleSignTypes.MAPLE),Maple.Maple_Group);
    public static final Block Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F).dropsLike(Maple_SIGN),MapleSignTypes.MAPLE),Maple.Maple_Group);
    public static final Block BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign",
            new SignBlock(AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.BAMBOO_PLANKS.getDefaultMapColor()).noCollision().strength(1.0f), MapleSignTypes.BAMBOO),Maple.Maple_Group);
    public static final Block BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",
            new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD, MapleBlocks.BAMBOO_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F).dropsLike(BAMBOO_SIGN),MapleSignTypes.BAMBOO),Maple.Maple_Group);
    public static final Block GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign",
            new SignBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapleBlocks.GINKGO_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F), MapleSignTypes.GINKGO),Maple.Maple_Group);
    public static final Block GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",
            new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD).mapColor(MapleBlocks.GINKGO_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F).dropsLike(GINKGO_SIGN),MapleSignTypes.GINKGO),Maple.Maple_Group);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static void registerMapleSignBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
