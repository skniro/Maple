package com.skniro.maple.entity.custom;

import com.skniro.maple.entity.MapleBoatEntities;
import com.skniro.maple.item.MapleItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
public class MapleChestBoatEntity extends ChestBoat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);
    public MapleChestBoatEntity(EntityType<? extends ChestBoat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public MapleChestBoatEntity(Level pLevel, double pX, double pY, double pZ) {
        this(MapleBoatEntities.Maple_CHEST_BOAT.get(), pLevel);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }
    @Override
    public Item getDropItem() {
        switch (getMapleVariant()) {
            case MAPLE -> {
                return MapleItems.MAPLE_CHEST_BOAT.get();
            }
            case GINKGO -> {
                return MapleItems.GINKGO_CHEST_BOAT.get();
            }
        }
        return super.getDropItem();
    }
    public void setVariant(MapleBoatEntity.Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_ID_TYPE, MapleBoatEntity.Type.MAPLE.ordinal());
    }
    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getMapleVariant().getSerializedName());
    }
    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(MapleBoatEntity.Type.byName(pCompound.getString("Type")));
        }
    }
    public MapleBoatEntity.Type getMapleVariant() {
        return MapleBoatEntity.Type.byId(this.entityData.get(DATA_ID_TYPE));
    }
}