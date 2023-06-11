package item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleDoorBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MapleItems {
    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    MapleSignBlocks.CHERRY_SIGN, MapleSignBlocks.CHERRY_WALL_SIGN));

    public static final Item CHERRY_DOOR = registerItem("cherry_door",new TallBlockItem(MapleDoorBlocks.CHERRY_DOOR, new FabricItemSettings().group(Maple.Maple_Group).maxCount(16)));
    public static final Item MAPLE_DOOR = registerItem("maple_door",new TallBlockItem(MapleDoorBlocks.MAPLE_DOOR, new FabricItemSettings().group(Maple.Maple_Group).maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Mod Items for " + Maple.MOD_ID);
    }
}