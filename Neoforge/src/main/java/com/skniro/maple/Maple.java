package com.skniro.maple;

import com.mojang.logging.LogUtils;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.entity.MapleBlockEntities;
import com.skniro.maple.block.entity.MapleWoodTypes;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.fluid.MapleFluids;
import com.skniro.maple.item.*;
import com.skniro.maple.particle.MapleParticleTypes;
import com.skniro.maple.util.MapleLootModifiers;
import com.skniro.maple.world.biome.MapleGroveBiome;
import com.skniro.maple.world.biome.MapleSakuraBiome;
import com.skniro.maple.world.biome.MapleTerrablender;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
import terrablender.api.Regions;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Maple.MODID)
public class Maple{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "maple";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Maple(IEventBus modEventBus) {

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        MapleBlocks.registerMapleBlocks(modEventBus);
        MapleOreBlocks.registerMapleOreBlocks(modEventBus);


        // Register the Deferred Register to the mod event bus so items get registered
        MapleItems.registerModItems(modEventBus);
        GlassCupItems.registerMapleGlassItems(modEventBus);
        MapleFoodComponents.registerModFoodItems(modEventBus);
        MapleArmorItems.registerMapleArmorItems(modEventBus);

        MapleFluids.registerFluids(modEventBus);
        MapleFluidBlockOrItem.registerFluidBlocks(modEventBus);
        MapleFluidBlockOrItem.registerFluidItems(modEventBus);

        MapleCreativeModeTabs.registerMapleCreativeModeTabs(modEventBus);

        MapleTerrablender.registerBiomes();
        MapleSignBlocks.registerMapleSignBlocks(modEventBus);

        MapleBlockEntities.registerMapleBlockEntities(modEventBus);

        MapleParticleTypes.MapleParticleTypesRegister(modEventBus);

        MapleLootModifiers.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            WoodType.register(MapleWoodTypes.MAPLE);
            WoodType.register(MapleWoodTypes.GINKGO);
            BlockEntityRenderers.register(MapleBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
            Sheets.addWoodType(MapleWoodTypes.MAPLE);
            Sheets.addWoodType(MapleWoodTypes.GINKGO);
        }
    }

    @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ParticleFactoryRegistry {
        @SubscribeEvent
        public static void onParticleFactoryRegistration(RegisterParticleProvidersEvent event) {
            Regions.register(new MapleGroveBiome(ResourceLocation.fromNamespaceAndPath(Maple.MODID, "overworld_1"), 2));
            Regions.register(new MapleSakuraBiome(ResourceLocation.fromNamespaceAndPath(Maple.MODID, "overworld_2"), 2));
        }
    }

}
