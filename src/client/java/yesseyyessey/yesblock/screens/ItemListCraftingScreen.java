package yesseyyessey.yesblock.screens;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Colors;
import net.minecraft.util.Identifier;
import org.joml.Vector2i;
import yesseyyessey.yesblock.YesBlockClient;

public class ItemListCraftingScreen extends ItemListScreen {
    private final Identifier TEXTURE = new Identifier("yesblock", "textures/gui/skyblock_crafting.png");
    private final int TEXTURE_WIDTH = 176;
    private final int TEXTURE_HEIGHT = 86;

    private final int FIRST_SLOT_OFFSET_X = 30;
    private final int FIRST_SLOT_OFFSET_Y = 17;
    private final int CRAFT_SLOT_OFFSET_X = 124;
    private final int CRAFT_SLOT_OFFSET_Y = 35;

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
        super.renderBackground(context, mouseX, mouseY, delta);
        context.drawTexture(TEXTURE, (width - TEXTURE_WIDTH) / 2, (height - TEXTURE_HEIGHT) / 2, 0, 0, TEXTURE_WIDTH, TEXTURE_HEIGHT);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        DrawItemInSlot(context, 0, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 1, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 2, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 3, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 4, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 5, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 6, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 7, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 8, YesBlockClient.SBItems.getFirst().toItemStack());
        DrawItemInSlot(context, 9, YesBlockClient.SBItems.getFirst().toItemStack());

        int mouseSlot = GetMouseSlot(mouseX, mouseY);
        if (mouseSlot != -1) {
            context.drawItemTooltip(textRenderer, YesBlockClient.SBItems.getFirst().toItemStack(), mouseX, mouseY);
            // context.drawText(textRenderer, Integer.toString(mouseSlot), mouseX, mouseY, Colors.WHITE, true);
        }
    }

    private Vector2i GetSlotPos(int slot) {
        if (slot == 9) {
            return new Vector2i(((width - TEXTURE_WIDTH) / 2) + CRAFT_SLOT_OFFSET_X, ((height - TEXTURE_HEIGHT) / 2) + CRAFT_SLOT_OFFSET_Y);
        } else {
            int FirstSlotX = ((width - TEXTURE_WIDTH) / 2) + FIRST_SLOT_OFFSET_X;
            int FirstSlotY = ((height - TEXTURE_HEIGHT) / 2) + FIRST_SLOT_OFFSET_Y;

            int x = (slot % 3);
            int y = slot / 3;

            return new Vector2i(FirstSlotX + (16 * x) + (2 * x), FirstSlotY + (16 * y) + (2 * y));
        }
    }

    private void DrawItemInSlot(DrawContext context, int slot, ItemStack stack) {
        Vector2i pos = GetSlotPos(slot);
        context.drawItem(stack, pos.x, pos.y);
    }

    private int GetMouseSlot(int mouseX, int mouseY) {
        for (int i = 0; i < 10; i++) {
            Vector2i pos = GetSlotPos(i);
            if ((mouseX >= pos.x - 1 && mouseX <= pos.x + 16) && (mouseY >= pos.y - 1 && mouseY <= pos.y + 16)) {
                return i;
            }
        }
        return -1;
    }
}
