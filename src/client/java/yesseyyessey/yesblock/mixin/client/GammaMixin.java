package yesseyyessey.yesblock.mixin.client;

import net.minecraft.client.option.SimpleOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(SimpleOption.DoubleSliderCallbacks.class)
public class GammaMixin {
    @Inject(at = @At("RETURN"), method = "validate(Ljava/lang/Double;)Ljava/util/Optional;", cancellable = true)
    public void GammaFix(Double double_, CallbackInfoReturnable<Optional<Double>> cir) {
        cir.setReturnValue(Optional.of(double_));
    }
}
