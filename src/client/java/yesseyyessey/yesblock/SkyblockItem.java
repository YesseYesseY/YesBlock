package yesseyyessey.yesblock;

import com.google.gson.JsonObject;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

public class SkyblockItem {
    public String Name;
    public String Material;
    public String Id;
    public SkyblockTier Tier;

    private ItemStack _itemStack;

    public SkyblockItem(JsonObject json) {
        Name = json.get("name").getAsString();
        Material = json.get("material").getAsString();
        Id = json.get("id").getAsString();

        if (json.has("tier")) {
            try {
                Tier = SkyblockTier.valueOf(json.get("tier").getAsString().toUpperCase());
            }
            catch (Exception e) {
                YesBlock.LOGGER.info("Invalid Tier " + json.get("tier").getAsString().toUpperCase());
                Tier = SkyblockTier.COMMON;
            }
        }
        else {
            Tier = SkyblockTier.COMMON;
        }

        // Rest is for the itemstack
        _itemStack = new ItemStack(getMaterialItem());
        _itemStack.set(DataComponentTypes.RARITY, Rarity.COMMON);

        MutableText stackName = Text.empty().append(Text.literal(Name).formatted(Tier.getFormatting()));
        _itemStack.set(DataComponentTypes.ITEM_NAME, stackName);
        // TODO: add other stuffs
    }

    private Item getMaterialItem() {
        return Items.BARRIER; // Temp
    }

    public ItemStack toItemStack() {
        return _itemStack;
    }
}
