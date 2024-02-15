package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleEnglishLanguageProvider extends FabricLanguageProvider {
    public MapleEnglishLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
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
        translationBuilder.add(MapleBlocks.POTTED_MAPLE_SAPLING,"Potted Maple Sapling");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"Maple Sign");
        translationBuilder.add(MapleBlocks.MAPLE_TRAPDOOR,"Maple Trapdoor");
        translationBuilder.add(MapleBlocks.MAPLE_PRESSURE_PLATE,"Maple Pressure Plate");

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

        //Sakura
        translationBuilder.add(MapleBlocks.SAKURA_LEAVES,"Sakura");
        translationBuilder.add(MapleBlocks.SAKURA_SAPLING,"Sakura Sapling");
        translationBuilder.add(MapleBlocks.POTTED_SAKURA_SAPLING,"Potted Sakura Sapling");

        //Salt Ore
        translationBuilder.add(MapleOreBlocks.DEEPSLATE_Salt_Ore,"Deepslate Salt Ore");
        translationBuilder.add(MapleOreBlocks.Salt_Ore,"Salt Ore");

        //Crop
        translationBuilder.add(MapleBlocks.RICE,"Crop Rice");

        //Food Materials
        translationBuilder.add(MapleItems.MILK_BOTTOM,"Bottom Milk");
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
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS,"Pink  Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB,"灰色Stained Glass Slab");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS,"灰色Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,"淡灰色Stained Glass Slab");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,"淡灰色Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB,"青色Stained Glass Slab");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS,"青色Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB,"紫色Stained Glass Slab");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS,"紫色Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB,"蓝色Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS,"蓝色Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB,"棕色Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS,"棕色Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB,"绿色Stained Glass Slab");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS,"绿色Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_SLAB,"Red Stained Glass Slab");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_STAIRS,"Red Stained Glass Stairs");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB,"黑色Stained Glass Slab");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS,"黑色Stained Glass Stairs");
    }
}
