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
                .add(ModBlocks.SMOOTH_STONE_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DEEPSLATE_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.SMOOTH_STONE_WALL);
    }
}
