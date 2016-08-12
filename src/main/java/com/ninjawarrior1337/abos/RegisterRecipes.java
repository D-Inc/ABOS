package com.ninjawarrior1337.abos;

import com.mrcrayfish.furniture.api.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class RegisterRecipes
{
    public static void register(IRecipeRegistry registry)
    {
        RecipeVariables freezer = new RecipeVariables();
        freezer.addValue("input", new ItemStack(Items.blaze_rod));
        freezer.addValue("output", new ItemStack(abos.itemObsidianRod));
        registry.registerRecipe("freezer", freezer);
        freezer.addValue("input", new ItemStack(Items.rotten_flesh));
        freezer.addValue("output", new ItemStack(Items.leather));
        registry.registerRecipe("freezer", freezer);

        RecipeVariables microwave = new RecipeVariables();
        microwave.addValue("input", new ItemStack(abos.itemObsidianRod));
        microwave.addValue("output", new ItemStack(Items.blaze_rod));
        registry.registerRecipe("microwave", microwave);

        RecipeVariables blender = new RecipeVariables();
        blender.addValue("name", "Derek Juice");
        blender.addValue("heal", 20);
        blender.addValue("ingredients", new ItemStack[]{new ItemStack(Blocks.tnt, 1, 0), new ItemStack(Blocks.obsidian, 1 ,0)});
        blender.addValue("colour", new int[]{162, 0, 255});
        registry.registerRecipe("blender", blender);

    }
}
