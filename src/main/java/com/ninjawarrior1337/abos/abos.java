package com.ninjawarrior1337.abos;

import com.ninjawarrior1337.abos.item.*;
import com.ninjawarrior1337.abos.proxy.IProxy;
import com.ninjawarrior1337.abos.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;

import javax.naming.directory.ModificationItem;

import static com.ninjawarrior1337.abos.reference.Reference.MOD_ID;

@Mod(modid = MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class abos {
    public static Item itemObsidianRod;
    public static Item diamondObsidianPickaxe;
    public static Item diamondObsidianSword;
    public static Item diamondObsidianAxe;
    public static Item diamondObsidianShovel;
    public static Item diamondObsidianHoe;
    public static Item obsidianApple;
    public static Item scrod;

    //Tab
    public static final CreativeTabs mo_rod = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return abos.itemObsidianRod;
        }
    };

    //Tool Materials
    public static final Item.ToolMaterial diamondObsidianToolMaterial = EnumHelper.addToolMaterial("diamondObsidianToolMaterial",5, 3122, 25.0F, 6.0F, 20);

    @Mod.Instance(MOD_ID)
    public static abos instance;

    @SidedProxy(clientSide = "com.ninjawarrior1337.abos.proxy.ClientProxy", serverSide = "com.ninjawarrior1337.abos.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        //Items
        itemObsidianRod = new ItemObsidianRod().setUnlocalizedName("ItemObsidianRod").setMaxStackSize(64).setTextureName(Reference.MOD_ID + ":obsidianstick");;
        GameRegistry.registerItem(itemObsidianRod, itemObsidianRod.getUnlocalizedName().substring(5));

        scrod = new scrod().setUnlocalizedName("scrod").setMaxStackSize(64).setTextureName("abos:scrod").setMaxStackSize(64);
        GameRegistry.registerItem(scrod, scrod.getUnlocalizedName().substring(5));


        //Tools
        diamondObsidianPickaxe = new ItemObsidianPickaxe(diamondObsidianToolMaterial).setUnlocalizedName("ItemObsidianPickaxe").setTextureName("abos:obPick");
        GameRegistry.registerItem(diamondObsidianPickaxe, diamondObsidianPickaxe.getUnlocalizedName().substring(5));

        diamondObsidianSword = new ItemObsidianSword(diamondObsidianToolMaterial).setUnlocalizedName("ItemObsidianSword").setTextureName("abos:obSword");
        GameRegistry.registerItem(diamondObsidianSword, diamondObsidianSword.getUnlocalizedName().substring(5));

        diamondObsidianAxe = new ItemObsidianAxe(diamondObsidianToolMaterial).setUnlocalizedName("ItemObsidianAxe").setTextureName("abos:obAxe");
        GameRegistry.registerItem(diamondObsidianAxe, diamondObsidianAxe.getUnlocalizedName().substring(5));

        diamondObsidianShovel = new ItemObsidianShovel(diamondObsidianToolMaterial).setUnlocalizedName("ItemObsidianShovel").setTextureName("abos:obShovel");
        GameRegistry.registerItem(diamondObsidianShovel, diamondObsidianShovel.getUnlocalizedName().substring(5));

        diamondObsidianHoe = new ItemObsidianHoe(diamondObsidianToolMaterial).setUnlocalizedName("ItemObsidianHoe").setTextureName("abos:obHoe");
        GameRegistry.registerItem(diamondObsidianHoe, diamondObsidianHoe.getUnlocalizedName().substring(5));

        //Blocks

        //Food
        obsidianApple = new ItemObsidianApple(20, 2.0F, true).setUnlocalizedName("ItemObsidianApple").setTextureName("abos:obApple");
        GameRegistry.registerItem(obsidianApple, obsidianApple.getUnlocalizedName().substring(5));


    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        //Recipes
        GameRegistry.addRecipe(new ItemStack(itemObsidianRod, 4), new Object[]{"   ", "O  ", "O  ", 'O', Blocks.obsidian});
        GameRegistry.addRecipe(new ItemStack(itemObsidianRod, 4), new Object[]{"   ", " O ", " O ", 'O', Blocks.obsidian});
        GameRegistry.addRecipe(new ItemStack(diamondObsidianPickaxe, 1), new Object[]{"DDD"," O "," O ", 'D', Items.diamond, 'O',abos.itemObsidianRod});
        GameRegistry.addRecipe(new ItemStack(diamondObsidianSword, 1), new Object[]{" D "," D "," O ", 'D',Items.diamond, 'O',abos.itemObsidianRod});
        GameRegistry.addRecipe(new ItemStack(diamondObsidianSword, 1), new Object[]{"D  ","D  ","O  ", 'D',Items.diamond, 'O',abos.itemObsidianRod});
        GameRegistry.addRecipe(new ItemStack(diamondObsidianAxe, 1), new Object[]{"DD ","DO "," O ", 'O',abos.itemObsidianRod, 'D',Items.diamond});
        GameRegistry.addRecipe(new ItemStack(diamondObsidianAxe, 1), new Object[]{" DD"," OD"," O ", 'O',abos.itemObsidianRod, 'D',Items.diamond});
        GameRegistry.addRecipe(new ItemStack(diamondObsidianShovel, 1),new Object[]{"D  ","O  ","O  ", 'D',Items.diamond, 'O',abos.itemObsidianRod});
        GameRegistry.addRecipe(new ItemStack(diamondObsidianShovel, 1),new Object[]{" D "," O "," O ", 'D',Items.diamond, 'O',abos.itemObsidianRod});
        GameRegistry.addRecipe(new ItemStack(diamondObsidianHoe, 1),new Object[]{"DD "," O "," O ", 'D',Items.diamond, 'O',abos.itemObsidianRod});
        GameRegistry.addRecipe(new ItemStack(obsidianApple, 1), new Object[]{"OOO","OAO","OOO", 'O',abos.itemObsidianRod, 'A', Items.golden_apple});
        GameRegistry.addRecipe(new ItemStack(scrod, 4), new Object[]{"XXX","   ","   ", 'X',Items.reeds});
        GameRegistry.addRecipe(new ItemStack(scrod, 4), new Object[]{"   ","XXX","   ", 'X',Items.reeds});

        //API's
        FMLInterModComms.sendMessage("cfm","register","com.ninjawarrior1337.abos.RegisterRecipes.registerCustomRecipes");



    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}


