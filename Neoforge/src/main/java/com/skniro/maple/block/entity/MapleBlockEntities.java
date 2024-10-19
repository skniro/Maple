package com.skniro.maple.block.entity;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Maple.MODID);

    public static final Supplier<BlockEntityType<MapleSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(MapleSignBlockEntity::new,
                            MapleSignBlocks.BAMBOO_SIGN.get(),
                            MapleSignBlocks.BAMBOO_WALL_SIGN.get(),
                            MapleSignBlocks.Maple_SIGN.get(),
                            MapleSignBlocks.Maple_WALL_SIGN.get(),
                            MapleSignBlocks.CHERRY_SIGN.get(),
                            MapleSignBlocks.CHERRY_WALL_SIGN.get(),
                            MapleSignBlocks.GINKGO_SIGN.get(),
                            MapleSignBlocks.GINKGO_WALL_SIGN.get()).build(null));


    public static void registerMapleBlockEntities(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
