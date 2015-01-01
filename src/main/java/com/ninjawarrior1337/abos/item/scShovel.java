package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.item.ItemSpade;

public class scShovel extends ItemSpade
{
    public scShovel(ToolMaterial scMaterial)
    {
        super(scMaterial);
        setCreativeTab(abos.mo_rod);
    }
}
