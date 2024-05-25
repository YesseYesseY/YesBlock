package yesseyyessey.yesblock;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.lang.reflect.Field;

public class SkyblockMaterial {
    public static Item getMaterialItem(String material, int durability) {
        String thing_to_search = material;
        if (thing_to_search.contains("_WOOD_STAIRS")) thing_to_search = thing_to_search.replace("_WOOD_STAIRS", "_STAIRS");
        if (thing_to_search.contains("_WOOD_SLAB")) thing_to_search = thing_to_search.replace("_WOOD_SLAB", "_SLAB");
        if (thing_to_search.contains("_DOOR_ITEM")) thing_to_search = thing_to_search.replace("_DOOR_ITEM", "_DOOR");
        if (thing_to_search.contains("_SPADE")) thing_to_search = thing_to_search.replace("_SPADE", "_SHOVEL");

        switch (material) {
            case "GOLD_AXE" -> { return Items.GOLDEN_AXE; }
            case "GOLD_SWORD" -> { return Items.GOLDEN_SWORD; }
            case "GOLD_SPADE" -> { return Items.GOLDEN_SHOVEL; }
            case "GOLD_PICKAXE" -> { return Items.GOLDEN_PICKAXE; }
            case "GOLD_HOE" -> { return Items.GOLDEN_HOE; }
            case "WOOD_AXE" -> { return Items.WOODEN_AXE; }
            case "WOOD_SWORD" -> { return Items.WOODEN_SWORD; }
            case "WOOD_SPADE" -> { return Items.WOODEN_SHOVEL; }
            case "WOOD_PICKAXE" -> { return Items.WOODEN_PICKAXE; }
            case "WOOD_HOE" -> { return Items.WOODEN_HOE; }
            case "IRON_PLATE" -> { return Items.HEAVY_WEIGHTED_PRESSURE_PLATE; }
            case "GOLD_PLATE" -> { return Items.LIGHT_WEIGHTED_PRESSURE_PLATE; }
            case "IRON_BARDING" -> { return Items.IRON_HORSE_ARMOR; }
            case "GOLD_BARDING" -> { return Items.GOLDEN_HORSE_ARMOR; }
            case "REDSTONE_COMPARATOR" -> { return Items.COMPARATOR; }
            case "EXP_BOTTLE" -> { return Items.EXPERIENCE_BOTTLE; }
            case "GOLD_HELMET" -> { return Items.GOLDEN_HELMET; }
            case "GOLD_CHESTPLATE" -> { return Items.GOLDEN_CHESTPLATE; }
            case "GOLD_LEGGINGS" -> { return Items.GOLDEN_LEGGINGS; }
            case "GOLD_BOOTS" -> { return Items.GOLDEN_BOOTS; }
            case "CLAY_BRICK" -> { return Items.BRICK; }
            case "REDSTONE_LAMP_OFF" -> { return Items.REDSTONE_LAMP; }
            case "FIREWORK_CHARGE" -> { return Items.FIREWORK_STAR; }
            case "BOOK_AND_QUILL" -> { return Items.WRITABLE_BOOK; }
            case "CARROT_STICK" -> { return Items.CARROT_ON_A_STICK; }
            case "QUARTZ_ORE" -> { return Items.NETHER_QUARTZ_ORE; }
            case "ENDER_STONE" -> { return Items.END_STONE; }
            case "PISTON_STICKY_BASE" -> { return Items.STICKY_PISTON; }
            case "FIREBALL" -> { return Items.FIRE_CHARGE; }
            case "GOLD_RECORD" -> { return Items.MUSIC_DISC_13; }
            case "RECORD_3" -> { return Items.MUSIC_DISC_BLOCKS; }
            case "RECORD_4" -> { return Items.MUSIC_DISC_CHIRP; }
            case "RECORD_5" -> { return Items.MUSIC_DISC_FAR; }
            case "RECORD_6" -> { return Items.MUSIC_DISC_MALL; }
            case "RECORD_7" -> { return Items.MUSIC_DISC_MELLOHI; }
            case "RECORD_8" -> { return Items.MUSIC_DISC_STAL; }
            case "RECORD_9" -> { return Items.MUSIC_DISC_STRAD; }
            case "RECORD_10" -> { return Items.MUSIC_DISC_WARD; }
            case "RECORD_11" -> { return Items.MUSIC_DISC_11; }
            case "RECORD_12" -> { return Items.MUSIC_DISC_WAIT; }
            case "GREEN_RECORD" -> { return Items.MUSIC_DISC_CAT; }
            case "COBBLE_WALL" -> { return Items.COBBLESTONE_WALL; }
            case "CAULDRON_ITEM" -> { return Items.CAULDRON; }
            case "LEASH" -> { return Items.LEAD; }
            case "SIGN" -> { return Items.OAK_SIGN; }
            case "FIREWORK" -> { return Items.FIREWORK_ROCKET; }
            case "HUGE_MUSHROOM_1" -> { return Items.BROWN_MUSHROOM_BLOCK; }
            case "HUGE_MUSHROOM_2" -> { return Items.RED_MUSHROOM_BLOCK; }
            case "MYCEL" -> { return Items.MYCELIUM; }
            case "YELLOW_FLOWER" -> { return Items.DANDELION; }
            case "MUSHROOM_SOUP" -> { return Items.MUSHROOM_STEW; }
            case "EXPLOSIVE_MINECART" -> { return Items.TNT_MINECART; }
            case "STORAGE_MINECART" -> { return Items.CHEST_MINECART; }
            case "POWERED_MINECART" -> { return Items.FURNACE_MINECART; }
            case "HOPPER_MINECART" -> { return Items.HOPPER_MINECART; }
            case "CARROT_ITEM" -> { return Items.CARROT; }
            case "RAW_CHICKEN" -> { return Items.CHICKEN; }
            case "SULPHUR" -> { return Items.GUNPOWDER; }
            case "WOOD_STAIRS" -> { return Items.OAK_STAIRS; }
            case "POTATO_ITEM" -> { return Items.POTATO; }
            case "REDSTONE_TORCH_ON" -> { return Items.REDSTONE_TORCH; }
            case "BED" -> { return Items.RED_BED; } // TODO: Check this
            case "EMPTY_MAP" -> { return Items.MAP; }
            case "GRASS" -> { return Items.GRASS_BLOCK; }
            case "SPECKLED_MELON" -> { return Items.GLISTERING_MELON_SLICE; }
            case "FENCE" -> { return Items.OAK_FENCE; }
            case "IRON_FENCE" -> { return Items.IRON_BARS; }
            case "EYE_OF_ENDER" -> { return Items.ENDER_EYE; }
            case "SNOW_BALL" -> { return Items.SNOWBALL; }
            case "FLOWER_POT_ITEM" -> { return Items.FLOWER_POT; }
            case "FENCE_GATE" -> { return Items.OAK_FENCE_GATE; }
            case "SMOOTH_STAIRS" -> { return Items.STONE_BRICK_STAIRS; }
            case "WATER_LILY" -> { return Items.LILY_PAD; }
            case "BOAT" -> { return Items.OAK_BOAT; }
            case "WEB" -> { return Items.COBWEB; }
            case "WATCH" -> { return Items.CLOCK; }
            case "DIODE" -> { return Items.REPEATER; }
            case "WOOD_DOOR" -> { return Items.OAK_DOOR; }
            case "MELON_BLOCK" -> { return Items.MELON; }
            case "DIAMOND_BARDING" -> { return Items.DIAMOND_HORSE_ARMOR; }
            case "PISTON_BASE" -> { return Items.PISTON; }
            case "PORK" -> { return Items.PORKCHOP; }
            case "GRILLED_PORK" -> { return Items.COOKED_PORKCHOP; }
            case "HARD_CLAY" -> { return Items.TERRACOTTA; }
            case "SEEDS" -> { return Items.WHEAT_SEEDS; }
            case "THIN_GLASS" -> { return Items.GLASS_PANE; }
            case "NETHER_STALK" -> { return Items.NETHER_WART; }
            case "COMMAND" -> { return Items.COMMAND_BLOCK; }
            case "RAW_BEEF" -> { return Items.BEEF; }
            case "RAILS" -> { return Items.RAIL; }
            case "NETHER_FENCE" -> { return Items.NETHER_BRICK_FENCE; }
            case "NETHER_BRICK_ITEM" -> { return Items.NETHER_BRICK; }
            case "BREWING_STAND_ITEM" -> { return Items.BREWING_STAND; }
            case "TRAP_DOOR" -> { return Items.OAK_TRAPDOOR; }
            case "ENCHANTMENT_TABLE" -> { return Items.ENCHANTING_TABLE; }
            case "STONE_PLATE" -> { return Items.STONE_PRESSURE_PLATE; }
            case "WORKBENCH" -> { return Items.CRAFTING_TABLE; }
            case "ENDER_PORTAL_FRAME" -> { return Items.END_PORTAL_FRAME; }
            case "WOOD_PLATE" -> { return Items.OAK_PRESSURE_PLATE; }
            case "WOOD_BUTTON" -> { return Items.OAK_BUTTON; }

            // These depend on durability
            case "DOUBLE_PLANT" -> {
                switch (durability) {
                    case 0 -> { return Items.SUNFLOWER; }
                    case 1 -> { return Items.LILAC; }
                    case 2 -> { return Items.TALL_GRASS; }
                    case 3 -> { return Items.LARGE_FERN; }
                    case 4 -> { return Items.ROSE_BUSH; }
                    case 5 -> { return Items.PEONY; }
                }
            }

            case "STAINED_GLASS_PANE", "WOOL", "STAINED_GLASS", "CARPET", "STAINED_CLAY" -> {
                if (material.equals("STAINED_CLAY")) thing_to_search = "TERRACOTTA";
                switch (durability) {
                    case 0 ->  { thing_to_search = "WHITE_" + thing_to_search; }
                    case 1 ->  { thing_to_search = "ORANGE_" + thing_to_search; }
                    case 2 ->  { thing_to_search = "MAGENTA_" + thing_to_search; }
                    case 3 ->  { thing_to_search = "LIGHT_BLUE_" + thing_to_search; }
                    case 4 ->  { thing_to_search = "YELLOW_" + thing_to_search; }
                    case 5 ->  { thing_to_search = "LIME_" + thing_to_search; }
                    case 6 ->  { thing_to_search = "PINK_" + thing_to_search; }
                    case 7 ->  { thing_to_search = "GRAY_" + thing_to_search; }
                    case 8 ->  { thing_to_search = "LIGHT_GRAY_" + thing_to_search; }
                    case 9 ->  { thing_to_search = "CYAN_" + thing_to_search; }
                    case 10 -> { thing_to_search = "PURPLE_" + thing_to_search; }
                    case 11 -> { thing_to_search = "BLUE_" + thing_to_search; }
                    case 12 -> { thing_to_search = "BROWN_" + thing_to_search; }
                    case 13 -> { thing_to_search = "GREEN_" + thing_to_search; }
                    case 14 -> { thing_to_search = "RED_" + thing_to_search; }
                    case 15 -> { thing_to_search = "BLACK_" + thing_to_search; }
                }
            }
            case "WOOD_STEP", "WOOD", "SAPLING", "LOG", "LEAVES" -> {
                if (material.equals("WOOD_STEP")) thing_to_search = "SLAB";
                if (material.equals("WOOD")) thing_to_search = "PLANKS";
                if (material.equals("LEAVES")) {
                    if (durability == 4 || durability == 5) thing_to_search = "LEAVES_2"; // nice.
                }

                switch (durability) {
                    case 0 -> { thing_to_search = "OAK_" + thing_to_search; }
                    case 1 -> { thing_to_search = "SPRUCE_" + thing_to_search; }
                    case 2 -> { thing_to_search = "BIRCH_" + thing_to_search; }
                    case 3 -> { thing_to_search = "JUNGLE_" + thing_to_search; }
                    case 4 -> { thing_to_search = "ACACIA_" + thing_to_search; }
                    case 5 -> { thing_to_search = "DARK_OAK_" + thing_to_search; }
                }
            }
            case "LOG_2", "LEAVES_2" -> { // nice.
                thing_to_search = thing_to_search.replace("_2", "");
                switch (durability) {
                    case 0 -> { thing_to_search = "ACACIA_" + thing_to_search; }
                    case 1 -> { thing_to_search = "DARK_OAK_" + thing_to_search; }
                }
            }
            case "STONE" -> {
                switch (durability) {
                    case 0 -> { return Items.STONE; }
                    case 1 -> { return Items.GRANITE; }
                    case 2 -> { return Items.POLISHED_GRANITE; }
                    case 3 -> { return Items.DIORITE; }
                    case 4 -> { return Items.POLISHED_DIORITE; }
                    case 5 -> { return Items.ANDESITE; }
                    case 6 -> { return Items.POLISHED_ANDESITE; }
                }
            }
            case "INK_SACK" -> {
                switch (durability) {
                    case 0 -> { return Items.INK_SAC; }
                    case 1 -> { return Items.RED_DYE; }
                    case 2 -> { return Items.GREEN_DYE; }
                    case 3 -> { return Items.COCOA_BEANS; }
                    case 4 -> { return Items.LAPIS_LAZULI; }
                    case 5 -> { return Items.PURPLE_DYE; }
                    case 6 -> { return Items.CYAN_DYE; }
                    case 7 -> { return Items.LIGHT_GRAY_DYE; }
                    case 8 -> { return Items.GRAY_DYE; }
                    case 9 -> { return Items.PINK_DYE; }
                    case 10 -> { return Items.LIME_DYE; }
                    case 11 -> { return Items.YELLOW_DYE; }
                    case 12 -> { return Items.LIGHT_BLUE_DYE; }
                    case 13 -> { return Items.MAGENTA_DYE; }
                    case 14 -> { return Items.ORANGE_DYE; }
                    case 15 -> { return Items.BONE_MEAL; }
                }
            }
            case "RED_ROSE" -> {
                switch (durability) {
                    case 0 -> { return Items.POPPY; }
                    case 1 -> { return Items.BLUE_ORCHID; }
                    case 2 -> { return Items.ALLIUM; }
                    case 3 -> { return Items.AZURE_BLUET; }
                    case 4 -> { return Items.RED_TULIP; }
                    case 5 -> { return Items.ORANGE_TULIP; }
                    case 6 -> { return Items.WHITE_TULIP; }
                    case 7 -> { return Items.PINK_TULIP; }
                    case 8 -> { return Items.OXEYE_DAISY; }
                }
            }
            case "RED_SANDSTONE", "SANDSTONE" -> {
                switch (durability) {
                    case 1 -> { thing_to_search = "CHISELED_" + thing_to_search; }
                    case 2 -> { thing_to_search = "SMOOTH_" + thing_to_search; }
                }
            }
            case "RAW_FISH" -> {
                switch (durability) {
                    case 0 -> { return Items.COD; }
                    case 1 -> { return Items.SALMON; }
                    case 2 -> { return Items.TROPICAL_FISH; }
                    case 3 -> { return Items.PUFFERFISH; }
                }
            }
            case "LONG_GRASS" -> {
                switch (durability) {
                    case 1 -> { return Items.SHORT_GRASS; }
                    case 2 -> { return Items.FERN; }
                }
            }
            case "PRISMARINE" -> {
                switch (durability) {
                    case 0 -> { return Items.PRISMARINE; }
                    case 1 -> { return Items.PRISMARINE_BRICKS; }
                    case 2 -> { return Items.DARK_PRISMARINE; }
                }
            }
            case "BANNER" -> {
                switch (durability) {
                    case 0 -> { return Items.BLACK_BANNER; }
                    case 1 -> { return Items.RED_BANNER; }
                    case 2 -> { return Items.GREEN_BANNER; }
                    case 3 -> { return Items.BROWN_BANNER; }
                    case 4 -> { return Items.BLUE_BANNER; }
                    case 5 -> { return Items.PURPLE_BANNER; }
                    case 6 -> { return Items.CYAN_BANNER; }
                    case 7 -> { return Items.LIGHT_GRAY_BANNER; }
                    case 8 -> { return Items.GRAY_BANNER; }
                    case 9 -> { return Items.PINK_BANNER; }
                    case 10 -> { return Items.LIME_BANNER; }
                    case 11 -> { return Items.YELLOW_BANNER; }
                    case 12 -> { return Items.LIGHT_BLUE_BANNER; }
                    case 13 -> { return Items.MAGENTA_BANNER; }
                    case 14 -> { return Items.ORANGE_BANNER; }
                    case 15 -> { return Items.WHITE_BANNER; }
                }
            }
            case "SMOOTH_BRICK" -> {
                switch (durability) {
                    case 0 -> { return Items.STONE_BRICKS; }
                    case 1 -> { return Items.MOSSY_STONE_BRICKS; }
                    case 2 -> { return Items.CRACKED_STONE_BRICKS; }
                    case 3 -> { return Items.CHISELED_STONE_BRICKS; }
                }
            }
            case "DIRT" -> {
                switch (durability) {
                    case 0 -> { return Items.DIRT; }
                    case 1 -> { return Items.COARSE_DIRT; }
                    case 2 -> { return Items.PODZOL; }
                }
            }
            case "SKULL_ITEM" -> {
                switch (durability) {
                    case 0 -> { return Items.SKELETON_SKULL; }
                    case 1 -> { return Items.WITHER_SKELETON_SKULL; }
                    case 2 -> { return Items.ZOMBIE_HEAD; }
                    case 3 -> {
                        // TODO: Fix player skins
                        return Items.PLAYER_HEAD;
                    }
                    case 4 -> { return Items.CREEPER_HEAD; }

                }
            }
            case "STEP" -> {
                switch (durability) {
                    case 0 -> { return Items.SMOOTH_STONE_SLAB; }
                    case 1 -> { return Items.SANDSTONE_SLAB; }

                    case 3 -> { return Items.COBBLESTONE_SLAB; }
                    case 4 -> { return Items.BRICK_SLAB; }
                    case 5 -> { return Items.STONE_BRICK_SLAB; }
                    case 6 -> { return Items.NETHER_BRICK_SLAB; }
                    case 7 -> { return Items.QUARTZ_SLAB; }
                }
            }
            case "COOKED_FISH" -> {
                switch (durability) {
                    case 0 -> { return Items.COOKED_COD; }
                    case 1 -> { return Items.COOKED_SALMON; }
                }
            }

            case "MONSTER_EGG" -> {
                return Items.GHAST_SPAWN_EGG; // TODO: Add styles, Example: durability 120 on INFLATABLE_JERRY
            }
        }

        try {
            Field field = Items.class.getDeclaredField(thing_to_search);
            return (Item) field.get(null);
        }
        catch (Exception e)
        {
            return Items.BARRIER;
        }
    }
}
