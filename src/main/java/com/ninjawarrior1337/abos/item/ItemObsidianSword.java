package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;

public class ItemObsidianSword extends ItemSword {
    public ItemObsidianSword(ToolMaterial material) {
        super(material);
        setCreativeTab(abos.mo_rod);
    }


}
