package com.ninjawarrior1337.abos.block.CreativeLaser;

import buildcraft.silicon.BlockLaser;
import com.ninjawarrior1337.abos.abos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by ninjawarrior1337 on 8/28/16.
 */
public class CreativeLazer extends BlockLaser
{
    public CreativeLazer()
    {
        setCreativeTab(abos.mo_rod);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileCreativeLaser();
    }
}
