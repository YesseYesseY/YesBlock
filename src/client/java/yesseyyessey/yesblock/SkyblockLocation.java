package yesseyyessey.yesblock;

public enum SkyblockLocation {
    Hub(true),
    TheFarmingIslands(true),
    ThePark(true),
    SpidersDen(true),
    CrimsonIsle(true),
    TheEnd(true),
    GoldMine(true),
    DeepCaverns, // Deep caverns have is NOT a main island, it's positioned differently from other main islands which messes up bobby
    DwarvenMines,
    PrivateIsland,
    Other;

    public final boolean IsMainIsland;

    SkyblockLocation(boolean isMainIsland) {
        IsMainIsland = isMainIsland;
    }

    SkyblockLocation() {
        IsMainIsland = false;
    }
}
