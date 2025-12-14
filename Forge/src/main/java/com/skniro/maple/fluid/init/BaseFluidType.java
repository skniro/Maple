package com.skniro.maple.fluid.init;

import net.minecraft.resources.Identifier;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.Properties;
import java.util.function.Consumer;

public class BaseFluidType extends FluidType {
    private final Identifier stillTexture;
    private final Identifier flowingTexture;
    private final Identifier overlayTexture;
    private final int tintColor;
    private final Vector3f fogColor;

public BaseFluidType(final Identifier stillTexture, final Identifier flowingTexture, final Identifier overlayTexture,
                     final int tintColor, final Vector3f fogColor, final Properties properties) {
    super(properties);
    this.stillTexture = stillTexture;
    this.flowingTexture = flowingTexture;
    this.overlayTexture = overlayTexture;
    this.tintColor = tintColor;
    this.fogColor = fogColor;
}
public Identifier getStillTexture() {
    return stillTexture;
}
public Identifier getFlowingTexture() {
    return flowingTexture;
}
public int getTintColor() {
    return tintColor;
}
public Identifier getOverlayTexture() {
    return overlayTexture;
}
public Vector3f getFogColor() {
    return fogColor;
}


public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
    consumer.accept(new IClientFluidTypeExtensions() {
        @Override
        public Identifier getStillTexture() {
            return stillTexture;
        }
        @Override
        public Identifier getFlowingTexture() {
            return flowingTexture;
        }
        @Override
        public @Nullable Identifier getOverlayTexture() {
            return overlayTexture;
        }
        @Override
        public int getTintColor() {
            return tintColor;
        }

    });
}
}
