package yesseyyessey.yesblock;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;

public class SkyblockUtils {
    public static String GetAreaString() {
        if (MinecraftClient.getInstance().getNetworkHandler() != null) {
            PlayerListEntry areaPlayer = MinecraftClient.getInstance().getNetworkHandler().getPlayerListEntry("!C-b");
            if (areaPlayer != null && areaPlayer.getDisplayName() != null) {
                String name = areaPlayer.getDisplayName().getString();
                if (name.startsWith("Area: ")) {
                    return name.substring("Area: ".length());
                }
            }
        }
        return null;
    }

    public static SkyblockLocation GetSkyblockLocation() {
        String area = GetAreaString();
        if (area == null) { return null; }
        switch (area) {
            case "Hub" -> { return SkyblockLocation.Hub; }
            case "The Farming Islands" -> { return SkyblockLocation.TheFarmingIslands; }
            case "The Park" -> { return SkyblockLocation.ThePark; }
            case "Spider's Den" -> { return SkyblockLocation.SpidersDen; }
            case "Crimson Isle" -> { return SkyblockLocation.CrimsonIsle; } // I can't check if this is correct cus I'm not combat 22 lol
            case "The End" -> { return SkyblockLocation.TheEnd; }
            case "Gold Mine" -> { return SkyblockLocation.GoldMine; }
            case "Deep Caverns" -> { return SkyblockLocation.DeepCaverns; }
            case "Dwarven Mines" -> { return SkyblockLocation.DwarvenMines; }
            case "Private Island" -> { return SkyblockLocation.PrivateIsland; }
            default -> { return SkyblockLocation.Other; }
        }
    }
}
