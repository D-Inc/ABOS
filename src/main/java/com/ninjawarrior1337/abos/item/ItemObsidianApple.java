package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemObsidianApple extends ItemFood
{
    public ItemObsidianApple(int hunger, float saturation, boolean isWolfsFavoriteMeat)
    {
        super(hunger, saturation, isWolfsFavoriteMeat);
        setCreativeTab(abos.mo_rod);
        setPotionEffect(Potion.harm.id, 10, 124, 0.1F);

    }
}
