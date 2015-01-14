package com.ninjawarrior1337.abos;

import com.ninjawarrior1337.abos.item.*;
import com.ninjawarrior1337.abos.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import java.sql.Ref;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class abos {
    public static Item itemObsidianRod;
    public static Item diamondObsidianPickaxe;
    public static Item diamondObsidianSword;
    public static Item diamondObsidianAxe;
    public static Item diamondObsidianShovel;
    public static Item diamondObsidianHoe;
    public static Item obsidianApple;
    public static Item scrod;
    public static Item scPick;
    public static Item scAxe;
    public static Item scSword;
    public static Item scHoe;
    public static Item scShovel;
    public static Item scApple;




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
    public static final Item.ToolMaterial scMaterial = EnumHelper.addToolMaterial("scMaterial", 3, 1337, 8.7F, 5.0F, 20);

    @Mod.Instance(Reference.MOD_ID)
    public static abos instance;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        //Items
        itemObsidianRod = new ItemObsidianRod().setUnlocalizedName("ItemObsidianRod").setMaxStackSize(64).setTextureName(Reference.MOD_ID + ":obsidianstick");;
        GameRegistry.registerItem(itemObsidianRod, itemObsidianRod.getUnlocalizedName().substring(5));

        scrod = new scrod().setUnlocalizedName("scrod").setMaxStackSize(64).setTextureName(Reference.MOD_ID + "scrod").setMaxStackSize(64);
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

       scPick = new scPick(scMaterial).setUnlocalizedName("scPick").setTextureName("abos:scPick");
        GameRegistry.registerItem(scPick, scPick.getUnlocalizedName().substring(5));

        scSword = new scSword(scMaterial).setUnlocalizedName("scSword").setTextureName("abos:scSword");
        GameRegistry.registerItem(scSword, scSword.getUnlocalizedName().substring(5));

        scAxe = new scAxe(scMaterial).setUnlocalizedName("scAxe").setTextureName("abos:scAxe");
        GameRegistry.registerItem(scAxe, scAxe.getUnlocalizedName().substring(5));

        scShovel = new scShovel(scMaterial).setUnlocalizedName("scShovel").setTextureName("abos:scShovel");
        GameRegistry.registerItem(scShovel, scShovel.getUnlocalizedName().substring(5));

        scHoe = new scHoe(scMaterial).setUnlocalizedName("scHoe").setTextureName("abos:scHoe");
        GameRegistry.registerItem(scHoe, scHoe.getUnlocalizedName().substring(5));

        //Blocks

        //Food
        obsidianApple = new ItemObsidianApple(20, 2.0F, true).setUnlocalizedName("ItemObsidianApple").setTextureName("abos:obApple");
        GameRegistry.registerItem(obsidianApple, obsidianApple.getUnlocalizedName().substring(5));

        scApple = new scApple (6, 0.5F, true).setUnlocalizedName("scApple").setTextureName("abos:scApple");
        GameRegistry.registerItem(scApple, scApple.getUnlocalizedName().substring(5));


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
        GameRegistry.addRecipe(new ItemStack(scPick, 1), new Object[]{"DDD"," O "," O ", 'D', Items.diamond, 'O',abos.scrod});
        GameRegistry.addRecipe(new ItemStack(scSword, 1), new Object[]{" D "," D "," O ", 'D',Items.diamond, 'O',abos.scrod});
        GameRegistry.addRecipe(new ItemStack(scSword, 1), new Object[]{"D  ","D  ","O  ", 'D',Items.diamond, 'O',abos.scrod});
        GameRegistry.addRecipe(new ItemStack(scAxe, 1), new Object[]{"DD ","DO "," O ", 'O',abos.scrod, 'D',Items.diamond});
        GameRegistry.addRecipe(new ItemStack(scAxe, 1), new Object[]{" DD"," OD"," O ", 'O',abos.scrod, 'D',Items.diamond});
        GameRegistry.addRecipe(new ItemStack(scShovel, 1),new Object[]{"D  ","O  ","O  ", 'D',Items.diamond, 'O',abos.scrod});
        GameRegistry.addRecipe(new ItemStack(scShovel, 1),new Object[]{" D "," O "," O ", 'D',Items.diamond, 'O',abos.scrod});
        GameRegistry.addRecipe(new ItemStack(scHoe, 1),new Object[]{"DD "," O "," O ", 'D',Items.diamond, 'O',abos.scrod});
        GameRegistry.addRecipe(new ItemStack(scApple, 1), new Object[]{"OOO","OAO","OOO", 'O',abos.scrod, 'A', Items.golden_apple});

        //API's
        FMLInterModComms.sendMessage("cfm","register","com.ninjawarrior1337.abos.RegisterRecipes.registerCustomRecipes");



    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}


