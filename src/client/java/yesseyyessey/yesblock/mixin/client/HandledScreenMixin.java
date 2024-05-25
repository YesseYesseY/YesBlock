package yesseyyessey.yesblock.mixin.client;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import yesseyyessey.yesblock.SkyblockItem;
import yesseyyessey.yesblock.YesBlockClient;

@Mixin(HandledScreen.class)
public class HandledScreenMixin extends Screen {
    protected HandledScreenMixin(Text title) {
        super(title);
    }

    @Unique private final int ItemListHeight = 20;
    @Unique private final int ItemListWidth = 8;
    @Unique private final int ItemListTotalSize = ItemListHeight * ItemListWidth;

    @Inject(method = "init", at = @At("TAIL"))
    private void init(CallbackInfo ci) {
        ButtonWidget prevButton = ButtonWidget.builder(Text.literal("Prev Page"), button -> {
            if (YesBlockClient.CurrentItemPage > 0) {
                YesBlockClient.CurrentItemPage--;
            }
        }).width((ItemListWidth * 16) / 2).build();
        prevButton.setY(ItemListHeight*16);

        ButtonWidget nextButton = ButtonWidget.builder(Text.literal("Next Page"), button -> {
            if (YesBlockClient.CurrentItemPage < YesBlockClient.SBItems.size() / ItemListTotalSize) {
                YesBlockClient.CurrentItemPage++;
            }
        }).width((ItemListWidth * 16) / 2).build();
        nextButton.setY(ItemListHeight*16);
        nextButton.setX((ItemListWidth * 16) / 2);

        addDrawableChild(prevButton);
        addDrawableChild(nextButton);
    }

    @Inject(method = "render", at = @At("TAIL"))
    private void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        context.drawText(this.textRenderer, Text.literal("Page: " + YesBlockClient.CurrentItemPage), ItemListWidth * 16, 1, 0xFFFFFFFF, true);

        for (int i = 0; i < YesBlockClient.SBItems.size() && i < ItemListTotalSize; i++) {
            int index = i + (YesBlockClient.CurrentItemPage * ItemListTotalSize);
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
        int z = x + (y * ItemListWidth) + (YesBlockClient.CurrentItemPage * ItemListTotalSize);

        if (z < YesBlockClient.SBItems.size()) {
            return YesBlockClient.SBItems.get(z);
        }

        return null;
    }
}
