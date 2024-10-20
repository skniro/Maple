package com.skniro.maple.client.boat;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import com.skniro.maple.Maple;
import com.skniro.maple.entity.custom.MapleBoatEntity;
import com.skniro.maple.entity.custom.MapleChestBoatEntity;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import java.util.Map;
import java.util.stream.Stream;
public class MapleBoatRenderer extends BoatRenderer {
    private final Map<MapleBoatEntity.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;
    public MapleBoatRenderer(EntityRendererProvider.Context pContext, boolean pChestBoat) {
        super(pContext, pChestBoat);
        this.boatResources = Stream.of(MapleBoatEntity.Type.values()).collect(ImmutableMap.toImmutableMap(type -> type,
                type -> Pair.of(ResourceLocation.fromNamespaceAndPath(Maple.MODID, getTextureLocation(type, pChestBoat)), this.createBoatModel(pContext, type, pChestBoat))));
    }
    private static String getTextureLocation(MapleBoatEntity.Type pType, boolean pChestBoat) {
        return pChestBoat ? "textures/entity/chest_boat/" + pType.getName() + ".png" : "textures/entity/boat/" + pType.getName() + ".png";
    }
    private ListModel<Boat> createBoatModel(EntityRendererProvider.Context pContext, MapleBoatEntity.Type pType, boolean pChestBoat) {
        ModelLayerLocation modellayerlocation = pChestBoat ? MapleBoatRenderer.createChestBoatModelName(pType) : MapleBoatRenderer.createBoatModelName(pType);
        ModelPart modelpart = pContext.bakeLayer(modellayerlocation);
        return pChestBoat ? new ChestBoatModel(modelpart) : new BoatModel(modelpart);
    }
    public static ModelLayerLocation createBoatModelName(MapleBoatEntity.Type pType) {
        return createLocation("boat/" + pType.getName(), "main");
    }
    public static ModelLayerLocation createChestBoatModelName(MapleBoatEntity.Type pType) {
        return createLocation("chest_boat/" + pType.getName(), "main");
    }
    private static ModelLayerLocation createLocation(String pPath, String pModel) {
        return new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Maple.MODID, pPath), pModel);
    }
    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(Boat boat) {
        if(boat instanceof MapleBoatEntity modBoat) {
            return this.boatResources.get(modBoat.getMapleVariant());
        } else if(boat instanceof MapleChestBoatEntity modChestBoatEntity) {
            return this.boatResources.get(modChestBoatEntity.getMapleVariant());
        } else {
            return null;
        }
    }
}