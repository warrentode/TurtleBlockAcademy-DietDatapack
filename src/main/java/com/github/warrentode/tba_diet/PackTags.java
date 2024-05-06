package com.github.warrentode.tba_diet;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class PackTags {
    public static class Items {
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
