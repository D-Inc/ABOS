package com.ninjawarrior1337.abos.item;

import appeng.api.config.FuzzyMode;
import appeng.api.implementations.items.IStorageCell;
import appeng.api.storage.data.IAEItemStack;
import com.ninjawarrior1337.abos.Reference;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by ninjawarrior1337 on 8/11/16.
 */
public class DirtCell extends Item implements IStorageCell
{
    public DirtCell()
    {
        setUnlocalizedName("dirt_cell");
        setTextureName(Reference.RESOURCE_PREFIX+"dirt_cell");
    }

    @Override
    public int getBytes(ItemStack cellItem) {
        return 8;
    }

    @Override
    public int BytePerType(ItemStack cellItem) {
        return 8;
    }

    @Override
    public int getBytesPerType(ItemStack cellItem) {
        return 8;
    }

    @Override
    public int getTotalTypes(ItemStack cellItem) {
        return 1;
    }

    @Override
    public boolean isBlackListed(ItemStack cellItem, IAEItemStack requestedAddition) {
        return false;
    }

    @Override
    public boolean storableInStorageCell() {
        return false;
    }

    @Override
    public boolean isStorageCell(ItemStack i) {
        return true;
    }

    @Override
    public double getIdleDrain() {
        return 0;
    }

    @Override
    public boolean isEditable(ItemStack is) {
        return false;
    }

    @Override
    public IInventory getUpgradesInventory(ItemStack is) {
        return null;
    }

    @Override
    public IInventory getConfigInventory(ItemStack is) {
        return null;
    }

    @Override
    public FuzzyMode getFuzzyMode(ItemStack is) {
        return null;
    }

    @Override
    public void setFuzzyMode(ItemStack is, FuzzyMode fzMode) {

    }
}
