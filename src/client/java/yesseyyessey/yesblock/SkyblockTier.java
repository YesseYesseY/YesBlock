package yesseyyessey.yesblock;

import net.minecraft.util.Formatting;

public enum SkyblockTier {
    COMMON(Formatting.WHITE),
    UNCOMMON(Formatting.GREEN),
    RARE(Formatting.BLUE),
    EPIC(Formatting.DARK_PURPLE),
    LEGENDARY(Formatting.GOLD),
    MYTHIC(Formatting.LIGHT_PURPLE),
    DIVINE(Formatting.AQUA),
    SPECIAL(Formatting.RED),
    VERY_SPECIAL(Formatting.RED),
    UNOBTAINABLE(Formatting.BLACK);

    public final Formatting formatting;

    SkyblockTier(Formatting formatting) {
        this.formatting = formatting;
    }
}
