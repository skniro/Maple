package com.skniro.maple.tag;

import com.skniro.maple.Maple;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;


public class MapleItemTags {
    public static final TagKey<Item> BOOKSHELF_BOOKS = of("bookshelf_books");
    public static final TagKey<Item> REPAIRS_CHERRY_ARMOR = of("repairs_cherry_armor");
    public static final TagKey<Item> CHERRY_TOOL_MATERIALS = of("cherry_tool_materials");


    private static TagKey<Item> of(String id) {
        return TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID,id));
    }
}
