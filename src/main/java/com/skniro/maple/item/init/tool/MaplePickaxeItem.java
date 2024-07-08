package com.skniro.maple.item.init.tool;

import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class MaplePickaxeItem extends MiningToolItem {
    public MaplePickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super((float)attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }
}
