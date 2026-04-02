package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.init.*;
import com.skniro.maple.item.MapleItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Function;
import java.util.function.Supplier;

public class MapleFurnitureBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MOD_ID);

    // Maple Cushion Blocks
    public static final Supplier<Block> CUSHION_MAPLE_WHITE = registerBlock("maple_white_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_ORANGE = registerBlock("maple_orange_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_MAGENTA = registerBlock("maple_magenta_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_LIGHT_BLUE = registerBlock("maple_light_blue_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_YELLOW = registerBlock("maple_yellow_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_LIME = registerBlock("maple_lime_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_PINK = registerBlock("maple_pink_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_GRAY = registerBlock("maple_gray_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_LIGHT_GRAY = registerBlock("maple_light_gray_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_CYAN = registerBlock("maple_cyan_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_PURPLE = registerBlock("maple_purple_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_BLUE = registerBlock("maple_blue_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_BROWN = registerBlock("maple_brown_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_GREEN = registerBlock("maple_green_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_RED = registerBlock("maple_red_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_MAPLE_BLACK = registerBlock("maple_black_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));

    // GINKGO Cushion Blocks
    public static final Supplier<Block> CUSHION_GINKGO_WHITE = registerBlock("ginkgo_white_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_ORANGE = registerBlock("ginkgo_orange_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_MAGENTA = registerBlock("ginkgo_magenta_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_LIGHT_BLUE = registerBlock("ginkgo_light_blue_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_YELLOW = registerBlock("ginkgo_yellow_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_LIME = registerBlock("ginkgo_lime_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_PINK = registerBlock("ginkgo_pink_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_GRAY = registerBlock("ginkgo_gray_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_LIGHT_GRAY = registerBlock("ginkgo_light_gray_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_CYAN = registerBlock("ginkgo_cyan_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_PURPLE = registerBlock("ginkgo_purple_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_BLUE = registerBlock("ginkgo_blue_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_BROWN = registerBlock("ginkgo_brown_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_GREEN = registerBlock("ginkgo_green_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_RED = registerBlock("ginkgo_red_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final Supplier<Block> CUSHION_GINKGO_BLACK = registerBlock("ginkgo_black_cushion", CushionBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));

    // Table Blocks
    public static final Supplier<Block> TABLE_MAPLE = registerBlock("maple_table", TableBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));
    public static final Supplier<Block> TABLE_GINKGO = registerBlock("ginkgo_table", TableBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));

    //Window
    public static final Supplier<Block> Window_Wood_GINKGO = registerBlock("ginkgo_wood_window", (settings)-> new WindowBlock(settings, MapleBlockSetType.GINKGO), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion());
    public static final Supplier<Block> Window_Wood_MAPLE = registerBlock("maple_wood_window", (settings)-> new WindowBlock(settings, MapleBlockSetType.MAPLE), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion());
    public static final Supplier<Block> Window_PLANK_GINKGO = registerBlock("ginkgo_plank_window", (settings)-> new WindowBlock(settings, MapleBlockSetType.GINKGO),BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion());
    public static final Supplier<Block> Window_PLANK_MAPLE = registerBlock("maple_plank_window", (settings)-> new WindowBlock(settings, MapleBlockSetType.MAPLE), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion());

    // Coffee Table Blocks
    public static final Supplier<Block> Coffee_Table_Wood_GINKGO = registerBlock("ginkgo_wood_coffee_table", TableBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));
    public static final Supplier<Block> Coffee_Table_Wood_MAPLE = registerBlock("maple_wood_coffee_table", TableBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));
    public static final Supplier<Block> Coffee_Table_PLANK_GINKGO = registerBlock("ginkgo_plank_coffee_table", TableBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()));
    public static final Supplier<Block> Coffee_Table_PLANK_MAPLE = registerBlock("maple_plank_coffee_table", TableBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()));

    //Chair
    public static final Supplier<Block> Chair_Wood_GINKGO = registerBlock("ginkgo_wood_chair", ChairBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));
    public static final Supplier<Block> Chair_Wood_MAPLE = registerBlock("maple_wood_chair", ChairBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));
    public static final Supplier<Block> Chair_PLANK_GINKGO = registerBlock("ginkgo_plank_chair", ChairBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion()));
    public static final Supplier<Block> Chair_PLANK_MAPLE = registerBlock("maple_plank_chair", ChairBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion()));

    //End Table
    public static final Supplier<Block> END_TABLE_MAPLE = registerBlock("maple_end_table", EndTableBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));
    public static final Supplier<Block> END_TABLE_GINKGO = registerBlock("ginkgo_end_table", EndTableBlock::new, (BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion()));

    public static <B extends Block> RegistryObject<Block> register(String name, Function<BlockBehaviour.Properties, ? extends B> func, BlockBehaviour.Properties props) {
        return BLOCKS.register(name, () -> {
            return (Block)func.apply(props.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        });
    }

    private static <B extends Block> RegistryObject<Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> register = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> bRegistryObject = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bRegistryObject);
        return bRegistryObject;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Maple.MOD_ID, name)))));
    }

    public static void registerMapleBlocks(BusGroup eventBus) {
        BLOCKS.register(eventBus);
    }
}
