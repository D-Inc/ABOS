package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemObsidianAxe extends ItemAxe
{
    public ItemObsidianAxe(Item.ToolMaterial material) {
        super(material);
        setCreativeTab(abos.mo_rod);

    }
}
