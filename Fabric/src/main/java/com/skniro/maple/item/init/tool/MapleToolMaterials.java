package com.skniro.maple.item.init.tool;


import com.google.common.base.Suppliers;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.tag.MapleItemTags;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public class MapleToolMaterials{
    public static final ToolMaterial Cherry = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3231, 12.0F, 3.0F, 22, MapleItemTags.CHERRY_TOOL_MATERIALS);
}
