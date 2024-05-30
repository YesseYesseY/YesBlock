package yesseyyessey.yesblock.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import yesseyyessey.yesblock.screens.ItemListThing;

@Mixin(HandledScreen.class)
public abstract class HandledScreenMixin extends Screen {
    protected HandledScreenMixin(Text title) {
        super(title);
    }

    @Unique ItemListThing itemList = new ItemListThing();

    @Inject(method = "init", at = @At("TAIL"))
    private void init(CallbackInfo ci) {
        PressableWidget[] widgets = itemList.init(width);
        for (PressableWidget widget : widgets) {
            addDrawableChild(widget);
        }
    }

    @Inject(method = "render", at = @At("TAIL"))
    private void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        itemList.render(context, mouseX, mouseY, delta, width, textRenderer);
    }

    @Inject(method = "mouseClicked", at = @At("TAIL"))
    private void mouseClicked(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
        itemList.mouseClicked(mouseX, mouseY, button);
    }
}
