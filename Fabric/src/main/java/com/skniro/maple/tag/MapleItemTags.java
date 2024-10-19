package com.skniro.maple.tag;

import com.skniro.maple.Maple;
import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class MapleItemTags {
    public static final TagKey<Item> BOOKSHELF_BOOKS = of("bookshelf_books");

    private static TagKey<Item> of(String id) {
        return TagKey.of(Registries.ITEM.getKey(), Identifier.of(Maple.MOD_ID,id));
    }
}
