package com.skniro.maple;

import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.misc.qsldatafixupper.impl.ServerFreezer;
import com.skniro.maple.world.biome.MapleGroveBiome;
import com.skniro.maple.world.biome.MapleOverworldBiomes;
import com.skniro.maple.world.biome.MapleSakuraBiome;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

import java.util.ArrayList;
import java.util.List;

import static com.skniro.maple.block.MapleBlocks.MAPLE_LOG;

public class Maple implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "maple";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ModContainer MOD_CONTAINER = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow();


    public static final RegistryKey<ItemGroup> Maple_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "maple_group"));
    public static final RegistryKey<ItemGroup> Maple_Group_Food = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "test_group"));


    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, Maple_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MAPLE_LOG))
                .displayName(Text.translatable("itemGroup.maple.maple_group"))
                .build()); // build() no longer registers by itself
        Registry.register(Registries.ITEM_GROUP, Maple_Group_Food, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MapleItems.MapleSyrup))
                .displayName(Text.translatable("itemGroup.maple.maple_group_food"))
                .build()); // build() no longer registers by itself
        MapleContent.registerItem();
        MapleContent.registerBlock();
        MapleContent.registerFluid();
        MapleContent.CreativeTab();
        MapleContent.generateWorldGen();
        MapleContent.registerBlockEntityType();
        //MapleContent.datafix(MOD_CONTAINER);
    }

    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new MapleGroveBiome(new Identifier(Maple.MOD_ID, "overworld_1"), 2));
        Regions.register(new MapleSakuraBiome(new Identifier(Maple.MOD_ID, "overworld_2"), 2));
    }

    public static Identifier asResource(String path) {
        return new Identifier(MOD_ID, path);
    }

}
