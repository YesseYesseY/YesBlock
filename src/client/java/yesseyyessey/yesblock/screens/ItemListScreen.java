package yesseyyessey.yesblock.screens;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.text.Text;

public class ItemListScreen extends Screen {
    protected ItemListScreen() {
        super(Text.literal("Item List"));
    }

    ItemListThing itemList;

    @Override
    protected void init() {
        itemList = new ItemListThing(this);
        PressableWidget[] widgets = itemList.init();
        for (PressableWidget widget : widgets) {
            addDrawableChild(widget);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        itemList.render(context, mouseX, mouseY, delta, textRenderer);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        itemList.mouseClicked(mouseX, mouseY, button);
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
        context.fillGradient(0, 0, this.width, this.height, -1072689136, -804253680);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (!itemList.keyPressed(keyCode, scanCode, modifiers))
        {
            return super.keyPressed(keyCode, scanCode, modifiers);
        }
        return true;
    }
}
