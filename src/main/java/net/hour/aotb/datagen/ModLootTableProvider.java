package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hour.aotb.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CRACKED_BRICKS);

        addDrop(ModBlocks.DEEPSLATE_SLAB, slabDrops(ModBlocks.DEEPSLATE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_WALL);
        addDrop(ModBlocks.DEEPSLATE_STAIRS);

        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_WALL);

        addDrop(ModBlocks.MOSSY_SLAB, slabDrops(ModBlocks.MOSSY_SLAB));
        addDrop(ModBlocks.MOSSY_STAIRS);

        addDrop(ModBlocks.STONE_WALL);

        addDrop(ModBlocks.DARK_PRISMARINE_WALL);
        addDrop(ModBlocks.PRISMARINE_BRICK_WALL);

        addDrop(ModBlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);



        addDrop(ModBlocks.WHITE_WOOL_SLAB);
        addDrop(ModBlocks.WHITE_WOOL_STAIRS);

        addDrop(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);

        addDrop(ModBlocks.GRAY_WOOL_SLAB);
        addDrop(ModBlocks.GRAY_WOOL_STAIRS);

        addDrop(ModBlocks.BLACK_WOOL_STAIRS);
        addDrop(ModBlocks.BLACK_WOOL_SLAB);

        addDrop(ModBlocks.BROWN_WOOL_SLAB);
        addDrop(ModBlocks.BROWN_WOOL_STAIRS);

        addDrop(ModBlocks.RED_WOOL_SLAB);
        addDrop(ModBlocks.RED_WOOL_STAIRS);

        addDrop(ModBlocks.ORANGE_WOOL_SLAB);
        addDrop(ModBlocks.ORANGE_WOOL_STAIRS);

        addDrop(ModBlocks.YELLOW_WOOL_SLAB);
        addDrop(ModBlocks.YELLOW_WOOL_STAIRS);

        addDrop(ModBlocks.LIME_WOOL_SLAB);
        addDrop(ModBlocks.LIME_WOOL_STAIRS);

        addDrop(ModBlocks.GREEN_WOOL_SLAB);
        addDrop(ModBlocks.GREEN_WOOL_STAIRS);

        addDrop(ModBlocks.CYAN_WOOL_SLAB);
        addDrop(ModBlocks.CYAN_WOOL_STAIRS);

        addDrop(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_SLAB);

        addDrop(ModBlocks.BLUE_WOOL_SLAB);
        addDrop(ModBlocks.BLUE_WOOL_STAIRS);

        addDrop(ModBlocks.PURPLE_WOOL_SLAB);
        addDrop(ModBlocks.PURPLE_WOOL_STAIRS);

        addDrop(ModBlocks.MAGENTA_WOOL_SLAB);
        addDrop(ModBlocks.MAGENTA_WOOL_STAIRS);

        addDrop(ModBlocks.PINK_WOOL_SLAB);
        addDrop(ModBlocks.PINK_WOOL_STAIRS);
    }
}
