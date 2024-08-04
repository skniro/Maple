package com.skniro.maple.tag;
import com.skniro.maple.Maple;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleBlockTags {
    public static final TagKey<Block> CEILING_HANGING_SIGNS = of("ceiling_hanging_signs");
    public static final TagKey<Block> WALL_HANGING_SIGNS = of("wall_hanging_signs");
    public static final TagKey<Block> ALL_HANGING_SIGNS = of("all_hanging_signs");

    private static TagKey<Block> of(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(Maple.MOD_ID,id));
    }
}
