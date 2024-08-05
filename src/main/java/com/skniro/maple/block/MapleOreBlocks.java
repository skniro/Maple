package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.item.MapleItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleOreBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MODID);

    public static final RegistryObject<Block> Salt_Ore =registerBlock("salt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)),Maple.Maple_Group);
    public static final RegistryObject<Block> DEEPSLATE_Salt_Ore =registerBlock("deepslate_salt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Salt_Ore.get()).color(MaterialColor.COLOR_GRAY).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)),Maple.Maple_Group);
    public static final RegistryObject<Block> Nether_Coal_Ore = registerBlock("coal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),Maple.Maple_Group);
    public static final RegistryObject<Block> Nether_Copper_Ore = registerBlock("copper_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),Maple.Maple_Group);
    public static final RegistryObject<Block> Nether_Diamond_Ore = registerBlock("diamond_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),Maple.Maple_Group);
    public static final RegistryObject<Block> Nether_Emerald_Ore = registerBlock("emerald_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),Maple.Maple_Group);
    public static final RegistryObject<Block> Nether_Gold_Ore = registerBlock("gold_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),Maple.Maple_Group);
    public static final RegistryObject<Block> Nether_Iron_Ore = registerBlock("iron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),Maple.Maple_Group);
    public static final RegistryObject<Block> Nether_Lapis_Ore = registerBlock("lapis_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)),Maple.Maple_Group);
    public static final RegistryObject<Block> Nether_Redstone_Ore = registerBlock("redstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(2, 4)), Maple.Maple_Group);


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static RotatedPillarBlock createBambooBlock(MaterialColor topMaterialColor, MaterialColor sideMaterialColor, SoundType soundGroup) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).color(sideMaterialColor).strength(2.0f).sound(soundGroup));
    }

    public static void registerMapleOreBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
