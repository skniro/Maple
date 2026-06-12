package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.fluid.MapleFluids;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

import java.util.concurrent.CompletableFuture;

public class MapleFluidTagGeneration extends FabricTagsProvider<Fluid> {
    public MapleFluidTagGeneration(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.FLUID, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        // minecraft:fluid/water -> include mod hot spring fluids
        TagKey<Fluid> minecraftWater = TagKey.create(Registries.FLUID, Identifier.fromNamespaceAndPath("minecraft", "water"));
        builder(minecraftWater)
                .add(ResourceKey.create(Registries.FLUID, Identifier.fromNamespaceAndPath(Maple.MOD_ID, "hot_spring")))
                .add(ResourceKey.create(Registries.FLUID, Identifier.fromNamespaceAndPath(Maple.MOD_ID, "flowing_hot_spring_water")))
                .setReplace(false);
    }
}

