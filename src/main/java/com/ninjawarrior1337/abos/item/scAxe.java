package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class scAxe extends ItemAxe
{

    public scAxe(Item.ToolMaterial scMaterial) {
        super(scMaterial);
        setCreativeTab(abos.mo_rod);

    }
}
