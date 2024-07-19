package com.skniro.maple;

import com.mojang.logging.LogUtils;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.entity.MapleBlockEntities;
import com.skniro.maple.block.entity.MapleSignTypes;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.MapleConfiguredFeatures;
import com.skniro.maple.world.MaplePlacedFeatures;
import com.skniro.maple.world.biome.MapleOverworldBiomes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import terrablender.api.Regions;

import static com.skniro.maple.block.MapleBlocks.MAPLE_LOG;
import static com.skniro.maple.item.MapleItems.MapleSyrup;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Maple.MODID)
public class Maple{

    public static final CreativeModeTab Maple_Group = new CreativeModeTab("maple.maple_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MAPLE_LOG.get());
        }
    };

    public static final CreativeModeTab Maple_Group_Food =  new CreativeModeTab("maple.maple_group_food") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MapleSyrup.get());
        }
    };

    // Define mod id in a common place for everything to reference
    public static final String MODID = "maple";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Maple() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        MapleBlocks.registerMapleBlocks(modEventBus);
        MapleOreBlocks.registerMapleOreBlocks(modEventBus);


        // Register the Deferred Register to the mod event bus so items get registered
        MapleItems.registerModItems(modEventBus);
        GlassCupItems.registerMapleGlassItems(modEventBus);
        MapleFoodComponents.registerModFoodItems(modEventBus);

        //MapleBiomeKeys.registerBiome(modEventBus);
        MapleSignBlocks.registerMapleSignBlocks(modEventBus);

        MaplePlacedFeatures.registerMaplePlacedFeatures(modEventBus);
        MapleConfiguredFeatures.registerModConfiguredFeatures(modEventBus);

        MapleBlockEntities.registerMapleBlockEntities(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(this::registerTerraBlender);

        Sheets.addWoodType(MapleSignTypes.MAPLE);
        Sheets.addWoodType(MapleSignTypes.BAMBOO);
        Sheets.addWoodType(MapleSignTypes.CHERRY);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CHERRY_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.SAKURA_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CHERRY_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_CHERRY_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_MAPLE_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.SAKURA_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.POTTED_SAKURA_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CHERRY_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.CHERRY_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.MAPLE_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BAMBOO_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.BAMBOO_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.RICE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(MapleBlocks.PINK_PETALS.get(), RenderType.cutout());

            WoodType.register(MapleSignTypes.MAPLE);
            WoodType.register(MapleSignTypes.CHERRY);
            WoodType.register(MapleSignTypes.BAMBOO);
            BlockEntityRenderers.register(MapleBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        }
    }

    private void registerTerraBlender() {
        Regions.register(new MapleOverworldBiomes(new ResourceLocation(Maple.MODID, "overworld"), 1));
    }

}
