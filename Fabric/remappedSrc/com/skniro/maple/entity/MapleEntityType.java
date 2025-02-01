package com.skniro.maple.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.maple.Maple;
import com.skniro.maple.entity.furniture.ChairEntity;
import com.skniro.maple.entity.furniture.CushionEntity;
import com.skniro.maple.item.MapleItems;
import java.util.function.Supplier;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;

public class MapleEntityType {
    public static final EntityType<ChairEntity> CHAIR_ENTITY =
            register("chair_entity",  EntityType.Builder.of(ChairEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f));

    public static final EntityType<CushionEntity> Cushion_ENTITY =
            register("cushion_entity",  EntityType.Builder.of(CushionEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f));

    public static final EntityType<Boat> Maple_BOAT = register("maple_boat", EntityType.Builder.of(getBoatFactory(() -> {
        return MapleItems.MAPLE_BOAT;
    }), MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));

    public static final EntityType<ChestBoat> Maple_CHEST_BOAT = register("maple_chest_boat", EntityType.Builder.of(getChestBoatFactory(() -> {
        return MapleItems.MAPLE_CHEST_BOAT;
    }), MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));

    public static final EntityType<Boat> GINKGO_BOAT = register("ginkgo_boat", EntityType.Builder.of(getBoatFactory(() -> {
        return MapleItems.MAPLE_BOAT;
    }), MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));

    public static final EntityType<ChestBoat> GINKGO_CHEST_BOAT = register("ginkgo_chest_boat", EntityType.Builder.of(getChestBoatFactory(() -> {
        return MapleItems.MAPLE_CHEST_BOAT;
    }), MobCategory.MISC).noLootTable().sized(1.375F, 0.5625F).eyeHeight(0.5625F).clientTrackingRange(10));

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        Type<?> type = Util.fetchChoiceType(References.ENTITY, name);
        return (EntityType) Registry.register(BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name), builder.build(keyOf(name)));
    }
    private static ResourceKey<EntityType<?>> keyOf(String name) {
        return ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, name));
    }

    private static EntityType.EntityFactory<Boat> getBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> {
            return new Boat(type, world, itemSupplier);
        };
    }

    private static EntityType.EntityFactory<ChestBoat> getChestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> {
            return new ChestBoat(type, world, itemSupplier);
        };
    }

    public static void registerMapleEntityType() {
        Maple.LOGGER.debug("Registering MapleEntityType for " + Maple.MOD_ID);
    }
}
