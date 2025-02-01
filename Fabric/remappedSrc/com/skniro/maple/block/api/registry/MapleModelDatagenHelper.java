package com.skniro.maple.block.api.registry;

import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.blockstates.Variant;
import net.minecraft.client.data.models.blockstates.VariantProperties;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class MapleModelDatagenHelper {
    private final BlockModelGenerators generator;

    public MapleModelDatagenHelper(BlockModelGenerators generator) {
        this.generator = generator;
    }

    public void registerModSweetBerryBush(Item fruititem, Block block) {
        generator.registerSimpleFlatItemModel(fruititem);
        generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block)
                .with(PropertyDispatch.property(BlockStateProperties.AGE_3).generate(stage ->
                        Variant.variant().with(VariantProperties.MODEL,
                                generator.createSuffixedVariant(block, "_stage" + stage, ModelTemplates.CROSS, TextureMapping::cross)
                        )
                ))
        );
    }
}