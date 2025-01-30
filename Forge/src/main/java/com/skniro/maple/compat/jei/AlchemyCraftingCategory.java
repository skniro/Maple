package com.skniro.maple.compat.jei;
import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import com.skniro.maple.recipe.MapleJuicerCraftingRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;


public class AlchemyCraftingCategory implements IRecipeCategory<MapleJuicerCraftingRecipe> {
    public static final ResourceLocation UID = ResourceLocation.tryBuild(Maple.MODID, "maple_juicer");
    public static final ResourceLocation TEXTURE = ResourceLocation.tryBuild(Maple.MODID,
            "textures/gui/maple_juicer/maple_juicer.png");
    public static final RecipeType<MapleJuicerCraftingRecipe> Maple_Juicer_TYPE =
            new RecipeType<>(UID, MapleJuicerCraftingRecipe.class);
    private final IDrawable background;
    private final IDrawable icon;

    public AlchemyCraftingCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 82);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(MapleBlocks.Maple_Juicer_Block.get()));
    }

    @Override
    public RecipeType<MapleJuicerCraftingRecipe> getRecipeType() {
        return Maple_Juicer_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("gui.maple.maple_juicer");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, MapleJuicerCraftingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 52, 19).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 52, 50).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 100, 34).addItemStack(recipe.getResultItem(null));
    }
}