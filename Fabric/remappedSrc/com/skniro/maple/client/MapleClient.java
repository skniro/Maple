package com.skniro.maple.client;

import com.skniro.maple.MapleContent;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleFurnitureBlocks;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.block.renderer.MapleJuicerEntityRenderer;
import com.skniro.maple.client.gui.screen.ingame.MapleJuicerBlockScreen;
import com.skniro.maple.client.particle.MapleCampfireSmokeParticle;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.screen.MapleScreenHandlerType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MapleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_LEAVES, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_LEAVES, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_CHERRY_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_MAPLE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_SAKURA_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_LEAVES, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_DOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_DOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_TRAPDOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_TRAPDOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BAMBOO_TRAPDOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BAMBOO_DOOR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RICE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_PETALS,RenderType.cutout());

        RenderType renderLayer2 = RenderType.cutoutMipped();
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_LEAVES, renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_CARPET,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.Maple_CARPET,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_MAPLE_CARPET,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_CARPET,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_OAK,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_SPRUCE,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_BIRCH,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_JUNGLE,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_ACACIA,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_DARK_OAK,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_CRIMSON,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_WARPED,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_MANGROVE,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_BAMBOO,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_CHERRY,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_MAPLE,renderLayer2);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.TABLE_GINKGO,renderLayer2);

        RenderType renderLayer3 = RenderType.cutout();
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_SAPLING, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_GINKGO_SAPLING, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_DOOR, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_TRAPDOOR, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_MAPLE_LEAVES, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_MAPLE_SAPLING , renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_RED_MAPLE_SAPLING, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_Wood_GINKGO, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_Wood_MAPLE, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_OAK, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_BIRCH, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_SPRUCE, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_JUNGLE, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_DARK_OAK, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_ACACIA, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_MANGROVE, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_CHERRY, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_CRIMSON, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_WOOD_WARPED, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_MAPLE, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_GINKGO, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_OAK, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_BIRCH, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_SPRUCE, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_JUNGLE, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_DARK_OAK, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_ACACIA, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_MANGROVE, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_CHERRY, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_CRIMSON, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleFurnitureBlocks.Window_PLANK_WARPED, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.Tea_Block, renderLayer3);


        RenderType renderLayer4 = RenderType.translucent();
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIME_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GRAY_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CYAN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLUE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BROWN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GREEN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BLACK_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.Maple_Juicer_Block, renderLayer4);

        FluidRenderHandlerRegistry.INSTANCE.register(MapleFluids.STILL_Hot_Spring, MapleFluids.FLOWING_Hot_Spring,
                new SimpleFluidRenderHandler(
                        ResourceLocation.parse("maple:block/spring_still"),
                        ResourceLocation.parse("maple:block/spring_flow"),
                        0x5DB7EF
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderType.translucent(),
                MapleFluids.STILL_Hot_Spring, MapleFluids.FLOWING_Hot_Spring);


        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.HOT_SPRING, MapleCampfireSmokeParticle.CosySmokeFactory::new);

        MenuScreens.register(MapleScreenHandlerType.Maple_JUICER, MapleJuicerBlockScreen::new);
        BlockEntityRenderers.register(MapleBlockEntityType.MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, MapleJuicerEntityRenderer::new);

        MapleContent.registerClientEntityRenderer();
        MapleContent.registerClientParticle();
    }
}
