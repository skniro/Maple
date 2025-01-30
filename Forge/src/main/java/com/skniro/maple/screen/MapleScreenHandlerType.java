package com.skniro.maple.screen;

import com.skniro.maple.Maple;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleScreenHandlerType<T extends AbstractContainerMenu> {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Maple.MODID);

    public static final RegistryObject<MenuType<MapleJuicerBlockScreenHandler>> Maple_JUICER =
            registerMenuType("maple_juicer_screen_handler", MapleJuicerBlockScreenHandler::new);

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(String name,
                                                                                                  IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void registerMapleScreenHandlerType(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
