package com.skniro.maple.fluid.init;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.MapleFluidTypes;
import com.skniro.maple.fluid.MapleFluids;
import net.minecraft.client.renderer.block.FluidModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.fluid.FluidTintSources;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.transfer.fluid.FluidResource;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.function.Consumer;

public class BaseFluidType {

    public static final Identifier Spring_STILL_RL = Identifier.fromNamespaceAndPath(Maple.MOD_ID, "block/spring_still");
    public static final Identifier Spring_FLOWING_RL = Identifier.fromNamespaceAndPath(Maple.MOD_ID, "block/spring_flow");
    private static final Identifier Spring_OVERLAY_RL = Identifier.parse("block/water_overlay");

    public static final FluidModel.Unbaked Spring_MODEL = new FluidModel.Unbaked(
            new Material(Spring_STILL_RL),
            new Material(Spring_FLOWING_RL),
            new Material(Spring_OVERLAY_RL),
            FluidTintSources.constant(-6141935)
    );
}