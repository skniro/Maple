package com.skniro.maple.compat.rei;

import com.skniro.maple.Maple;
import com.skniro.maple.block.MapleBlocks;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.LinkedList;
import java.util.List;

// Done with the help:
// https://github.com/TeamGalacticraft/Galacticraft/tree/main (MIT License)
public class MapleJuicerCraftingCategory implements DisplayCategory<BasicDisplay> {
    public static final CategoryIdentifier<MapleJuicerCraftingDisplay> UID = CategoryIdentifier.of(Maple.MOD_ID, "maple_juicer");
    public static final Identifier TEXTURE = Identifier.of(Maple.MOD_ID,
            "textures/gui/maple_juicer/maple_juicer.png");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return UID;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("gui.maple.maple_juicer");
    }


    @Override
    public Renderer getIcon() {
        return EntryStacks.of(MapleBlocks.Maple_Juicer_Block.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 52, startPoint.y + 19))
                .entries(display.getInputEntries().get(0)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 52, startPoint.y + 50))
                .entries(display.getInputEntries().get(1)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 100, startPoint.y + 34))
                .markOutput().entries(display.getOutputEntries().get(0)));
        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}