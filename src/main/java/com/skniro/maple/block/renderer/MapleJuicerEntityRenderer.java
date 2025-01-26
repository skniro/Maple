package com.skniro.maple.block.renderer;


import com.skniro.maple.block.entity.MapleJuicerBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

import java.util.Random;

public class MapleJuicerEntityRenderer implements BlockEntityRenderer<MapleJuicerBlockEntity> {
    public MapleJuicerEntityRenderer(BlockEntityRendererFactory.Context context) {
    }

    @Override
    public void render(MapleJuicerBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = entity.getRenderStack();

        int itemCount = 15;

        Random random = new Random(entity.getPos().asLong());
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

            itemRenderer.renderItem(stack, ModelTransformationMode.GROUND, getLightLevel(entity.getWorld(),
                    entity.getPos()), OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 1);
            matrices.pop();
        }
    }


    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, Math.max(sLight, 15));
    }
}