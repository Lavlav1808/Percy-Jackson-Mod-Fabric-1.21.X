package net.lavlav.pjmod;

import net.fabricmc.api.ModInitializer;

import net.lavlav.pjmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PercyJacksonMod implements ModInitializer {
	public static final String MOD_ID = "pjmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}