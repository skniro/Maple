package com.skniro.maple.client;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.client.particle.MapleCherryLeavesParticle;
import com.skniro.maple.misc.qsldatafixupper.impl.client.ClientFreezer;
import com.skniro.maple.particle.MapleParticleTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MapleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_LEAVES, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_LEAVES, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_SAKURA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_LEAVES, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BAMBOO_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BAMBOO_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RICE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_PETALS,RenderLayer.getCutout());

        RenderLayer renderLayer2 = RenderLayer.getCutoutMipped();
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_LEAVES, renderLayer2);


        RenderLayer renderLayer3 = RenderLayer.getCutout();
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_SAPLING, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_GINKGO_SAPLING, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_DOOR, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_TRAPDOOR, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_MAPLE_LEAVES, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RED_MAPLE_SAPLING , renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_RED_MAPLE_SAPLING, renderLayer3);

        RenderLayer renderLayer4 = RenderLayer.getTranslucent();
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.WHITE_STAINED_GLASS_STAIRS, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_CARPET,renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.Maple_CARPET,renderLayer4);
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



        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.CHERRY_LEAVES,((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider);
            };
        }));

        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.SAKURA_LEAVES,((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider);
            };
        }));
    }
}
