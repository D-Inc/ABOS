package com.ninjawarrior1337.abos.block;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RedstoneInfusedDirt extends Block
{
            public RedstoneInfusedDirt(Material material)
            {
                super(material);
                setCreativeTab(abos.mo_rod);
                this.setLightLevel(2.0f);
                this.setStepSound(soundTypeGrass);
                setHardness(1.0f);
            }
}