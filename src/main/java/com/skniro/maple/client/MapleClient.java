package com.skniro.maple.client;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.client.particle.MapleCherryLeavesParticle;
import com.skniro.maple.particle.MapleParticleTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.block.Block;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MapleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.SAKURA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.POTTED_SAKURA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.CHERRY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.MAPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BAMBOO_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.BAMBOO_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.RICE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MapleBlocks.PINK_PETALS,RenderLayer.getCutout());


        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier(Maple.MOD_ID, "particle/cherry"));
        }));

        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier(Maple.MOD_ID, "particle/sakura"));
        }));

        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.SAKURA_LEAVES,((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider);
            };
        }));

        ParticleFactoryRegistry.getInstance().register(MapleParticleTypes.CHERRY_LEAVES,((spriteProvider) -> {
            return (parameters, world, x, y, z, velocityX, velocityY, velocityZ) -> {
                return new MapleCherryLeavesParticle(world, x, y, z, spriteProvider);
            };
        }));
    }
}
