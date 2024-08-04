package com.skniro.maple;

import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.biome.MapleGroveBiome;
import com.skniro.maple.world.biome.MapleOverworldBiomes;
import com.skniro.maple.world.biome.MapleSakuraBiome;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

import static com.skniro.maple.block.MapleBlocks.MAPLE_LOG;

public class Maple implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "maple";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup Maple_Group = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "maple_group"),() -> new ItemStack(MAPLE_LOG));

    public static final ItemGroup Maple_Group_Food = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "maple_group_food"),() -> new ItemStack(MapleItems.MapleSyrup));
    @Override
    public void onInitialize() {
        MapleContent.registerItem();
        MapleContent.registerBlock();
        MapleContent.registerFluid();
        MapleContent.CreativeTab();
        MapleContent.generateWorldGen();
        MapleContent.registerMapleConfigured();
        MapleContent.registerBlockEntityType();
        MapleContent.registerMapleLootTable();
    }

    public void onTerraBlenderInitialized() {
        Regions.register(new MapleOverworldBiomes(new Identifier(Maple.MOD_ID, "overworld"), 1));
        Regions.register(new MapleGroveBiome(new Identifier(Maple.MOD_ID, "overworld_1"), 2));
        Regions.register(new MapleSakuraBiome(new Identifier(Maple.MOD_ID, "overworld_2"), 2));
    }

    public static Identifier asResource(String path) {
        return new Identifier(MOD_ID, path);
    }
}
