package com.gypsyhost.aventuria.custom.util;

import com.gypsyhost.aventuria.Aventuria;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        /*public static final TagKey<Block> DOWSING_ROD_VALUABLES = tag("dowsing_rod_valuables");
        public static final TagKey<Block> PAXEL_MINEABLE =tag("mineable/paxel");*/

        public static final TagKey<Block> TRANSFER_CABLE = forgeTag("transfer_cable");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Aventuria.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }


    public static class Items {
        public static final TagKey<Item> STEEL_INGOTS = forgeTag("ingots/steel");
        public static final TagKey<Item> STEEL_NUGGETS = forgeTag("nuggets/steel");
        public static final TagKey<Item> TITANIUM_INGOTS = forgeTag("ingots/titanium");
        public static final TagKey<Item> TITANIUM_NUGGETS = forgeTag("nuggets/titanium");
        public static final TagKey<Item> TUNGSTEN_INGOTS = forgeTag("ingots/tungsten");
        public static final TagKey<Item> TUNGSTEN_NUGGETS = forgeTag("nuggets/tungsten");

        public static final TagKey<Item> RAW_GEMS = tag("gems/raw_gems");
        public static final TagKey<Item> CRAFTING_HAMMER = tag("crafting_hammer");
        public static final TagKey<Item> PLATE_INGREDIENTS = tag("plate_ingredients");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Aventuria.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}