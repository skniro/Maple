package com.skniro.maple.compat.jei;

import com.skniro.maple.Maple;
import com.skniro.maple.client.gui.screen.ingame.MapleJuicerBlockScreen;
import com.skniro.maple.recipe.MapleJuicerCraftingRecipe;
import com.skniro.maple.recipe.MapleRecipeType;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import java.util.List;

@JeiPlugin
public class JEIGrowableOresEModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Maple.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new AlchemyCraftingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<MapleJuicerCraftingRecipe> craftingRecipes = recipeManager.getAllRecipesFor(MapleRecipeType.Maple_JUIER_TYPE.get());
        registration.addRecipes(AlchemyCraftingCategory.Maple_Juicer_TYPE, craftingRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(MapleJuicerBlockScreen.class, 73, 34, 22, 16,
                AlchemyCraftingCategory.Maple_Juicer_TYPE);
    }
}