package net.hour.aotb;

import net.fabricmc.api.ModInitializer;

import net.hour.aotb.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllOfTheAbove implements ModInitializer {

	public static final String MOD_ID = "aotb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}