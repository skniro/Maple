package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class MapleFluidTagGeneration extends FabricTagProvider<Fluid> {

    public MapleFluidTagGeneration(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.FLUID, registriesFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // minecraft:fluid/water -> include mod hot spring fluids
        TagKey<Fluid> minecraftWater = TagKey.of(RegistryKeys.FLUID, Identifier.of("minecraft", "water"));
        getOrCreateTagBuilder(minecraftWater)
                .add(RegistryKey.of(RegistryKeys.FLUID, Identifier.of(Maple.MOD_ID, "hot_spring")))
                .add(RegistryKey.of(RegistryKeys.FLUID, Identifier.of(Maple.MOD_ID, "flowing_hot_spring_water")))
                .setReplace(false);
    }
}

