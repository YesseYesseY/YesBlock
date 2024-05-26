package yesseyyessey.yesblock;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;

public class SkyblockUtils {
    public static String GetAreaLocation() {
        if (MinecraftClient.getInstance().getNetworkHandler() != null) {
            PlayerListEntry areaPlayer = MinecraftClient.getInstance().getNetworkHandler().getPlayerListEntry("!C-b");
            if (areaPlayer != null) {
                if (areaPlayer.getDisplayName() != null)
                {
                    return areaPlayer.getDisplayName().getString();
                }
            }
        }
        return null;
    }
}
