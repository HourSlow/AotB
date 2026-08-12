package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hour.aotb.AllOfTheAbove;
import net.hour.aotb.block.ModBlocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        List<ItemConvertible> BRICKS = List.of(Items.BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.DIRT, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.COARSE_DIRT, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.ROOTED_DIRT, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.DIRT_PATH, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.SAND, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CLAY, Items.GRAVEL, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_BRICKS, Items.BRICKS, 1);
        offerSmelting(exporter, BRICKS, RecipeCategory.BUILDING_BLOCKS ,ModBlocks.CRACKED_BRICKS, 2f,100, "bricks");

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL, Items.DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_WALL, Items.DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_STAIRS, Items.DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE);
        createStairsRecipe(ModBlocks.DEEPSLATE_STAIRS, Ingredient.ofItems(Items.DEEPSLATE))
                .criterion(hasItem(Items.DEEPSLATE), conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "deepslate_stairs_from_deepslate"));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Items.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Items.STONE, 1);


        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_SLAB, Items.MOSS_BLOCK);
        createStairsRecipe(ModBlocks.MOSSY_STAIRS, Ingredient.ofItems(Items.MOSS_BLOCK))
                .criterion(hasItem(Items.MOSS_BLOCK), conditionsFromItem(Items.MOSS_BLOCK))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "mossy_stairs_from_moss_block"));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE, 1);
        createStairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Items.SMOOTH_STONE))
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "smooth_stone_stairs_from_smooth_stone"));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE, 1);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS, 1);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE, 1);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE, 1);


        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_SLAB, Items.WHITE_WOOL);
        createStairsRecipe(ModBlocks.WHITE_WOOL_STAIRS, Ingredient.ofItems(Items.WHITE_WOOL))
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "white_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, Items.LIGHT_GRAY_WOOL);
        createStairsRecipe(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_WOOL))
                .criterion(hasItem(Items.LIGHT_GRAY_WOOL), conditionsFromItem(Items.LIGHT_GRAY_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "light_gray_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_SLAB, Items.GRAY_WOOL);
        createStairsRecipe(ModBlocks.GRAY_WOOL_STAIRS, Ingredient.ofItems(Items.GRAY_WOOL))
                .criterion(hasItem(Items.GRAY_WOOL), conditionsFromItem(Items.GRAY_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "gray_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_SLAB, Items.BLACK_WOOL);
        createStairsRecipe(ModBlocks.BLACK_WOOL_STAIRS, Ingredient.ofItems(Items.BLACK_WOOL))
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "black_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_SLAB, Items.BROWN_WOOL);
        createStairsRecipe(ModBlocks.BROWN_WOOL_STAIRS, Ingredient.ofItems(Items.BROWN_WOOL))
                .criterion(hasItem(Items.BROWN_WOOL), conditionsFromItem(Items.BROWN_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "brown_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_SLAB, Items.RED_WOOL);
        createStairsRecipe(ModBlocks.RED_WOOL_STAIRS, Ingredient.ofItems(Items.RED_WOOL))
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "red_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_SLAB, Items.ORANGE_WOOL);
        createStairsRecipe(ModBlocks.ORANGE_WOOL_STAIRS, Ingredient.ofItems(Items.ORANGE_WOOL))
                .criterion(hasItem(Items.ORANGE_WOOL), conditionsFromItem(Items.ORANGE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "orange_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_SLAB, Items.YELLOW_WOOL);
        createStairsRecipe(ModBlocks.YELLOW_WOOL_STAIRS, Ingredient.ofItems(Items.YELLOW_WOOL))
                .criterion(hasItem(Items.YELLOW_WOOL), conditionsFromItem(Items.YELLOW_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "yellow_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_SLAB, Items.LIME_WOOL);
        createStairsRecipe(ModBlocks.LIME_WOOL_STAIRS, Ingredient.ofItems(Items.LIME_WOOL))
                .criterion(hasItem(Items.LIME_WOOL), conditionsFromItem(Items.LIME_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "lime_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_SLAB, Items.GREEN_WOOL);
        createStairsRecipe(ModBlocks.GREEN_WOOL_STAIRS, Ingredient.ofItems(Items.GREEN_WOOL))
                .criterion(hasItem(Items.GREEN_WOOL), conditionsFromItem(Items.GREEN_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "green_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_SLAB, Items.CYAN_WOOL);
        createStairsRecipe(ModBlocks.CYAN_WOOL_STAIRS, Ingredient.ofItems(Items.CYAN_WOOL))
                .criterion(hasItem(Items.CYAN_WOOL), conditionsFromItem(Items.CYAN_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "cyan_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, Items.LIGHT_BLUE_WOOL);
        createStairsRecipe(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Items.LIGHT_BLUE_WOOL), conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "light_blue_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_SLAB, Items.BLUE_WOOL);
        createStairsRecipe(ModBlocks.BLUE_WOOL_STAIRS, Ingredient.ofItems(Items.BLUE_WOOL))
                .criterion(hasItem(Items.BLUE_WOOL), conditionsFromItem(Items.BLUE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "blue_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_SLAB, Items.PURPLE_WOOL);
        createStairsRecipe(ModBlocks.PURPLE_WOOL_STAIRS, Ingredient.ofItems(Items.PURPLE_WOOL))
                .criterion(hasItem(Items.PURPLE_WOOL), conditionsFromItem(Items.PURPLE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "purple_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_SLAB, Items.MAGENTA_WOOL);
        createStairsRecipe(ModBlocks.MAGENTA_WOOL_STAIRS, Ingredient.ofItems(Items.MAGENTA_WOOL))
                .criterion(hasItem(Items.MAGENTA_WOOL), conditionsFromItem(Items.MAGENTA_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "magenta_wool_stairs_from_deepslate"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_SLAB, Items.PINK_WOOL);
        createStairsRecipe(ModBlocks.PINK_WOOL_STAIRS, Ingredient.ofItems(Items.PINK_WOOL))
                .criterion(hasItem(Items.PINK_WOOL), conditionsFromItem(Items.PINK_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "pink_wool_stairs_from_deepslate"));
    }
}
