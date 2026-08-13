package net.hour.aotb;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hour.aotb.datagen.AotABlockTagsProvider;
import net.hour.aotb.datagen.AotALootTableProvider;
import net.hour.aotb.datagen.AotAModelProvider;
import net.hour.aotb.datagen.AotARecipeProvider;

public class AllOfTheAboveDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(AotARecipeProvider::new);
		pack.addProvider(AotALootTableProvider::new);
		pack.addProvider(AotAModelProvider::new);
		pack.addProvider(AotABlockTagsProvider::new);
	}
}
