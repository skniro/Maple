package com.skniro.maple.client.renderer;

import com.skniro.maple.entity.furniture.CushionEntity;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class CushinoRenderer extends EntityRenderer<CushionEntity> {

    public CushinoRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    @Override
    public ResourceLocation getTexture(CushionEntity entity) {
        return null;
    }
    @Override
    public boolean shouldRender(CushionEntity livingEntity, Frustum camera, double camX, double camY, double camZ) {
        return true;
    }


}