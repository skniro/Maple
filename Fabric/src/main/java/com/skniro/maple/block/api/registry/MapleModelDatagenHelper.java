package com.skniro.maple.block.api.registry;

import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;

import static net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant;

public class MapleModelDatagenHelper {
    private final BlockStateModelGenerator generator;

    public MapleModelDatagenHelper(BlockStateModelGenerator generator) {
        this.generator = generator;
    }

    public void registerModSweetBerryBush(Item fruititem, Block block) {
        generator.registerItemModel(fruititem);
        generator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block)
                .with(BlockStateVariantMap.models(Properties.AGE_3).generate(stage ->
                        createWeightedVariant(generator.createSubModel(block, "_stage" + stage, Models.CROSS, TextureMap::cross)
                        )
                ))
        );
    }
}