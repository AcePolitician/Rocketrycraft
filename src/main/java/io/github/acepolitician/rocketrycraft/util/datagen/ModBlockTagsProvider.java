package io.github.acepolitician.rocketrycraft.util.datagen;

import io.github.acepolitician.rocketrycraft.Rocketrycraft;
import io.github.acepolitician.rocketrycraft.block.ModBlocks;
import io.github.acepolitician.rocketrycraft.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Rocketrycraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //this.tag(BlockTags.MINEABLE_WITH_AXE);
        //this.tag(BlockTags.MINEABLE_WITH_HOE);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STEEL_BLOCK.get());
        //this.tag(BlockTags.MINEABLE_WITH_SHOVEL);
        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL);
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK.get());
        //this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);
        //this.tag(BlockTags.NEEDS_STONE_TOOL);
    }
}
