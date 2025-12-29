package com.skniro.maple.entity.village;

import com.skniro.maple.Maple;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.entity.npc.villager.VillagerType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class MapleVillagers {
    public static final DeferredRegister<VillagerType> VILLAGER_TYPES = DeferredRegister.create(BuiltInRegistries.VILLAGER_TYPE, Maple.MOD_ID);

    public static final Supplier<VillagerType> Cherry = registerType("cherry");


    private static Supplier<VillagerType> registerType(String name) {
        VillagerType villagerType = new VillagerType();
        Supplier<VillagerType> type = VILLAGER_TYPES.register(name, () -> villagerType);
        return type;
    }

    public static void registerVillagerType(IEventBus eventBus) {
        VILLAGER_TYPES.register(eventBus);
    }

}