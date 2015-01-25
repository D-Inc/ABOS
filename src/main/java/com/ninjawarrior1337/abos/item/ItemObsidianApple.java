package com.ninjawarrior1337.abos.item;

import com.ninjawarrior1337.abos.abos;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemObsidianApple extends ItemFood
{
    public ItemObsidianApple(int hunger, float saturation, boolean isWolfsFavoriteMeat)
    {
        super(hunger, saturation, isWolfsFavoriteMeat);
        setCreativeTab(abos.mo_rod);
        setPotionEffect(Potion.harm.id, 10, 124, 0.1F);



    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack Item, EntityPlayer player, List toolTip, boolean advanced)
    {
        toolTip.add(EnumChatFormatting.DARK_RED + "EATING MAY CAUSE DEATH");
    }
}
