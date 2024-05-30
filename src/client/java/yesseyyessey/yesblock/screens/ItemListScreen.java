package yesseyyessey.yesblock.screens;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.text.Text;

public class ItemListScreen extends Screen {
    protected ItemListScreen() {
        super(Text.literal("Item List"));
    }

    ItemListThing itemList = new ItemListThing();

    @Override
    protected void init() {
        PressableWidget[] widgets = itemList.init(width);
        for (PressableWidget widget : widgets) {
            addDrawableChild(widget);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        itemList.render(context, mouseX, mouseY, delta, width, textRenderer);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        itemList.mouseClicked(mouseX, mouseY, button);
        return super.mouseClicked(mouseX, mouseY, button);
    }
}
