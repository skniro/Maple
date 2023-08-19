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

import com.skniro.maple.Maple;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import org.jetbrains.annotations.ApiStatus;



@ApiStatus.Internal
public final class ServerFreezer {
	public ServerFreezer() {
	}

	public static void onInitialize() {
		ServerLifecycleEvents.SERVER_STARTING.register((server) -> {
			Maple.LOGGER.info("[Quilt DFU API] Serverside DataFixer Registry");
			QuiltDataFixesInternals.get().freeze();
		});
	}
}
