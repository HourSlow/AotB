package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hour.aotb.block.ModBlocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> CLAYABLE_BLOCKS = List.of(Items.ANDESITE, Items.GRANITE, Items.DIORITE);
        List<ItemConvertible> BRICKS = List.of(Items.BRICKS);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.ANDESITE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.GRANITE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.DIORITE, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.BASALT, 1);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICKS, Items.BRICKS, 1);

        offerSmelting(recipeExporter, BRICKS, RecipeCategory.BUILDING_BLOCKS ,ModBlocks.CRACKED_BRICKS, 2f,100, "bricks");
    }
}
