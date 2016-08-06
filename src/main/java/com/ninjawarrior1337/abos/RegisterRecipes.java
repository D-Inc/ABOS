package com.ninjawarrior1337.abos;

import com.mrcrayfish.furniture.api.IRecipeRegistry;
import com.mrcrayfish.furniture.api.RecipeType;
import com.mrcrayfish.furniture.api.RecipeVariables;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class RegisterRecipes
{
    public static void register(IRecipeRegistry registry)
    {
        RecipeVariables freezer = new RecipeVariables();
        freezer.setInput(new ItemStack(Items.blaze_rod));
        freezer.setOutput(new ItemStack(abos.itemObsidianRod));
        registry.registerRecipe(RecipeType.FREEZER, freezer);
        freezer.setInput(new ItemStack(Items.rotten_flesh));
        freezer.setOutput(new ItemStack(Items.leather));
        registry.registerRecipe(RecipeType.FREEZER, freezer);

        RecipeVariables microwave = new RecipeVariables();
        microwave.setInput(new ItemStack(abos.itemObsidianRod));
        microwave.setOutput(new ItemStack(Items.blaze_rod));
        registry.registerRecipe(RecipeType.MICROWAVE, microwave);

        RecipeVariables blender = new RecipeVariables();
        blender.setName("Derek Juice");
        blender.setHeal(20);
        blender.setIngredients(new ItemStack(Blocks.obsidian), new ItemStack(Blocks.tnt));
        blender.setColour(new int[]{162, 0, 255});
        registry.registerRecipe(RecipeType.BLENDER, blender);

    }
}
