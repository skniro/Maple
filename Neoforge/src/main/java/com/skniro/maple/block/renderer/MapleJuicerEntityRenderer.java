package com.skniro.maple.block.renderer;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.skniro.maple.block.entity.MapleJuicerBlockEntity;
import com.skniro.maple.block.renderer.state.MapleJuicerBlockEntityRenderState;
import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.util.LightCoordsUtil;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class MapleJuicerEntityRenderer implements BlockEntityRenderer<MapleJuicerBlockEntity, MapleJuicerBlockEntityRenderState> {
    public MapleJuicerEntityRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void submit(MapleJuicerBlockEntityRenderState state, PoseStack matrices, SubmitNodeCollector queue, CameraRenderState cameraState) {
        int itemCount = 15;

        Random random = new Random(state.blockPos.asLong());
        for (int i = 0; i < itemCount; i++) {
            matrices.pushPose();

            double offsetX = 0.4 + random.nextDouble() * 0.20;
            double offsetY = 0.3 + random.nextDouble() * 0.20;
            double offsetZ = 0.4 + random.nextDouble() * 0.20;
            matrices.translate(offsetX, offsetY, offsetZ);

            float scale = 0.45f + random.nextFloat() * 0.1f;
            matrices.scale(scale, scale, scale);

            float rotation = random.nextFloat() * 260.0f;
            matrices.mulPose(Axis.XP.rotationDegrees(rotation));

            state.item.submit(matrices, queue, state.lightCoords, OverlayTexture.NO_OVERLAY,0);
            matrices.popPose();
        }
    }


    private int getLightLevel(Level world, BlockPos pos) {
        int bLight = world.getBrightness(LightLayer.BLOCK, pos);
        int sLight = world.getBrightness(LightLayer.SKY, pos);
        return LightCoordsUtil.pack(bLight, Math.max(sLight, 15));
    }

    @Override
    public MapleJuicerBlockEntityRenderState createRenderState() {
        return new MapleJuicerBlockEntityRenderState();
    }

    @Override
    public void extractRenderState(MapleJuicerBlockEntity entity, MapleJuicerBlockEntityRenderState state, float tickProgress, Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(entity, state, tickProgress, cameraPos, crumblingOverlay);
        ItemModelResolver itemModelResolver = Minecraft.getInstance().getItemModelResolver();
        itemModelResolver.updateForTopItem(state.item, entity.getRenderStack(), ItemDisplayContext.GUI, entity.getLevel(), null, 1);
        state.blockPos = entity.getBlockPos();
        state.blockState = entity.getBlockState();
        state.lightCoords = getLightLevel(entity.getLevel(), entity.getBlockPos());
    }
}