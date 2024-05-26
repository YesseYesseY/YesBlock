package yesseyyessey.yesblock.mixin.client;

import de.johni0702.minecraft.bobby.ChunkSerializer;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.world.chunk.WorldChunk;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import de.johni0702.minecraft.bobby.FakeChunkManager;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import yesseyyessey.yesblock.YesBlockClient;

import java.util.function.Supplier;

import static de.johni0702.minecraft.bobby.ChunkSerializer.fingerprint;

@Mixin(FakeChunkManager.class)
public class BobbyMixin {
    @Unique private static boolean IsOnHypixel = false;

    @Inject(at = @At("RETURN"), method = "getCurrentWorldOrServerName")
    private static void HypixelFix(ClientPlayNetworkHandler networkHandler, CallbackInfoReturnable<String> cir) {
        // TODO: Return different name depending on location, Example: hypixel.net.mainislands, hypixel.net.deepcaverns (deep caverns are positioned differently from every other island)
        IsOnHypixel = networkHandler != null && networkHandler.getServerInfo() != null && !networkHandler.getServerInfo().isRealm() && networkHandler.getServerInfo().address.contains("hypixel.net");
    }

    @Inject(at = @At("HEAD"), method = "save", cancellable = true)
    private void SaveFix(WorldChunk chunk, CallbackInfoReturnable<Supplier<WorldChunk>> cir) {
        if (IsOnHypixel && !YesBlockClient.SaveChunksOnHypixel)
        {
            Pair<WorldChunk, Supplier<WorldChunk>> copy = ChunkSerializer.shallowCopy(chunk);
            fingerprint(copy.getLeft());
            cir.setReturnValue(copy.getRight());
        }
    }
}