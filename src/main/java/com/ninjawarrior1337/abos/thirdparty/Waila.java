package com.ninjawarrior1337.abos.thirdparty;

import com.ninjawarrior1337.abos.block.CreativeLaser.CreativeLaserHandler;
import com.ninjawarrior1337.abos.block.CreativeLaser.CreativeLazer;
import mcp.mobius.waila.api.IWailaRegistrar;

/**
 * Created by ninjawarrior1337 on 8/29/16.
 */
public class Waila
{
    public static void onWailaCall(IWailaRegistrar registrar)
    {
        registrar.registerBodyProvider(new CreativeLaserHandler(), CreativeLazer.class);
    }
}
