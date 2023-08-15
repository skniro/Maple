package com.skniro.maple;

import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.biome.MapleOverworldBiomes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
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

    public static final ItemGroup Maple_Group = FabricItemGroup.builder(new Identifier(MOD_ID, "maple_group"))
            .icon(() -> new ItemStack(MAPLE_LOG))
            .build();

    public static final ItemGroup Maple_Group_Food = FabricItemGroup.builder(new Identifier(MOD_ID, "maple_group_food"))
            .icon(() -> new ItemStack(MapleItems.MapleSyrup))
            .build();


    @Override
    public void onInitialize() {
        MapleContent.registerItem();
        MapleContent.registerBlock();
        MapleContent.CreativeTab();
        MapleContent.generateWorldGen();
        MapleContent.registerMapleConfigured();
        MapleContent.registerBlockEntityType();
    }

    public void onTerraBlenderInitialized() {
        Regions.register(new MapleOverworldBiomes(new Identifier(Maple.MOD_ID, "overworld"), 1));
    }

    public static Identifier asResource(String path) {
        return new Identifier(MOD_ID, path);
    }
}
