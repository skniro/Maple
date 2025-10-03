package com.skniro.maple.capabilities;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleBlockEntityType;
import net.minecraft.world.WorldlyContainer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.items.wrapper.InvWrapper;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.transfer.item.WorldlyContainerWrapper;

@EventBusSubscriber(modid = Maple.MOD_ID)
public class GrowableCapabilitiesHooks {
    @SubscribeEvent
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.Item.BLOCK, MapleBlockEntityType.MAPLE_JUICER_BLOCK_ENTITY_BLOCK_ENTITY_TYPE.get(), (sidedContainer, side) -> {
            WorldlyContainer worldly = (WorldlyContainer) sidedContainer;
            return new WorldlyContainerWrapper(worldly, side);
        });
    }
}
