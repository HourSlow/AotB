package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hour.aotb.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool deepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool smoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool prismarineBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool smoothRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_RED_SANDSTONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_BRICKS);

        deepslatePool.slab(ModBlocks.DEEPSLATE_SLAB);
        deepslatePool.wall(ModBlocks.DEEPSLATE_WALL);
        deepslatePool.stairs(ModBlocks.DEEPSLATE_STAIRS);

        smoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        smoothStonePool.wall(ModBlocks.SMOOTH_STONE_WALL);

        stonePool.wall(ModBlocks.STONE_WALL);

        darkPrismarinePool.wall(ModBlocks.DARK_PRISMARINE_WALL);
        prismarineBricksPool.wall(ModBlocks.PRISMARINE_BRICK_WALL);

        smoothSandstonePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        smoothRedSandstonePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
