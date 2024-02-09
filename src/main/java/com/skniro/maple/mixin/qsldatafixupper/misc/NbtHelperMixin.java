/*
 * Copyright 2022 The Quilt Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skniro.maple.mixin.qsldatafixupper.misc;

import com.skniro.maple.misc.qsldatafixupper.impl.QuiltDataFixesInternals;
import org.spongepowered.asm.mixin.Mixin;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import org.spongepowered.asm.mixin.injection.At;


@Mixin(NbtHelper.class)
public abstract class NbtHelperMixin {
	public NbtHelperMixin() {
	}

	@ModifyReturnValue(
			method = {"putDataVersion"},
			at = {@At("RETURN")}
	)

	private static NbtCompound putDataVersion(NbtCompound nbt) {
		return QuiltDataFixesInternals.get().addModDataVersions(nbt);
	}
}