package com.skniro.maple.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.maple.Maple;
import com.skniro.maple.entity.furniture.ChairEntity;
import com.skniro.maple.entity.furniture.CushionEntity;
import com.skniro.maple.item.MapleItems;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.function.Supplier;

public class MapleEntityType {
    public static final EntityType<ChairEntity> CHAIR_ENTITY =
            register("chair_entity",  EntityType.Builder.create(ChairEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f));

    public static final EntityType<CushionEntity> Cushion_ENTITY =
            register("cushion_entity",  EntityType.Builder.create(CushionEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 0.5f));

    public static final EntityType<BoatEntity> Maple_BOAT = register("maple_boat", EntityType.Builder.create(getBoatFactory(() -> {
        return MapleItems.MAPLE_BOAT;
    }), SpawnGroup.MISC).dropsNothing().dimensions(1.375F, 0.5625F).eyeHeight(0.5625F).maxTrackingRange(10));

    public static final EntityType<ChestBoatEntity> Maple_CHEST_BOAT = register("maple_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> {
        return MapleItems.MAPLE_CHEST_BOAT;
    }), SpawnGroup.MISC).dropsNothing().dimensions(1.375F, 0.5625F).eyeHeight(0.5625F).maxTrackingRange(10));

    public static final EntityType<BoatEntity> GINKGO_BOAT = register("ginkgo_boat", EntityType.Builder.create(getBoatFactory(() -> {
        return MapleItems.MAPLE_BOAT;
    }), SpawnGroup.MISC).dropsNothing().dimensions(1.375F, 0.5625F).eyeHeight(0.5625F).maxTrackingRange(10));

    public static final EntityType<ChestBoatEntity> GINKGO_CHEST_BOAT = register("ginkgo_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> {
        return MapleItems.MAPLE_CHEST_BOAT;
    }), SpawnGroup.MISC).dropsNothing().dimensions(1.375F, 0.5625F).eyeHeight(0.5625F).maxTrackingRange(10));

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.ENTITY, name);
        return (EntityType) Registry.register(Registries.ENTITY_TYPE, Identifier.of(Maple.MOD_ID, name), builder.build(keyOf(name)));
    }
    private static RegistryKey<EntityType<?>> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Maple.MOD_ID, name));
    }

    private static EntityType.EntityFactory<BoatEntity> getBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> {
            return new BoatEntity(type, world, itemSupplier);
        };
    }

    private static EntityType.EntityFactory<ChestBoatEntity> getChestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> {
            return new ChestBoatEntity(type, world, itemSupplier);
        };
    }

    public static void registerMapleEntityType() {
        Maple.LOGGER.debug("Registering MapleEntityType for " + Maple.MOD_ID);
    }
}
