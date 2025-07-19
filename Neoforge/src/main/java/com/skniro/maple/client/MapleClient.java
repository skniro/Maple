package com.skniro.maple.client;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleFurnitureBlocks;
import com.skniro.maple.conifg.MapleConfig;
import com.skniro.maple.fluid.MapleFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Maple.MOD_ID, value = Dist.CLIENT)
public class MapleClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ChunkSectionLayer renderLayer2 = ChunkSectionLayer.CUTOUT_MIPPED;
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_LEAVES.get(), renderLayer2);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CHERRY_LEAVES.get(), renderLayer2);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.SAKURA_LEAVES.get(), renderLayer2);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_LEAVES.get(), renderLayer2);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.SAKURA_CARPET.get(),renderLayer2);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.Maple_CARPET.get(),renderLayer2);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_MAPLE_CARPET.get(),renderLayer2);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_CARPET.get(),renderLayer2);
        if(MapleConfig.Furniture_Module) {
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_OAK.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_SPRUCE.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_BIRCH.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_JUNGLE.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_ACACIA.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_DARK_OAK.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_CRIMSON.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_WARPED.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_MANGROVE.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_BAMBOO.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_CHERRY.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_MAPLE.get(), renderLayer2);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_GINKGO.get(), renderLayer2);
        }

        ChunkSectionLayer renderLayer3 = ChunkSectionLayer.CUTOUT;
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_GINKGO_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_DOOR.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_TRAPDOOR.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_MAPLE_LEAVES.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_MAPLE_SAPLING .get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_RED_MAPLE_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CHERRY_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_CHERRY_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_MAPLE_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.SAKURA_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_SAKURA_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_SAPLING.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_DOOR.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CHERRY_DOOR.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CHERRY_TRAPDOOR.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_TRAPDOOR.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BAMBOO_TRAPDOOR.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BAMBOO_DOOR.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RICE.get(), renderLayer3);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_PETALS.get(),renderLayer3);
        if(MapleConfig.Furniture_Module) {
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_Wood_GINKGO.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_Wood_MAPLE.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_OAK.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_BIRCH.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_SPRUCE.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_JUNGLE.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_DARK_OAK.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_ACACIA.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_MANGROVE.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_CHERRY.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_CRIMSON.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_WOOD_WARPED.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_MAPLE.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_GINKGO.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_OAK.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_BIRCH.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_SPRUCE.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_JUNGLE.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_DARK_OAK.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_ACACIA.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_MANGROVE.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_CHERRY.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_CRIMSON.get(), renderLayer3);
            ItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_WARPED.get(), renderLayer3);
        }
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.Tea_Block.get(), renderLayer3);


        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_SLAB.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_STAIRS.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleBlocks.Maple_Juicer_Block.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleFluids.FLOWING_Hot_Spring.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleFluids.STILL_Hot_Spring.get(), renderLayer4);
    }
}
