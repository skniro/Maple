package com.skniro.maple.client.gui.screen.ingame;

import com.mojang.blaze3d.systems.RenderSystem;
import com.skniro.maple.Maple;
import com.skniro.maple.screen.MapleJuicerBlockScreenHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

@Environment(EnvType.CLIENT)
public class MapleJuicerBlockScreen extends AbstractContainerScreen<MapleJuicerBlockScreenHandler> {
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Maple.MOD_ID, "textures/gui/maple_juicer/maple_juicer.png");

    public MapleJuicerBlockScreen(MapleJuicerBlockScreenHandler handler, Inventory inventory, Component title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleLabelX = (imageWidth - font.width(title)) / 2;
    }

    @Override
    protected void renderBg(GuiGraphics context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        context.blit(RenderType::guiTextured, TEXTURE, x, y, 0, 0, imageWidth, imageHeight,256,256);

        renderProgressArrow(context, x, y);
    }

    private void renderProgressArrow(GuiGraphics context, int x, int y) {
        if(menu.isCrafting()) {
            context.blit(RenderType::guiTextured, TEXTURE, x + 73, y + 34, 176, 12, menu.getScaledProgress(),45,256,256);
        }
        /*if(handler.hasFuel()){
            drawTexture(matrices, x + 18, y + 33 + 14 - handler.getScaledFuelProgress(), 176,
                    14 - handler.getScaledFuelProgress(), 14, handler.getScaledFuelProgress());
        }*/
    }

    @Override
    public void render(GuiGraphics context , int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        renderTooltip(context, mouseX, mouseY);
    }
}

