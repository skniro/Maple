package com.skniro.maple.block.renderer;


import com.skniro.maple.block.entity.MapleJuicerBlockEntity;
import com.skniro.maple.block.renderer.state.MapleJuicerBlockEntityRenderState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.ItemModelManager;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.command.ModelCommandRenderer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class MapleJuicerEntityRenderer implements BlockEntityRenderer<MapleJuicerBlockEntity, MapleJuicerBlockEntityRenderState> {
    public MapleJuicerEntityRenderer(BlockEntityRendererFactory.Context context) {
    }

    @Override
    public void render(MapleJuicerBlockEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue queue, CameraRenderState cameraState) {
        int itemCount = 15;

        Random random = new Random(state.pos.asLong());
        for (int i = 0; i < itemCount; i++) {
            matrices.push();

            double offsetX = 0.4 + random.nextDouble() * 0.20;
            double offsetY = 0.3 + random.nextDouble() * 0.20;
            double offsetZ = 0.4 + random.nextDouble() * 0.20;
            matrices.translate(offsetX, offsetY, offsetZ);

            float scale = 0.45f + random.nextFloat() * 0.1f;
            matrices.scale(scale, scale, scale);

            float rotation = random.nextFloat() * 260.0f;
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotation));

            state.item.render(matrices, queue, state.lightmapCoordinates, OverlayTexture.DEFAULT_UV,0);
            matrices.pop();
        }
    }


    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, Math.max(sLight, 15));
    }

    @Override
    public MapleJuicerBlockEntityRenderState createRenderState() {
        return new MapleJuicerBlockEntityRenderState();
    }

    @Override
    public void updateRenderState(MapleJuicerBlockEntity entity, MapleJuicerBlockEntityRenderState state, float tickProgress, Vec3d cameraPos, @Nullable ModelCommandRenderer.CrumblingOverlayCommand crumblingOverlay) {
        BlockEntityRenderer.super.updateRenderState(entity, state, tickProgress, cameraPos, crumblingOverlay);
        ItemModelManager itemModelResolver = MinecraftClient.getInstance().getItemModelManager();
        itemModelResolver.clearAndUpdate(state.item, entity.getRenderStack(), ItemDisplayContext.GUI, entity.getWorld(), null, 1);
        state.pos = entity.getPos();
        state.blockState = entity.getCachedState();
        state.lightmapCoordinates = getLightLevel(entity.getWorld(), entity.getPos());
    }
}