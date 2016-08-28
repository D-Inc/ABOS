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
        String Tyler = "7ce98ec4-496c-4ab0-968b-280c750f423b";
        String Derek = "35536359-762d-401a-ae4e-b020c0f9756c";
        String Bryan = "f95d14d4-77a2-45f2-963e-bdfe06ce84bb";
        String Jenna = "2a20bf57-fde0-4dec-81bd-1d50ce1059ec";
        String Dylan = "1f573fb3-5ceb-4961-b08b-a45264771c0d";
        String Jaxon = "114f9e56-d7c1-40b2-b75d-34c2f5ab0826";
        String Ethan = "eab0594b-c596-444f-9eaf-6f16837210a9";

        if(event.entityPlayer.getUniqueID().toString().equals(Tyler))
        {
            event.displayname=(EnumChatFormatting.DARK_AQUA + "ninjawarrior1337" + EnumChatFormatting.GREEN + EnumChatFormatting.BOLD + " The AE God");
        }

        if(event.entityPlayer.getUniqueID().toString().equals(Derek))
        {
            event.displayname=(EnumChatFormatting.RED + "Rocker545" + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + " THE GOD");
        }

        if(event.entityPlayer.getUniqueID().toString().equals(Bryan))
        {
            event.displayname=("Breean_Chan");
        }

        if(event.entityPlayer.getUniqueID().toString().equals(Jenna))
        {
            event.displayname=("Apriinot");
        }

        if(event.entityPlayer.getUniqueID().toString().equals(Dylan))
        {
            event.displayname=(EnumChatFormatting.DARK_PURPLE + "LEBRON" + EnumChatFormatting.GOLD + "HUMMUS");
        }

        if(event.entityPlayer.getUniqueID().toString().equals(Jaxon))
        {
            event.displayname=("JooxonHootchHootch");
        }

        if(event.entityPlayer.getUniqueID().toString().equals(Ethan))
        {
            event.displayname=("Etan the Sucky BobaTea CEO");
        }

        if(event.username.contains("Player"))
        {
            event.displayname=(EnumChatFormatting.DARK_GRAY + "" + EnumChatFormatting.BOLD + "UNPAID SCROOB");
        }

        if(event.username.equals("OG_Arist0tle"))
        {
            event.displayname=("OG_NotNiceGuyWhoReplacesIronWithSteel :)");
        }
    }

}
