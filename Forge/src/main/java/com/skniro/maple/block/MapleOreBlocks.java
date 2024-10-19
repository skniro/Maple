package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.item.MapleItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleOreBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MODID);

    public static final RegistryObject<Block> Salt_Ore =registerBlock("salt_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> DEEPSLATE_Salt_Ore =registerBlock("deepslate_salt_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofLegacyCopy(Salt_Ore.get()).mapColor(MapColor.COLOR_GRAY).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> Nether_Coal_Ore = registerBlock("coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> Nether_Copper_Ore = registerBlock("copper_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> Nether_Diamond_Ore = registerBlock("diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> Nether_Emerald_Ore = registerBlock("emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> Nether_Gold_Ore = registerBlock("gold_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> Nether_Iron_Ore = registerBlock("iron_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> Nether_Lapis_Ore = registerBlock("lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> Nether_Redstone_Ore = registerBlock("redstone_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COAL_ORE)));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block
                                                                            ) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerMapleOreBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
