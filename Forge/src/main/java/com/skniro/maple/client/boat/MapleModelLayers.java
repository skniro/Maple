package com.skniro.maple.client.boat;

import com.skniro.maple.Maple;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class MapleModelLayers {
    public static final ModelLayerLocation Maple_BOAT_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(Maple.MODID, "boat/maple"), "main");
    public static final ModelLayerLocation Maple_CHEST_BOAT_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(Maple.MODID, "chest_boat/maple"), "main");
    public static final ModelLayerLocation Ginkgo_BOAT_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(Maple.MODID, "boat/ginkgo"), "main");
    public static final ModelLayerLocation Ginkgo_CHEST_BOAT_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(Maple.MODID, "chest_boat/ginkgo"), "main");
}