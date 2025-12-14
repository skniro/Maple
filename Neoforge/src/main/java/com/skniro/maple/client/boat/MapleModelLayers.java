package com.skniro.maple.client.boat;

import com.skniro.maple.Maple;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class MapleModelLayers {
    public static final ModelLayerLocation Maple_BOAT_LAYER = new ModelLayerLocation(
            Identifier.fromNamespaceAndPath(Maple.MOD_ID, "boat/maple"), "main");
    public static final ModelLayerLocation Maple_CHEST_BOAT_LAYER = new ModelLayerLocation(
            Identifier.fromNamespaceAndPath(Maple.MOD_ID, "chest_boat/maple"), "main");
    public static final ModelLayerLocation Ginkgo_BOAT_LAYER = new ModelLayerLocation(
            Identifier.fromNamespaceAndPath(Maple.MOD_ID, "boat/ginkgo"), "main");
    public static final ModelLayerLocation Ginkgo_CHEST_BOAT_LAYER = new ModelLayerLocation(
            Identifier.fromNamespaceAndPath(Maple.MOD_ID, "chest_boat/ginkgo"), "main");
}