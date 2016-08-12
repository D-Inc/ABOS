package com.ninjawarrior1337.abos.item;

import appeng.api.AEApi;
import appeng.api.config.FuzzyMode;
import appeng.api.config.IncludeExclude;
import appeng.api.exceptions.MissingDefinition;
import appeng.api.implementations.items.IStorageCell;
import appeng.api.implementations.items.IUpgradeModule;
import appeng.api.storage.ICellInventory;
import appeng.api.storage.ICellInventoryHandler;
import appeng.api.storage.IMEInventoryHandler;
import appeng.api.storage.StorageChannel;
import appeng.api.storage.data.IAEItemStack;
import appeng.api.storage.data.IItemList;
import appeng.core.localization.GuiText;
import appeng.items.AEBaseItem;
import appeng.items.contents.CellConfig;
import appeng.items.contents.CellUpgrades;
import appeng.util.InventoryAdaptor;
import appeng.util.Platform;
import com.ninjawarrior1337.abos.abos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;

/**
 * Created by Rocker545 on 8/11/2016.
 */
public class DirtCell extends AEBaseItem implements IStorageCell{
    private final int totalBytes = 64;
    private final int perType = 1;
    private final double idleDrain = 0;

    public DirtCell()
    {
        this.setMaxStackSize(1);
        setUnlocalizedName("dirt_cell");
        this.setCreativeTab(abos.mo_rod);
        setTextureName("abos:dirt_cell");
    }

    @Override
    public void addCheckedInformation(final ItemStack stack, final EntityPlayer player, final List<String> lines, final boolean displayMoreInfo )
    {
        final IMEInventoryHandler<?> inventory = AEApi.instance().registries().cell().getCellInventory( stack, null, StorageChannel.ITEMS );

        if( inventory instanceof ICellInventoryHandler)
        {
            final ICellInventoryHandler handler = (ICellInventoryHandler) inventory;
            final ICellInventory cellInventory = handler.getCellInv();

            if( cellInventory != null )
            {
                lines.add( cellInventory.getUsedBytes() + " " + GuiText.Of.getLocal() + ' ' + cellInventory.getTotalBytes() + ' ' + GuiText.BytesUsed.getLocal() );

                lines.add( cellInventory.getStoredItemTypes() + " " + GuiText.Of.getLocal() + ' ' + cellInventory.getTotalItemTypes() + ' ' + GuiText.Types.getLocal() );

                if( handler.isPreformatted() )
                {
                    final String list = ( handler.getIncludeExcludeMode() == IncludeExclude.WHITELIST ? GuiText.Included : GuiText.Excluded ).getLocal();

                    if( handler.isFuzzy() )
                    {
                        lines.add( GuiText.Partitioned.getLocal() + " - " + list + ' ' + GuiText.Fuzzy.getLocal() );
                    }
                    else
                    {
                        lines.add( GuiText.Partitioned.getLocal() + " - " + list + ' ' + GuiText.Precise.getLocal() );
                    }
                }
            }
        }
    }

    @Override
    public int getBytes(final ItemStack cellItem)
    {
        return this.totalBytes;
    }

    @Override
    public int BytePerType( final ItemStack cell )
    {
        return this.perType;
    }

    @Override
    public int getBytesPerType( final ItemStack cellItem )
    {
        return this.perType;
    }

    @Override
    public int getTotalTypes( final ItemStack cellItem )
    {
        return 1;
    }

    @Override
    public boolean isBlackListed( final ItemStack cellItem, final IAEItemStack requestedAddition )
    {
        return false;
    }

    @Override
    public boolean storableInStorageCell()
    {
        return false;
    }

    @Override
    public boolean isStorageCell( final ItemStack i )
    {
        return true;
    }

    @Override
    public double getIdleDrain()
    {
        return this.idleDrain;
    }

    @Override
    public boolean isEditable( final ItemStack is )
    {
        return true;
    }

