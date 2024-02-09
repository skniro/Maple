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

package com.skniro.maple.misc.qsldatafixupper.impl.client;

import com.skniro.maple.Maple;
import com.skniro.maple.misc.qsldatafixupper.impl.QuiltDataFixesInternals;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import org.jetbrains.annotations.ApiStatus;

@Environment(EnvType.CLIENT)
@ApiStatus.Internal
public final class ClientFreezer {
	public ClientFreezer() {
	}

	public static void onInitializeClient() {
		ClientLifecycleEvents.CLIENT_STARTED.register((client) -> {
			Maple.LOGGER.info("[Quilt DFU API] Clientside DataFixer Registry");
			QuiltDataFixesInternals.get().freeze();
		});
	}
}