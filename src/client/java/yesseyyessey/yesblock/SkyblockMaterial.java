package yesseyyessey.yesblock;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

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

        // no mappings on live version !! :D
        switch (thing_to_search) {
            case "DIAMOND_SWORD" -> { return Items.DIAMOND_SWORD; }
            case "DIAMOND_HELMET" -> { return Items.DIAMOND_HELMET; }
            case "IRON_SWORD" -> { return Items.IRON_SWORD; }
            case "LEATHER_BOOTS" -> { return Items.LEATHER_BOOTS; }
            case "LEATHER_CHESTPLATE" -> { return Items.LEATHER_CHESTPLATE; }
            case "COMPASS" -> { return Items.COMPASS; }
            case "LEATHER_LEGGINGS" -> { return Items.LEATHER_LEGGINGS; }
            case "STICK" -> { return Items.STICK; }
            case "DIAMOND_AXE" -> { return Items.DIAMOND_AXE; }
            case "NAME_TAG" -> { return Items.NAME_TAG; }
            case "STONE_HOE" -> { return Items.STONE_HOE; }
            case "DIAMOND_HOE" -> { return Items.DIAMOND_HOE; }
            case "IRON_HOE" -> { return Items.IRON_HOE; }
            case "FEATHER" -> { return Items.FEATHER; }
            case "BOOK" -> { return Items.BOOK; }
            case "ICE" -> { return Items.ICE; }
            case "DIAMOND_CHESTPLATE" -> { return Items.DIAMOND_CHESTPLATE; }
            case "DIAMOND_BOOTS" -> { return Items.DIAMOND_BOOTS; }
            case "DIAMOND_LEGGINGS" -> { return Items.DIAMOND_LEGGINGS; }
            case "FISHING_ROD" -> { return Items.FISHING_ROD; }
            case "LADDER" -> { return Items.LADDER; }
            case "PACKED_ICE" -> { return Items.PACKED_ICE; }
            case "CLAY_BALL" -> { return Items.CLAY_BALL; }
            case "BLACK_STAINED_GLASS" -> { return Items.BLACK_STAINED_GLASS; }
            case "DEAD_BUSH" -> { return Items.DEAD_BUSH; }
            case "BLACK_WOOL" -> { return Items.BLACK_WOOL; }
            case "LEATHER_HELMET" -> { return Items.LEATHER_HELMET; }
            case "RABBIT_STEW" -> { return Items.RABBIT_STEW; }
            case "BLAZE_ROD" -> { return Items.BLAZE_ROD; }
            case "FLINT" -> { return Items.FLINT; }
            case "NETHER_STAR" -> { return Items.NETHER_STAR; }
            case "CHEST" -> { return Items.CHEST; }
            case "GOLDEN_CARROT" -> { return Items.GOLDEN_CARROT; }
            case "ANVIL" -> { return Items.ANVIL; }
            case "GHAST_TEAR" -> { return Items.GHAST_TEAR; }
            case "PRISMARINE_SHARD" -> { return Items.PRISMARINE_SHARD; }
            case "PAPER" -> { return Items.PAPER; }
            case "COAL_BLOCK" -> { return Items.COAL_BLOCK; }
            case "CHAINMAIL_BOOTS" -> { return Items.CHAINMAIL_BOOTS; }
            case "HAY_BLOCK" -> { return Items.HAY_BLOCK; }
            case "IRON_INGOT" -> { return Items.IRON_INGOT; }
            case "PRISMARINE_CRYSTALS" -> { return Items.PRISMARINE_CRYSTALS; }
            case "FERMENTED_SPIDER_EYE" -> { return Items.FERMENTED_SPIDER_EYE; }
            case "LAVA_BUCKET" -> { return Items.LAVA_BUCKET; }
            case "EMERALD_BLOCK" -> { return Items.EMERALD_BLOCK; }
            case "NETHERRACK" -> { return Items.NETHERRACK; }
            case "BLUE_CARPET" -> { return Items.BLUE_CARPET; }
            case "IRON_AXE" -> { return Items.IRON_AXE; }
            case "ORANGE_CARPET" -> { return Items.ORANGE_CARPET; }
            case "ACACIA_LOG" -> { return Items.ACACIA_LOG; }
            case "BOW" -> { return Items.BOW; }
            case "BIRCH_LOG" -> { return Items.BIRCH_LOG; }
            case "SPRUCE_STAIRS" -> { return Items.SPRUCE_STAIRS; }
            case "CYAN_CARPET" -> { return Items.CYAN_CARPET; }
            case "ACACIA_LEAVES" -> { return Items.ACACIA_LEAVES; }
            case "WHITE_STAINED_GLASS" -> { return Items.WHITE_STAINED_GLASS; }
            case "OBSIDIAN" -> { return Items.OBSIDIAN; }
            case "CHAINMAIL_CHESTPLATE" -> { return Items.CHAINMAIL_CHESTPLATE; }
            case "DIAMOND" -> { return Items.DIAMOND; }
            case "SPRUCE_LEAVES" -> { return Items.SPRUCE_LEAVES; }
            case "RABBIT_HIDE" -> { return Items.RABBIT_HIDE; }
            case "REDSTONE_BLOCK" -> { return Items.REDSTONE_BLOCK; }
            case "TORCH" -> { return Items.TORCH; }
            case "WHEAT" -> { return Items.WHEAT; }
            case "ROTTEN_FLESH" -> { return Items.ROTTEN_FLESH; }
            case "CHAINMAIL_HELMET" -> { return Items.CHAINMAIL_HELMET; }
            case "IRON_HELMET" -> { return Items.IRON_HELMET; }
            case "RED_MUSHROOM" -> { return Items.RED_MUSHROOM; }
            case "BLACK_STAINED_GLASS_PANE" -> { return Items.BLACK_STAINED_GLASS_PANE; }
            case "RED_TERRACOTTA" -> { return Items.RED_TERRACOTTA; }
            case "ARROW" -> { return Items.ARROW; }
            case "BEACON" -> { return Items.BEACON; }
            case "MAGMA_CREAM" -> { return Items.MAGMA_CREAM; }
            case "DIAMOND_BLOCK" -> { return Items.DIAMOND_BLOCK; }
            case "LEVER" -> { return Items.LEVER; }
            case "SAND" -> { return Items.SAND; }
            case "CHISELED_RED_SANDSTONE" -> { return Items.CHISELED_RED_SANDSTONE; }
            case "LIGHT_GRAY_CARPET" -> { return Items.LIGHT_GRAY_CARPET; }
            case "PINK_WOOL" -> { return Items.PINK_WOOL; }
            case "BIRCH_FENCE" -> { return Items.BIRCH_FENCE; }
            case "TNT" -> { return Items.TNT; }
            case "BONE" -> { return Items.BONE; }
            case "SPRUCE_FENCE_GATE" -> { return Items.SPRUCE_FENCE_GATE; }
            case "BREAD" -> { return Items.BREAD; }
            case "YELLOW_WOOL" -> { return Items.YELLOW_WOOL; }
            case "GLASS" -> { return Items.GLASS; }
            case "NETHER_BRICK" -> { return Items.NETHER_BRICK; }
            case "RED_STAINED_GLASS" -> { return Items.RED_STAINED_GLASS; }
            case "BEDROCK" -> { return Items.BEDROCK; }
            case "GOLD_BLOCK" -> { return Items.GOLD_BLOCK; }
            case "MELON" -> { return Items.MELON; }
            case "GREEN_STAINED_GLASS_PANE" -> { return Items.GREEN_STAINED_GLASS_PANE; }
            case "GOLD_INGOT" -> { return Items.GOLD_INGOT; }
            case "STONE_AXE" -> { return Items.STONE_AXE; }
            case "GRAVEL" -> { return Items.GRAVEL; }
            case "PURPLE_WOOL" -> { return Items.PURPLE_WOOL; }
            case "COOKED_MUTTON" -> { return Items.COOKED_MUTTON; }
            case "SHEARS" -> { return Items.SHEARS; }
            case "ACTIVATOR_RAIL" -> { return Items.ACTIVATOR_RAIL; }
            case "GOLDEN_APPLE" -> { return Items.GOLDEN_APPLE; }
            case "DISPENSER" -> { return Items.DISPENSER; }
            case "PURPLE_STAINED_GLASS" -> { return Items.PURPLE_STAINED_GLASS; }
            case "PUMPKIN_SEEDS" -> { return Items.PUMPKIN_SEEDS; }
            case "BAKED_POTATO" -> { return Items.BAKED_POTATO; }
            case "SPONGE" -> { return Items.SPONGE; }
            case "STONE_SWORD" -> { return Items.STONE_SWORD; }
            case "YELLOW_STAINED_GLASS_PANE" -> { return Items.YELLOW_STAINED_GLASS_PANE; }
            case "PUMPKIN" -> { return Items.PUMPKIN; }
            case "NETHER_BRICK_STAIRS" -> { return Items.NETHER_BRICK_STAIRS; }
            case "ENDER_CHEST" -> { return Items.ENDER_CHEST; }
            case "EGG" -> { return Items.EGG; }
            case "RABBIT" -> { return Items.RABBIT; }
            case "STRING" -> { return Items.STRING; }
            case "ENDER_PEARL" -> { return Items.ENDER_PEARL; }
            case "COBBLESTONE" -> { return Items.COBBLESTONE; }
            case "BROWN_STAINED_GLASS_PANE" -> { return Items.BROWN_STAINED_GLASS_PANE; }
            case "DARK_OAK_FENCE" -> { return Items.DARK_OAK_FENCE; }
            case "GRAY_CARPET" -> { return Items.GRAY_CARPET; }
            case "BIRCH_SAPLING" -> { return Items.BIRCH_SAPLING; }
            case "CACTUS" -> { return Items.CACTUS; }
            case "ACACIA_PLANKS" -> { return Items.ACACIA_PLANKS; }
            case "LIGHT_BLUE_STAINED_GLASS" -> { return Items.LIGHT_BLUE_STAINED_GLASS; }
            case "COAL" -> { return Items.COAL; }
            case "SPRUCE_FENCE" -> { return Items.SPRUCE_FENCE; }
            case "GREEN_CARPET" -> { return Items.GREEN_CARPET; }
            case "BLACK_CARPET" -> { return Items.BLACK_CARPET; }
            case "FURNACE" -> { return Items.FURNACE; }
            case "SPRUCE_DOOR" -> { return Items.SPRUCE_DOOR; }
            case "LIGHT_GRAY_STAINED_GLASS" -> { return Items.LIGHT_GRAY_STAINED_GLASS; }
            case "CYAN_TERRACOTTA" -> { return Items.CYAN_TERRACOTTA; }
            case "GOLD_NUGGET" -> { return Items.GOLD_NUGGET; }
            case "WATER_BUCKET" -> { return Items.WATER_BUCKET; }
            case "LEATHER" -> { return Items.LEATHER; }
            case "LIGHT_BLUE_WOOL" -> { return Items.LIGHT_BLUE_WOOL; }
            case "BLUE_STAINED_GLASS" -> { return Items.BLUE_STAINED_GLASS; }
            case "MINECART" -> { return Items.MINECART; }
            case "QUARTZ_STAIRS" -> { return Items.QUARTZ_STAIRS; }
            case "CHAINMAIL_LEGGINGS" -> { return Items.CHAINMAIL_LEGGINGS; }
            case "LAPIS_BLOCK" -> { return Items.LAPIS_BLOCK; }
            case "BROWN_MUSHROOM" -> { return Items.BROWN_MUSHROOM; }
            case "CARROT" -> { return Items.CARROT; }
            case "COOKIE" -> { return Items.COOKIE; }
            case "JUNGLE_DOOR" -> { return Items.JUNGLE_DOOR; }
            case "STONE_SHOVEL" -> { return Items.STONE_SHOVEL; }
            case "GLOWSTONE_DUST" -> { return Items.GLOWSTONE_DUST; }
            case "MAGENTA_STAINED_GLASS_PANE" -> { return Items.MAGENTA_STAINED_GLASS_PANE; }
            case "BROWN_STAINED_GLASS" -> { return Items.BROWN_STAINED_GLASS; }
            case "LIME_STAINED_GLASS" -> { return Items.LIME_STAINED_GLASS; }
            case "DARK_OAK_DOOR" -> { return Items.DARK_OAK_DOOR; }
            case "BOOKSHELF" -> { return Items.BOOKSHELF; }
            case "RABBIT_FOOT" -> { return Items.RABBIT_FOOT; }
            case "CAKE" -> { return Items.CAKE; }
            case "BIRCH_STAIRS" -> { return Items.BIRCH_STAIRS; }
            case "SPRUCE_LOG" -> { return Items.SPRUCE_LOG; }
            case "IRON_SHOVEL" -> { return Items.IRON_SHOVEL; }
            case "IRON_PICKAXE" -> { return Items.IRON_PICKAXE; }
            case "DROPPER" -> { return Items.DROPPER; }
            case "DAYLIGHT_DETECTOR" -> { return Items.DAYLIGHT_DETECTOR; }
            case "POISONOUS_POTATO" -> { return Items.POISONOUS_POTATO; }
            case "IRON_BLOCK" -> { return Items.IRON_BLOCK; }
            case "PINK_STAINED_GLASS_PANE" -> { return Items.PINK_STAINED_GLASS_PANE; }
            case "PUMPKIN_PIE" -> { return Items.PUMPKIN_PIE; }
            case "GRAY_TERRACOTTA" -> { return Items.GRAY_TERRACOTTA; }
            case "DARK_OAK_LOG" -> { return Items.DARK_OAK_LOG; }
            case "ACACIA_FENCE" -> { return Items.ACACIA_FENCE; }
            case "COBBLESTONE_STAIRS" -> { return Items.COBBLESTONE_STAIRS; }
            case "ORANGE_STAINED_GLASS" -> { return Items.ORANGE_STAINED_GLASS; }
            case "IRON_LEGGINGS" -> { return Items.IRON_LEGGINGS; }
            case "GRAY_STAINED_GLASS" -> { return Items.GRAY_STAINED_GLASS; }
            case "SPIDER_EYE" -> { return Items.SPIDER_EYE; }
            case "DARK_OAK_PLANKS" -> { return Items.DARK_OAK_PLANKS; }
            case "SPRUCE_PLANKS" -> { return Items.SPRUCE_PLANKS; }
            case "GOLD_ORE" -> { return Items.GOLD_ORE; }
            case "QUARTZ" -> { return Items.QUARTZ; }
            case "JUNGLE_PLANKS" -> { return Items.JUNGLE_PLANKS; }
            case "OAK_LOG" -> { return Items.OAK_LOG; }
            case "STONE_BUTTON" -> { return Items.STONE_BUTTON; }
            case "COAL_ORE" -> { return Items.COAL_ORE; }
            case "SMOOTH_RED_SANDSTONE" -> { return Items.SMOOTH_RED_SANDSTONE; }
            case "JACK_O_LANTERN" -> { return Items.JACK_O_LANTERN; }
            case "ITEM_FRAME" -> { return Items.ITEM_FRAME; }
            case "HOPPER" -> { return Items.HOPPER; }
            case "WHITE_STAINED_GLASS_PANE" -> { return Items.WHITE_STAINED_GLASS_PANE; }
            case "QUARTZ_BLOCK" -> { return Items.QUARTZ_BLOCK; }
            case "BIRCH_DOOR" -> { return Items.BIRCH_DOOR; }
            case "LAPIS_ORE" -> { return Items.LAPIS_ORE; }
            case "SNOW_BLOCK" -> { return Items.SNOW_BLOCK; }
            case "LIME_STAINED_GLASS_PANE" -> { return Items.LIME_STAINED_GLASS_PANE; }
            case "SUGAR" -> { return Items.SUGAR; }
            case "BIRCH_PLANKS" -> { return Items.BIRCH_PLANKS; }
            case "VINE" -> { return Items.VINE; }
            case "LIGHT_GRAY_WOOL" -> { return Items.LIGHT_GRAY_WOOL; }
            case "JUNGLE_SLAB" -> { return Items.JUNGLE_SLAB; }
            case "REDSTONE" -> { return Items.REDSTONE; }
            case "RED_STAINED_GLASS_PANE" -> { return Items.RED_STAINED_GLASS_PANE; }
            case "OAK_LEAVES" -> { return Items.OAK_LEAVES; }
            case "GREEN_STAINED_GLASS" -> { return Items.GREEN_STAINED_GLASS; }
            case "CHISELED_SANDSTONE" -> { return Items.CHISELED_SANDSTONE; }
            case "YELLOW_TERRACOTTA" -> { return Items.YELLOW_TERRACOTTA; }
            case "SLIME_BLOCK" -> { return Items.SLIME_BLOCK; }
            case "BLAZE_POWDER" -> { return Items.BLAZE_POWDER; }
            case "BRICK_STAIRS" -> { return Items.BRICK_STAIRS; }
            case "JUKEBOX" -> { return Items.JUKEBOX; }
            case "DIAMOND_ORE" -> { return Items.DIAMOND_ORE; }
            case "BROWN_CARPET" -> { return Items.BROWN_CARPET; }
            case "OAK_SLAB" -> { return Items.OAK_SLAB; }
            case "IRON_CHESTPLATE" -> { return Items.IRON_CHESTPLATE; }
            case "GRAY_WOOL" -> { return Items.GRAY_WOOL; }
            case "PURPLE_TERRACOTTA" -> { return Items.PURPLE_TERRACOTTA; }
            case "SPRUCE_SAPLING" -> { return Items.SPRUCE_SAPLING; }
            case "POWERED_RAIL" -> { return Items.POWERED_RAIL; }
            case "PURPLE_STAINED_GLASS_PANE" -> { return Items.PURPLE_STAINED_GLASS_PANE; }
            case "WHITE_TERRACOTTA" -> { return Items.WHITE_TERRACOTTA; }
            case "STONE_PICKAXE" -> { return Items.STONE_PICKAXE; }
            case "NOTE_BLOCK" -> { return Items.NOTE_BLOCK; }
            case "IRON_TRAPDOOR" -> { return Items.IRON_TRAPDOOR; }
            case "CLAY" -> { return Items.CLAY; }
            case "LIGHT_BLUE_CARPET" -> { return Items.LIGHT_BLUE_CARPET; }
            case "LIGHT_GRAY_TERRACOTTA" -> { return Items.LIGHT_GRAY_TERRACOTTA; }
            case "MILK_BUCKET" -> { return Items.MILK_BUCKET; }
            case "BLACK_TERRACOTTA" -> { return Items.BLACK_TERRACOTTA; }
            case "PURPLE_CARPET" -> { return Items.PURPLE_CARPET; }
            case "ACACIA_SLAB" -> { return Items.ACACIA_SLAB; }
            case "IRON_BOOTS" -> { return Items.IRON_BOOTS; }
            case "BIRCH_LEAVES" -> { return Items.BIRCH_LEAVES; }
            case "OAK_SAPLING" -> { return Items.OAK_SAPLING; }
            case "MELON_SEEDS" -> { return Items.MELON_SEEDS; }
            case "TRAPPED_CHEST" -> { return Items.TRAPPED_CHEST; }
            case "DIAMOND_SHOVEL" -> { return Items.DIAMOND_SHOVEL; }
            case "BUCKET" -> { return Items.BUCKET; }
            case "ENCHANTED_BOOK" -> { return Items.ENCHANTED_BOOK; }
            case "EMERALD" -> { return Items.EMERALD; }
            case "BLUE_STAINED_GLASS_PANE" -> { return Items.BLUE_STAINED_GLASS_PANE; }
            case "GREEN_TERRACOTTA" -> { return Items.GREEN_TERRACOTTA; }
            case "MAGENTA_CARPET" -> { return Items.MAGENTA_CARPET; }
            case "CYAN_STAINED_GLASS" -> { return Items.CYAN_STAINED_GLASS; }
            case "GLOWSTONE" -> { return Items.GLOWSTONE; }
            case "BLUE_TERRACOTTA" -> { return Items.BLUE_TERRACOTTA; }
            case "LIME_WOOL" -> { return Items.LIME_WOOL; }
            case "ORANGE_TERRACOTTA" -> { return Items.ORANGE_TERRACOTTA; }
            case "RED_SANDSTONE" -> { return Items.RED_SANDSTONE; }
            case "PAINTING" -> { return Items.PAINTING; }
            case "LIME_CARPET" -> { return Items.LIME_CARPET; }
            case "JUNGLE_STAIRS" -> { return Items.JUNGLE_STAIRS; }
            case "CYAN_WOOL" -> { return Items.CYAN_WOOL; }
            case "BLUE_WOOL" -> { return Items.BLUE_WOOL; }
            case "TRIPWIRE_HOOK" -> { return Items.TRIPWIRE_HOOK; }
            case "BOWL" -> { return Items.BOWL; }
            case "MAGENTA_STAINED_GLASS" -> { return Items.MAGENTA_STAINED_GLASS; }
            case "ACACIA_SAPLING" -> { return Items.ACACIA_SAPLING; }
            case "GREEN_WOOL" -> { return Items.GREEN_WOOL; }
            case "POTION" -> { return Items.POTION; }
            case "SMOOTH_SANDSTONE" -> { return Items.SMOOTH_SANDSTONE; }
            case "BROWN_TERRACOTTA" -> { return Items.BROWN_TERRACOTTA; }
            case "LIGHT_BLUE_TERRACOTTA" -> { return Items.LIGHT_BLUE_TERRACOTTA; }
            case "LIME_TERRACOTTA" -> { return Items.LIME_TERRACOTTA; }
            case "ORANGE_STAINED_GLASS_PANE" -> { return Items.ORANGE_STAINED_GLASS_PANE; }
            case "JUNGLE_FENCE_GATE" -> { return Items.JUNGLE_FENCE_GATE; }
            case "MAGENTA_WOOL" -> { return Items.MAGENTA_WOOL; }
            case "SUGAR_CANE" -> { return Items.SUGAR_CANE; }
            case "SLIME_BALL" -> { return Items.SLIME_BALL; }
            case "COOKED_CHICKEN" -> { return Items.COOKED_CHICKEN; }
            case "ORANGE_WOOL" -> { return Items.ORANGE_WOOL; }
            case "RED_WOOL" -> { return Items.RED_WOOL; }
            case "YELLOW_CARPET" -> { return Items.YELLOW_CARPET; }
            case "ACACIA_STAIRS" -> { return Items.ACACIA_STAIRS; }
            case "COOKED_RABBIT" -> { return Items.COOKED_RABBIT; }
            case "SADDLE" -> { return Items.SADDLE; }
            case "WHITE_CARPET" -> { return Items.WHITE_CARPET; }
            case "DIAMOND_PICKAXE" -> { return Items.DIAMOND_PICKAXE; }
            case "PINK_CARPET" -> { return Items.PINK_CARPET; }
            case "RED_SANDSTONE_STAIRS" -> { return Items.RED_SANDSTONE_STAIRS; }
            case "BROWN_WOOL" -> { return Items.BROWN_WOOL; }
            case "BRICK" -> { return Items.BRICK; }
            case "APPLE" -> { return Items.APPLE; }
            case "GLASS_BOTTLE" -> { return Items.GLASS_BOTTLE; }
            case "EMERALD_ORE" -> { return Items.EMERALD_ORE; }
            case "LIGHT_GRAY_STAINED_GLASS_PANE" -> { return Items.LIGHT_GRAY_STAINED_GLASS_PANE; }
            case "COOKED_BEEF" -> { return Items.COOKED_BEEF; }
            case "JUNGLE_FENCE" -> { return Items.JUNGLE_FENCE; }
            case "DARK_OAK_SLAB" -> { return Items.DARK_OAK_SLAB; }
            case "IRON_ORE" -> { return Items.IRON_ORE; }
            case "JUNGLE_LOG" -> { return Items.JUNGLE_LOG; }
            case "RED_CARPET" -> { return Items.RED_CARPET; }
            case "SEA_LANTERN" -> { return Items.SEA_LANTERN; }
            case "SPRUCE_SLAB" -> { return Items.SPRUCE_SLAB; }
            case "ACACIA_DOOR" -> { return Items.ACACIA_DOOR; }
            case "OAK_PLANKS" -> { return Items.OAK_PLANKS; }
            case "IRON_DOOR" -> { return Items.IRON_DOOR; }
            case "MUTTON" -> { return Items.MUTTON; }
            case "JUNGLE_SAPLING" -> { return Items.JUNGLE_SAPLING; }
            case "MOSSY_COBBLESTONE" -> { return Items.MOSSY_COBBLESTONE; }
            case "DARK_OAK_FENCE_GATE" -> { return Items.DARK_OAK_FENCE_GATE; }
            case "YELLOW_STAINED_GLASS" -> { return Items.YELLOW_STAINED_GLASS; }
            case "JUNGLE_LEAVES" -> { return Items.JUNGLE_LEAVES; }
            case "WHITE_WOOL" -> { return Items.WHITE_WOOL; }
            case "BIRCH_FENCE_GATE" -> { return Items.BIRCH_FENCE_GATE; }
            case "SOUL_SAND" -> { return Items.SOUL_SAND; }
            case "ARMOR_STAND" -> { return Items.ARMOR_STAND; }
            case "SANDSTONE" -> { return Items.SANDSTONE; }
            case "PINK_TERRACOTTA" -> { return Items.PINK_TERRACOTTA; }
            case "SANDSTONE_STAIRS" -> { return Items.SANDSTONE_STAIRS; }
            case "DARK_OAK_STAIRS" -> { return Items.DARK_OAK_STAIRS; }
            case "DARK_OAK_SAPLING" -> { return Items.DARK_OAK_SAPLING; }
            case "DRAGON_EGG" -> { return Items.DRAGON_EGG; }
            case "MAGENTA_TERRACOTTA" -> { return Items.MAGENTA_TERRACOTTA; }
            case "DETECTOR_RAIL" -> { return Items.DETECTOR_RAIL; }
            case "FLINT_AND_STEEL" -> { return Items.FLINT_AND_STEEL; }
            case "PINK_STAINED_GLASS" -> { return Items.PINK_STAINED_GLASS; }
            case "DARK_OAK_LEAVES" -> { return Items.DARK_OAK_LEAVES; }
            case "ACACIA_FENCE_GATE" -> { return Items.ACACIA_FENCE_GATE; }
            case "BIRCH_SLAB" -> { return Items.BIRCH_SLAB; }
            case "GRAY_STAINED_GLASS_PANE" -> { return Items.GRAY_STAINED_GLASS_PANE; }
            case "LIGHT_BLUE_STAINED_GLASS_PANE" -> { return Items.LIGHT_BLUE_STAINED_GLASS_PANE; }
            case "CYAN_STAINED_GLASS_PANE" -> { return Items.CYAN_STAINED_GLASS_PANE; }
            case "REDSTONE_ORE" -> { return Items.REDSTONE_ORE; }
            case "MAP" -> { return Items.MAP; }
        }

        return Items.BARRIER;
    }
}
