package com.ninjawarrior1337.abos;

import com.mrcrayfish.furniture.api.IRecipeRegistry;
import com.mrcrayfish.furniture.api.RecipeVariables;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class RegisterRecipes
{
    public static void registerCustomRecipes(IRecipeRegistry registry)
    {
        RecipeVariables freezer = new RecipeVariables();
        freezer.addValue("input", new ItemStack(Items.blaze_rod));
        freezer.addValue("output", new ItemStack(abos.itemObsidianRod));
        registry.registerRecipe("freezer", freezer);

        RecipeVariables microwave = new RecipeVariables();
        microwave.addValue("input", new ItemStack(abos.itemObsidianRod));
        microwave.addValue("output", new ItemStack(Items.blaze_rod));
        registry.registerRecipe("microwave", microwave);

        RecipeVariables minebay = new RecipeVariables();
        minebay.addValue("input", new ItemStack(abos.itemObsidianRod));
        minebay.addValue("currency", new ItemStack(Items.emerald));
        minebay.addValue("price", 7);
        registry.registerRecipe("minebay", minebay);

        RecipeVariables dishwasher = new RecipeVariables();
        dishwasher.addValue("input", new ItemStack(abos.diamondObsidianAxe));
        registry.registerRecipe("dishwasher", dishwasher);
        dishwasher.addValue("input", new ItemStack(abos.diamondObsidianPickaxe));
        registry.registerRecipe("dishwasher", dishwasher);
        dishwasher.addValue("input", new ItemStack(abos.diamondObsidianSword));
        registry.registerRecipe("dishwasher", dishwasher);
        dishwasher.addValue("input", new ItemStack(abos.diamondObsidianShovel));
        registry.registerRecipe("dishwasher", dishwasher);
        dishwasher.addValue("input", new ItemStack(abos.diamondObsidianHoe));
        registry.registerRecipe("dishwasher", dishwasher);

        RecipeVariables choppingboard = new RecipeVariables();
        choppingboard.addValue("input", new ItemStack(Items.reeds));
        choppingboard.addValue("output", new ItemStack(abos.scrod, 8));
        registry.registerRecipe("choppingboard", choppingboard);





    }
}
