package com.skniro.maple.block.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;


public class MapleBlockEntityType {

    public static final BlockEntityType<MapleJuicerBlockEntity> MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE = create("maple_juicer_block_entity", FabricBlockEntityTypeBuilder.create(MapleJuicerBlockEntity::new, MapleBlocks.Maple_Juicer_Block));

    private static <T extends BlockEntity> BlockEntityType create(String id, FabricBlockEntityTypeBuilder<T> builder) {
        Type<?> type = Util.fetchChoiceType(References.BLOCK_ENTITY, id);
        return (BlockEntityType) Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,id), builder.build(null));
    }

    public static void registerMapleBlockEntityType() {
        Maple.LOGGER.debug("Registering MapleBlockEntityType for " + Maple.MOD_ID);
    }

}
