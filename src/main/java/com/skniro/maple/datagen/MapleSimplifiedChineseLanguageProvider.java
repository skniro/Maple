package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleNetherOresBlocks;
import com.skniro.maple.block.MapleOreBlocks;
import com.skniro.maple.block.MapleSignBlocks;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.gamerules.MapleGameRules;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public MapleSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        //Maple
        translationBuilder.add(MapleBlocks.MAPLE_PLANKS,"枫木木板");
        translationBuilder.add(MapleBlocks.MAPLE_LOG,"枫树原木");
        translationBuilder.add(MapleBlocks.MAPLE_WOOD,"枫树木");
        translationBuilder.add(MapleBlocks.STRIPPED_MAPLE_WOOD,"去皮枫树木");
        translationBuilder.add(MapleBlocks.STRIPPED_MAPLE_LOG,"去皮枫树原木");
        translationBuilder.add(MapleBlocks.MAPLE_LEAVES,"枫树叶");
        translationBuilder.add(MapleBlocks.RED_MAPLE_LEAVES,"红枫枫树叶");
        translationBuilder.add(MapleBlocks.MAPLE_DOOR,"枫木门");
        translationBuilder.add(MapleBlocks.MAPLE_BUTTON,"枫木按钮");
        translationBuilder.add(MapleBlocks.MAPLE_FENCE,"枫木栏杆");
        translationBuilder.add(MapleBlocks.MAPLE_FENCE_GATE,"枫木栏杆门");
        translationBuilder.add(MapleBlocks.MAPLE_SLAB,"枫木台阶");
        translationBuilder.add(MapleBlocks.MAPLE_STAIRS,"枫木楼梯");
        translationBuilder.add(MapleBlocks.MAPLE_SAPLING,"枫木树苗");
        translationBuilder.add(MapleBlocks.RED_MAPLE_SAPLING,"红枫枫木树苗");
        translationBuilder.add(MapleBlocks.POTTED_MAPLE_SAPLING,"红枫枫木树苗盆栽");
        translationBuilder.add(MapleBlocks.POTTED_RED_MAPLE_SAPLING,"枫木树苗盆栽");
        translationBuilder.add(MapleSignBlocks.Maple_SIGN,"枫木告示牌");
        translationBuilder.add(MapleBlocks.MAPLE_TRAPDOOR,"枫木活版门");
        translationBuilder.add(MapleBlocks.MAPLE_PRESSURE_PLATE,"枫木压力板");

        //Ginkgo
        translationBuilder.add(MapleBlocks.GINKGO_PLANKS,"银杏木木板");
        translationBuilder.add(MapleBlocks.GINKGO_LOG,"银杏树原木");
        translationBuilder.add(MapleBlocks.GINKGO_WOOD,"银杏树木");
        translationBuilder.add(MapleBlocks.STRIPPED_GINKGO_WOOD,"去皮银杏树木");
        translationBuilder.add(MapleBlocks.STRIPPED_GINKGO_LOG,"去皮银杏树原木");
        translationBuilder.add(MapleBlocks.GINKGO_LEAVES,"银杏树叶");
        translationBuilder.add(MapleBlocks.GINKGO_DOOR,"银杏木门");
        translationBuilder.add(MapleBlocks.GINKGO_BUTTON,"银杏木按钮");
        translationBuilder.add(MapleBlocks.GINKGO_FENCE,"银杏木栏杆");
        translationBuilder.add(MapleBlocks.GINKGO_FENCE_GATE,"银杏木栏杆门");
        translationBuilder.add(MapleBlocks.GINKGO_SLAB,"银杏木台阶");
        translationBuilder.add(MapleBlocks.GINKGO_STAIRS,"银杏木楼梯");
        translationBuilder.add(MapleBlocks.GINKGO_SAPLING,"银杏木树苗");
        translationBuilder.add(MapleBlocks.POTTED_GINKGO_SAPLING,"银杏木树苗盆栽");
        translationBuilder.add(MapleSignBlocks.GINKGO_SIGN,"银杏木告示牌");
        translationBuilder.add(MapleBlocks.GINKGO_TRAPDOOR,"银杏木活版门");
        translationBuilder.add(MapleBlocks.GINKGO_PRESSURE_PLATE,"银杏木压力板");

        //Cherry
        translationBuilder.add(MapleBlocks.CHERRY_LOG,"樱树原木");
        translationBuilder.add(MapleBlocks.CHERRY_WOOD,"樱树木");
        translationBuilder.add(MapleBlocks.CHERRY_PLANKS,"樱木木板");
        translationBuilder.add(MapleBlocks.STRIPPED_CHERRY_WOOD,"去皮樱树木");
        translationBuilder.add(MapleBlocks.STRIPPED_CHERRY_LOG,"去皮樱树原木");
        translationBuilder.add(MapleBlocks.CHERRY_LEAVES,"樱树叶");
        translationBuilder.add(MapleBlocks.CHERRY_DOOR,"樱木门");
        translationBuilder.add(MapleBlocks.CHERRY_BUTTON,"樱木按钮");
        translationBuilder.add(MapleBlocks.CHERRY_FENCE,"樱木栏杆");
        translationBuilder.add(MapleBlocks.CHERRY_FENCE_GATE,"樱木栏杆门");
        translationBuilder.add(MapleBlocks.CHERRY_SLAB,"樱木台阶");
        translationBuilder.add(MapleBlocks.CHERRY_STAIRS,"樱木楼梯");
        translationBuilder.add(MapleBlocks.CHERRY_SAPLING,"樱木树苗");
        translationBuilder.add(MapleBlocks.POTTED_CHERRY_SAPLING,"樱木树苗盆栽");
        translationBuilder.add(MapleSignBlocks.CHERRY_SIGN,"樱木告示牌");
        translationBuilder.add(MapleBlocks.CHERRY_TRAPDOOR,"樱木活版门");
        translationBuilder.add(MapleBlocks.CHERRY_PRESSURE_PLATE,"樱木压力板");
        translationBuilder.add(MapleBlocks.PINK_PETALS,"粉红色花簇");

        //BAMBOO
        translationBuilder.add(MapleBlocks.BAMBOO_BLOCK,"竹块");
        translationBuilder.add(MapleBlocks.BAMBOO_PLANKS,"竹制木板");
        translationBuilder.add(MapleBlocks.STRIPPED_BAMBOO_BLOCK,"去皮竹块");
        translationBuilder.add(MapleBlocks.BAMBOO_DOOR,"竹制木门");
        translationBuilder.add(MapleBlocks.BAMBOO_BUTTON,"竹制木按钮");
        translationBuilder.add(MapleBlocks.BAMBOO_FENCE,"竹制栏杆");
        translationBuilder.add(MapleBlocks.BAMBOO_FENCE_GATE,"竹制栏杆门");
        translationBuilder.add(MapleBlocks.BAMBOO_SLAB,"竹制台阶");
        translationBuilder.add(MapleBlocks.BAMBOO_STAIRS,"竹制楼梯");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC,"竹马赛克");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC_SLAB,"竹马赛克台阶");
        translationBuilder.add(MapleBlocks.BAMBOO_MOSAIC_STAIRS,"竹马赛克楼梯");
        translationBuilder.add(MapleSignBlocks.BAMBOO_SIGN,"竹制告示牌");
        translationBuilder.add(MapleBlocks.BAMBOO_TRAPDOOR,"竹制活版门");
        translationBuilder.add(MapleBlocks.BAMBOO_PRESSURE_PLATE,"竹制压力板");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"高玻璃杯");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"枫");
        translationBuilder.add(Maple.Maple_Group_Food,"枫-食物");

        //Sakura
        translationBuilder.add(MapleBlocks.SAKURA_LEAVES,"樱花");
        translationBuilder.add(MapleBlocks.SAKURA_SAPLING,"樱花树苗");
        translationBuilder.add(MapleBlocks.POTTED_SAKURA_SAPLING,"樱花树苗盆栽");

        //Ores
        translationBuilder.add(MapleOreBlocks.DEEPSLATE_Salt_Ore,"深板岩盐矿石");
        translationBuilder.add(MapleOreBlocks.Salt_Ore,"盐矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Coal_Ore,"下届煤矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Copper_Ore,"下届铜矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Diamond_Ore,"下届钻石矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Emerald_Ore,"下届绿宝石矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Gold_Ore,"下届金矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Iron_Ore,"下届铁矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Lapis_Ore,"下届青金石矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Redstone_Ore,"下届红石矿石");

        //Crop
        translationBuilder.add(MapleBlocks.RICE,"稻米作物");

        //Food Materials
        translationBuilder.add(MapleItems.MILK_BOTTOM,"瓶装牛奶");
        translationBuilder.add(MapleItems.Cream,"奶油");
        translationBuilder.add(MapleItems.Flour,"面粉");
        translationBuilder.add(MapleItems.Rice,"稻米");
        translationBuilder.add(MapleItems.SOYBEAN,"黄豆");
        translationBuilder.add(MapleItems.Salt,"盐");
        translationBuilder.add(MapleItems.MapleSyrup,"枫糖浆");

        //Food
        translationBuilder.add(MapleFoodComponents.Anko_Dango,"豆沙团子");
        translationBuilder.add(MapleFoodComponents.Sanshoku_Dango,"三彩团子");
        translationBuilder.add(MapleFoodComponents.Kinako_Dango,"豆粉团子");
        translationBuilder.add(MapleFoodComponents.Zunda_Dango,"豆打团子");
        translationBuilder.add(MapleFoodComponents.Cooked_Rice,"熟米饭");
        translationBuilder.add(MapleFoodComponents.TOFU,"豆腐");
        translationBuilder.add(MapleFoodComponents.MILK_ICECREAM,"牛奶冰激凌");
        translationBuilder.add(MapleFoodComponents.Mochi,"麻糬");
        translationBuilder.add(MapleFoodComponents.SakuraMochi,"樱花麻糬");

        //Boat
        translationBuilder.add(MapleItems.CHERRY_BOAT,"樱木船");
        translationBuilder.add(MapleItems.CHERRY_CHEST_BOAT,"樱木箱船");
        translationBuilder.add(MapleItems.MAPLE_BOAT,"枫木船");
        translationBuilder.add(MapleItems.MAPLE_CHEST_BOAT,"枫木箱船");
        translationBuilder.add(MapleItems.GINKGO_BOAT,"银杏木船");
        translationBuilder.add(MapleItems.GINKGO_CHEST_BOAT,"银杏木箱船");

        translationBuilder.add(MapleBlocks.CHISELED_BOOKSHELF,"雕纹书架");

        //Snowball
        translationBuilder.add(MapleItems.SNOWBALL_STONE, "雪球(石)");
        translationBuilder.add(MapleItems.SNOWBALL_Diamond, "雪球(钻石)");
        translationBuilder.add(MapleItems.SNOWBALL_Gold, "雪球(金)");
        translationBuilder.add(MapleItems.SNOWBALL_ICE, "雪球(冰)");
        translationBuilder.add(MapleItems.SNOWBALL_IRON, "雪球(铁)");
        translationBuilder.add(MapleItems.SNOWBALL_Compression, "雪球(混合)");
        translationBuilder.add(MapleItems.SNOWBALL_Teleporting, "雪球(瞬移)");
        translationBuilder.add(MapleItems.SNOWBALL_Confusion, "雪球(混乱)");
        translationBuilder.add(MapleItems.SNOWBALL_Instant_Health, "雪球(瞬间治疗)");
        translationBuilder.add(MapleItems.SNOWBALL_Poison, "雪球(毒)");

        //Glass
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_STAIRS,"白色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.WHITE_STAINED_GLASS_SLAB,"白色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_SLAB,"橘色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.ORANGE_STAINED_GLASS_STAIRS,"橘色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_SLAB,"品红色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.MAGENTA_STAINED_GLASS_STAIRS,"品红色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,"淡蓝色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS,"淡蓝色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_SLAB,"黄色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.YELLOW_STAINED_GLASS_STAIRS,"黄色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_SLAB,"黄绿色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.LIME_STAINED_GLASS_STAIRS,"黄绿色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_SLAB,"粉红色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.PINK_STAINED_GLASS_STAIRS,"粉红色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_SLAB,"灰色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.GRAY_STAINED_GLASS_STAIRS,"灰色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,"淡灰色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,"淡灰色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_SLAB,"青色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.CYAN_STAINED_GLASS_STAIRS,"青色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_SLAB,"紫色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.PURPLE_STAINED_GLASS_STAIRS,"紫色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_SLAB,"蓝色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.BLUE_STAINED_GLASS_STAIRS,"蓝色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_SLAB,"棕色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.BROWN_STAINED_GLASS_STAIRS,"棕色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_SLAB,"绿色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.GREEN_STAINED_GLASS_STAIRS,"绿色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_SLAB,"红色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.RED_STAINED_GLASS_STAIRS,"红色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_SLAB,"黑色染色玻璃台阶");
        translationBuilder.add(MapleBlocks.BLACK_STAINED_GLASS_STAIRS,"黑色染色玻璃楼梯");
        translationBuilder.add(MapleBlocks.GLASS_SLAB,"玻璃台阶");
        translationBuilder.add(MapleBlocks.GLASS_STAIRS,"玻璃楼梯");

        translationBuilder.add(MapleBlocks.TATAMI,"榻榻米");
        translationBuilder.add(MapleBlocks.TATAMI_SLAB,"榻榻米台阶");

        translationBuilder.add(MapleFluidBlockOrItem.Hot_Spring_BUCKET,"温泉桶");
        translationBuilder.add(MapleFluidBlockOrItem.Hot_Spring_BLOCK,"温泉");

        translationBuilder.add(String.valueOf(MapleGameRules.HOT_SPRING_SOURCE_CONVERSION),"允许流动温泉转换成温泉源");

    }
}
