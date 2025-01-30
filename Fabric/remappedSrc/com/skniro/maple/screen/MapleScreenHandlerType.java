package com.skniro.maple.screen;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

public class MapleScreenHandlerType<T extends AbstractContainerMenu>{
    public static final MenuType<MapleJuicerBlockScreenHandler> Maple_JUICER =
            Registry.register(BuiltInRegistries.MENU, ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "maple_juicer_screen_handler"),
                    new ExtendedScreenHandlerType<>(MapleJuicerBlockScreenHandler::new, BlockPos.STREAM_CODEC));

    public static void registerMapleScreenHandlerType () {
        Maple.LOGGER.debug("Registering Maple Screen Handler Type for " + Maple.MOD_ID);
    }
}
