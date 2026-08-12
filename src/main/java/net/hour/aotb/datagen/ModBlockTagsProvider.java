package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hour.aotb.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CRACKED_BRICKS)

                .add(ModBlocks.DEEPSLATE_WALL)
                .add(ModBlocks.DEEPSLATE_SLAB)
                .add(ModBlocks.DEEPSLATE_STAIRS)

                .add(ModBlocks.STONE_WALL)

                .add(ModBlocks.SMOOTH_STONE_STAIRS)
                .add(ModBlocks.SMOOTH_STONE_WALL)

                .add(ModBlocks.PRISMARINE_BRICK_WALL)
                .add(ModBlocks.DARK_PRISMARINE_WALL)

                .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DEEPSLATE_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.DARK_PRISMARINE_WALL)
                .add(ModBlocks.PRISMARINE_BRICK_WALL)
                .add(ModBlocks.SMOOTH_STONE_WALL)
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.MOSSY_STAIRS)
                .add(ModBlocks.MOSSY_SLAB);

        getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
        .add(ModBlocks.WHITE_WOOL_SLAB)
        .add(ModBlocks.WHITE_WOOL_STAIRS)

        .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
        .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)

        .add(ModBlocks.GRAY_WOOL_SLAB)
        .add(ModBlocks.GRAY_WOOL_STAIRS)

        .add(ModBlocks.BLACK_WOOL_STAIRS)
        .add(ModBlocks.BLACK_WOOL_SLAB)

        .add(ModBlocks.BROWN_WOOL_SLAB)
        .add(ModBlocks.BROWN_WOOL_STAIRS)

        .add(ModBlocks.RED_WOOL_SLAB)
        .add(ModBlocks.RED_WOOL_STAIRS)

        .add(ModBlocks.ORANGE_WOOL_SLAB)
        .add(ModBlocks.ORANGE_WOOL_STAIRS)

        .add(ModBlocks.YELLOW_WOOL_SLAB)
        .add(ModBlocks.YELLOW_WOOL_STAIRS)

        .add(ModBlocks.LIME_WOOL_SLAB)
        .add(ModBlocks.LIME_WOOL_STAIRS)

        .add(ModBlocks.GREEN_WOOL_SLAB)
        .add(ModBlocks.GREEN_WOOL_STAIRS)

        .add(ModBlocks.CYAN_WOOL_SLAB)
        .add(ModBlocks.CYAN_WOOL_STAIRS)

        .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
        .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)

        .add(ModBlocks.BLUE_WOOL_SLAB)
        .add(ModBlocks.BLUE_WOOL_STAIRS)

        .add(ModBlocks.PURPLE_WOOL_SLAB)
        .add(ModBlocks.PURPLE_WOOL_STAIRS)

        .add(ModBlocks.MAGENTA_WOOL_SLAB)
        .add(ModBlocks.MAGENTA_WOOL_STAIRS)

        .add(ModBlocks.PINK_WOOL_SLAB)
        .add(ModBlocks.PINK_WOOL_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.WHITE_WOOL_SLAB)
                .add(ModBlocks.WHITE_WOOL_STAIRS)

                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)

                .add(ModBlocks.GRAY_WOOL_SLAB)
                .add(ModBlocks.GRAY_WOOL_STAIRS)

                .add(ModBlocks.BLACK_WOOL_STAIRS)
                .add(ModBlocks.BLACK_WOOL_SLAB)

                .add(ModBlocks.BROWN_WOOL_SLAB)
                .add(ModBlocks.BROWN_WOOL_STAIRS)

                .add(ModBlocks.RED_WOOL_SLAB)
                .add(ModBlocks.RED_WOOL_STAIRS)

                .add(ModBlocks.ORANGE_WOOL_SLAB)
                .add(ModBlocks.ORANGE_WOOL_STAIRS)

                .add(ModBlocks.YELLOW_WOOL_SLAB)
                .add(ModBlocks.YELLOW_WOOL_STAIRS)

                .add(ModBlocks.LIME_WOOL_SLAB)
                .add(ModBlocks.LIME_WOOL_STAIRS)

                .add(ModBlocks.GREEN_WOOL_SLAB)
                .add(ModBlocks.GREEN_WOOL_STAIRS)

                .add(ModBlocks.CYAN_WOOL_SLAB)
                .add(ModBlocks.CYAN_WOOL_STAIRS)

                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)

                .add(ModBlocks.BLUE_WOOL_SLAB)
                .add(ModBlocks.BLUE_WOOL_STAIRS)

                .add(ModBlocks.PURPLE_WOOL_SLAB)
                .add(ModBlocks.PURPLE_WOOL_STAIRS)

                .add(ModBlocks.MAGENTA_WOOL_SLAB)
                .add(ModBlocks.MAGENTA_WOOL_STAIRS)

                .add(ModBlocks.PINK_WOOL_SLAB)
                .add(ModBlocks.PINK_WOOL_STAIRS);
    }
}
