package com.skniro.maple.entity;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.MapleItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;

import java.util.function.Supplier;

public class MapleBoatType {
    public static final EnumProxy<Boat.Type> MAPLE = new EnumProxy<>(Boat.Type.class, MapleBlocks.MAPLE_PLANKS, ResourceLocation.fromNamespaceAndPath(Maple.MODID,"maple").toString(), MapleItems.MAPLE_BOAT, MapleItems.MAPLE_CHEST_BOAT, (Supplier<Item>)() -> Items.STICK, false);
    public static final EnumProxy<Boat.Type> GINKGO = new EnumProxy<>(Boat.Type.class, MapleBlocks.GINKGO_PLANKS, ResourceLocation.fromNamespaceAndPath(Maple.MODID,"ginkgo").toString(), MapleItems.GINKGO_BOAT, MapleItems.GINKGO_CHEST_BOAT, (Supplier<Item>)() -> Items.STICK, false);
}