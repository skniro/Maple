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
        translationBuilder.add(MapleItems.MAPLE_BOAT,"Maple Boat");
        translationBuilder.add(MapleItems.MAPLE_CHEST_BOAT,"Maple Chest Boat");
        translationBuilder.add(MapleItems.GINKGO_BOAT,"Ginkgo Boat");
        translationBuilder.add(MapleItems.GINKGO_CHEST_BOAT,"Ginkgo Chest Boat");

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

        translationBuilder.add(MapleFluidBlockOrItem.Hot_Spring_BUCKET,"Hot Spring Bucket");
        translationBuilder.add(MapleFluidBlockOrItem.Hot_Spring_BLOCK,"Hot Spring");

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

        //Table
        translationBuilder.add(MapleFurnitureBlocks.TABLE_MAPLE, "Maple Table");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_GINKGO, "Ginkgo Table");


        //Window
        translationBuilder.add(MapleFurnitureBlocks.Window_Wood_GINKGO, "Ginkgo Wood Window");
        translationBuilder.add(MapleFurnitureBlocks.Window_Wood_MAPLE, "Maple Wood Window");
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
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_Wood_MAPLE,"Maple Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_Wood_GINKGO,"Ginkgo Wood Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_MAPLE,"Maple Plank Coffee Table");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_GINKGO,"Ginkgo Plank Coffee Table");

        //Chair
        translationBuilder.add(MapleFurnitureBlocks.Chair_Wood_MAPLE,"Maple Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_Wood_GINKGO,"Ginkgo Wood Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_MAPLE,"Maple Plank Chair");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_GINKGO,"Ginkgo Plank Chair");

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
