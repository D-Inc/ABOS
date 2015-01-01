package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class scSword extends ItemSword
{
    public scSword(Item.ToolMaterial scMaterial)
    {
        super(scMaterial);
        setCreativeTab(abos.mo_rod);

    }
}
