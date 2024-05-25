package yesseyyessey.yesblock;

import com.google.gson.JsonObject;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ProfileComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;

import java.util.Optional;

public class SkyblockItem {
    public String Name;
    public String Material;
    public String Id;
    public SkyblockTier Tier;
    public String Category;
    public int Durability;
    public boolean Glowing;

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

        if (json.has("durability")) {
            Durability = json.get("durability").getAsInt();
        }
        else {
            Durability = 0;
        }

        if (json.has("glowing")) {
            Glowing = json.get("glowing").getAsBoolean();
        }
        else {
            Glowing = false;
        }

        if (json.has("category")) {
            Category = json.get("category").getAsString();
        }
        else {
            Category = "";
        }

        // Rest is for the itemstack
        _itemStack = new ItemStack(SkyblockMaterial.getMaterialItem(Material, Durability));
        _itemStack.set(DataComponentTypes.RARITY, Rarity.COMMON);
        _itemStack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, Glowing);
        if (json.has("skin"))
        {
            PropertyMap properties = new PropertyMap();
            properties.put("textures", new Property("textures", json.get("skin").getAsString()));
            _itemStack.set(DataComponentTypes.PROFILE, new ProfileComponent(Optional.empty(), Optional.empty(), properties));
        }

        MutableText stackName = Text.empty().append(Text.literal(Name).formatted(Tier.getFormatting()));
        _itemStack.set(DataComponentTypes.ITEM_NAME, stackName);
        // TODO: add other stuffs
    }

    public ItemStack toItemStack() {
        return _itemStack;
    }
}
