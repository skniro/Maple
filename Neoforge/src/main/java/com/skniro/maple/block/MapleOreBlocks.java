package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.item.MapleItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class MapleOreBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Maple.MOD_ID);

    public static final Supplier<Block> Salt_Ore =registerBlock("salt_ore",(settings)-> new DropExperienceBlock(UniformInt.of(3, 7), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F));
    public static final Supplier<Block> DEEPSLATE_Salt_Ore =registerBlock("deepslate_salt_ore",(settings)-> new DropExperienceBlock(UniformInt.of(3, 7), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE));
    public static final Supplier<Block> Nether_Coal_Ore = registerBlock("coal_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Copper_Ore = registerBlock("copper_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Diamond_Ore = registerBlock("diamond_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Emerald_Ore = registerBlock("emerald_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Gold_Ore = registerBlock("gold_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Iron_Ore = registerBlock("iron_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Lapis_Ore = registerBlock("lapis_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Redstone_Ore = registerBlock("redstone_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));


    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> bDeferredBlock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bDeferredBlock);
        return bDeferredBlock;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = BLOCKS.registerBlock(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItemWithEmpty(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = registerBlockWithoutItem(name, block, properties);
        return register;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return MapleItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)))));
    }

    public static void registerMapleOreBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
