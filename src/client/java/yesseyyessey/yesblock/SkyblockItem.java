package yesseyyessey.yesblock;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.DyedColorComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.ProfileComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SkyblockItem {
    public String Name;
    public String Material;
    public String Id;
    public SkyblockTier Tier;
    public String Category;
    public int Durability;
    public boolean Glowing;

    private final ItemStack _itemStack;

    private String GetOrDefault(JsonObject json, String key, String Default) {
        if (json.has(key)) {
            return json.get(key).getAsString();
        }
        return Default;
    }

    private int GetOrDefault(JsonObject json, String key, int Default) {
        if (json.has(key)) {
            return json.get(key).getAsInt();
        }
        return Default;
    }

    private boolean GetOrDefault(JsonObject json, String key, boolean Default) {
        if (json.has(key)) {
            return json.get(key).getAsBoolean();
        }
        return Default;
    }

    private final Style NoItalic = Style.EMPTY.withItalic(false);

    private Text CreateStatText(String statName, String statValue, Formatting valueColor, String end ) {
        return Text.empty().setStyle(NoItalic).append(Text.literal(statName + ": ").formatted(Formatting.GRAY).append(Text.literal("+" + statValue + end).formatted(valueColor)));
    }

    private Text CreateStatText(String statName, String statValue, Formatting valueColor) {
        return CreateStatText(statName, statValue, valueColor, "");
    }

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

        Durability = GetOrDefault(json, "durability", 0);
        Glowing = GetOrDefault(json, "glowing", false);
        Category = GetOrDefault(json, "category", "");

        // Rest is for the itemstack
        _itemStack = new ItemStack(SkyblockMaterial.getMaterialItem(Material, Durability));
        _itemStack.set(DataComponentTypes.RARITY, Rarity.COMMON);
        _itemStack.set(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, Glowing);
        _itemStack.set(DataComponentTypes.ATTRIBUTE_MODIFIERS, new AttributeModifiersComponent(new ArrayList<>(), false));
        if (json.has("skin"))
        {
            PropertyMap properties = new PropertyMap();
            properties.put("textures", new Property("textures", json.get("skin").getAsString()));
            _itemStack.set(DataComponentTypes.PROFILE, new ProfileComponent(Optional.empty(), Optional.empty(), properties));
        }

        if (json.has("color")) {
            String color_raw = json.get("color").getAsString(); // 255,255,255
            String[] values = color_raw.split(",");
            int color = (Integer.parseInt(values[0]) << 16) | (Integer.parseInt(values[1]) << 8) | Integer.parseInt(values[2]);

            _itemStack.set(DataComponentTypes.DYED_COLOR, new DyedColorComponent(color, false));
        }

        MutableText stackName = Text.empty().append(Text.literal(Name).formatted(Tier.formatting));
        _itemStack.set(DataComponentTypes.ITEM_NAME, stackName);
        // TODO: add other stuffs
        ArrayList<Text> lore = new ArrayList<>();

        if (json.has("stats")) {
            JsonObject stats = json.get("stats").getAsJsonObject();
            Map<String, String> finalStats = new HashMap<>();
            stats.asMap().forEach((s, jsonElement) -> {
                finalStats.put(s.toLowerCase(), jsonElement.getAsString());
            });
            if (finalStats.containsKey("breaking_power")) {
                lore.add(Text.empty().setStyle(NoItalic).append(Text.literal("Breaking Power " + finalStats.get("breaking_power")).formatted(Formatting.DARK_GRAY)));
                lore.add(Text.empty().setStyle(NoItalic));
            }
            if (finalStats.containsKey("damage")) {
                lore.add(CreateStatText("Damage", finalStats.get("damage"), Formatting.RED));
            }
            if (finalStats.containsKey("strength")) {
                lore.add(CreateStatText("Strength", finalStats.get("strength"), Formatting.RED));
            }
            if (finalStats.containsKey("sea_creature_chance")) {
                lore.add(CreateStatText("Sea Creature Chance", finalStats.get("sea_creature_chance"), Formatting.RED, "%"));
            }
            if (finalStats.containsKey("fishing_speed")) {
                lore.add(CreateStatText("Fishing Speed", finalStats.get("fishing_speed"), Formatting.GREEN));
            }
            if (finalStats.containsKey("mining_speed")) {
                lore.add(CreateStatText("Mining Speed", finalStats.get("mining_speed"), Formatting.GREEN));
            }
            lore.add(Text.empty().setStyle(NoItalic));
        }

        MutableText footer = Text.literal(Tier.name());
        if (!Category.isEmpty()) {
            footer.append(" " + Category.replace('_', ' '));
        }
        lore.add(footer.setStyle(NoItalic).formatted(Formatting.BOLD).formatted(Tier.formatting));
        _itemStack.set(DataComponentTypes.LORE, new LoreComponent(lore));
    }

    public ItemStack toItemStack() {
        return _itemStack;
    }
}
