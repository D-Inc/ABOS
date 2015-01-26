package com.ninjawarrior1337.abos;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class ChickenGenoration implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case 1:
                generateNether(world, random, chunkX, chunkZ);
                break;
            case -1:
                generateEnd(world, random, chunkX, chunkZ);
                break;
            case 0:
                generateOverworld(world, random, chunkX, chunkZ);
                break;
        }
    }

    public void generateOverworld(World world, Random random, int x, int z)
    {
        generateOre(abos.oreChicken, world, random, x, z, 4, 8, 5, 0, 100, Blocks.stone);
    }

    public void generateNether(World world, Random random, int x, int z)
    {
        generateOre(abos.oreChicken, world, random, x, z, 4, 8, 5, 0, 200, Blocks.netherrack);
    }
    public void generateEnd(World world, Random random, int x, int z)
    {

    }
    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int maxY, int minY, Block generateIn)
    {
        int veinSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
        int hightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);
        for(int i=0; 1 < chance; i++)
        {
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(hightRange)+ minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random,xRand,yRand,zRand);
        }
    }
}
