package io.github.acepolitician.rocketrycraft.util;

import io.github.acepolitician.rocketrycraft.Rocketrycraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MINEABLE_AXE = tag("mineable/axe");
        public static final TagKey<Block> MINEABLE_HOE = tag("mineable/hoe");
        public static final TagKey<Block> MINEABLE_PICKAXE = tag("mineable/pickaxe");
        public static final TagKey<Block> MINEABLE_SHOVEL = tag("mineable/shovel");

        public static final TagKey<Block> NEEDS_DIAMOND_TOOL = tag("needs_diamond_tool");
        public static final TagKey<Block> NEEDS_IRON_TOOL = tag("needs_iron_tool");
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = tag("needs_netherite_tool");
        public static final TagKey<Block> NEEDS_STONE_TOOL = tag("needs_stone_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Rocketrycraft.MODID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Rocketrycraft.MODID, name));
        }
    }
}
