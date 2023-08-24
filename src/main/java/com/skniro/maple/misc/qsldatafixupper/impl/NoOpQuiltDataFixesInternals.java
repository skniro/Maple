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

package com.skniro.maple.misc.qsldatafixupper.impl;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.skniro.maple.misc.qsldatafixupper.api.EmptySchema;
import net.minecraft.nbt.NbtElement;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import net.minecraft.datafixer.DataFixTypes;
import net.minecraft.nbt.NbtCompound;


@ApiStatus.Internal
public final class NoOpQuiltDataFixesInternals extends QuiltDataFixesInternals {
	private final Schema schema;

	private boolean frozen;

	public NoOpQuiltDataFixesInternals() {
		this.schema = new EmptySchema(0);

		this.frozen = false;
	}

	@Override
	public void registerFixer(@NotNull String modId, @Range(from = 0, to = Integer.MAX_VALUE) int currentVersion,
			@NotNull DataFixer dataFixer) {}

	@Override
	public @Nullable DataFixerEntry getFixerEntry(@NotNull String modId) {
		return null;
	}

	@Override
	public @NotNull Schema createBaseSchema() {
		return this.schema;
	}

	public @NotNull Dynamic<NbtElement> updateWithAllFixers(@NotNull DataFixTypes dataFixTypes, @NotNull Dynamic<NbtElement> dynamic) {
		return new Dynamic(dynamic.getOps(), ((NbtElement)dynamic.getValue()).copy());
	}

	@Override
	public @NotNull NbtCompound addModDataVersions(@NotNull NbtCompound compound) {
		return compound;
	}

	@Override
	public void freeze() {
		this.frozen = true;
	}

	@Override
	public boolean isFrozen() {
		return this.frozen;
	}
}