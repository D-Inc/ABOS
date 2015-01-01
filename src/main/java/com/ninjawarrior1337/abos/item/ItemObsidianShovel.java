package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemObsidianShovel extends ItemSpade
{
    public ItemObsidianShovel(Item.ToolMaterial material)
    {
        super(material);
        setCreativeTab(abos.mo_rod);
    }
}
