package com.ninjawarrior1337.abos.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.PlayerEvent;

/**
 * Created by ninjawarrior1337 on 8/11/16.
 */
public class changeplayerdisplayname
{
    @SubscribeEvent
    public void getName(PlayerEvent.NameFormat event)
    {
        if(event.username.equals("Rocker545"))
        {
            event.displayname=(EnumChatFormatting.RED + "Rocker545" + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + " THE GOD");
        }
        if(event.username.equals("ninjawarrior1337"))
        {
            event.displayname=(EnumChatFormatting.DARK_AQUA + "ninjawarrior1337" + EnumChatFormatting.GREEN + EnumChatFormatting.BOLD + " The AE God");
        }
        if(event.username.equals("Eric_James"))
        {
            event.displayname=("Breean_Chan");
        }
        if(event.username.equals("Apriicot"))
        {
            event.displayname=("Apriinot");
        }
        if(event.username.equals("Rocket_D"))
        {
            event.displayname=(EnumChatFormatting.DARK_PURPLE + "LEBRON" + EnumChatFormatting.GOLD + "HUMMUS");
        }
        if(event.username.equals("JaxonHH"))
        {
            event.displayname=("JooxonHootchHootch");
        }
        if(event.username.equals("etonais"))
        {
            event.displayname=("Etan the Sucky BobaTea CEO");
        }
        if(event.username.contains("Player")){
            event.displayname=(EnumChatFormatting.DARK_GRAY + "" + EnumChatFormatting.BOLD + "UNPAID SCROOB");
        }
    }

}
