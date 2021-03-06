package com.gypsyhost.aventuria.registry;

import com.gypsyhost.aventuria.Aventuria;
import com.gypsyhost.aventuria.custom.item.CatalystItem;
import com.gypsyhost.aventuria.custom.item.CraftingHammerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Aventuria.MOD_ID);

    private static final Item.Properties CREATIVE_TAB = new Item.Properties().tab(ModCreativeModeTab.MOD_TAB);
    private static final Item.Properties CREATIVE_TAB_D32 = new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).durability(32);
    private static final Item.Properties CREATIVE_TAB_D128 = new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).durability(128);
    private static final Item.Properties CREATIVE_TAB_D256 = new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).durability(256);
    private static final Item.Properties CREATIVE_TAB_D512 = new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).durability(512);

    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", () -> new Item(CREATIVE_TAB));

    public static final RegistryObject<Item> TITANIUM_RAW_ORE = ITEMS.register("titanium_raw_ore", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust", () -> new Item(CREATIVE_TAB));

    public static final RegistryObject<Item> TUNGSTEN_RAW_ORE = ITEMS.register("tungsten_raw_ore", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust", () -> new Item(CREATIVE_TAB));

    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(CREATIVE_TAB));
    //public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(CREATIVE_TAB));

    public static final RegistryObject<Item> CRAFTING_HAMMER_IRON = ITEMS.register("crafting_hammer_iron", () -> new CraftingHammerItem(CREATIVE_TAB_D32));
    public static final RegistryObject<Item> CRAFTING_HAMMER_STEEL = ITEMS.register("crafting_hammer_steel", () -> new CraftingHammerItem(CREATIVE_TAB_D128));
    public static final RegistryObject<Item> CRAFTING_HAMMER_TITANIUM = ITEMS.register("crafting_hammer_titanium", () -> new CraftingHammerItem(CREATIVE_TAB_D256));
    public static final RegistryObject<Item> CRAFTING_HAMMER_TUNGSTEN = ITEMS.register("crafting_hammer_tungsten", () -> new CraftingHammerItem(CREATIVE_TAB_D512));

    public static final RegistryObject<Item> CATALYST = ITEMS.register("catalyst", () -> new CatalystItem(CREATIVE_TAB_D32));

    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> REDSTONE_PLATE = ITEMS.register("redstone_plate", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> TITANIUM_PLATE = ITEMS.register("titanium_plate", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> TUNGSTEN_PLATE = ITEMS.register("tungsten_plate", () -> new Item(CREATIVE_TAB));

    public static final RegistryObject<Item> GEM_RAW_AVENTURINE = ITEMS.register("gem_raw_aventurine", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_RAW_CALCITE = ITEMS.register("gem_raw_calcite", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_RAW_PYRITE = ITEMS.register("gem_raw_pyrite", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_RAW_RUBY = ITEMS.register("gem_raw_ruby", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_RAW_TOPAZ = ITEMS.register("gem_raw_topaz", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_RAW_UNAKITE = ITEMS.register("gem_raw_unakite", () -> new Item(CREATIVE_TAB));

    public static final RegistryObject<Item> GEM_AVENTURINE = ITEMS.register("gem_aventurine", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_CALCITE = ITEMS.register("gem_calcite", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_PYRITE = ITEMS.register("gem_pyrite", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_RUBY = ITEMS.register("gem_ruby", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_TOPAZ = ITEMS.register("gem_topaz", () -> new Item(CREATIVE_TAB));
    public static final RegistryObject<Item> GEM_UNAKITE = ITEMS.register("gem_unakite", () -> new Item(CREATIVE_TAB));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
