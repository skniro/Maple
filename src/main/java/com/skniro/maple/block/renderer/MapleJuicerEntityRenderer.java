package com.skniro.maple.block.renderer;


import com.skniro.maple.block.entity.MapleJuicerBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class MapleJuicerEntityRenderer implements BlockEntityRenderer<MapleJuicerBlockEntity> {
    public MapleJuicerEntityRenderer(BlockEntityRendererFactory.Context context) {
    }
    @Override
    public void render(MapleJuicerBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = entity.getRenderStack();
        Direction direction = entity.getCachedState().get(Properties.HORIZONTAL_FACING);
        matrices.push();
        switch (direction) {
            case NORTH -> matrices.translate(0.5f, 0.5f, -0.01f);
            case SOUTH -> matrices.translate(0.5f, 0.5f, 1.01f);
            case WEST -> matrices.translate(-0.01f, 0.5f, 0.5f);
            case EAST -> matrices.translate(1.01f, 0.5f, 0.5f);
        }
        matrices.scale(0.35f, 0.35f, 0.35f);
        switch (direction) {
            case NORTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));
            case SOUTH -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));
            case WEST -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));
            case EAST -> matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(270));
        }
        itemRenderer.renderItem(stack, ModelTransformationMode.GUI, getLightLevel(entity.getWorld(),
                entity.getPos()), OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 1);
        matrices.pop();
    }
    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, Math.max(sLight, 15));
    }
}