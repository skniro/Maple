package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.item.MapleItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class MapleOreBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MOD_ID);

    public static final RegistryObject<Block> Salt_Ore =registerBlock("salt_ore",(settings)-> new DropExperienceBlock(UniformInt.of(3, 7), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F));
    public static final RegistryObject<Block> DEEPSLATE_Salt_Ore =registerBlock("deepslate_salt_ore",(settings)-> new DropExperienceBlock(UniformInt.of(3, 7), settings),BlockBehaviour.Properties.ofFullCopy(Salt_Ore.get()).mapColor(MapColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE));
    public static final RegistryObject<Block> Nether_Coal_Ore = registerBlock("coal_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final RegistryObject<Block> Nether_Copper_Ore = registerBlock("copper_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final RegistryObject<Block> Nether_Diamond_Ore = registerBlock("diamond_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final RegistryObject<Block> Nether_Emerald_Ore = registerBlock("emerald_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final RegistryObject<Block> Nether_Gold_Ore = registerBlock("gold_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final RegistryObject<Block> Nether_Iron_Ore = registerBlock("iron_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final RegistryObject<Block> Nether_Lapis_Ore = registerBlock("lapis_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final RegistryObject<Block> Nether_Redstone_Ore = registerBlock("redstone_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));


    public static <B extends Block> RegistryObject<Block> register(String name, Function<BlockBehaviour.Properties, ? extends B> func, BlockBehaviour.Properties props) {
        return BLOCKS.register(name, () -> {
            return (Block)func.apply(props.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <B extends Block> RegistryObject<Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> register = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> bRegistryObject = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bRegistryObject);
        return bRegistryObject;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name)))));
    }

    public static void registerMapleOreBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
