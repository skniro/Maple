package com.skniro.maple.entity;

import com.skniro.maple.Maple;
import com.skniro.maple.entity.custom.MapleChestBoatEntity;
import com.skniro.maple.entity.furniture.ChairEntity;
import com.skniro.maple.entity.furniture.CushionEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Maple.MODID);

    public static final RegistryObject<EntityType<com.skniro.maple.entity.custom.MapleBoatEntity>> Maple_BOAT =
            ENTITY_TYPES.register("maple_boat", () -> EntityType.Builder.<com.skniro.maple.entity.custom.MapleBoatEntity>of(com.skniro.maple.entity.custom.MapleBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("maple_boat"));
    public static final RegistryObject<EntityType<MapleChestBoatEntity>> Maple_CHEST_BOAT =
            ENTITY_TYPES.register("maple_chest_boat", () -> EntityType.Builder.<MapleChestBoatEntity>of(MapleChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("maple_chest_boat"));
    public static final RegistryObject<EntityType<ChairEntity>> CHAIR_ENTITY =
            ENTITY_TYPES.register("chair_entity",  () -> EntityType.Builder.<ChairEntity>of(ChairEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("chair_entity"));
    public static final RegistryObject<EntityType<CushionEntity>> Cushion_ENTITY =
            ENTITY_TYPES.register("cushion_entity", () -> EntityType.Builder.<CushionEntity>of(CushionEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("cushion_entity"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}