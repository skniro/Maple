package com.skniro.maple.client;

import com.skniro.maple.Maple;
import com.skniro.maple.MapleContent;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleFurnitureBlocks;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import com.skniro.maple.block.renderer.MapleJuicerEntityRenderer;
import com.skniro.maple.client.gui.screen.ingame.MapleJuicerBlockScreen;
import com.skniro.maple.client.particle.MapleCampfireSmokeParticle;
import com.skniro.maple.client.particle.MapleCherryLeavesParticle;
import com.skniro.maple.client.renderer.ChairRenderer;
import com.skniro.maple.client.renderer.CushinoRenderer;
import com.skniro.maple.conifg.MapleConfig;
import com.skniro.maple.entity.MapleEntityType;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.screen.MapleScreenHandlerType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.resources.ResourceLocation;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MapleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChunkSectionLayer renderLayer2 = ChunkSectionLayer.CUTOUT_MIPPED;
        BlockRenderLayerMap.putBlock(MapleBlocks.GINKGO_LEAVES, renderLayer2);
        BlockRenderLayerMap.putBlock(MapleBlocks.CHERRY_LEAVES, renderLayer2);
        BlockRenderLayerMap.putBlock(MapleBlocks.SAKURA_LEAVES, renderLayer2);
        BlockRenderLayerMap.putBlock(MapleBlocks.MAPLE_LEAVES, renderLayer2);
        BlockRenderLayerMap.putBlock(MapleBlocks.SAKURA_CARPET,renderLayer2);
        BlockRenderLayerMap.putBlock(MapleBlocks.Maple_CARPET,renderLayer2);
        BlockRenderLayerMap.putBlock(MapleBlocks.RED_MAPLE_CARPET,renderLayer2);
        BlockRenderLayerMap.putBlock(MapleBlocks.GINKGO_CARPET,renderLayer2);
        if (MapleConfig.Furniture_Module) {
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_OAK, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_SPRUCE, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_BIRCH, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_JUNGLE, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_ACACIA, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_DARK_OAK, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_CRIMSON, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_WARPED, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_MANGROVE, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_BAMBOO, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_CHERRY, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_MAPLE, renderLayer2);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.TABLE_GINKGO, renderLayer2);
        }

        ChunkSectionLayer renderLayer3 = ChunkSectionLayer.CUTOUT;
        BlockRenderLayerMap.putBlock(MapleBlocks.CHERRY_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.POTTED_CHERRY_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.MAPLE_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.POTTED_MAPLE_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.SAKURA_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.POTTED_SAKURA_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.MAPLE_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.MAPLE_DOOR, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.CHERRY_DOOR, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.CHERRY_TRAPDOOR, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.MAPLE_TRAPDOOR, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.BAMBOO_TRAPDOOR, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.BAMBOO_DOOR, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.RICE, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.PINK_PETALS, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.GINKGO_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.POTTED_GINKGO_SAPLING, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.GINKGO_DOOR, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.GINKGO_TRAPDOOR, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.RED_MAPLE_LEAVES, renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.RED_MAPLE_SAPLING , renderLayer3);
        BlockRenderLayerMap.putBlock(MapleBlocks.POTTED_RED_MAPLE_SAPLING, renderLayer3);
        if (MapleConfig.Furniture_Module) {
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_Wood_GINKGO, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_Wood_MAPLE, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_OAK, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_BIRCH, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_SPRUCE, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_JUNGLE, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_DARK_OAK, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_ACACIA, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_MANGROVE, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_CHERRY, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_CRIMSON, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_WOOD_WARPED, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_MAPLE, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_GINKGO, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_OAK, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_BIRCH, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_SPRUCE, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_JUNGLE, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_DARK_OAK, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_ACACIA, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_MANGROVE, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_CHERRY, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_CRIMSON, renderLayer3);
            BlockRenderLayerMap.putBlock(MapleFurnitureBlocks.Window_PLANK_WARPED, renderLayer3);
        }
        BlockRenderLayerMap.putBlock(MapleBlocks.Tea_Block, renderLayer3);


        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;
        BlockRenderLayerMap.putBlock(MapleBlocks.WHITE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.WHITE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.LIME_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.LIME_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.PINK_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.PINK_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.GRAY_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.GRAY_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.CYAN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.CYAN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.BLUE_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.BLUE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.BROWN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.BROWN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.GREEN_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.GREEN_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.RED_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.RED_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.BLACK_STAINED_GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.BLACK_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.GLASS_SLAB, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.putBlock(MapleBlocks.Maple_Juicer_Block, renderLayer4);

        FluidRenderHandlerRegistry.INSTANCE.register(MapleFluids.STILL_Hot_Spring, MapleFluids.FLOWING_Hot_Spring,
                new SimpleFluidRenderHandler(
                        ResourceLocation.parse("maple:block/spring_still"),
                        ResourceLocation.parse("maple:block/spring_flow"),
                        0x5DB7EF
                ));

        BlockRenderLayerMap.putFluids(ChunkSectionLayer.TRANSLUCENT,
                MapleFluids.STILL_Hot_Spring, MapleFluids.FLOWING_Hot_Spring);


        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.HOT_SPRING, MapleCampfireSmokeParticle.CosySmokeFactory::new);

        MenuScreens.register(MapleScreenHandlerType.Maple_JUICER, MapleJuicerBlockScreen::new);
        BlockEntityRenderers.register(MapleBlockEntityType.MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, MapleJuicerEntityRenderer::new);

        registerClientEntityRenderer();
        registerClientParticle();
    }

    @Environment(EnvType.CLIENT)
    public static void registerClientEntityRenderer() {
        EntityRendererRegistry.register(MapleEntityType.CHAIR_ENTITY, ChairRenderer::new);
        EntityRendererRegistry.register(MapleEntityType.Cushion_ENTITY, CushinoRenderer::new);

        var maple_boat = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "boat/maple"), "main");
        EntityModelLayerRegistry.registerModelLayer(maple_boat, BoatModel::createBoatModel);
        EntityRendererRegistry.register(MapleEntityType.Maple_BOAT, (dispatcher) -> new BoatRenderer(dispatcher,maple_boat));

        var ginkgo_boat = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "boat/ginkgo"), "main");
        EntityModelLayerRegistry.registerModelLayer(ginkgo_boat, BoatModel::createBoatModel);
        EntityRendererRegistry.register(MapleEntityType.GINKGO_BOAT, (dispatcher) -> new BoatRenderer(dispatcher, ginkgo_boat));

        var maple_chest_boat = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "chest_boat/maple"), "main");
        EntityModelLayerRegistry.registerModelLayer(maple_chest_boat, BoatModel::createChestBoatModel);
        EntityRendererRegistry.register(MapleEntityType.Maple_CHEST_BOAT, (dispatcher) -> new BoatRenderer(dispatcher, maple_chest_boat));

        var ginkgo_chest_boat = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "chest_boat/ginkgo"), "main");
        EntityModelLayerRegistry.registerModelLayer(ginkgo_chest_boat, BoatModel::createChestBoatModel);
        EntityRendererRegistry.register(MapleEntityType.GINKGO_CHEST_BOAT,  (dispatcher) -> new BoatRenderer(dispatcher, ginkgo_chest_boat));

    }

    @Environment(EnvType.CLIENT)
    public static void registerClientParticle() {
        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.CHERRY_LEAVES, ((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ, random) -> {
                return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider, spriteProvider.get(random));
            };
        }));

        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.SAKURA_LEAVES, ((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ, random) -> {
                return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider, spriteProvider.get(random));
            };
        }));
    }
}
