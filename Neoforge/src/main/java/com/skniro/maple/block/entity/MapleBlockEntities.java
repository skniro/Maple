package com.skniro.maple.block.entity;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleSignBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Set;
import java.util.function.Supplier;

public class MapleBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Maple.MOD_ID);

    public static final Supplier<BlockEntityType<MapleSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    new BlockEntityType<>(MapleSignBlockEntity::new,
                            Set.of(
                                    MapleSignBlocks.Maple_SIGN.get(),
                                    MapleSignBlocks.Maple_WALL_SIGN.get(),
                                    MapleSignBlocks.GINKGO_SIGN.get(),
                                    MapleSignBlocks.GINKGO_WALL_SIGN.get())));

    public static final Supplier<BlockEntityType<MapleHangingSignBlockEntity>> Maple_HANGING_SIGN =
            BLOCK_ENTITIES.register("maple_hanging_sign", () ->
                    new BlockEntityType<>(MapleHangingSignBlockEntity::new,
                            Set.of(
                                    MapleSignBlocks.Maple_HANGING_SIGN.get(),
                                    MapleSignBlocks.Maple_WALL_HANGING_SIGN.get(),
                                    MapleSignBlocks.GINKGO_HANGING_SIGN.get(),
                                    MapleSignBlocks.GINKGO_WALL_HANGING_SIGN.get()
                            )));



    public static void registerMapleBlockEntities(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
