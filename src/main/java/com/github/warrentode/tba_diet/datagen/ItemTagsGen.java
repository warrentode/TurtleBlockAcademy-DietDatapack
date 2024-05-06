package com.github.warrentode.tba_diet.datagen;

import com.github.warrentode.tba_diet.PackTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class ItemTagsGen extends ItemTagsProvider {
    public ItemTagsGen(DataGenerator generator, BlockTagsProvider blockTagsProvider, String modid, @Nullable ExistingFileHelper helper) {
        super(generator, blockTagsProvider, modid, helper);
    }

    @Override
    protected void addTags() {
        this.registerPackTags();
    }

    private void registerPackTags() {
        tag(PackTags.Items.FRUITS);
        tag(PackTags.Items.VEGETABLES);
        tag(PackTags.Items.GRAINS);
        tag(PackTags.Items.PROTEINS)
                .addTag(Tags.Items.EGGS)
                .addTag(PackTags.Items.RAW_FISHES)
                .addTag(PackTags.Items.RAW_MEATS)
                .addTag(PackTags.Items.MILK);
        tag(PackTags.Items.SUGAR)
                .add(Items.SUGAR)
                .add(Items.HONEY_BOTTLE);

        tag(PackTags.Items.FAT);

        tag(PackTags.Items.RAW_MEATS)
                .addTag(PackTags.Items.RAW_GOAT)
                .addTag(PackTags.Items.RAW_BEEF)
                .addTag(PackTags.Items.RAW_MUTTON)
                .addTag(PackTags.Items.RAW_PORK);

        tag(PackTags.Items.RAW_FISHES)
                .addTag(PackTags.Items.RAW_ELDER_GUARDIAN)
                .addTag(PackTags.Items.RAW_GUARDIAN)
                .addTag(PackTags.Items.RAW_CLAWSTER)
                .addTag(PackTags.Items.RAW_SHRIMP)
                .addTag(PackTags.Items.RAW_CLAM)
                .addTag(PackTags.Items.RAW_CRAB)
                .addTag(PackTags.Items.RAW_SQUID)
                .addTag(PackTags.Items.RAW_GLOW_SQUID);

        tag(PackTags.Items.RAW_ELDER_GUARDIAN)
                .addTag(PackTags.Items.RAW_GUARDIAN)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:elder_guardian_slice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:elder_guardian_slab")));
        tag(PackTags.Items.RAW_GUARDIAN)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:guardian_tail")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:guardian")));
        tag(PackTags.Items.RAW_CLAWSTER)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("crabbersdelight:clawster")));
        tag(PackTags.Items.RAW_SHRIMP)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("crabbersdelight:shrimp")));
        tag(PackTags.Items.RAW_CLAM)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("crabbersdelight:clam_meat")));
        tag(PackTags.Items.RAW_CRAB)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("ecologics:crab_claw")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("crabbersdelight:crab")));
        tag(PackTags.Items.RAW_SQUID)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:cut_tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("miners_delight:tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:squid")));
        tag(PackTags.Items.RAW_GLOW_SQUID)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:cut_tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("miners_delight:tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:glow_squid")));;

        tag(PackTags.Items.RAW_BEEF)
                .add(Items.BEEF)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:minced_beef")));
        tag(PackTags.Items.RAW_BACON)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("tconstruct:bacon")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:bacon")));
        tag(PackTags.Items.RAW_PORK)
                .add(Items.PORKCHOP)
                .addTag(PackTags.Items.RAW_BACON)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:ham")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("nethersdelight:ham")));
        tag(PackTags.Items.RAW_MUTTON)
                .add(Items.MUTTON)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:mutton_chops")));
        tag(PackTags.Items.RAW_GOAT)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("delightful:goat")));

        tag(PackTags.Items.FATTY_MEATS)
                .addTag(PackTags.Items.RAW_PORK)
                .addTag(PackTags.Items.RAW_MUTTON)
                .addTag(PackTags.Items.RAW_GOAT)
                .addTag(PackTags.Items.RAW_BEEF);

        tag(PackTags.Items.MILK)
                .add(Items.MILK_BUCKET)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:milk_bottle")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("kawaiidishes:condensed_milk")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("aether:skyroot_milk_bucket")));

        tag(PackTags.Items.DIET_INGREDIENTS);
        tag(PackTags.Items.DIET_SPECIAL_FOOD);
        tag(PackTags.Items.DIET_FRUITS)
                .addTag(PackTags.Items.FRUITS);
        tag(PackTags.Items.DIET_VEGETABLES)
                .addTag(PackTags.Items.VEGETABLES);
        tag(PackTags.Items.DIET_GRAINS)
                .addTag(PackTags.Items.GRAINS);
        tag(PackTags.Items.DIET_PROTEINS)
                .addTag(PackTags.Items.PROTEINS);
        tag(PackTags.Items.DIET_SUGARS)
                .addTag(PackTags.Items.SUGAR);
        tag(PackTags.Items.DIET_FATS)
                .replace(true)
                .addTag(PackTags.Items.FATTY_MEATS)
                .addTag(PackTags.Items.FAT)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("simplefarming:olive_oil")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("vanillafoodpantry:seedoil_jar")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("vanillafoodpantry:sunbutter_jar")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("vanillafoodpantry:portion_butter")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("pamhc2foodcore:mayonaiseitem")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("pamhc2foodcore:sesameoilitem")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("pamhc2foodcore:mushroomoilitem")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("pamhc2foodcore:cookingoilitem")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("pamhc2foodcore:butteritem")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("croptopia:butter")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("croptopia:olive_oil")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("delightful:animal_oil_bottle")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("delightful:animal_fat")));
    }
}
