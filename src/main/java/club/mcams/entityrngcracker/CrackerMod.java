/*
 * This file is part of the TemplateMod project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2023  Fallen_Breath and contributors
 *
 * TemplateMod is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TemplateMod is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with TemplateMod.  If not, see <https://www.gnu.org/licenses/>.
 */

package club.mcams.entityrngcracker;

import net.fabricmc.api.ModInitializer;

public class CrackerMod implements ModInitializer
{
	public static final String MOD_ID = "entityrngcracker";
	public static String MOD_VERSION = "1.0.0";
	public static String MOD_NAME = "EntityRngCracker";
	public static String compactName = "entityrngcracker";

	@Override
	public void onInitialize() {
		CrackerServer.init();
	}
}
