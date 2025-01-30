package com.skniro.maple.block.entity;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class MapleBlockEntityType {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Maple.MODID);

    public static final Supplier<BlockEntityType<MapleJuicerBlockEntity>> MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE =
            BLOCK_ENTITIES.register("maple_juicer_block_entity", () -> BlockEntityType.Builder.of(
                    MapleJuicerBlockEntity::new, MapleBlocks.Maple_Juicer_Block.get()).build(null));

    public static void registerBlockEntityType(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
