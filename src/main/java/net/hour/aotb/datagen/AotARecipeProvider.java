package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hour.aotb.AllOfTheAbove;
import net.hour.aotb.block.AotABlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class AotARecipeProvider extends FabricRecipeProvider {

    public AotARecipeProvider(FabricDataOutput output) {
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

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.CRACKED_BRICKS, Items.BRICKS, 1);
        offerSmelting(exporter, BRICKS, RecipeCategory.BUILDING_BLOCKS , AotABlocks.CRACKED_BRICKS, 2f,100, "bricks");

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.DEEPSLATE_WALL, Items.DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.DEEPSLATE_WALL, Items.DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.DEEPSLATE_STAIRS, Items.DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.DEEPSLATE_SLAB, Items.DEEPSLATE, 2);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.DEEPSLATE_SLAB, Items.DEEPSLATE);
        createStairsRecipe(AotABlocks.DEEPSLATE_STAIRS, Ingredient.ofItems(Items.DEEPSLATE))
                .criterion(hasItem(Items.DEEPSLATE), conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "deepslate_stairs_from_deepslate"));



        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.STONE_WALL, Items.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.STONE_WALL, Items.STONE, 1);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE, 1);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE, 1);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE, 1);



        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.MOSSY_SLAB, Items.MOSS_BLOCK);
        createStairsRecipe(AotABlocks.MOSSY_STAIRS, Ingredient.ofItems(Items.MOSS_BLOCK))
                .criterion(hasItem(Items.MOSS_BLOCK), conditionsFromItem(Items.MOSS_BLOCK))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "mossy_stairs_from_moss_block"));

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE, 1);
        createStairsRecipe(AotABlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Items.SMOOTH_STONE))
                .criterion(hasItem(Items.SMOOTH_STONE), conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "smooth_stone_stairs_from_smooth_stone"));



        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE, 1);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS, 1);


        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE, 1);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE, 1);



        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.WHITE_WOOL_SLAB, Items.WHITE_WOOL);
        createStairsRecipe(AotABlocks.WHITE_WOOL_STAIRS, Ingredient.ofItems(Items.WHITE_WOOL))
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "white_wool_stairs_from_white_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.LIGHT_GRAY_WOOL_SLAB, Items.LIGHT_GRAY_WOOL);
        createStairsRecipe(AotABlocks.LIGHT_GRAY_WOOL_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_WOOL))
                .criterion(hasItem(Items.LIGHT_GRAY_WOOL), conditionsFromItem(Items.LIGHT_GRAY_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "light_gray_wool_stairs_from_light_gray_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.GRAY_WOOL_SLAB, Items.GRAY_WOOL);
        createStairsRecipe(AotABlocks.GRAY_WOOL_STAIRS, Ingredient.ofItems(Items.GRAY_WOOL))
                .criterion(hasItem(Items.GRAY_WOOL), conditionsFromItem(Items.GRAY_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "gray_wool_stairs_from_gray_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.BLACK_WOOL_SLAB, Items.BLACK_WOOL);
        createStairsRecipe(AotABlocks.BLACK_WOOL_STAIRS, Ingredient.ofItems(Items.BLACK_WOOL))
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "black_wool_stairs_from_black_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.BROWN_WOOL_SLAB, Items.BROWN_WOOL);
        createStairsRecipe(AotABlocks.BROWN_WOOL_STAIRS, Ingredient.ofItems(Items.BROWN_WOOL))
                .criterion(hasItem(Items.BROWN_WOOL), conditionsFromItem(Items.BROWN_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "brown_wool_stairs_from_brown_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.RED_WOOL_SLAB, Items.RED_WOOL);
        createStairsRecipe(AotABlocks.RED_WOOL_STAIRS, Ingredient.ofItems(Items.RED_WOOL))
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "red_wool_stairs_from_red_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.ORANGE_WOOL_SLAB, Items.ORANGE_WOOL);
        createStairsRecipe(AotABlocks.ORANGE_WOOL_STAIRS, Ingredient.ofItems(Items.ORANGE_WOOL))
                .criterion(hasItem(Items.ORANGE_WOOL), conditionsFromItem(Items.ORANGE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "orange_wool_stairs_from_orange_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.YELLOW_WOOL_SLAB, Items.YELLOW_WOOL);
        createStairsRecipe(AotABlocks.YELLOW_WOOL_STAIRS, Ingredient.ofItems(Items.YELLOW_WOOL))
                .criterion(hasItem(Items.YELLOW_WOOL), conditionsFromItem(Items.YELLOW_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "yellow_wool_stairs_from_yellow_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.LIME_WOOL_SLAB, Items.LIME_WOOL);
        createStairsRecipe(AotABlocks.LIME_WOOL_STAIRS, Ingredient.ofItems(Items.LIME_WOOL))
                .criterion(hasItem(Items.LIME_WOOL), conditionsFromItem(Items.LIME_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "lime_wool_stairs_from_lime_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.GREEN_WOOL_SLAB, Items.GREEN_WOOL);
        createStairsRecipe(AotABlocks.GREEN_WOOL_STAIRS, Ingredient.ofItems(Items.GREEN_WOOL))
                .criterion(hasItem(Items.GREEN_WOOL), conditionsFromItem(Items.GREEN_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "green_wool_stairs_from_green_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.CYAN_WOOL_SLAB, Items.CYAN_WOOL);
        createStairsRecipe(AotABlocks.CYAN_WOOL_STAIRS, Ingredient.ofItems(Items.CYAN_WOOL))
                .criterion(hasItem(Items.CYAN_WOOL), conditionsFromItem(Items.CYAN_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "cyan_wool_stairs_from_cyan_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.LIGHT_BLUE_WOOL_SLAB, Items.LIGHT_BLUE_WOOL);
        createStairsRecipe(AotABlocks.LIGHT_BLUE_WOOL_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Items.LIGHT_BLUE_WOOL), conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "light_blue_wool_stairs_from_light_blue"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.BLUE_WOOL_SLAB, Items.BLUE_WOOL);
        createStairsRecipe(AotABlocks.BLUE_WOOL_STAIRS, Ingredient.ofItems(Items.BLUE_WOOL))
                .criterion(hasItem(Items.BLUE_WOOL), conditionsFromItem(Items.BLUE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "blue_wool_stairs_from_blue_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.PURPLE_WOOL_SLAB, Items.PURPLE_WOOL);
        createStairsRecipe(AotABlocks.PURPLE_WOOL_STAIRS, Ingredient.ofItems(Items.PURPLE_WOOL))
                .criterion(hasItem(Items.PURPLE_WOOL), conditionsFromItem(Items.PURPLE_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "purple_wool_stairs_from_purple_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.MAGENTA_WOOL_SLAB, Items.MAGENTA_WOOL);
        createStairsRecipe(AotABlocks.MAGENTA_WOOL_STAIRS, Ingredient.ofItems(Items.MAGENTA_WOOL))
                .criterion(hasItem(Items.MAGENTA_WOOL), conditionsFromItem(Items.MAGENTA_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "magenta_wool_stairs_from_magenta_wool"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AotABlocks.PINK_WOOL_SLAB, Items.PINK_WOOL);
        createStairsRecipe(AotABlocks.PINK_WOOL_STAIRS, Ingredient.ofItems(Items.PINK_WOOL))
                .criterion(hasItem(Items.PINK_WOOL), conditionsFromItem(Items.PINK_WOOL))
                .offerTo(exporter, Identifier.of(AllOfTheAbove.MOD_ID, "pink_wool_stairs_from_pink_wool"));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRASS_BLOCK)
                .pattern("   ")
                .pattern(" G ")
                .pattern(" E ")
                .input('G', Blocks.TALL_GRASS)
                .input('E', Blocks.DIRT)
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "tall_grass_grass_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRASS_BLOCK)
                .pattern("   ")
                .pattern(" G ")
                .pattern(" E ")
                .input('G', Blocks.FERN)
                .input('E', Blocks.DIRT)
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "fern_grass_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRASS_BLOCK)
                .pattern("   ")
                .pattern(" G ")
                .pattern(" E ")
                .input('G', Blocks.LARGE_FERN)
                .input('E', Blocks.DIRT)
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "large_fern_grass_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRASS_BLOCK)
                .pattern("   ")
                .pattern(" G ")
                .pattern(" E ")
                .input('G', Blocks.MOSS_CARPET)
                .input('E', Blocks.DIRT)
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "moss_carpet_grass_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRASS_BLOCK)
                .pattern("   ")
                .pattern(" G ")
                .pattern(" E ")
                .input('G', Blocks.GRASS)
                .input('E', Blocks.DIRT)
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "grass_grass_block"));



        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Items.SADDLE)
                .pattern("LLL")
                .pattern("I I")
                .pattern("   ")
                .input('L', Items.LEATHER)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.COBWEB, 3)
                .pattern("S S")
                .pattern(" S ")
                .pattern("S S")
                .input('S', Items.STRING)
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .offerTo(exporter);



        offerShapelessRecipe(exporter, Items.STRING, Items.WHITE_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.LIGHT_GRAY_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.GRAY_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.BLACK_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.BROWN_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.RED_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.ORANGE_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.YELLOW_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.LIME_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.GREEN_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.CYAN_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.LIGHT_BLUE_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.BLUE_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.PURPLE_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.MAGENTA_WOOL, "misc", 4);
        offerShapelessRecipe(exporter, Items.STRING, Items.PINK_WOOL, "misc", 4);



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STONE_PICKAXE)
                .pattern("BBB")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('B', Items.BASALT)
                .criterion(hasItem(Items.BASALT), conditionsFromItem(Items.BASALT))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "basalt_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STONE_PICKAXE)
                .pattern("GGG")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('G', Items.GRANITE)
                .criterion(hasItem(Items.GRANITE), conditionsFromItem(Items.GRANITE))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "granite_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STONE_PICKAXE)
                .pattern("DDD")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', Items.DIORITE)
                .criterion(hasItem(Items.DIORITE), conditionsFromItem(Items.DIORITE))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "diorite_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STONE_PICKAXE)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('A', Items.ANDESITE)
                .criterion(hasItem(Items.ANDESITE), conditionsFromItem(Items.ANDESITE))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "andesite_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STONE_PICKAXE)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', Items.TUFF)
                .criterion(hasItem(Items.TUFF), conditionsFromItem(Items.TUFF))
                .offerTo(exporter, new Identifier(AllOfTheAbove.MOD_ID, "tuff_pickaxe"));
    }
}
