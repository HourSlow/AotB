package net.hour.aotb;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.hour.aotb.block.ModBlocks;
import net.hour.aotb.potion.ModPotions;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllOfTheAbove implements ModInitializer {

	public static final String MOD_ID = "aotb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

		ModPotions.registerPotions();



		FabricBrewingRecipeRegistry.registerPotionRecipe(
				Potions.AWKWARD,
				Ingredient.ofItems(Items.GLOW_BERRIES),
				ModPotions.GLOWING_POTION.value()
		);
		FabricBrewingRecipeRegistry.registerPotionRecipe(
				ModPotions.GLOWING_POTION.value(),
				Ingredient.ofItems(Items.REDSTONE),
				ModPotions.GLOWING_POTION_2.value()
		);
		FabricBrewingRecipeRegistry.registerPotionRecipe(
				Potions.AWKWARD,
				Ingredient.ofItems(Items.GOLDEN_APPLE),
				Potions.LUCK
		);
		FabricBrewingRecipeRegistry.registerPotionRecipe(
				Potions.AWKWARD,
				Ingredient.ofItems(Items.CHARCOAL),
				ModPotions.UNLUCK_POTION.value()
		);
		FabricBrewingRecipeRegistry.registerPotionRecipe(
				Potions.AWKWARD,
				Ingredient.ofItems(Items.COAL),
				ModPotions.UNLUCK_POTION.value()
		);
	}
}