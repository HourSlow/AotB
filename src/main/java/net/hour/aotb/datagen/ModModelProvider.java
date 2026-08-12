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
        BlockStateModelGenerator.BlockTexturePool mossBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MOSS_BLOCK);

        BlockStateModelGenerator.BlockTexturePool white_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        BlockStateModelGenerator.BlockTexturePool light_gray_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool gray_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool black_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
        BlockStateModelGenerator.BlockTexturePool brown_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
        BlockStateModelGenerator.BlockTexturePool red_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        BlockStateModelGenerator.BlockTexturePool orange_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
        BlockStateModelGenerator.BlockTexturePool yellow_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
        BlockStateModelGenerator.BlockTexturePool lime_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
        BlockStateModelGenerator.BlockTexturePool green_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
        BlockStateModelGenerator.BlockTexturePool cyan_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
        BlockStateModelGenerator.BlockTexturePool light_blue_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool blue_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool purple_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
        BlockStateModelGenerator.BlockTexturePool magenta_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
        BlockStateModelGenerator.BlockTexturePool pink_woolBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_BRICKS);

        deepslatePool.slab(ModBlocks.DEEPSLATE_SLAB);
        deepslatePool.wall(ModBlocks.DEEPSLATE_WALL);
        deepslatePool.stairs(ModBlocks.DEEPSLATE_STAIRS);

        smoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        smoothStonePool.wall(ModBlocks.SMOOTH_STONE_WALL);

        stonePool.wall(ModBlocks.STONE_WALL);

        mossBlockPool.slab(ModBlocks.MOSSY_SLAB);
        mossBlockPool.stairs(ModBlocks.MOSSY_STAIRS);

        darkPrismarinePool.wall(ModBlocks.DARK_PRISMARINE_WALL);
        prismarineBricksPool.wall(ModBlocks.PRISMARINE_BRICK_WALL);

        smoothSandstonePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        smoothRedSandstonePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);



        white_woolBlockPool.slab(ModBlocks.WHITE_WOOL_SLAB);
        white_woolBlockPool.stairs(ModBlocks.WHITE_WOOL_STAIRS);

        light_gray_woolBlockPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
        light_gray_woolBlockPool.stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);

        gray_woolBlockPool.slab(ModBlocks.GRAY_WOOL_SLAB);
        gray_woolBlockPool.stairs(ModBlocks.GRAY_WOOL_STAIRS);

        black_woolBlockPool.slab(ModBlocks.BLACK_WOOL_SLAB);
        black_woolBlockPool.stairs(ModBlocks.BLACK_WOOL_STAIRS);

        brown_woolBlockPool.slab(ModBlocks.BROWN_WOOL_SLAB);
        brown_woolBlockPool.stairs(ModBlocks.BROWN_WOOL_STAIRS);

        red_woolBlockPool.slab(ModBlocks.RED_WOOL_SLAB);
        red_woolBlockPool.stairs(ModBlocks.RED_WOOL_STAIRS);

        orange_woolBlockPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
        orange_woolBlockPool.stairs(ModBlocks.ORANGE_WOOL_STAIRS);

        yellow_woolBlockPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
        yellow_woolBlockPool.stairs(ModBlocks.YELLOW_WOOL_STAIRS);

        lime_woolBlockPool.slab(ModBlocks.LIME_WOOL_SLAB);
        lime_woolBlockPool.stairs(ModBlocks.LIME_WOOL_STAIRS);

        green_woolBlockPool.slab(ModBlocks.GREEN_WOOL_SLAB);
        green_woolBlockPool.stairs(ModBlocks.GREEN_WOOL_STAIRS);

        cyan_woolBlockPool.slab(ModBlocks.CYAN_WOOL_SLAB);
        cyan_woolBlockPool.stairs(ModBlocks.CYAN_WOOL_STAIRS);

        light_blue_woolBlockPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
        light_blue_woolBlockPool.stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);

        blue_woolBlockPool.slab(ModBlocks.BLUE_WOOL_SLAB);
        blue_woolBlockPool.stairs(ModBlocks.BLUE_WOOL_STAIRS);

        purple_woolBlockPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
        purple_woolBlockPool.stairs(ModBlocks.PURPLE_WOOL_STAIRS);

        magenta_woolBlockPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
        magenta_woolBlockPool.stairs(ModBlocks.MAGENTA_WOOL_STAIRS);

        pink_woolBlockPool.slab(ModBlocks.PINK_WOOL_SLAB);
        pink_woolBlockPool.stairs(ModBlocks.PINK_WOOL_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
