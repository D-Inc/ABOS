package com.ninjawarrior1337.abos.item;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;

/**
 * Created by ninjawarrior1337 on 8/9/16.
 */
public class DABRecord extends ItemRecord
{
    public DABRecord(String name)
    {
        super(name);
    }
    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation("abos:"+name);
    }
}
