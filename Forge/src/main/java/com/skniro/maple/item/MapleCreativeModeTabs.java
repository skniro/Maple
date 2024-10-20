package com.skniro.maple.item;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.skniro.maple.block.MapleBlocks.MAPLE_LOG;
import static com.skniro.maple.item.MapleItems.MapleSyrup;

public class MapleCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Maple.MODID);

    public static final RegistryObject<CreativeModeTab> Maple_Group = CREATIVE_MODE_TABS.register("maple_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MAPLE_LOG.get()))
                    .title(Component.translatable("itemGroup.maple.maple_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(MapleBlocks.MAPLE_LOG.get());
                        pOutput.accept(MapleBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(MapleBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(MapleBlocks.MAPLE_WOOD.get());
                        pOutput.accept(MapleBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(MapleBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(MapleBlocks.MAPLE_SAPLING.get());
                        pOutput.accept(MapleBlocks.RED_MAPLE_SAPLING.get());
                        pOutput.accept(MapleBlocks.SAKURA_SAPLING.get());
                        pOutput.accept(MapleBlocks.SAKURA_CARPET.get());
                        pOutput.accept(MapleBlocks.MAPLE_LEAVES.get());
                        pOutput.accept(MapleBlocks.Maple_CARPET.get());
                        pOutput.accept(MapleBlocks.SAKURA_LEAVES.get());
                        pOutput.accept(MapleBlocks.MAPLE_PLANKS.get());
                        pOutput.accept(MapleBlocks.RED_MAPLE_LEAVES.get());
                        pOutput.accept(MapleBlocks.RED_MAPLE_CARPET.get());
                        pOutput.accept(MapleBlocks.MAPLE_BUTTON.get());
                        pOutput.accept(MapleBlocks.MAPLE_STAIRS.get());
                        pOutput.accept(MapleBlocks.MAPLE_SLAB.get());
                        pOutput.accept(MapleBlocks.MAPLE_FENCE.get());
                        pOutput.accept(MapleBlocks.MAPLE_FENCE_GATE.get());
                        pOutput.accept(MapleBlocks.MAPLE_TRAPDOOR.get());
                        pOutput.accept(MapleBlocks.MAPLE_PRESSURE_PLATE.get());
                        pOutput.accept(MapleBlocks.WHITE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.WHITE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.ORANGE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.YELLOW_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIME_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.LIME_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.PINK_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.PINK_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.GRAY_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.GRAY_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.CYAN_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.CYAN_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.PURPLE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.BLUE_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.BLUE_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.BROWN_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.BROWN_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.GREEN_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.GREEN_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.RED_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.RED_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.BLACK_STAINED_GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.BLACK_STAINED_GLASS_STAIRS.get());
                        pOutput.accept(MapleBlocks.GLASS_SLAB.get());
                        pOutput.accept(MapleBlocks.GLASS_STAIRS.get());
                        pOutput.accept(MapleItems.MAPLE_SIGN.get());
                        pOutput.accept(MapleItems.Maple_HANGING_SIGN.get());
                        pOutput.accept(MapleItems.MAPLE_DOOR.get());
                        pOutput.accept(MapleItems.MAPLE_BOAT.get());
                        pOutput.accept(MapleItems.MAPLE_CHEST_BOAT.get());
                        pOutput.accept(MapleBlocks.GINKGO_LOG.get());
                        pOutput.accept(MapleBlocks.STRIPPED_GINKGO_LOG.get());
                        pOutput.accept(MapleBlocks.STRIPPED_GINKGO_WOOD.get());
                        pOutput.accept(MapleBlocks.GINKGO_WOOD.get());
                        pOutput.accept(MapleBlocks.STRIPPED_GINKGO_WOOD.get());
                        pOutput.accept(MapleBlocks.STRIPPED_GINKGO_LOG.get());
                        pOutput.accept(MapleBlocks.GINKGO_SAPLING.get());
                        pOutput.accept(MapleBlocks.GINKGO_LEAVES.get());
                        pOutput.accept(MapleBlocks.GINKGO_CARPET.get());
                        pOutput.accept(MapleBlocks.GINKGO_PLANKS.get());
                        pOutput.accept(MapleBlocks.GINKGO_BUTTON.get());
                        pOutput.accept(MapleBlocks.GINKGO_STAIRS.get());
                        pOutput.accept(MapleBlocks.GINKGO_SLAB.get());
                        pOutput.accept(MapleBlocks.GINKGO_FENCE.get());
                        pOutput.accept(MapleBlocks.GINKGO_FENCE_GATE.get());
                        pOutput.accept(MapleBlocks.GINKGO_TRAPDOOR.get());
                        pOutput.accept(MapleBlocks.GINKGO_PRESSURE_PLATE.get());
                        pOutput.accept(MapleItems.GINKGO_SIGN.get());
                        pOutput.accept(MapleItems.GINKGO_HANGING_SIGN.get());
                        pOutput.accept(MapleItems.GINKGO_DOOR.get());
                        pOutput.accept(MapleItems.GINKGO_BOAT.get());
                        pOutput.accept(MapleItems.GINKGO_CHEST_BOAT.get());
                        pOutput.accept(MapleOreBlocks.Salt_Ore.get());
                        pOutput.accept(MapleOreBlocks.DEEPSLATE_Salt_Ore.get());
                        pOutput.accept(MapleItems.SNOWBALL_STONE.get());
                        pOutput.accept(MapleItems.SNOWBALL_Diamond.get());
                        pOutput.accept(MapleItems.SNOWBALL_Gold.get());
                        pOutput.accept(MapleItems.SNOWBALL_ICE.get());
                        pOutput.accept(MapleItems.SNOWBALL_IRON.get());
                        pOutput.accept(MapleItems.SNOWBALL_Compression.get());
                        pOutput.accept(MapleItems.SNOWBALL_Teleporting.get());
                        pOutput.accept(MapleItems.SNOWBALL_Confusion.get());
                        pOutput.accept(MapleItems.SNOWBALL_Instant_Health.get());
                        pOutput.accept(MapleItems.SNOWBALL_Poison.get());
                        pOutput.accept(MapleBlocks.TATAMI.get());
                        pOutput.accept(MapleBlocks.TATAMI_SLAB.get());
                        pOutput.accept(MapleFluidBlockOrItem.Hot_Spring_BUCKET.get());
                        pOutput.accept(MapleOreBlocks.Nether_Coal_Ore.get());
                        pOutput.accept(MapleOreBlocks.Nether_Copper_Ore.get());
                        pOutput.accept(MapleOreBlocks.Nether_Diamond_Ore.get());
                        pOutput.accept(MapleOreBlocks.Nether_Emerald_Ore.get());
                        pOutput.accept(MapleOreBlocks.Nether_Gold_Ore.get());
                        pOutput.accept(MapleOreBlocks.Nether_Iron_Ore.get());
                        pOutput.accept(MapleOreBlocks.Nether_Lapis_Ore.get());
                        pOutput.accept(MapleOreBlocks.Nether_Redstone_Ore.get());
                        //PLASTER
                        pOutput.accept(MapleBlocks.GREEN_PLASTER.get());
                        pOutput.accept(MapleBlocks.PLASTER.get());
                        pOutput.accept(MapleBlocks.ORANGE_PLASTER.get());
                        pOutput.accept(MapleBlocks.MAGENTA_PLASTER.get());
                        pOutput.accept(MapleBlocks.LIGHT_BLUE_PLASTER.get());
                        pOutput.accept(MapleBlocks.YELLOW_PLASTER.get());
                        pOutput.accept(MapleBlocks.LIME_PLASTER.get());
                        pOutput.accept(MapleBlocks.PINK_PLASTER.get());
                        pOutput.accept(MapleBlocks.GRAY_PLASTER.get());
                        pOutput.accept(MapleBlocks.LIGHT_GRAY_PLASTER.get());
                        pOutput.accept(MapleBlocks.CYAN_PLASTER.get());
                        pOutput.accept(MapleBlocks.PURPLE_PLASTER.get());
                        pOutput.accept(MapleBlocks.BLUE_PLASTER.get());
                        pOutput.accept(MapleBlocks.BROWN_PLASTER.get());
                        pOutput.accept(MapleBlocks.RED_PLASTER.get());
                        //Sea Lantern
                        pOutput.accept(MapleBlocks.Iron_Sea_Lantern.get());
                        pOutput.accept(MapleBlocks.Gold_Sea_Lantern.get());
                        //Cherry Armor and tools
                        pOutput.accept(MapleArmorItems.Cherry_INGOT.get());
                        pOutput.accept(MapleArmorItems.Cherry_NUGGET.get());
                        pOutput.accept(MapleArmorItems.Cherry_HELMET.get());
                        pOutput.accept(MapleArmorItems.Cherry_CHESTPLATE.get());
                        pOutput.accept(MapleArmorItems.Cherry_LEGGINGS.get());
                        pOutput.accept(MapleArmorItems.Cherry_BOOTS.get());
                        pOutput.accept(MapleArmorItems.Cherry_SWORD.get());
                        pOutput.accept(MapleArmorItems.Cherry_AXE.get());
                        pOutput.accept(MapleArmorItems.Cherry_PICKAXE.get());
                        pOutput.accept(MapleArmorItems.Cherry_SHOVEL.get());
                        pOutput.accept(MapleArmorItems.Cherry_HOE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> Maple_Group_Food = CREATIVE_MODE_TABS.register("maple_group_food",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MapleSyrup.get()))
                    .title(Component.translatable("itemGroup.maple.maple_group_food"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(MapleItems.Flour.get());
                        pOutput.accept(MapleItems.MapleSyrup.get());
                        pOutput.accept(MapleItems.Cream.get());
                        pOutput.accept(MapleItems.MILK_BOTTOM.get());
                        pOutput.accept(MapleItems.SOYBEAN.get());
                        pOutput.accept(MapleItems.Salt.get());
                        pOutput.accept(MapleItems.Rice.get());
                        pOutput.accept(MapleFoodComponents.Sanshoku_Dango.get());
                        pOutput.accept(MapleFoodComponents.Anko_Dango.get());
                        pOutput.accept(MapleFoodComponents.Zunda_Dango.get());
                        pOutput.accept(MapleFoodComponents.Kinako_Dango.get());
                        pOutput.accept(MapleFoodComponents.Mochi.get());
                        pOutput.accept(MapleFoodComponents.SakuraMochi.get());
                        pOutput.accept(MapleFoodComponents.TOFU.get());
                        pOutput.accept(MapleFoodComponents.MILK_ICECREAM.get());
                        pOutput.accept(MapleFoodComponents.Cooked_Rice.get());
                        pOutput.accept(MapleFoodComponents.Beef_Rice.get());
                        pOutput.accept(MapleFoodComponents.Cheese.get());
                    })
                    .build());





    public static void registerMapleCreativeModeTabs(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
