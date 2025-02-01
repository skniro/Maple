package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

import java.util.function.Supplier;

public class MapleFluidTypes {
    public static final ResourceLocation Spring_STILL_RL = ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "block/spring_still");
    public static final ResourceLocation Spring_FLOWING_RL = ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "block/spring_flow");
    private static final ResourceLocation Spring_OVERLAY_RL = ResourceLocation.parse("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, Maple.MOD_ID);

    public static final Supplier<FluidType> Spring_FLUID_TYPE = register("spring_water_fluid",
            FluidType.Properties.create().fallDistanceModifier(0.0F).density(15).viscosity(5).canHydrate(true).canExtinguish(true).canConvertToSource(true).supportsBoating(true).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));

    private static Supplier<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(Spring_STILL_RL, Spring_FLOWING_RL, Spring_OVERLAY_RL,
                0x5DB7EF, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}