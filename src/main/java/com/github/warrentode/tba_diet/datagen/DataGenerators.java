package com.github.warrentode.tba_diet.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

import static com.github.warrentode.tba_diet.TBA_Diet.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(@NotNull GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new LangGen(generator, "diet", "en_us"));

        BlockTagsGen blockTagsGen = new BlockTagsGen(generator, MODID, helper);
        generator.addProvider(event.includeServer(), blockTagsGen);

        generator.addProvider(event.includeServer(), new ItemTagsGen(generator, blockTagsGen, MODID, helper));
    }
}