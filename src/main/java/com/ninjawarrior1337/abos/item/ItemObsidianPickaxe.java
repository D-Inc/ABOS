package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemObsidianPickaxe extends ItemPickaxe {
    public ItemObsidianPickaxe(ToolMaterial material) {
        super(material);
        setCreativeTab(abos.mo_rod);
    }
}
