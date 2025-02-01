package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleWoodTypes;

import com.skniro.maple.block.init.MapleHangingSignBlock;
import com.skniro.maple.block.init.MapleStandingSignBlock;
import com.skniro.maple.block.init.MapleWallHangingSignBlock;
import com.skniro.maple.block.init.MapleWallSignBlock;
import com.skniro.maple.item.MapleItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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

import java.util.function.Function;
import java.util.function.Supplier;

public class MapleSignBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Maple.MOD_ID);

    public static final RegistryObject<Block> CHERRY_SIGN = registerBlockWithoutItem("cherry_sign",
            (properties)-> new MapleStandingSignBlock(properties, WoodType.CHERRY), BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F));
    public static final RegistryObject<Block> CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign",
            (properties)-> new MapleWallSignBlock(properties, WoodType.CHERRY),BlockBehaviour.Properties.of().mapColor(MapleBlocks.CHERRY_LOG.get().defaultMapColor()).noCollission().strength(1.0F).overrideLootTable(CHERRY_SIGN.get().getLootTable()));
    public static final RegistryObject<Block> Maple_SIGN = registerBlockWithoutItem("maple_sign",
            (properties)-> new MapleStandingSignBlock(properties, MapleWoodTypes.MAPLE), BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F));
    public static final RegistryObject<Block> Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            (properties)-> new MapleWallSignBlock(properties, MapleWoodTypes.MAPLE), BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).overrideLootTable(Maple_SIGN.get().getLootTable()));
    public static final RegistryObject<Block> BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign",
            (properties)-> new MapleStandingSignBlock(properties, WoodType.BAMBOO), BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0f));
    public static final RegistryObject<Block> BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",
            (properties)-> new MapleWallSignBlock(properties, WoodType.BAMBOO),BlockBehaviour.Properties.of().mapColor(MapleBlocks.BAMBOO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).overrideLootTable(BAMBOO_SIGN.get().getLootTable()));
   public static final RegistryObject<Block> GINKGO_SIGN = registerBlockWithoutItem("ginkgo_sign",
            (properties)-> new MapleStandingSignBlock(properties, MapleWoodTypes.GINKGO), BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F));
    public static final RegistryObject<Block> GINKGO_WALL_SIGN = registerBlockWithoutItem("ginkgo_wall_sign",
            (properties)-> new MapleWallSignBlock(properties, MapleWoodTypes.GINKGO), BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_PLANKS.get().defaultMapColor()).noCollission().strength(1.0F).overrideLootTable(GINKGO_SIGN.get().getLootTable()));
    public static final RegistryObject<Block> Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign",
            (properties)-> new MapleHangingSignBlock(properties, MapleWoodTypes.MAPLE), BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava());
    public static final RegistryObject<Block> GINKGO_HANGING_SIGN = registerBlockWithoutItem("ginkgo_hanging_sign",
            (properties)-> new MapleHangingSignBlock(properties, MapleWoodTypes.GINKGO), BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava());
    public static final RegistryObject<Block> GINKGO_WALL_HANGING_SIGN = registerBlockWithoutItem("ginkgo_wall_hanging_sign",
            (properties)-> new MapleWallHangingSignBlock(properties, MapleWoodTypes.GINKGO), BlockBehaviour.Properties.of().mapColor(MapleBlocks.GINKGO_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().overrideLootTable(GINKGO_HANGING_SIGN.get().getLootTable()));
    public static final RegistryObject<Block> Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign",
            (properties)-> new MapleWallHangingSignBlock(properties, MapleWoodTypes.MAPLE), BlockBehaviour.Properties.of().mapColor(MapleBlocks.MAPLE_LEAVES.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava().overrideLootTable(Maple_HANGING_SIGN.get().getLootTable()));

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

    public static void registerMapleSignBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
