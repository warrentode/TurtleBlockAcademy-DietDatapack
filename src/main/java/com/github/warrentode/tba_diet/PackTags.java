package com.github.warrentode.tba_diet;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class PackTags {
    public static class Items {
        public static final TagKey<Item> FRUITS = packItemTag("forge", "crops/fruits");
        public static final TagKey<Item> VEGETABLES = packItemTag("forge", "crops/vegetables");
        public static final TagKey<Item> GRAINS = packItemTag("forge", "crops/grains");
        public static final TagKey<Item> PROTEINS = packItemTag("forge", "ingredients/proteins");
        public static final TagKey<Item> SUGAR = packItemTag("forge", "sugar");
        public static final TagKey<Item> FAT = packItemTag("turtleblockacademy", "fat");

        public static final TagKey<Item> MILK = packItemTag("forge", "milk");

        public static final TagKey<Item> RAW_FISHES = packItemTag("forge", "ingredients/raw_fishes");
        public static final TagKey<Item> RAW_SQUID = packItemTag("forge", "raw_fishes/raw_squid");
        public static final TagKey<Item> RAW_GLOW_SQUID = packItemTag("forge", "raw_fishes/raw_glow_squid");
        public static final TagKey<Item> RAW_CRAB = packItemTag("forge", "raw_fishes/raw_crab");
        public static final TagKey<Item> RAW_CLAM = packItemTag("forge", "raw_fishes/raw_clam");
        public static final TagKey<Item> RAW_SHRIMP = packItemTag("forge", "raw_fishes/raw_shrimp");
        public static final TagKey<Item> RAW_CLAWSTER = packItemTag("forge", "raw_fishes/raw_clawster");
        public static final TagKey<Item> RAW_GUARDIAN = packItemTag("forge", "raw_fishes/raw_guardian");
        public static final TagKey<Item> RAW_ELDER_GUARDIAN = packItemTag("forge", "raw_fishes/raw_elder_guardian");

        public static final TagKey<Item> RAW_MEATS = packItemTag("forge", "ingredients/raw_meats");
        public static final TagKey<Item> FATTY_MEATS = packItemTag("forge", "ingredients/fatty_meats");
        public static final TagKey<Item> RAW_BEEF = packItemTag("forge", "raw_meats/raw_beef");
        public static final TagKey<Item> RAW_PORK = packItemTag("forge", "raw_meats/raw_pork");
        public static final TagKey<Item> RAW_BACON = packItemTag("forge", "raw_pork/raw_bacon");
        public static final TagKey<Item> RAW_MUTTON = packItemTag("forge", "raw_meats/raw_mutton");
        public static final TagKey<Item> RAW_GOAT = packItemTag("forge", "raw_meats/raw_goat");

        public static final TagKey<Item> DIET_INGREDIENTS = packItemTag("diet", "ingredients");
        public static final TagKey<Item> DIET_SPECIAL_FOOD = packItemTag("diet", "special_food");
        public static final TagKey<Item> DIET_FRUITS = packItemTag("diet", "fruits");
        public static final TagKey<Item> DIET_VEGETABLES = packItemTag("diet", "vegetables");
        public static final TagKey<Item> DIET_GRAINS = packItemTag("diet", "grains");
        public static final TagKey<Item> DIET_PROTEINS = packItemTag("diet", "proteins");
        public static final TagKey<Item> DIET_SUGARS = packItemTag("diet", "sugars");
        public static final TagKey<Item> DIET_FATS = packItemTag("diet", "fats");
    }

    private static @NotNull TagKey<Item> packItemTag(String id, String path) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(id, path));
    }
}
