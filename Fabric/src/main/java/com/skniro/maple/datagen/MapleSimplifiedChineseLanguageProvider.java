package com.skniro.maple.datagen;

import com.skniro.maple.Maple;
import com.skniro.maple.block.*;
import com.skniro.maple.fluid.MapleFluidBlockOrItem;
import com.skniro.maple.item.GlassCupItems;
import com.skniro.maple.item.MapleArmorItems;
import com.skniro.maple.item.MapleFoodComponents;
import com.skniro.maple.item.MapleItems;
import com.skniro.maple.world.gamerules.MapleGameRules;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class MapleSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public MapleSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup){
        super(dataGenerator, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder translationBuilder) {
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
        translationBuilder.add(MapleSignBlocks.Maple_HANGING_SIGN,"悬挂式枫木告示牌");
        translationBuilder.add(MapleBlocks.MAPLE_TRAPDOOR,"枫木活板门");
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
        translationBuilder.add(MapleSignBlocks.GINKGO_HANGING_SIGN,"悬挂式银杏木告示牌");
        translationBuilder.add(MapleBlocks.GINKGO_TRAPDOOR,"银杏木活板门");
        translationBuilder.add(MapleBlocks.GINKGO_PRESSURE_PLATE,"银杏木压力板");

        //ITEM GLASS CUP
        translationBuilder.add(GlassCupItems.HIGH_GLASS_CUP,"高玻璃杯");

        //ITEM GROUP
        translationBuilder.add(Maple.Maple_Group,"枫");
        translationBuilder.add(Maple.Maple_Group_Food,"枫-食物");
        translationBuilder.add(Maple.Maple_Group_Furniture,"枫-家具");

        //Sakura
        translationBuilder.add(MapleBlocks.SAKURA_LEAVES,"樱花");
        translationBuilder.add(MapleBlocks.SAKURA_SAPLING,"樱花树苗");
        translationBuilder.add(MapleBlocks.POTTED_SAKURA_SAPLING,"樱花树苗盆栽");

        //Ores
        translationBuilder.add(MapleOreBlocks.DEEPSLATE_Salt_Ore,"深板岩盐矿石");
        translationBuilder.add(MapleOreBlocks.Salt_Ore,"盐矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Coal_Ore,"下界煤矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Copper_Ore,"下界铜矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Diamond_Ore,"下界钻石矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Emerald_Ore,"下界绿宝石矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Gold_Ore,"下界金矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Iron_Ore,"下界铁矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Lapis_Ore,"下界青金石矿石");
        translationBuilder.add(MapleNetherOresBlocks.Nether_Redstone_Ore,"下界红石矿石");

        //Crop
        translationBuilder.add(MapleBlocks.RICE,"稻米作物");

        //Food Materials
        translationBuilder.add(MapleFoodComponents.MILK_BOTTOM,"瓶装牛奶");
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
        translationBuilder.add(MapleItems.MAPLE_BOAT,"枫木船");
        translationBuilder.add(MapleItems.MAPLE_CHEST_BOAT,"枫木箱船");
        translationBuilder.add(MapleItems.GINKGO_BOAT,"银杏木船");
        translationBuilder.add(MapleItems.GINKGO_CHEST_BOAT,"银杏木箱船");

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

        //PLASTER
        translationBuilder.add(MapleBlocks.GREEN_PLASTER,"绿色灰浆");
        translationBuilder.add(MapleBlocks.PLASTER,"灰浆");
        translationBuilder.add(MapleBlocks.ORANGE_PLASTER,"橙色灰浆");
        translationBuilder.add(MapleBlocks.MAGENTA_PLASTER,"品红色灰浆");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_PLASTER,"淡蓝色灰浆");
        translationBuilder.add(MapleBlocks.YELLOW_PLASTER,"黄色灰浆");
        translationBuilder.add(MapleBlocks.LIME_PLASTER,"黄绿色灰浆");
        translationBuilder.add(MapleBlocks.PINK_PLASTER,"粉色灰浆");
        translationBuilder.add(MapleBlocks.GRAY_PLASTER,"灰色灰浆");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_PLASTER,"淡灰色灰浆");
        translationBuilder.add(MapleBlocks.CYAN_PLASTER,"青色灰浆");
        translationBuilder.add(MapleBlocks.PURPLE_PLASTER,"紫色灰浆");
        translationBuilder.add(MapleBlocks.BLUE_PLASTER,"蓝色灰浆");
        translationBuilder.add(MapleBlocks.BROWN_PLASTER,"棕色灰浆");
        translationBuilder.add(MapleBlocks.RED_PLASTER,"红色灰浆");

        //Sea Lantern
        translationBuilder.add(MapleBlocks.Iron_Sea_Lantern,"镶嵌海晶灯");
        translationBuilder.add(MapleBlocks.Gold_Sea_Lantern,"镶金海晶灯");

        //Cherry tools
        translationBuilder.add(MapleArmorItems.Cherry_INGOT,"樱锭");
        translationBuilder.add(MapleArmorItems.Cherry_NUGGET,"樱粒");
        translationBuilder.add(MapleArmorItems.Cherry_PICKAXE,"樱稿");
        translationBuilder.add(MapleArmorItems.Cherry_AXE,"樱斧");
        translationBuilder.add(MapleArmorItems.Cherry_SHOVEL,"樱锹");
        translationBuilder.add(MapleArmorItems.Cherry_SWORD,"樱剑");
        translationBuilder.add(MapleArmorItems.Cherry_HOE,"樱锄");

        //Cherry armors
        translationBuilder.add(MapleArmorItems.Cherry_HELMET,"樱头盔");
        translationBuilder.add(MapleArmorItems.Cherry_CHESTPLATE,"樱胸甲");
        translationBuilder.add(MapleArmorItems.Cherry_LEGGINGS,"樱护腿");
        translationBuilder.add(MapleArmorItems.Cherry_BOOTS,"樱靴子");

        //Food(1.3)
        translationBuilder.add(MapleFoodComponents.Cheese,"芝士");
        translationBuilder.add(MapleFoodComponents.Beef_Rice,"牛肉饭");

        //Carpet
        translationBuilder.add(MapleBlocks.Maple_CARPET,"枫落叶");
        translationBuilder.add(MapleBlocks.RED_MAPLE_CARPET,"红枫落叶");
        translationBuilder.add(MapleBlocks.GINKGO_CARPET,"银杏落叶");
        translationBuilder.add(MapleBlocks.SAKURA_CARPET,"樱花落花");

        //cushion
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_WHITE,"白色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_ORANGE,"橙色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_MAGENTA,"品红色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_BLUE,"淡蓝色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_YELLOW,"黄色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_LIME,"黄绿色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_PINK,"粉色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_GRAY,"灰色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_LIGHT_GRAY,"淡灰色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_CYAN,"青色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_PURPLE,"紫色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_BLUE,"蓝色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_BROWN,"棕色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_GREEN,"绿色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_RED,"红色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_MAPLE_BLACK,"黑色枫木坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_WHITE,"白色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_ORANGE,"橙色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_MAGENTA,"品红色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_BLUE,"淡蓝色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_YELLOW,"黄色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_LIME,"黄绿色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_PINK,"粉色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_GRAY,"灰色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_LIGHT_GRAY,"淡灰色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_CYAN,"青色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_PURPLE,"紫色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_BLUE,"蓝色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_BROWN,"棕色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_GREEN,"绿色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_RED,"红色银杏坐垫");
        translationBuilder.add(MapleFurnitureBlocks.CUSHION_GINKGO_BLACK,"黑色银杏坐垫");

        //Table
        translationBuilder.add(MapleFurnitureBlocks.TABLE_MAPLE,"枫木桌");
        translationBuilder.add(MapleFurnitureBlocks.TABLE_GINKGO,"银杏桌");


        //Window
        translationBuilder.add(MapleFurnitureBlocks.Window_Wood_GINKGO,"银杏木窗");
        translationBuilder.add(MapleFurnitureBlocks.Window_Wood_MAPLE,"枫木木窗");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_GINKGO,"银杏木板窗");
        translationBuilder.add(MapleFurnitureBlocks.Window_PLANK_MAPLE,"枫木木板窗");

        //Concrete
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_SLAB,"白色混凝土台阶");
        translationBuilder.add(MapleBlocks.WHITE_CONCRETE_STAIRS,"白色混凝土楼梯");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_SLAB,"橙色混凝土台阶");
        translationBuilder.add(MapleBlocks.ORANGE_CONCRETE_STAIRS,"橙色混凝土楼梯");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_SLAB,"品红色混凝土台阶");
        translationBuilder.add(MapleBlocks.MAGENTA_CONCRETE_STAIRS,"品红色混凝土楼梯");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_SLAB,"淡蓝色混凝土台阶");
        translationBuilder.add(MapleBlocks.LIGHT_BLUE_CONCRETE_STAIRS,"淡蓝色混凝土楼梯");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_SLAB,"黄色混凝土台阶");
        translationBuilder.add(MapleBlocks.YELLOW_CONCRETE_STAIRS,"黄色混凝土楼梯");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_SLAB,"黄绿色混凝土台阶");
        translationBuilder.add(MapleBlocks.LIME_CONCRETE_STAIRS,"黄绿色混凝土楼梯");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_SLAB,"枫木混凝土台阶");
        translationBuilder.add(MapleBlocks.PINK_CONCRETE_STAIRS,"枫木混凝土楼梯");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_SLAB,"灰色混凝土台阶");
        translationBuilder.add(MapleBlocks.GRAY_CONCRETE_STAIRS,"灰色混凝土楼梯");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_SLAB,"淡灰色混凝土台阶");
        translationBuilder.add(MapleBlocks.LIGHT_GRAY_CONCRETE_STAIRS,"淡灰色混凝土楼梯");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_SLAB,"青色混凝土台阶");
        translationBuilder.add(MapleBlocks.CYAN_CONCRETE_STAIRS,"青色混凝土楼梯");
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_SLAB,"紫色混凝土台阶");;
        translationBuilder.add(MapleBlocks.PURPLE_CONCRETE_STAIRS,"紫色混凝土楼梯");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_SLAB,"蓝色混凝土台阶");
        translationBuilder.add(MapleBlocks.BLUE_CONCRETE_STAIRS,"蓝色混凝土楼梯");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_SLAB,"棕色混凝土台阶");
        translationBuilder.add(MapleBlocks.BROWN_CONCRETE_STAIRS,"棕色混凝土楼梯");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_SLAB,"绿色混凝土台阶");
        translationBuilder.add(MapleBlocks.GREEN_CONCRETE_STAIRS,"绿色混凝土楼梯");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_SLAB,"红色混凝土台阶");
        translationBuilder.add(MapleBlocks.RED_CONCRETE_STAIRS,"红色混凝土楼梯");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_SLAB,"黑色混凝土台阶");
        translationBuilder.add(MapleBlocks.BLACK_CONCRETE_STAIRS,"黑色混凝土楼梯");


        translationBuilder.add(MapleBlocks.Maple_Juicer_Block,"榨汁机");

        translationBuilder.add(MapleFoodComponents.Green_Tea_Leaves,"绿茶茶叶");
        translationBuilder.add(MapleFoodComponents.Red_Tea_Leaves,"红茶茶叶");
        translationBuilder.add(MapleFoodComponents.Green_Tea,"绿茶");
        translationBuilder.add(MapleFoodComponents.Red_Tea,"红茶");
        translationBuilder.add(MapleBlocks.Tea_Block,"茶作物");

        translationBuilder.add(MapleFoodComponents.Chorus_Juice,"紫颂果汁");
        translationBuilder.add(MapleFoodComponents.AppleJuice,"苹果汁");
        translationBuilder.add(MapleFoodComponents.CarrotJuice,"胡萝卜汁");
        translationBuilder.add(MapleFoodComponents.MelonJuice,"西瓜汁");
        translationBuilder.add(MapleFoodComponents.Sweet_Berries_Juice,"甜浆果汁");
        translationBuilder.add(MapleFoodComponents.Glow_Berries_Juice,"发光浆果汁");

        //CoffeeTable
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_Wood_MAPLE,"枫木咖啡桌");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_Wood_GINKGO,"银杏木咖啡桌");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_MAPLE,"枫木木板咖啡桌");
        translationBuilder.add(MapleFurnitureBlocks.Coffee_Table_PLANK_GINKGO,"银杏木木板咖啡桌");

        //Chair
        translationBuilder.add(MapleFurnitureBlocks.Chair_Wood_MAPLE,"枫木椅子");
        translationBuilder.add(MapleFurnitureBlocks.Chair_Wood_GINKGO,"银杏木椅子");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_MAPLE,"枫木木板椅子");
        translationBuilder.add(MapleFurnitureBlocks.Chair_PLANK_GINKGO,"银杏木木板椅子");

        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_MAPLE,"枫木木板茶几");
        translationBuilder.add(MapleFurnitureBlocks.END_TABLE_GINKGO,"银杏木木板茶几");



        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/maple/lang/zh_cn.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
