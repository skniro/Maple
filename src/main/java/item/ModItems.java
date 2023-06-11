package item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.ModDoorBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            new SignItem(new FabricItemSettings().group(Maple.Maple_Group).maxCount(16),
                    ModDoorBlocks.CHERRY_SIGN, ModDoorBlocks.CHERRY_WALL_SIGN));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Maple.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Maple.LOGGER.info("Registering Mod Items for " + Maple.MOD_ID);
    }
}