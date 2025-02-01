package com.skniro.maple;

import com.skniro.maple.block.MapleFurnitureBlocks;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.biome.MapleGroveBiome;
import com.skniro.maple.world.biome.MapleSakuraBiome;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

import static com.skniro.maple.block.MapleBlocks.MAPLE_LOG;

public class Maple implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "maple";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ModContainer MOD_CONTAINER = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow();


    public static final ResourceKey<CreativeModeTab> Maple_Group = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "maple_group"));
    public static final ResourceKey<CreativeModeTab> Maple_Group_Food = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "test_group"));
    public static final ResourceKey<CreativeModeTab> Maple_Group_Furniture = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "maple_group_furniture"));


    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Maple_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MAPLE_LOG))
                .title(Component.translatable("itemGroup.maple.maple_group"))
                .build()); // build() no longer registers by itself
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Maple_Group_Food, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MapleItems.MapleSyrup))
                .title(Component.translatable("itemGroup.maple.maple_group_food"))
                .build()); // build() no longer registers by itself
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Maple_Group_Furniture, FabricItemGroup.builder()
                .icon(() -> new ItemStack(MapleFurnitureBlocks.CUSHION_MAPLE_YELLOW))
                .title(Component.translatable("itemGroup.maple.maple_group_furniture"))
                .build());
        MapleContent.registerItem();
        MapleContent.registerBlock();
        MapleContent.registerFluid();
        MapleContent.CreativeTab();
        MapleContent.generateWorldGen();
        MapleContent.registerOthers();
        MapleContent.registerCommand();
        MapleContent.registerMapleLootTable();
        MapleContent.registerMapleCompostableItems();
        MapleContent.registerScreenType();
        MapleContent.registerRecipeType();
        //MapleContent.datafix(MOD_CONTAINER);
    }

    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new MapleGroveBiome(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "overworld_1"), 2));
        Regions.register(new MapleSakuraBiome(ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "overworld_2"), 2));
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

}
