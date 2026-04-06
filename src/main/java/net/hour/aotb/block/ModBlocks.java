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


public class ModBlocks {


    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));


    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));


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


    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));

    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));


    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));

    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AllOfTheAbove.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AllOfTheAbove.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AllOfTheAbove.LOGGER.info("Registering: AotB Blocks");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(CRACKED_BRICKS);

            entries.add(STONE_WALL);

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
    }
}
