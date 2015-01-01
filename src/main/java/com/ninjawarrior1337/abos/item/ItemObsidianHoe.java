package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.item.ItemHoe;

public class ItemObsidianHoe extends ItemHoe
{
    public ItemObsidianHoe(ToolMaterial material) {
        super(material);
        setCreativeTab(abos.mo_rod);
    }
}
