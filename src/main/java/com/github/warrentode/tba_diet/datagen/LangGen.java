package com.github.warrentode.tba_diet.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangGen extends LanguageProvider {
    public LangGen(DataGenerator generator, String modid, String locale) {
        super(generator, modid, locale);
    }

    @Override
    protected void addTranslations() {

        add("groups.diet.fat.name", "Fats");
    }
}
