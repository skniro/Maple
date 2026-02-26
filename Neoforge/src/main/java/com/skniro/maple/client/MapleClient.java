package com.skniro.maple.client;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleFurnitureBlocks;
import com.skniro.maple.conifg.MapleConfig;
import com.skniro.maple.fluid.MapleFluids;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Maple.MOD_ID, value = Dist.CLIENT)
public class MapleClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ChunkSectionLayer renderLayer2 = ChunkSectionLayer.SOLID;


        ChunkSectionLayer renderLayer3 = ChunkSectionLayer.CUTOUT;
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_LEAVES.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.SAKURA_LEAVES.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_LEAVES.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.SAKURA_CARPET.get(),renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.Maple_CARPET.get(),renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_MAPLE_CARPET.get(),renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_CARPET.get(),renderLayer3);
        if(MapleConfig.Furniture_Module) {
            ModItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_MAPLE.get(), renderLayer3);
            ModItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.TABLE_GINKGO.get(), renderLayer3);
        }

        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_SAPLING.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_GINKGO_SAPLING.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_DOOR.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GINKGO_TRAPDOOR.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_MAPLE_LEAVES.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_MAPLE_SAPLING .get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_RED_MAPLE_SAPLING.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_SAPLING.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_MAPLE_SAPLING.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.SAKURA_SAPLING.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_SAKURA_SAPLING.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_SAPLING.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_DOOR.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_TRAPDOOR.get(), renderLayer3);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.RICE.get(), renderLayer3);
        if(MapleConfig.Furniture_Module) {
            ModItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_Wood_GINKGO.get(), renderLayer3);
            ModItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_Wood_MAPLE.get(), renderLayer3);
            ModItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_MAPLE.get(), renderLayer3);
            ModItemBlockRenderTypes.setRenderLayer(MapleFurnitureBlocks.Window_PLANK_GINKGO.get(), renderLayer3);
        }
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.Tea_Block.get(), renderLayer3);


        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.WHITE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIME_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GRAY_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.CYAN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLUE_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.BROWN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GREEN_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.RED_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.BLACK_STAINED_GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_SLAB.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.GLASS_STAIRS.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(MapleBlocks.Maple_Juicer_Block.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleFluids.FLOWING_Hot_Spring.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(MapleFluids.STILL_Hot_Spring.get(), renderLayer4);
    }
}
