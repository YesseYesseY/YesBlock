package yesseyyessey.yesblock.screens;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.text.Text;
import yesseyyessey.yesblock.SkyblockItem;
import yesseyyessey.yesblock.YesBlockClient;

public class ItemListThing {
    private final int ItemListHeight = 20;
    private final int ItemListWidth = 8;
    private final int ItemListTotalSize = ItemListHeight * ItemListWidth;

    private final Screen screen;

    public ItemListThing(Screen screen) {
        this.screen = screen;
    }

    public PressableWidget[] init() {
        int buttonSize = (ItemListWidth * 16) / 2;

        ButtonWidget prevButton = ButtonWidget.builder(Text.literal("Prev Page"), button -> {
            if (YesBlockClient.CurrentItemPage > 0) {
                YesBlockClient.CurrentItemPage--;
            }
        }).width(buttonSize).build();

        ButtonWidget nextButton = ButtonWidget.builder(Text.literal("Next Page"), button -> {
            if (YesBlockClient.CurrentItemPage < YesBlockClient.SBItems.size() / ItemListTotalSize) {
                YesBlockClient.CurrentItemPage++;
            }
        }).width(buttonSize).build();

        prevButton.setY(ItemListHeight*16);
        prevButton.setX(screen.width - (buttonSize * 2));

        nextButton.setY(ItemListHeight*16);
        nextButton.setX(screen.width - buttonSize);

        PressableWidget[] widgets = new PressableWidget[2];
        widgets[0] = prevButton;
        widgets[1] = nextButton;
        return widgets;
    }

    public void render(DrawContext context, int mouseX, int mouseY, float delta, TextRenderer textRenderer) {
        context.drawText(textRenderer, Text.literal("Page: " + YesBlockClient.CurrentItemPage), ItemListWidth * 16, 1, 0xFFFFFFFF, true);

        for (int i = 0; i < YesBlockClient.SBItems.size() && i < ItemListTotalSize; i++) {
            int index = i + (YesBlockClient.CurrentItemPage * ItemListTotalSize);
            if (index < YesBlockClient.SBItems.size()) {
                SkyblockItem item = YesBlockClient.SBItems.get(index);
                context.drawItem(item.toItemStack(), ((i % ItemListWidth) * 16) + (screen.width - (ItemListWidth * 16)), i / ItemListWidth * 16);
            }
        }

        if (mouseX > screen.width - (ItemListWidth * 16) && mouseY < ItemListHeight * 16) {
            SkyblockItem item = getItemFromMouse(mouseX, mouseY, screen.width);
            if (item != null) {
                context.drawItemTooltip(textRenderer, item.toItemStack(), mouseX, mouseY);
            }
        }
    }

    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (mouseX > screen.width - (ItemListWidth * 16) && mouseY < ItemListHeight * 16) {
            SkyblockItem item = getItemFromMouse((int) mouseX, (int) mouseY, screen.width);
            if (item != null) {
                MinecraftClient.getInstance().setScreen(new ItemListCraftingScreen());
            }
        }
    }

    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (MinecraftClient.getInstance().options.inventoryKey.matchesKey(keyCode, scanCode)) {
            screen.close();
            return true;
        }
        return false;
    }

    private SkyblockItem getItemFromMouse(int mouseX, int mouseY, int width) {
        int x = (mouseX - (screen.width - (ItemListWidth * 16))) / 16;
        int y = mouseY / 16;
        int z = x + (y * ItemListWidth) + (YesBlockClient.CurrentItemPage * ItemListTotalSize);

        if (z < YesBlockClient.SBItems.size() && z >= 0) {
            return YesBlockClient.SBItems.get(z);
        }

        return null;
    }
}
