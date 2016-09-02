package com.ninjawarrior1337.abos.events;

import com.ninjawarrior1337.abos.abos;
import com.ninjawarrior1337.abos.gui_stuff.treelar_blur;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class superevent
{
    Minecraft mc;
    ScaledResolution res = new ScaledResolution(this.mc, this.mc.displayHeight, this.mc.displayWidth);
    int k = res.getScaledWidth();
    int l = res.getScaledHeight();

    static EntityPlayer player;

    treelar_blur treelarBlur = new treelar_blur();

    @SubscribeEvent
    public void onEvent(LivingEvent.LivingUpdateEvent event)
    {
        if(event.entity instanceof EntityPlayer)
        {
            player = (EntityPlayer) event.entity;
            if(player.inventory.getStackInSlot(103) == new ItemStack(abos.RedDirt, 1, 0));
            {
                treelarBlur.renderTreelarBlur(k, l);
            }
        }
    }

}
