package yesseyyessey.yesblock.screens;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;

public class ItemListCraftingScreen extends ItemListScreen {
    private final Identifier TEXTURE = new Identifier("yesblock", "textures/gui/skyblock_crafting.png");
    private final int TEXTURE_WIDTH = 176;
    private final int TEXTURE_HEIGHT = 86;

    @Override
    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
        context.drawTexture(TEXTURE, (width - TEXTURE_WIDTH) / 2, (height - TEXTURE_HEIGHT) / 2, 0, 0, TEXTURE_WIDTH, TEXTURE_HEIGHT);
    }
}
