package net.hour.aotb;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hour.aotb.datagen.ModBlockTagsProvider;
import net.hour.aotb.datagen.ModLootTableProvider;
import net.hour.aotb.datagen.ModModelProvider;
import net.hour.aotb.datagen.ModRecipeProvider;

public class AllOfTheAboveDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
	}
}
