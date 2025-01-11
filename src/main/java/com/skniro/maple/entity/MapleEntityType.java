package com.skniro.maple.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.maple.Maple;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class MapleEntityType {
    public static final EntityType<CushionEntity> CHAIR_ENTITY =
            register("chair_entity",  EntityType.Builder.create(CushionEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.5f, 0.5f));

    public static final EntityType<CushionEntity> Cushion_ENTITY =
            register("cushion_entity",  EntityType.Builder.create(CushionEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.5f, 0.5f));

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.ENTITY, name);
        return (EntityType) Registry.register(Registries.ENTITY_TYPE, new Identifier(Maple.MOD_ID, name), builder.build(name));
    }

    public static void registerMapleEntityType() {
        Maple.LOGGER.debug("Registering MapleEntityType for " + Maple.MOD_ID);
    }
}
