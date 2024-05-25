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
        if (this == SkyblockTier.COMMON) return Formatting.GRAY;
        if (this == SkyblockTier.UNCOMMON) return Formatting.GREEN;
        return Formatting.WHITE;
    }
}
