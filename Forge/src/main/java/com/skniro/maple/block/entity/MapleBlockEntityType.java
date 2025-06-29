package com.skniro.maple.block.entity;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;


public class MapleBlockEntityType {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Maple.MOD_ID);

    public static final RegistryObject<BlockEntityType<MapleJuicerBlockEntity>>  MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE =
            BLOCK_ENTITIES.register("maple_juicer_block_entity", () -> new BlockEntityType<>(
                    MapleJuicerBlockEntity::new, Set.of(MapleBlocks.Maple_Juicer_Block.get())));

    public static void registerBlockEntityType(BusGroup eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
