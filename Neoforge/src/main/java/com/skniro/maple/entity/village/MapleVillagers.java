package com.skniro.maple.entity.village;

import com.skniro.maple.Maple;
import com.skniro.maple.world.biome.MapleBiomeKeys;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
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
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(Registries.POINT_OF_INTEREST_TYPE, Maple.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSION = DeferredRegister.create(Registries.VILLAGER_PROFESSION, Maple.MOD_ID);
    public static final DeferredRegister<VillagerType> VILLAGER_TYPES = DeferredRegister.create(BuiltInRegistries.VILLAGER_TYPE, Maple.MOD_ID);
    public static final Map<VillagerType, Set<ResourceKey<Biome>>> VILLAGER_TYPE_BY_BIOME = new HashMap<>();

    public static final Supplier<VillagerType> Cherry = registerType("cherry", Set.of(MapleBiomeKeys.Sakura, Biomes.CHERRY_GROVE));


    private static Supplier<VillagerType> registerType(String name, Set<ResourceKey<Biome>> biomes) {
        VillagerType villagerType = new VillagerType();
        Supplier<VillagerType> type = VILLAGER_TYPES.register(name, () -> villagerType);
        VILLAGER_TYPE_BY_BIOME.put(villagerType, biomes);
        return type;
    }

    public static void registerVillagerType(IEventBus eventBus) {
        VILLAGER_TYPES.register(eventBus);
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSION.register(eventBus);
    }

}