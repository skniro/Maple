package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleWoodTypes;
import com.skniro.maple.block.init.MapleHangingSignBlock;
import com.skniro.maple.block.init.MapleStandingSignBlock;
import com.skniro.maple.block.init.MapleWallHangingSignBlock;
import com.skniro.maple.block.init.MapleWallSignBlock;
import com.skniro.maple.item.MapleItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class MapleSignBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Maple.MOD_ID);

    public static final Supplier<Block> Maple_SIGN = registerBlockWithoutItem("maple_sign",
            (properties)-> new MapleStandingSignBlock(properties, MapleWoodTypes.MAPLE), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).noCollision().strength(1.0F));
    public static final Supplier<Block> Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            (properties)-> new MapleWallSignBlock(properties, MapleWoodTypes.MAPLE), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).noCollision().strength(1.0F));
   public static final Supplier<Block> GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign",
            (properties)-> new MapleStandingSignBlock(properties, MapleWoodTypes.GINKGO), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).noCollision().strength(1.0F));
    public static final Supplier<Block> GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",
            (properties)-> new MapleWallSignBlock(properties, MapleWoodTypes.GINKGO), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).noCollision().strength(1.0F));
    public static final Supplier<Block> Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign",
            (properties)-> new MapleHangingSignBlock(properties, MapleWoodTypes.MAPLE), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).ignitedByLava());
    public static final Supplier<Block> GINKGO_HANGING_SIGN = registerBlockWithoutItem("ginkgo_hanging_sign",
            (properties)-> new MapleHangingSignBlock(properties, MapleWoodTypes.GINKGO), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).ignitedByLava());
    public static final Supplier<Block> GINKGO_WALL_HANGING_SIGN = registerBlockWithoutItem("ginkgo_wall_hanging_sign",
            (properties)-> new MapleWallHangingSignBlock(properties, MapleWoodTypes.GINKGO), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).ignitedByLava());
    public static final Supplier<Block> Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign",
            (properties)-> new MapleWallHangingSignBlock(properties, MapleWoodTypes.MAPLE), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).ignitedByLava());

    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> bDeferredBlock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bDeferredBlock);
        return bDeferredBlock;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = BLOCKS.registerBlock(name, block, ()->  properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItemWithEmpty(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = registerBlockWithoutItem(name, block, properties);
        return register;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return MapleItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name)))));
    }

    public static void registerMapleSignBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
