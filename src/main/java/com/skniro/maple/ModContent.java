package com.skniro.maple;


import com.skniro.maple.world.gen.ModTreeGeneration;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static com.skniro.maple.Maple.MOD_ID;
import static com.skniro.maple.Maple.Maple_Group;
import static com.skniro.maple.block.Maple_block.*;


public class ModContent {


    public static void registerItem(){
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maple_log"), new BlockItem(MAPLE_LOG, new FabricItemSettings().group(Maple_Group)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maple_sapling"), new BlockItem(MAPLE_SAPLING, new FabricItemSettings().group(Maple_Group)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cherry_leaves"), new BlockItem(CHERRY_LEAVES, new FabricItemSettings().group(Maple_Group)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cherry_log"), new BlockItem(CHERRY_LOG, new FabricItemSettings().group(Maple_Group)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cherry_sapling"), new BlockItem(CHERRY_SAPLING, new FabricItemSettings().group(Maple_Group)));
    }
    public static void registerBlock(){
       Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "maple_log"), MAPLE_LOG);
       Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cherry_log"), CHERRY_LOG);
       Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cherry_leaves"), CHERRY_LEAVES);
       Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cherry_sapling"), CHERRY_SAPLING);
       Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "maple_sapling"), MAPLE_SAPLING);
    }

    public static void CreativeTab() {
    }

    public static void generateWorldGen() {
        ModTreeGeneration.generateTrees();
    }

}
