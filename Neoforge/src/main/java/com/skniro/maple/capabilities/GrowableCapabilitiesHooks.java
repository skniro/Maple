package com.skniro.maple.capabilities;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.items.wrapper.InvWrapper;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;

@EventBusSubscriber(modid = Maple.MODID, bus = EventBusSubscriber.Bus.MOD)
public class GrowableCapabilitiesHooks {
    @SubscribeEvent
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MapleBlockEntityType.MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE.get(), (sidedContainer, side) -> {
            return side == null ? new InvWrapper(sidedContainer) : new SidedInvWrapper(sidedContainer, side);
        });
    }
}
