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
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_CARPET,renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_GINKGO_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.GINKGO_TRAPDOOR, RenderLayer.getCutout());




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
