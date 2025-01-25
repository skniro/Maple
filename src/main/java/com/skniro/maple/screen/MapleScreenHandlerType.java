package com.skniro.maple.screen;

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class MapleScreenHandlerType<T extends ScreenHandler>{
    public static final ScreenHandlerType<MapleJuicerBlockScreenHandler> Maple_JUICER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Maple.MOD_ID, "maple_juicer_screen_handler"),
                    new ExtendedScreenHandlerType<>(MapleJuicerBlockScreenHandler::new));

    public static void registerMapleScreenHandlerType () {
        Maple.LOGGER.debug("Registering Maple Screen Handler Type for " + Maple.MOD_ID);
    }
}
