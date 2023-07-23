package com.skniro.maple.tag;

import com.skniro.maple.Maple;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleItemTags {
    public static final TagKey<Item> BOOKSHELF_BOOKS = of("bookshelf_books");

    private static TagKey<Item> of(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(Maple.MOD_ID,id));
    }
}
