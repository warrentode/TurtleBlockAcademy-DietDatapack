package com.github.warrentode.tba_diet.datagen;

import com.github.warrentode.tba_diet.PackTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
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
        tag(PackTags.Items.DIET_INGREDIENTS);
        tag(PackTags.Items.DIET_SPECIAL_FOOD);

        tag(PackTags.Items.DIET_FRUITS)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("nethersdelight:propelpearl")))
                .add(Items.PUMPKIN)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:tomato")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("xercamod:tomato")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:cranberry_pie_slice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blackberry_pie_slice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:raspberry_pie_slice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blueberry_pie_slice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:glow_berry_pie_slice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:sweet_berry_pie_slice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:cranberry_muffin")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blackberry_muffin")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:raspberry_muffin")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blueberry_muffin")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:glow_berry_muffin")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:sweet_berry_muffin")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:cranberry_jam_sandwich")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blackberry_jam_sandwich")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:raspberry_jam_sandwich")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blueberry_jam_sandwich")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:glow_berry_jam_sandwich")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:sweet_berry_jam_sandwich")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:cranberry_jam")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blackberry_jam")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:raspberry_jam")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blueberry_jam")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:glow_berry_jam")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:sweet_berry_jam")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:cranberries")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blackberry")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:raspberry")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("wildberries:blueberries")));

        tag(PackTags.Items.DIET_VEGETABLES)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("delightful:chopped_clover")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("hauntedharvest:corn")))
                .add(Items.CACTUS)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("ecologics:prickly_pear")))
                .add(Items.PUMPKIN)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("hauntedharvest:corn")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("ends_delight:chorus_succulent")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("ends_delight:dried_chorus_flower")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("unusualend:chorus_petal")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("unusualend:warped_wart")))
                .add(Items.CRIMSON_ROOTS)
                .add(Items.WARPED_ROOTS)
                .add(Items.NETHER_WART)
                .add(Items.SEA_PICKLE)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:cabbage")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:wild_onion")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:onion")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:tomato")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("xercamod:tomato")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("miners_delight:cave_carrot")))
                .add(Items.RED_MUSHROOM)
                .add(Items.BROWN_MUSHROOM)
                .add(Items.CRIMSON_FUNGUS)
                .add(Items.WARPED_FUNGUS)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("phantasm:putac_shroom")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("unusualend:chorus_fungus")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("nethersdelight:crimson_fungus_colony")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("nethersdelight:warped_fungus_colony")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:red_mushroom_colony")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:brown_mushroom_colony")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("biomesoplenty:glowshroom")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("biomesoplenty:toadstool")));

        tag(PackTags.Items.DIET_GRAINS)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("hauntedharvest:corn")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:rice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("xercamod:rice")));

        tag(PackTags.Items.DIET_PROTEINS)
                .add(Items.MILK_BUCKET)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:milk_bottle")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("kawaiidishes:condensed_milk")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("aether:skyroot_milk_bucket")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:cut_tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("miners_delight:tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:glow_squid")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:cut_tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("miners_delight:tentacles")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:squid")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("ecologics:crab_claw")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("crabbersdelight:crab")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("crabbersdelight:clam_meat")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("crabbersdelight:shrimp")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("crabbersdelight:clawster")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:mutton_chops")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:minced_beef")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("tconstruct:bacon")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:bacon")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("delightful:goat")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("delightful:venison")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:guardian_tail")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:guardian")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:elder_guardian_slice")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("oceansdelight:elder_guardian_slab")));

        tag(PackTags.Items.DIET_SUGARS)
                .add(Items.SUGAR)
                .add(Items.HONEY_BOTTLE);

        tag(PackTags.Items.DIET_FATS)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("delightful:goat")))
                .add(Items.MUTTON)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:mutton_chops")))
                .add(Items.BEEF)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:minced_beef")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("tconstruct:bacon")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:bacon")))
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("delightful:goat")))
                .add(Items.PORKCHOP)
                .addOptional(Objects.requireNonNull(
                        ResourceLocation.tryParse("farmersdelight:ham")))
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
