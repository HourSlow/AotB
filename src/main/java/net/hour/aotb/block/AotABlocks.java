package net.hour.aotb.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hour.aotb.AllOfTheAbove;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class AotABlocks {


    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));



    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DIORITE)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRANITE)));



    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));



    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(Blocks.DEEPSLATE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));



    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));

    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));

    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));

    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            new StairsBlock(Blocks.RED_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));

    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));

    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));

    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            new StairsBlock(Blocks.LIME_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));

    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));

    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));

    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));

    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));

    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));

    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));

    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            new StairsBlock(Blocks.PINK_WOOL.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));



    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));

    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));



    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));

    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));



    public static final Block MOSSY_STAIRS = registerBlock("mossy_stairs",
            new StairsBlock(Blocks.MOSS_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
    public static final Block MOSSY_SLAB = registerBlock("mossy_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AllOfTheAbove.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AllOfTheAbove.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(CRACKED_BRICKS);

            entries.add(STONE_WALL);
            entries.add(POLISHED_ANDESITE_WALL);
            entries.add(POLISHED_DIORITE_WALL);
            entries.add(POLISHED_GRANITE_WALL);

            entries.add(SMOOTH_STONE_WALL);
            entries.add(SMOOTH_STONE_STAIRS);

            entries.add(DEEPSLATE_SLAB);
            entries.add(DEEPSLATE_STAIRS);
            entries.add(DEEPSLATE_WALL);

            entries.add(DARK_PRISMARINE_WALL);
            entries.add(PRISMARINE_BRICK_WALL);

            entries.add(SMOOTH_SANDSTONE_WALL);
            entries.add(SMOOTH_RED_SANDSTONE_WALL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(WHITE_WOOL_SLAB);
            entries.add(WHITE_WOOL_STAIRS);

            entries.add(LIGHT_GRAY_WOOL_SLAB);
            entries.add(LIGHT_GRAY_WOOL_STAIRS);

            entries.add(GRAY_WOOL_SLAB);
            entries.add(GRAY_WOOL_STAIRS);

            entries.add(BLACK_WOOL_SLAB);
            entries.add(BLACK_WOOL_STAIRS);

            entries.add(BROWN_WOOL_SLAB);
            entries.add(BROWN_WOOL_STAIRS);

            entries.add(RED_WOOL_SLAB);
            entries.add(RED_WOOL_STAIRS);

            entries.add(ORANGE_WOOL_SLAB);
            entries.add(ORANGE_WOOL_STAIRS);

            entries.add(YELLOW_WOOL_SLAB);
            entries.add(YELLOW_WOOL_STAIRS);

            entries.add(LIME_WOOL_SLAB);
            entries.add(LIME_WOOL_STAIRS);

            entries.add(GREEN_WOOL_SLAB);
            entries.add(GREEN_WOOL_STAIRS);

            entries.add(CYAN_WOOL_SLAB);
            entries.add(CYAN_WOOL_STAIRS);

            entries.add(LIGHT_BLUE_WOOL_STAIRS);
            entries.add(LIGHT_BLUE_WOOL_SLAB);

            entries.add(BLUE_WOOL_SLAB);
            entries.add(BLUE_WOOL_STAIRS);

            entries.add(PURPLE_WOOL_SLAB);
            entries.add(PURPLE_WOOL_STAIRS);

            entries.add(MAGENTA_WOOL_SLAB);
            entries.add(MAGENTA_WOOL_STAIRS);

            entries.add(PINK_WOOL_SLAB);
            entries.add(PINK_WOOL_STAIRS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(MOSSY_SLAB);
            entries.add(MOSSY_STAIRS);
        });
    }
}
