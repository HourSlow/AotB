package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hour.aotb.block.AotABlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class AotABlockTagsProvider extends FabricTagProvider.BlockTagProvider {

    public AotABlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(AotABlocks.CRACKED_BRICKS)

                .add(AotABlocks.DEEPSLATE_WALL)
                .add(AotABlocks.DEEPSLATE_SLAB)
                .add(AotABlocks.DEEPSLATE_STAIRS)

                .add(AotABlocks.STONE_WALL)
                .add(AotABlocks.POLISHED_GRANITE_WALL)
                .add(AotABlocks.POLISHED_ANDESITE_WALL)
                .add(AotABlocks.POLISHED_DIORITE_WALL)

                .add(AotABlocks.SMOOTH_STONE_STAIRS)
                .add(AotABlocks.SMOOTH_STONE_WALL)

                .add(AotABlocks.PRISMARINE_BRICK_WALL)
                .add(AotABlocks.DARK_PRISMARINE_WALL)

                .add(AotABlocks.SMOOTH_SANDSTONE_WALL)
                .add(AotABlocks.SMOOTH_RED_SANDSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(AotABlocks.DEEPSLATE_WALL)
                .add(AotABlocks.STONE_WALL)
                .add(AotABlocks.POLISHED_GRANITE_WALL)
                .add(AotABlocks.POLISHED_ANDESITE_WALL)
                .add(AotABlocks.POLISHED_DIORITE_WALL)
                .add(AotABlocks.DARK_PRISMARINE_WALL)
                .add(AotABlocks.PRISMARINE_BRICK_WALL)
                .add(AotABlocks.SMOOTH_STONE_WALL)
                .add(AotABlocks.SMOOTH_SANDSTONE_WALL)
                .add(AotABlocks.SMOOTH_RED_SANDSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(AotABlocks.MOSSY_STAIRS)
                .add(AotABlocks.MOSSY_SLAB);

        getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
                .add(AotABlocks.WHITE_WOOL_SLAB)
                .add(AotABlocks.WHITE_WOOL_STAIRS)

                .add(AotABlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(AotABlocks.LIGHT_GRAY_WOOL_STAIRS)

                .add(AotABlocks.GRAY_WOOL_SLAB)
                .add(AotABlocks.GRAY_WOOL_STAIRS)

                .add(AotABlocks.BLACK_WOOL_STAIRS)
                .add(AotABlocks.BLACK_WOOL_SLAB)

                .add(AotABlocks.BROWN_WOOL_SLAB)
                .add(AotABlocks.BROWN_WOOL_STAIRS)

                .add(AotABlocks.RED_WOOL_SLAB)
                .add(AotABlocks.RED_WOOL_STAIRS)

                .add(AotABlocks.ORANGE_WOOL_SLAB)
                .add(AotABlocks.ORANGE_WOOL_STAIRS)

                .add(AotABlocks.YELLOW_WOOL_SLAB)
                .add(AotABlocks.YELLOW_WOOL_STAIRS)

                .add(AotABlocks.LIME_WOOL_SLAB)
                .add(AotABlocks.LIME_WOOL_STAIRS)

                .add(AotABlocks.GREEN_WOOL_SLAB)
                .add(AotABlocks.GREEN_WOOL_STAIRS)

                .add(AotABlocks.CYAN_WOOL_SLAB)
                .add(AotABlocks.CYAN_WOOL_STAIRS)

                .add(AotABlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(AotABlocks.LIGHT_BLUE_WOOL_SLAB)

                .add(AotABlocks.BLUE_WOOL_SLAB)
                .add(AotABlocks.BLUE_WOOL_STAIRS)

                .add(AotABlocks.PURPLE_WOOL_SLAB)
                .add(AotABlocks.PURPLE_WOOL_STAIRS)

                .add(AotABlocks.MAGENTA_WOOL_SLAB)
                .add(AotABlocks.MAGENTA_WOOL_STAIRS)

                .add(AotABlocks.PINK_WOOL_SLAB)
                .add(AotABlocks.PINK_WOOL_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(AotABlocks.WHITE_WOOL_SLAB)
                .add(AotABlocks.WHITE_WOOL_STAIRS)

                .add(AotABlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(AotABlocks.LIGHT_GRAY_WOOL_STAIRS)

                .add(AotABlocks.GRAY_WOOL_SLAB)
                .add(AotABlocks.GRAY_WOOL_STAIRS)

                .add(AotABlocks.BLACK_WOOL_STAIRS)
                .add(AotABlocks.BLACK_WOOL_SLAB)

                .add(AotABlocks.BROWN_WOOL_SLAB)
                .add(AotABlocks.BROWN_WOOL_STAIRS)

                .add(AotABlocks.RED_WOOL_SLAB)
                .add(AotABlocks.RED_WOOL_STAIRS)

                .add(AotABlocks.ORANGE_WOOL_SLAB)
                .add(AotABlocks.ORANGE_WOOL_STAIRS)

                .add(AotABlocks.YELLOW_WOOL_SLAB)
                .add(AotABlocks.YELLOW_WOOL_STAIRS)

                .add(AotABlocks.LIME_WOOL_SLAB)
                .add(AotABlocks.LIME_WOOL_STAIRS)

                .add(AotABlocks.GREEN_WOOL_SLAB)
                .add(AotABlocks.GREEN_WOOL_STAIRS)

                .add(AotABlocks.CYAN_WOOL_SLAB)
                .add(AotABlocks.CYAN_WOOL_STAIRS)

                .add(AotABlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(AotABlocks.LIGHT_BLUE_WOOL_SLAB)

                .add(AotABlocks.BLUE_WOOL_SLAB)
                .add(AotABlocks.BLUE_WOOL_STAIRS)

                .add(AotABlocks.PURPLE_WOOL_SLAB)
                .add(AotABlocks.PURPLE_WOOL_STAIRS)

                .add(AotABlocks.MAGENTA_WOOL_SLAB)
                .add(AotABlocks.MAGENTA_WOOL_STAIRS)

                .add(AotABlocks.PINK_WOOL_SLAB)
                .add(AotABlocks.PINK_WOOL_STAIRS);
    }
}
