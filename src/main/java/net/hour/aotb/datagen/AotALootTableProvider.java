package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hour.aotb.block.AotABlocks;

public class AotALootTableProvider extends FabricBlockLootTableProvider {

    public AotALootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(AotABlocks.CRACKED_BRICKS);

        addDrop(AotABlocks.DEEPSLATE_SLAB, slabDrops(AotABlocks.DEEPSLATE_SLAB));
        addDrop(AotABlocks.DEEPSLATE_WALL);
        addDrop(AotABlocks.DEEPSLATE_STAIRS);

        addDrop(AotABlocks.SMOOTH_STONE_STAIRS);
        addDrop(AotABlocks.SMOOTH_STONE_WALL);

        addDrop(AotABlocks.MOSSY_SLAB, slabDrops(AotABlocks.MOSSY_SLAB));
        addDrop(AotABlocks.MOSSY_STAIRS);

        addDrop(AotABlocks.STONE_WALL);
        addDrop(AotABlocks.POLISHED_GRANITE_WALL);
        addDrop(AotABlocks.POLISHED_ANDESITE_WALL);
        addDrop(AotABlocks.POLISHED_DIORITE_WALL);

        addDrop(AotABlocks.DARK_PRISMARINE_WALL);
        addDrop(AotABlocks.PRISMARINE_BRICK_WALL);

        addDrop(AotABlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(AotABlocks.SMOOTH_RED_SANDSTONE_WALL);



        addDrop(AotABlocks.WHITE_WOOL_SLAB);
        addDrop(AotABlocks.WHITE_WOOL_STAIRS);

        addDrop(AotABlocks.LIGHT_GRAY_WOOL_SLAB);
        addDrop(AotABlocks.LIGHT_GRAY_WOOL_STAIRS);

        addDrop(AotABlocks.GRAY_WOOL_SLAB);
        addDrop(AotABlocks.GRAY_WOOL_STAIRS);

        addDrop(AotABlocks.BLACK_WOOL_STAIRS);
        addDrop(AotABlocks.BLACK_WOOL_SLAB);

        addDrop(AotABlocks.BROWN_WOOL_SLAB);
        addDrop(AotABlocks.BROWN_WOOL_STAIRS);

        addDrop(AotABlocks.RED_WOOL_SLAB);
        addDrop(AotABlocks.RED_WOOL_STAIRS);

        addDrop(AotABlocks.ORANGE_WOOL_SLAB);
        addDrop(AotABlocks.ORANGE_WOOL_STAIRS);

        addDrop(AotABlocks.YELLOW_WOOL_SLAB);
        addDrop(AotABlocks.YELLOW_WOOL_STAIRS);

        addDrop(AotABlocks.LIME_WOOL_SLAB);
        addDrop(AotABlocks.LIME_WOOL_STAIRS);

        addDrop(AotABlocks.GREEN_WOOL_SLAB);
        addDrop(AotABlocks.GREEN_WOOL_STAIRS);

        addDrop(AotABlocks.CYAN_WOOL_SLAB);
        addDrop(AotABlocks.CYAN_WOOL_STAIRS);

        addDrop(AotABlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(AotABlocks.LIGHT_BLUE_WOOL_SLAB);

        addDrop(AotABlocks.BLUE_WOOL_SLAB);
        addDrop(AotABlocks.BLUE_WOOL_STAIRS);

        addDrop(AotABlocks.PURPLE_WOOL_SLAB);
        addDrop(AotABlocks.PURPLE_WOOL_STAIRS);

        addDrop(AotABlocks.MAGENTA_WOOL_SLAB);
        addDrop(AotABlocks.MAGENTA_WOOL_STAIRS);

        addDrop(AotABlocks.PINK_WOOL_SLAB);
        addDrop(AotABlocks.PINK_WOOL_STAIRS);
    }
}
