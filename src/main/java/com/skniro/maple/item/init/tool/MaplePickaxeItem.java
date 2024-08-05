package com.skniro.maple.item.init.tool;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;

public class MaplePickaxeItem extends MiningToolItem {
    public MaplePickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super((float)attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }
}
