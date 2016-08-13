package com.ninjawarrior1337.abos.proxy;

import com.jadarstudios.developercapes.DevCapes;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent e)
    {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e)
    {
        super.init(e);
        DevCapes.getInstance().registerConfig("https://gist.githubusercontent.com/ninjawarrior1337/2ff29af4dc92683107fd9caeabf27f30/raw/e3296401cda83a88c30572865e68c911244b4036/capes.json", "dab_capes");
    }

    @Override
    public void postInit(FMLPostInitializationEvent e)
    {
        super.postInit(e);
    }
}
