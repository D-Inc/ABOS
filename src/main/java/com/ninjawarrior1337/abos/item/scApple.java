package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class scApple extends ItemFood
{
    public scApple(int hunger, float saturation, boolean isWolfsFavoriteMeat) {
        super(hunger, saturation, isWolfsFavoriteMeat);
        setPotionEffect(Potion.moveSpeed.id, 120, 4, 1.0F);
        setCreativeTab(abos.mo_rod);
    }
}
