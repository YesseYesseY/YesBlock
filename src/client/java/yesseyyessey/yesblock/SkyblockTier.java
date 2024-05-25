package yesseyyessey.yesblock;

import net.minecraft.util.Formatting;

public enum SkyblockTier {
    COMMON,
    UNCOMMON,
    RARE,
    EPIC,
    LEGENDARY,
    MYTHIC,
    SPECIAL,
    VERY_SPECIAL,
    UNOBTAINABLE;

    public Formatting getFormatting() {
        if (this == SkyblockTier.COMMON) return Formatting.WHITE;
        if (this == SkyblockTier.UNCOMMON) return Formatting.GREEN;
        if (this == SkyblockTier.RARE) return Formatting.BLUE;
        if (this == SkyblockTier.EPIC) return Formatting.DARK_PURPLE;
        if (this == SkyblockTier.LEGENDARY) return Formatting.GOLD;
        return Formatting.WHITE;
    }
}
