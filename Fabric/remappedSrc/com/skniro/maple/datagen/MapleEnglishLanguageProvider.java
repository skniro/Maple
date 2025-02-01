package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.*;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class MapleEnglishLanguageProvider extends FabricLanguageProvider {
    public MapleEnglishLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup){
        super(dataGenerator,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder translationBuilder) {
        //Maple
        translationBuilder.add(MapleBlocks.MAPLE_PLANKS,"Maple Planks");
        translationBuilder.add(MapleBlocks.MAPLE_LOG,"Maple Log");
        translationBuilder.add(MapleBlocks.MAPLE_WOOD,"Maple Wood");
        translationBuilder.add(MapleBlocks.STRIPPED_MAPLE_WOOD,"Stripped Maple Wood");
        translationBuilder.add(MapleBlocks.STRIPPED_MAPLE_LOG,"Stripped Maple Log");
        translationBuilder.add(MapleBlocks.MAPLE_LEAVES,"Maple Leaves");
        translationBuilder.add(MapleBlocks.RED_MAPLE_LEAVES,"Red Maple Leaves");
        translationBuilder.add(MapleBlocks.MAPLE_DOOR,"Maple Door");
        translationBuilder.add(MapleBlocks.MAPLE_BUTTON,"Maple Button");
        translationBuilder.add(MapleBlocks.MAPLE_FENCE,"Maple Fence");
        translationBuilder.add(MapleBlocks.MAPLE_FENCE_GATE,"Maple Fence Gate");
        translationBuilder.add(MapleBlocks.MAPLE_SLAB,"Maple Slab");
        translationBuilder.add(MapleBlocks.MAPLE_STAIRS,"Maple Stairs");
        translationBuilder.add(MapleBlocks.MAPLE_SAPLING,"Maple Sapling");
        translationBuilder.add(MapleBlocks.RED_MAPLE_SAPLING,"Red Maple Sapling");
        translationBuilder.add(MapleBlocks.POTTED_MAPLE_SAPLING,"Potted Maple Sapling");
        translationBuilder.add(MapleBlocks.POTTED_RED_MAPLE_SAPLING,"Potted Red Maple Sapling");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"Maple Sign");
        translationBuilder.add(MapleSignBlocks.Maple_HANGING_SIGN,"Maple Hanging Sign");
        translationBuilder.add(MapleBlocks.MAPLE_TRAPDOOR,"Maple Trapdoor");
        translationBuilder.add(MapleBlocks.MAPLE_PRESSURE_PLATE,"Maple Pressure Plate");

        //Ginkgo
        translationBuilder.add(MapleBlocks.GINKGO_PLANKS,"Ginkgo Planks");
        translationBuilder.add(MapleBlocks.GINKGO_LOG,"Ginkgo Log");
        translationBuilder.add(MapleBlocks.GINKGO_WOOD,"Ginkgo Wood");
        translationBuilder.add(MapleBlocks.STRIPPED_GINKGO_WOOD,"Stripped Ginkgo Wood");
        translationBuilder.add(MapleBlocks.STRIPPED_GINKGO_LOG,"Stripped Ginkgo Log");
        translationBuilder.add(MapleBlocks.GINKGO_LEAVES,"Ginkgo Leaves");
        translationBuilder.add(MapleBlocks.GINKGO_DOOR,"Ginkgo Door");
        translationBuilder.add(MapleBlocks.GINKGO_BUTTON,"Ginkgo Button");
        translationBuilder.add(MapleBlocks.GINKGO_FENCE,"Ginkgo Fence");
        translationBuilder.add(MapleBlocks.GINKGO_FENCE_GATE,"Ginkgo Fence Gate");
        translationBuilder.add(MapleBlocks.GINKGO_SLAB,"Ginkgo Slab");
        translationBuilder.add(MapleBlocks.GINKGO_STAIRS,"Ginkgo Stairs");
        translationBuilder.add(MapleBlocks.GINKGO_SAPLING,"Ginkgo Sapling");
        translationBuilder.add(MapleBlocks.POTTED_GINKGO_SAPLING,"Potted Ginkgo Sapling");
        translationBuilder.add(MapleSignBlocks.GINKGO_SIGN,"Ginkgo Sign");
        translationBuilder.add(MapleSignBlocks.GINKGO_HANGING_SIGN,"Ginkgo Hanging Sign");
        translationBuilder.add(MapleBlocks.GINKGO_TRAPDOOR,"Ginkgo Trapdoor");
        translationBuilder.add(MapleBlocks.GINKGO_PRESSURE_PLATE,"Ginkgo Pressure Plate");

        //Cherry
        translationBuilder.add(MapleBlocks.CHERRY_LOG,"Cherry Log");
        translationBuilder.add(MapleBlocks.CHERRY_WOOD,"Cherry Wood");
        translationBuilder.add(MapleBlocks.CHERRY_PLANKS,"Cherry Planks");
        translationBuilder.add(MapleBlocks.STRIPPED_CHERRY_WOOD,"Stripped Cherry Wood");
        translationBuilder.add(MapleBlocks.STRIPPED_CHERRY_LOG,"Stripped Cherry Log");
        translationBuilder.add(MapleBlocks.CHERRY_LEAVES,"Cherry Leaves");
        translationBuilder.add(MapleBlocks.CHERRY_DOOR,"Cherry Door");
        translationBuilder.add(MapleBlocks.CHERRY_BUTTON,"Cherry Button");
        translationBuilder.add(MapleBlocks.CHERRY_FENCE,"Cherry Fence");
        translationBuilder.add(MapleBlocks.CHERRY_FENCE_GATE,"Cherry Fence Gate");
        translationBuilder.add(MapleBlocks.CHERRY_SLAB,"Cherry Slab");
        translationBuilder.add(MapleBlocks.CHERRY_STAIRS,"Cherry Stairs");
        translationBuilder.add(MapleBlocks.CHERRY_SAPLING,"Cherry Sapling");
        translationBuilder.add(MapleBlocks.POTTED_CHERRY_SAPLING,"Potted Cherry Sapling");
        translationBuilder.add(MapleSignBlocks.CHERRY_SIGN,"Cherry Sign");
        translationBuilder.add(MapleBlocks.CHERRY_TRAPDOOR,"Cherry Trapdoor");
        translationBuilder.add(MapleBlocks.CHERRY_PRESSURE_PLATE,"Cherry Pressure Plate");
        translationBuilder.add(MapleBlocks.PINK_PETALS,"Pink Petals");

        //BAMBOO
        translationBuilder.add(MapleBlocks.BAMBOO_BLOCK,"Bamboo Block");
        translationBuilder.add(MapleBlocks.BAMBOO_PLANKS,"Bamboo Planks");
        translationBuilder.add(MapleBlocks.STRIPPED_BAMBOO_BLOCK,"Stripped Bamboo Block");
        translationBuilder.add(MapleBlocks.BAMBOO_DOOR,"Bamboo Door");
        translationBuilder.add(MapleBlocks.BAMBOO_BUTTON,"Bamboo Button");
        translationBuilder.add(MapleBlocks.BAMBOO_FENCE,"Bamboo Fence");
        translationBuilder.add(MapleBlocks.BAMBOO_FENCE_GATE,"Bamboo Fence Gate");
        translationBuilder.add(MapleBlocks.BAMBOO_SLAB,"Bamboo Slab");
        translationBuilder.add(MapleBlocks.BAMBOO_STAIRS,"Bamboo Stairs");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC,"Bamboo Mosaic");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC_SLAB,"Bamboo Mosaic Slab");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC_STAIRS,"Bamboo Mosaic Stairs");
        translationBuilder.add(MapleSignBlocks.BAMBOO_SIGN,"Bamboo Sign");
        translationBuilder.add(MapleBlocks.BAMBOO_TRAPDOOR,"Bamboo Trapdoor");
        translationBuilder.add(MapleBlocks.BAMBOO_PRESSURE_PLATE,"Bamboo Pressure Plate");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"High Glass Cup");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"Maple");
        translationBuilder.add(Maple.Maple_Group_Food,"Maple Food");
        translationBuilder.add(Maple.Maple_Group_Furniture,"Maple Furniture");

        //Sakura
        translationBuilder.add(MapleBlocks.SAKURA_LEAVES,"Sakura");
        translationBuilder.add(MapleBlocks.SAKURA_SAPLING,"Sakura Sapling");
        translationBuilder.add(MapleBlocks.POTTED_SAKURA_SAPLING,"Potted Sakura Sapling");

        //Ores
        translationBuilder.add(MapleOreBlocks.DEEPSLATE_Salt_Ore,"Deepslate Salt Ore");
        translationBuilder.add(MapleOreBlocks.Salt_Ore,"Salt Ore");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Coal_Ore,"Nether Coal Ore");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Copper_Ore,"Nether Copper Ore");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Diamond_Ore,"Nether Diamond Ore");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Emerald_Ore,"Nether Emerald Ore");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Gold_Ore,"Nether Gold Ore");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Iron_Ore,"Nether Iron Ore");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Lapis_Ore,"Nether Lapis Ore");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Redstone_Ore,"Nether Redstone Ore");

        //Crop
        translationBuilder.add(MapleBlocks.RICE,"Crop Rice");

        //Food Materials
        translationBuilder.add(MapleFoodComponents.MILK_BOTTOM,"Bottom Milk");
        translationBuilder.add(MapleItems.Cream,"Cream");
        translationBuilder.add(MapleItems.Flour,"Flour");
        translationBuilder.add(MapleItems.Rice,"Rice");
        translationBuilder.add(MapleItems.SOYBEAN,"SoyBeam");
        translationBuilder.add(MapleItems.Salt,"Salt");
        translationBuilder.add(MapleItems.MapleSyrup,"Maple Syrup");

        //Food
        translationBuilder.add(MapleFoodComponents.Anko_Dango,"Anko Dango");
        translationBuilder.add(MapleFoodComponents.Sanshoku_Dango,"Sanshoku Dango");
        translationBuilder.add(MapleFoodComponents.Kinako_Dango,"Kinako Dango");
        translationBuilder.add(MapleFoodComponents.Zunda_Dango,"Zunda Dango");
        translationBuilder.add(MapleFoodComponents.Cooked_Rice,"Cooked Rice");
        translationBuilder.add(MapleFoodComponents.TOFU,"Tofu");
        translationBuilder.add(MapleFoodComponents.MILK_ICECREAM,"Milk IceCream");
        translationBuilder.add(MapleFoodComponents.Mochi,"Mochi");
        translationBuilder.add(MapleFoodComponents.SakuraMochi,"Sakura Mochi");

        //Boat
        translationBuilder.add(MapleItems.CHERRY_BOAT,"Cherry Boat");
        translationBuilder.add(MapleItems.CHERRY_CHEST_BOAT,"Cherry Chest Boat");
        translationBuilder.add(MapleItems.MAPLE_BOAT,"Maple Boat");
        translationBuilder.add(MapleItems.MAPLE_CHEST_BOAT,"Maple Chest Boat");
        translationBuilder.add(MapleItems.GINKGO_BOAT,"Ginkgo Boat");
        translationBuilder.add(MapleItems.GINKGO_CHEST_BOAT,"Ginkgo Chest Boat");

        translationBuilder.add(MapleBlocks.CHISELED_BOOKSHELF,"Chiseled Bookshelf");

        //Snowball
        translationBuilder.add(MapleItems.SNOWBALL_STONE, "Snowball(Stone)");
        translationBuilder.add(MapleItems.SNOWBALL_Diamond, "Snowball(Diamond)");
        translationBuilder.add(MapleItems.SNOWBALL_Gold, "Snowball(Gold)");
        translationBuilder.add(MapleItems.SNOWBALL_ICE, "Snowball(Ice)");
        translationBuilder.add(MapleItems.SNOWBALL_IRON, "Snowball(Iron)");
        translationBuilder.add(MapleItems.SNOWBALL_Compression, "Snowball(Compression)");
        translationBuilder.add(MapleItems.SNOWBALL_Teleporting, "Snowball(Teleporting)");
        translationBuilder.add(MapleItems.SNOWBALL_Confusion, "Snowball(Confusion)");
        translationBuilder.add(MapleItems.SNOWBALL_Instant_Health, "Snowball(InstantHealth)");
        translationBuilder.add(MapleItems.SNOWBALL_Poison, "Snowball(Poison)");

        //Glass
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_STAIRS,"White Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_SLAB,"White Stained Glass Slab");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_SLAB,"Orange Stained Glass Slab");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS,"Orange Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB,"Magenta Stained Glass Slab");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS,"Magenta Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,"Light Blue Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS,"Light Blue Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_SLAB,"Yellow Stained Glass Slab");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS,"Yellow Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_SLAB,"Lime Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_STAIRS,"Lime Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_SLAB,"Pink Stained Glass Slab");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS,"Pink Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB,"Gray Stained Glass Slab");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS,"Gray Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,"Light Gray Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,"Light Gray Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB,"Cyan Stained Glass Slab");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS,"Cyan Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB,"Purple Stained Glass Slab");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS,"Purple Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB,"Blue Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS,"Blue Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB,"Brown Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS,"Brown Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB,"Green Stained Glass Slab");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS,"Green Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_SLAB,"Red Stained Glass Slab");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_STAIRS,"Red Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB,"Black Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS,"Black Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GLASS_SLAB,"Glass Slab");
        translationBuilder.add(MapleBlocks.GLASS_STAIRS,"Glass Stairs");

        translationBuilder.add(MapleBlocks.TATAMI,"Tatami");
        translationBuilder.add(MapleBlocks.TATAMI_SLAB,"Tatami Slab");

        translationBuilder.add(MapleFluidBlockOrItem.Hot_Spring_BUCKET,"Plaster Bucket");
        translationBuilder.add(MapleFluidBlockOrItem.Hot_Spring_BLOCK,"Plaster");

        //PLASTER
        translationBuilder.add(MapleBlocks.GREEN_PLASTER,"Green Plaster");
        translationBuilder.add(MapleBlocks.PLASTER,"Plaster");
        translationBuilder.add(MapleBlocks.ORANGE_PLASTER,"Orange Plaster");
        translationBuilder.add(MapleBlocks.MAGENTA_PLASTER,"Magenta Plaster");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_PLASTER,"Light Blue Plaster");
        translationBuilder.add(MapleBlocks.YELLOW_PLASTER,"Yellow Plaster");
        translationBuilder.add(MapleBlocks.LIME_PLASTER,"Lime Plaster");
        translationBuilder.add(MapleBlocks.PINK_PLASTER,"Pink Plaster");
        translationBuilder.add(MapleBlocks.GRAY_PLASTER,"Gray Plaster");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_PLASTER,"Light Gray Plaster");
        translationBuilder.add(MapleBlocks.CYAN_PLASTER,"Cyan Plaster");
        translationBuilder.add(MapleBlocks.PURPLE_PLASTER,"Purple Plaster");
        translationBuilder.add(MapleBlocks.BLUE_PLASTER,"Blue Plaster");
        translationBuilder.add(MapleBlocks.BROWN_PLASTER,"Brown Plaster");
        translationBuilder.add(MapleBlocks.RED_PLASTER,"Red Plaster");

        //Sea Lantern
        translationBuilder.add(MapleBlocks.Iron_Sea_Lantern,"Plating Sea Lantern");
        translationBuilder.add(MapleBlocks.Gold_Sea_Lantern,"Gilded Sea Lantern");

        //Cherry tools
        translationBuilder.add(MapleArmorItems.Cherry_NUGGET,"Cherry Nugget");
        translationBuilder.add(MapleArmorItems.Cherry_INGOT,"Cherry Ingot");
        translationBuilder.add(MapleArmorItems.Cherry_PICKAXE,"Cherry Pickaxe");
        translationBuilder.add(MapleArmorItems.Cherry_AXE,"Cherry Axe");
        translationBuilder.add(MapleArmorItems.Cherry_SHOVEL,"Cherry Shovel");
        translationBuilder.add(MapleArmorItems.Cherry_SWORD,"Cherry Sword");
        translationBuilder.add(MapleArmorItems.Cherry_HOE,"Cherry Hoe");

        //Cherry armors
        translationBuilder.add(MapleArmorItems.Cherry_HELMET,"Cherry Helmet");
        translationBuilder.add(MapleArmorItems.Cherry_CHESTPLATE,"Cherry Chestplate");
        translationBuilder.add(MapleArmorItems.Cherry_LEGGINGS,"Cherry Leggings");
        translationBuilder.add(MapleArmorItems.Cherry_BOOTS,"Cherry Boots");

        //Food(1.3)
        translationBuilder.add(MapleFoodComponents.Cheese,"Cheese");
        translationBuilder.add(MapleFoodComponents.Beef_Rice,"Beef Rice");

        //Carpet
        translationBuilder.add(MapleBlocks.Maple_CARPET,"Maple Fallen Leaves");
        translationBuilder.add(MapleBlocks.RED_MAPLE_CARPET,"Red Maple Fallen Leaves");
        translationBuilder.add(MapleBlocks.GINKGO_CARPET,"Ginkgo Fallen Leaves");
        translationBuilder.add(MapleBlocks.SAKURA_CARPET,"Sakura Fallen Flowers");

        //Cushion
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_WHITE, "White Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_ORANGE, "Orange Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_MAGENTA, "Magenta Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_LIGHT_BLUE, "Light Blue Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_YELLOW, "Yellow Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_LIME, "Lime Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_PINK, "Pink Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_GRAY, "Gray Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_LIGHT_GRAY, "Light Gray Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_CYAN, "Cyan Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_PURPLE, "Purple Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_BLUE, "Blue Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_BROWN, "Brown Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_GREEN, "Green Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_RED, "Red Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_OAK_BLACK, "Black Oak Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_WHITE, "White Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_ORANGE, "Orange Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_MAGENTA, "Magenta Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_LIGHT_BLUE, "Light Blue Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_YELLOW, "Yellow Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_LIME, "Lime Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_PINK, "Pink Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_GRAY, "Gray Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_LIGHT_GRAY, "Light Gray Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_CYAN, "Cyan Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_PURPLE, "Purple Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_BLUE, "Blue Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_BROWN, "Brown Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_GREEN, "Green Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_RED, "Red Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_SPRUCE_BLACK, "Black Spruce Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_WHITE, "White Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_ORANGE, "Orange Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_MAGENTA, "Magenta Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_LIGHT_BLUE, "Light Blue Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_YELLOW, "Yellow Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_LIME, "Lime Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_PINK, "Pink Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_GRAY, "Gray Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_LIGHT_GRAY, "Light Gray Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_CYAN, "Cyan Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_PURPLE, "Purple Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_BLUE, "Blue Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_BROWN, "Brown Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_GREEN, "Green Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_RED, "Red Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BIRCH_BLACK, "Black Birch Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_YELLOW, "Yellow Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_LIME, "Lime Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_PINK, "Pink Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_GRAY, "Gray Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_LIGHT_GRAY, "Light Gray Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_CYAN, "Cyan Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_PURPLE, "Purple Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_BLUE, "Blue Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_BROWN, "Brown Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_GREEN, "Green Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_RED, "Red Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_BLACK, "Black Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_WHITE,"White Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_ORANGE,"Orange Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_MAGENTA,"Magenta Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_JUNGLE_LIGHT_BLUE,"Magenta Jungle Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_WHITE, "White Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_ORANGE, "Orange Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_MAGENTA, "Magenta Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_LIGHT_BLUE, "Light Blue Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_YELLOW, "Yellow Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_LIME, "Lime Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_PINK, "Pink Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_GRAY, "Gray Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_LIGHT_GRAY, "Light Gray Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_CYAN, "Cyan Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_PURPLE, "Purple Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_BLUE, "Blue Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_BROWN, "Brown Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_GREEN, "Green Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_RED, "Red Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_ACACIA_BLACK, "Black Acacia Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_WHITE, "White Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_ORANGE, "Orange Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_MAGENTA, "Magenta Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIGHT_BLUE, "Light Blue Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_YELLOW, "Yellow Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIME, "Lime Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_PINK, "Pink Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_GRAY, "Gray Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_LIGHT_GRAY, "Light Gray Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_CYAN, "Cyan Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_PURPLE, "Purple Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_BLUE, "Blue Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_BROWN, "Brown Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_GREEN, "Green Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_RED, "Red Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_DARK_OAK_BLACK, "Black Oak Dark Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_WHITE, "White Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_ORANGE, "Orange Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_MAGENTA, "Magenta Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_LIGHT_BLUE, "Light Blue Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_YELLOW, "Yellow Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_LIME, "Lime Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_PINK, "Pink Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_GRAY, "Gray Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_LIGHT_GRAY, "Light Gray Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_CYAN, "Cyan Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_PURPLE, "Purple Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_BLUE, "Blue Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_BROWN, "Brown Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_GREEN, "Green Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_RED, "Red Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CRIMSON_BLACK, "Black Crimson Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_WHITE, "White Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_ORANGE, "Orange Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_MAGENTA, "Magenta Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_LIGHT_BLUE, "Light Blue Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_YELLOW, "Yellow Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_LIME, "Lime Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_PINK, "Pink Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_GRAY, "Gray Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_LIGHT_GRAY, "Light Gray Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_CYAN, "Cyan Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_PURPLE, "Purple Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_BLUE, "Blue Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_BROWN, "Brown Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_GREEN, "Green Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_RED, "Red Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_WARPED_BLACK, "Black Warped Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_WHITE, "White Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_ORANGE, "Orange Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_MAGENTA, "Magenta Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_LIGHT_BLUE, "Light Blue Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_YELLOW, "Yellow Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_LIME, "Lime Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_PINK, "Pink Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_GRAY, "Gray Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_LIGHT_GRAY, "Light Gray Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_CYAN, "Cyan Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_PURPLE, "Purple Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_BLUE, "Blue Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_BROWN, "Brown Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_GREEN, "Green Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_RED, "Red Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MANGROVE_BLACK, "Black Mangrove Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_WHITE, "White Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_ORANGE, "Orange Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_MAGENTA, "Magenta Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_BLUE, "Light Blue Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_YELLOW, "Yellow Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_LIME, "Lime Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_PINK, "Pink Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_GRAY, "Gray Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_GRAY, "Light Gray Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_CYAN, "Cyan Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_PURPLE, "Purple Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_BLUE, "Blue Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_BROWN, "Brown Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_GREEN, "Green Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_RED, "Red Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_BLACK, "Black Maple Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_WHITE, "White Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_ORANGE, "Orange Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_MAGENTA, "Magenta Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_LIGHT_BLUE, "Light Blue Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_YELLOW, "Yellow Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_LIME, "Lime Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_PINK, "Pink Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_GRAY, "Gray Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_LIGHT_GRAY, "Light Gray Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_CYAN, "Cyan Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_PURPLE, "Purple Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_BLUE, "Blue Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_BROWN, "Brown Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_GREEN, "Green Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_RED, "Red Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_CHERRY_BLACK, "Black Cherry Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_WHITE, "White Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_ORANGE, "Orange Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_MAGENTA, "Magenta Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_BLUE, "Light Blue Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_YELLOW, "Yellow Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_LIME, "Lime Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_PINK, "Pink Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_GRAY, "Gray Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_GRAY, "Light Gray Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_CYAN, "Cyan Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_PURPLE, "Purple Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_BLUE, "Blue Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_BROWN, "Brown Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_GREEN, "Green Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_RED, "Red Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_BLACK, "Black Ginkgo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_WHITE, "White Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_ORANGE, "Orange Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_MAGENTA, "Magenta Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_LIGHT_BLUE, "Light Blue Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_YELLOW, "Yellow Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_LIME, "Lime Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_PINK, "Pink Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_GRAY, "Gray Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_LIGHT_GRAY, "Light Gray Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_CYAN, "Cyan Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_PURPLE, "Purple Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_BLUE, "Blue Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_BROWN, "Brown Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_GREEN, "Green Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_RED, "Red Bamboo Cushion");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_BAMBOO_BLACK, "Black Bamboo Cushion");

        //Table
        translationBuilder.add(MapleFurnitureBlocks.TABLE_OAK, "Oak Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_SPRUCE, "Spruce Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_BIRCH, "Birch Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_JUNGLE, "Jungle Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_ACACIA, "Acacia Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_DARK_OAK, "Oak Dark Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_CRIMSON, "Crimson Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_WARPED, "Warped Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_MANGROVE, "Mangrove Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_BAMBOO, "Bamboo Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_CHERRY, "Cherry Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_MAPLE, "Maple Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_GINKGO, "Ginkgo Table");


        //Window
        translationBuilder.add(MapleFurnitureBlocks.Window_Wood_GINKGO, "Ginkgo Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_Wood_MAPLE, "Maple Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_OAK, "Oak Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_BIRCH, "Birch Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_SPRUCE, "Spruce Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_JUNGLE, "Jungle Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_DARK_OAK, "Oak Dark Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_ACACIA, "Acacia Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_MANGROVE, "Mangrove Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_CHERRY, "Cherry Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_CRIMSON, "Crimson Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_WOOD_WARPED, "Warped Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_OAK, "Oak Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_BIRCH, "Birch Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_SPRUCE, "Spruce Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_JUNGLE, "Jungle Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_DARK_OAK, "Oak Dark Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_ACACIA, "Acacia Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_MANGROVE, "Mangrove Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_CHERRY, "Cherry Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_CRIMSON, "Crimson Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_WARPED, "Warped Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_GINKGO, "Ginkgo Plank Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_MAPLE, "Maple Plank Window");

        //Concrete
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_SLAB,"White Concrete Slab");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_STAIRS,"White Concrete Stairs");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_SLAB,"Orange Concrete Slab");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_STAIRS,"Orange Concrete Stairs");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_SLAB,"Magenta Concrete Slab");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_STAIRS,"Magenta Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB,"Light Blue Concrete Slab");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS,"Light Blue Concrete Stairs");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_SLAB,"Yellow Concrete Slab");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_STAIRS,"Yellow Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_SLAB,"Lime Concrete Slab");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_STAIRS,"Lime Concrete Stairs");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_SLAB,"Pink Concrete Slab");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_STAIRS,"Pink Concrete Stairs");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_SLAB,"Gray Concrete Slab");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_STAIRS,"Gray Concrete Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB,"Light Gray Concrete Slab");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS,"Light Gray Concrete Stairs");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_SLAB,"Cyan Concrete Slab");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_STAIRS,"Cyan Concrete Stairs");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_SLAB,"Purple Concrete Slab");;
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_STAIRS,"Purple Concrete Stairs");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_SLAB,"Blue Concrete Slab");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_STAIRS,"Blue Concrete Stairs");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_SLAB,"Brown Concrete Slab");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_STAIRS,"Brown Concrete Stairs");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_SLAB,"Green Concrete Slab");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_STAIRS,"Green Concrete Stairs");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_SLAB,"Red Concrete Slab");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_STAIRS,"Red Concrete Stairs");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_SLAB,"Black Concrete Slab");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_STAIRS,"Black Concrete Stairs");

        translationBuilder.add(MapleBlocks.Maple_Juicer_Block,"Juicer");

        translationBuilder.add(MapleFoodComponents.Green_Tea_Leaves,"Green Tea Leaves");
        translationBuilder.add(MapleFoodComponents.Red_Tea_Leaves,"Red Tea Leaves");
        translationBuilder.add(MapleFoodComponents.Green_Tea,"Green Tea");
        translationBuilder.add(MapleFoodComponents.Red_Tea,"Red Tea");
        translationBuilder.add(MapleBlocks.Tea_Block,"Plant Tea");

        translationBuilder.add(MapleFoodComponents.Chorus_Juice,"Chorus Juice");
        translationBuilder.add(MapleFoodComponents.AppleJuice,"Apple Juice");
        translationBuilder.add(MapleFoodComponents.CarrotJuice,"Carrot Juice");
        translationBuilder.add(MapleFoodComponents.MelonJuice,"Melon Juice");
        translationBuilder.add(MapleFoodComponents.Sweet_Berries_Juice,"Sweet Berries Juice");
        translationBuilder.add(MapleFoodComponents.Glow_Berries_Juice,"Glow Berries Juice");

        //CoffeeTable
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_OAK,"Oak Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_SPRUCE,"Spruce Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_BIRCH,"Birch Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_JUNGLE,"JungleWood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_ACACIA,"Acacia Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_DARK_OAK,"Dark Oak Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_CRIMSON,"Crimson Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_WARPED,"Warped Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_MANGROVE,"Mangrove Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_BAMBOO,"Bamboo Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_WOOD_CHERRY,"Cherry Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_Wood_MAPLE,"Maple Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_Wood_GINKGO,"Ginkgo Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_OAK,"Oak Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_SPRUCE,"Spruce Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_BIRCH,"Birch Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_JUNGLE,"JunglePlank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_ACACIA,"Acacia Plank Coffee Table");;
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_DARK_OAK,"Dark Oak Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_CRIMSON,"Crimson Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_WARPED,"Warped Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_MANGROVE,"Mangrove Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_BAMBOO,"Bamboo Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_CHERRY,"Cherry Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_MAPLE,"Maple Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_GINKGO,"Ginkgo Plank Coffee Table");

        //Chair
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_OAK,"Oak Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_SPRUCE,"Spruce Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_BIRCH,"Birch Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_JUNGLE,"JungleWood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_ACACIA,"Acacia Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_DARK_OAK,"Dark Oak Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_CRIMSON,"Crimson Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_WARPED,"Warped Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_MANGROVE,"Mangrove Wood Chair");;
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_BAMBOO,"Bamboo Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_WOOD_CHERRY,"Cherry Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_Wood_MAPLE,"Maple Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_Wood_GINKGO,"Ginkgo Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_OAK,"Oak Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_SPRUCE,"Spruce Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_BIRCH,"Birch Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_JUNGLE,"JunglePlank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_ACACIA,"Acacia Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_DARK_OAK,"Dark Oak Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_CRIMSON,"Crimson Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_WARPED,"Warped Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_MANGROVE,"Mangrove Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_BAMBOO,"Bamboo Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_CHERRY,"Cherry Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_MAPLE,"Maple Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_GINKGO,"Ginkgo Plank Chair");

        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_OAK,"Oak End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_SPRUCE,"Spruce End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_BIRCH,"Birch End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_JUNGLE,"JungleEnd Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_ACACIA,"Acacia End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_DARK_OAK,"Dark Oak End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_CRIMSON,"Crimson End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_WARPED,"Warped End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_MANGROVE,"Mangrove End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_BAMBOO,"Bamboo End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_CHERRY,"Cherry End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_MAPLE,"Maple End Table");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_GINKGO,"Ginkgo End Table");

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/maple/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
