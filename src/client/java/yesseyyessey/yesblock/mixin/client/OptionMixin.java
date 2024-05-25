package yesseyyessey.yesblock.mixin.client;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.GridWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import yesseyyessey.yesblock.screens.TestScreen;

import java.util.function.Supplier;

@Mixin(GameMenuScreen.class)
public abstract class OptionMixin {
    @Shadow protected abstract ButtonWidget createButton(Text text, Supplier<Screen> screenSupplier);

    @Inject(method = "initWidgets", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/widget/GridWidget;refreshPositions()V"))
    private void onInitWidgets(CallbackInfo ci, @Local GridWidget.Adder adder) {
        adder.add(createButton(Text.literal("Skyblock Items"), TestScreen::new));
    }
}
