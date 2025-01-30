package com.skniro.maple.screen;

import com.skniro.maple.Maple;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class MapleScreenHandlerType<T extends AbstractContainerMenu> {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(BuiltInRegistries.MENU, Maple.MODID);

    public static final Supplier<MenuType<MapleJuicerBlockScreenHandler>> Maple_JUICER =
            registerMenuType("maple_juicer_screen_handler", MapleJuicerBlockScreenHandler::new);

    private static <T extends AbstractContainerMenu> Supplier<MenuType<T>> registerMenuType(String name,
                                                                                                  IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }

    public static void registerMapleScreenHandlerType(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
