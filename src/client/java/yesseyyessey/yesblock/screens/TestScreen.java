package yesseyyessey.yesblock.screens;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.*;
import net.minecraft.text.Text;
import yesseyyessey.yesblock.SkyblockItem;
import yesseyyessey.yesblock.YesBlockClient;

public class TestScreen extends Screen {
    public TestScreen() {
        super(Text.literal("Yes"));
    }

    private final int ItemListHeight = 20;
    private final int ItemListWidth = 8;
    private final int ItemListTotalSize = ItemListHeight * ItemListWidth;
    private int CurrentPage = 0;

    @Override
    protected void init() {
        ButtonWidget prevButton = ButtonWidget.builder(Text.literal("Prev Page"), button -> {
            if (CurrentPage > 0) {
                CurrentPage--;
            }
        }).width((ItemListWidth * 16) / 2).build();
        prevButton.setY(ItemListHeight*16);

        ButtonWidget nextButton = ButtonWidget.builder(Text.literal("Next Page"), button -> {
            if (CurrentPage < YesBlockClient.SBItems.size() / ItemListTotalSize) {
                CurrentPage++;
            }
        }).width((ItemListWidth * 16) / 2).build();
        nextButton.setY(ItemListHeight*16);
        nextButton.setX((ItemListWidth * 16) / 2);

        addDrawableChild(prevButton);
        addDrawableChild(nextButton);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);

        context.drawText(this.textRenderer, Text.literal("Page: " + CurrentPage), ItemListWidth * 16, 1, 0xFFFFFFFF, true);

        for (int i = 0; i < YesBlockClient.SBItems.size() && i < ItemListTotalSize; i++) {
            int index = i + (CurrentPage * ItemListTotalSize);
            if (index < YesBlockClient.SBItems.size()) {
                SkyblockItem item = YesBlockClient.SBItems.get(index);
                context.drawItem(item.toItemStack(), (i % ItemListWidth) * 16, i / ItemListWidth * 16);
            }
        }

        if (mouseX < ItemListWidth * 16 && mouseY < ItemListHeight * 16) {
            SkyblockItem item = getItemFromMouse(mouseX, mouseY);
            if (item != null) {
                context.drawItemTooltip(this.textRenderer, item.toItemStack(), mouseX, mouseY);
            }
        }
    }

    private SkyblockItem getItemFromMouse(int mouseX, int mouseY) {
        int x = mouseX / 16;
        int y = mouseY / 16;
        int z = x + (y * ItemListWidth) + (CurrentPage * ItemListTotalSize);

        if (z < YesBlockClient.SBItems.size()) {
            return YesBlockClient.SBItems.get(z);
        }

        return null;
    }
}