    @Override
    public IInventory getUpgradesInventory( final ItemStack is )
    {
        return new CellUpgrades( is, 2 );
    }

    @Override
    public IInventory getConfigInventory( final ItemStack is )
    {
        return new CellConfig( is );
    }

    @Override
    public FuzzyMode getFuzzyMode( final ItemStack is )
    {
        final String fz = Platform.openNbtData( is ).getString( "FuzzyMode" );
        try
        {
            return FuzzyMode.valueOf( fz );
        }
        catch( final Throwable t )
        {
            return FuzzyMode.IGNORE_ALL;
        }
    }

    @Override
    public void setFuzzyMode( final ItemStack is, final FuzzyMode fzMode )
    {
        Platform.openNbtData( is ).setString( "FuzzyMode", fzMode.name() );
    }

    @Override
    public ItemStack onItemRightClick( final ItemStack stack, final World world, final EntityPlayer player )
    {
        this.disassembleDrive( stack, world, player );
        return stack;
    }

    private boolean disassembleDrive(final ItemStack stack, final World world, final EntityPlayer player )
    {
        if( player.isSneaking() )
        {
            if( Platform.isClient() )
            {
                return false;
            }

            final InventoryPlayer playerInventory = player.inventory;
            final IMEInventoryHandler inv = AEApi.instance().registries().cell().getCellInventory( stack, null, StorageChannel.ITEMS );
            if( inv != null && playerInventory.getCurrentItem() == stack )
            {
                final InventoryAdaptor ia = InventoryAdaptor.getAdaptor( player, ForgeDirection.UNKNOWN );
                final IItemList<IAEItemStack> list = inv.getAvailableItems( StorageChannel.ITEMS.createList() );
                if( list.isEmpty() && ia != null )
                {
                    playerInventory.setInventorySlotContents( playerInventory.currentItem, null );
                    // drop core
					final ItemStack extraB = ia.addItems(new ItemStack(abos.RedDirt));
					if( extraB != null )
					{
						player.dropPlayerItemWithRandomChoice( extraB, false );
					}

                    // drop upgrades
                    final IInventory upgradesInventory = this.getUpgradesInventory( stack );
                    for( int upgradeIndex = 0; upgradeIndex < upgradesInventory.getSizeInventory(); upgradeIndex++ )
                    {
                        final ItemStack upgradeStack = upgradesInventory.getStackInSlot( upgradeIndex );
                        final ItemStack leftStack = ia.addItems( upgradeStack );
                        if( leftStack != null && upgradeStack.getItem() instanceof IUpgradeModule)
                        {
                            player.dropPlayerItemWithRandomChoice( upgradeStack, false );
                        }
                    }

                    // drop empty storage cell case
                    for( final ItemStack storageCellStack : AEApi.instance().definitions().materials().emptyStorageCell().maybeStack( 1 ).asSet() )
                    {
                        final ItemStack extraA = ia.addItems( storageCellStack );
                        if( extraA != null )
                        {
                            player.dropPlayerItemWithRandomChoice( extraA, false );
                        }
                    }

                    if( player.inventoryContainer != null )
                    {
                        player.inventoryContainer.detectAndSendChanges();
                    }

                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean onItemUseFirst( final ItemStack stack, final EntityPlayer player, final World world, final int x, final int y, final int z, final int side, final float hitX, final float hitY, final float hitZ )
    {
        return this.disassembleDrive( stack, world, player );
    }

    @Override
    public ItemStack getContainerItem( final ItemStack itemStack )
    {
        for( final ItemStack stack : AEApi.instance().definitions().materials().emptyStorageCell().maybeStack( 1 ).asSet() )
        {
            return stack;
        }

        throw new MissingDefinition( "Tried to use empty storage cells while basic storage cells are defined." );
    }

    @Override
    public boolean hasContainerItem( final ItemStack stack )
    {
        return false;
    }
}
