package com.ninjawarrior1337.abos.block.CreativeLaser;

import buildcraft.core.lib.RFBattery;
import buildcraft.silicon.TileLaser;

/**
 * Created by ninjawarrior1337 on 8/28/16.
 */
public class TileCreativeLaser extends TileLaser
{
    public TileCreativeLaser()
    {
        this.setBattery(new RFBattery(10000, 2147483647, 0));
    }

    @Override
    protected int getMaxPowerSent()
    {
        return 2147483647;
    }
}
