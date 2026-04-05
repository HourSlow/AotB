package net.hour.aotb.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hour.aotb.AllOfTheAbove;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {


    public static final Block CRACKED_BRICKS = registerBlock("cracked_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));



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
        });
    }
}
