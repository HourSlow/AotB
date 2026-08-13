package net.hour.aotb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hour.aotb.block.AotABlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class AotAModelProvider extends FabricModelProvider {

    public AotAModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool deepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool smoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool granitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool andesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool dioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
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

        blockStateModelGenerator.registerSimpleCubeAll(AotABlocks.CRACKED_BRICKS);

        deepslatePool.slab(AotABlocks.DEEPSLATE_SLAB);
        deepslatePool.wall(AotABlocks.DEEPSLATE_WALL);
        deepslatePool.stairs(AotABlocks.DEEPSLATE_STAIRS);

        smoothStonePool.stairs(AotABlocks.SMOOTH_STONE_STAIRS);
        smoothStonePool.wall(AotABlocks.SMOOTH_STONE_WALL);

        stonePool.wall(AotABlocks.STONE_WALL);
        andesitePool.wall(AotABlocks.POLISHED_ANDESITE_WALL);
        granitePool.wall(AotABlocks.POLISHED_GRANITE_WALL);
        dioritePool.wall(AotABlocks.POLISHED_DIORITE_WALL);

        mossBlockPool.slab(AotABlocks.MOSSY_SLAB);
        mossBlockPool.stairs(AotABlocks.MOSSY_STAIRS);

        darkPrismarinePool.wall(AotABlocks.DARK_PRISMARINE_WALL);
        prismarineBricksPool.wall(AotABlocks.PRISMARINE_BRICK_WALL);

        smoothSandstonePool.wall(AotABlocks.SMOOTH_SANDSTONE_WALL);
        smoothRedSandstonePool.wall(AotABlocks.SMOOTH_RED_SANDSTONE_WALL);



        white_woolBlockPool.slab(AotABlocks.WHITE_WOOL_SLAB);
        white_woolBlockPool.stairs(AotABlocks.WHITE_WOOL_STAIRS);

        light_gray_woolBlockPool.slab(AotABlocks.LIGHT_GRAY_WOOL_SLAB);
        light_gray_woolBlockPool.stairs(AotABlocks.LIGHT_GRAY_WOOL_STAIRS);

        gray_woolBlockPool.slab(AotABlocks.GRAY_WOOL_SLAB);
        gray_woolBlockPool.stairs(AotABlocks.GRAY_WOOL_STAIRS);

        black_woolBlockPool.slab(AotABlocks.BLACK_WOOL_SLAB);
        black_woolBlockPool.stairs(AotABlocks.BLACK_WOOL_STAIRS);

        brown_woolBlockPool.slab(AotABlocks.BROWN_WOOL_SLAB);
        brown_woolBlockPool.stairs(AotABlocks.BROWN_WOOL_STAIRS);

        red_woolBlockPool.slab(AotABlocks.RED_WOOL_SLAB);
        red_woolBlockPool.stairs(AotABlocks.RED_WOOL_STAIRS);

        orange_woolBlockPool.slab(AotABlocks.ORANGE_WOOL_SLAB);
        orange_woolBlockPool.stairs(AotABlocks.ORANGE_WOOL_STAIRS);

        yellow_woolBlockPool.slab(AotABlocks.YELLOW_WOOL_SLAB);
        yellow_woolBlockPool.stairs(AotABlocks.YELLOW_WOOL_STAIRS);

        lime_woolBlockPool.slab(AotABlocks.LIME_WOOL_SLAB);
        lime_woolBlockPool.stairs(AotABlocks.LIME_WOOL_STAIRS);

        green_woolBlockPool.slab(AotABlocks.GREEN_WOOL_SLAB);
        green_woolBlockPool.stairs(AotABlocks.GREEN_WOOL_STAIRS);

        cyan_woolBlockPool.slab(AotABlocks.CYAN_WOOL_SLAB);
        cyan_woolBlockPool.stairs(AotABlocks.CYAN_WOOL_STAIRS);

        light_blue_woolBlockPool.slab(AotABlocks.LIGHT_BLUE_WOOL_SLAB);
        light_blue_woolBlockPool.stairs(AotABlocks.LIGHT_BLUE_WOOL_STAIRS);

        blue_woolBlockPool.slab(AotABlocks.BLUE_WOOL_SLAB);
        blue_woolBlockPool.stairs(AotABlocks.BLUE_WOOL_STAIRS);

        purple_woolBlockPool.slab(AotABlocks.PURPLE_WOOL_SLAB);
        purple_woolBlockPool.stairs(AotABlocks.PURPLE_WOOL_STAIRS);

        magenta_woolBlockPool.slab(AotABlocks.MAGENTA_WOOL_SLAB);
        magenta_woolBlockPool.stairs(AotABlocks.MAGENTA_WOOL_STAIRS);

        pink_woolBlockPool.slab(AotABlocks.PINK_WOOL_SLAB);
        pink_woolBlockPool.stairs(AotABlocks.PINK_WOOL_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
