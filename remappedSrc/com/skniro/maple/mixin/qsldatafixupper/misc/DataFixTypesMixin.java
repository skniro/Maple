package com.skniro.maple.mixin.qsldatafixupper.misc;


import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.skniro.maple.misc.qsldatafixupper.impl.QuiltDataFixesInternals;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;
import net.minecraft.nbt.Tag;
import net.minecraft.util.datafix.DataFixTypes;

@Mixin(DataFixTypes.class)
public abstract class DataFixTypesMixin {

    @Shadow
    @Final
    private DSL.TypeReference typeReference;

    public DataFixTypesMixin() {
    }

    @ModifyReturnValue(
            method = {"update(Lcom/mojang/datafixers/DataFixer;Lcom/mojang/serialization/Dynamic;II)Lcom/mojang/serialization/Dynamic;"},
            at = @At("RETURN")
    )


    private @NotNull Dynamic updateDataWithFixers(Dynamic original, DataFixer fixer, Dynamic dynamic, int oldVersion, int targetVersion) {
        DataFixTypes type = (DataFixTypes)DataFixTypes.class.cast(this);
        Object value = original.getValue();
        return value instanceof Tag ? QuiltDataFixesInternals.get().updateWithAllFixers(type, original) : original;
    }
}

