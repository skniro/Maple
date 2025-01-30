package com.skniro.maple.block.renderer;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.skniro.maple.block.entity.MapleJuicerBlockEntity;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;

public class MapleJuicerEntityRenderer implements BlockEntityRenderer<MapleJuicerBlockEntity> {
    public MapleJuicerEntityRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(MapleJuicerBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        ItemStack stack = entity.getRenderStack();

        int itemCount = 15;

        Random random = new Random(entity.getBlockPos().asLong());
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

            itemRenderer.renderStatic(stack, ItemDisplayContext.GROUND, getLightLevel(entity.getLevel(),
                    entity.getBlockPos()), OverlayTexture.NO_OVERLAY, matrices, vertexConsumers, entity.getLevel(), 1);
            matrices.popPose();
        }
    }


    private int getLightLevel(Level world, BlockPos pos) {
        int bLight = world.getBrightness(LightLayer.BLOCK, pos);
        int sLight = world.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, Math.max(sLight, 15));
    }
}