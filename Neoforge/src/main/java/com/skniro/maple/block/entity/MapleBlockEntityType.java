package com.skniro.maple.block.entity;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Set;
import java.util.function.Supplier;


public class MapleBlockEntityType {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Maple.MOD_ID);

    public static final Supplier<BlockEntityType<MapleJuicerBlockEntity>> MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE =
            BLOCK_ENTITIES.register("maple_juicer_block_entity", () -> new BlockEntityType<>(
                    MapleJuicerBlockEntity::new, Set.of(MapleBlocks.Maple_Juicer_Block.get())));

    public static void registerBlockEntityType(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
