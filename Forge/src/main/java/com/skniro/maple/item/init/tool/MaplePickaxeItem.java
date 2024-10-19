package com.skniro.maple.item.init.tool;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;

public class MaplePickaxeItem extends DiggerItem {
    public MaplePickaxeItem(Tier material, int attackDamage, float attackSpeed, Properties settings) {
        super((float)attackDamage, attackSpeed, material, BlockTags.MINEABLE_WITH_PICKAXE, settings);
    }
}
