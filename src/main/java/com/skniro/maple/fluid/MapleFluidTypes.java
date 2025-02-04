package com.skniro.maple.fluid;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.init.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class MapleFluidTypes {
    public static final ResourceLocation Spring_STILL_RL = new ResourceLocation(Maple.MODID, "block/spring_still");
    public static final ResourceLocation Spring_FLOWING_RL = new ResourceLocation(Maple.MODID, "block/spring_flow");
    private static final ResourceLocation Spring_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Maple.MODID);

    public static final RegistryObject<FluidType> Spring_FLUID_TYPE = register("spring_water_fluid",
            FluidType.Properties.create().fallDistanceModifier(0.0F).density(15).viscosity(5).descriptionId("block.maple.hot_spring").canExtinguish(true).canConvertToSource(true).supportsBoating(true).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH).canHydrate(true));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(Spring_STILL_RL, Spring_FLOWING_RL, Spring_OVERLAY_RL,
                -6141935, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}