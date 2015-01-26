package com.ninjawarrior1337.abos.block;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class OreChicken extends Block
{
            public OreChicken(Material material)
            {
                super(material);
                setCreativeTab(abos.mo_rod);
                this.setLightLevel(2.0f);
                this.setStepSound(soundTypeStone);
                setHardness(1.0f);
            }
                @Override
                public Item getItemDropped(int metadata, Random random, int fortune)
                {
                    return Items.cooked_chicken;
                }

                public int quantityDropped(Random random)
                {
                    return 1 + random.nextInt(4);
                }
        }