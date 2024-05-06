package com.github.warrentode.tba_diet.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class BlockTagsGen extends BlockTagsProvider {
    public BlockTagsGen(DataGenerator generator, String modid, @Nullable ExistingFileHelper helper) {
        super(generator, modid, helper);
    }

    @Override
    protected void addTags() {}
}
