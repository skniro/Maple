package com.skniro.maple.fluid.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.Properties;
import java.util.function.Consumer;

public class BaseFluidType extends FluidType {
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;
    private final ResourceLocation overlayTexture;
    private final int tintColor;
    private final Vector3f fogColor;

public BaseFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, final ResourceLocation overlayTexture,
                     final int tintColor, final Vector3f fogColor, final Properties properties) {
    super(properties);
    this.stillTexture = stillTexture;
    this.flowingTexture = flowingTexture;
    this.overlayTexture = overlayTexture;
    this.tintColor = tintColor;
    this.fogColor = fogColor;
}
public ResourceLocation getStillTexture() {
    return stillTexture;
}
public ResourceLocation getFlowingTexture() {
    return flowingTexture;
}
public int getTintColor() {
    return tintColor;
}
public ResourceLocation getOverlayTexture() {
    return overlayTexture;
}
public Vector3f getFogColor() {
    return fogColor;
}


public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
    consumer.accept(new IClientFluidTypeExtensions() {
        @Override
        public ResourceLocation getStillTexture() {
            return stillTexture;
        }
        @Override
        public ResourceLocation getFlowingTexture() {
            return flowingTexture;
        }
        @Override
        public @Nullable ResourceLocation getOverlayTexture() {
            return overlayTexture;
        }
        @Override
        public int getTintColor() {
            return tintColor;
        }

    });
}
}
