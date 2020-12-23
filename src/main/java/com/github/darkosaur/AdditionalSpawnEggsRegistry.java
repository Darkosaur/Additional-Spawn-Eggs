package com.github.darkosaur;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AdditionalSpawnEggsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalSpawnEggs.MOD_ID);

    // Spawn Eggs
    public static final RegistryObject<SpawnEggItem> IRON_GOLEM_SPAWN_EGG = ITEMS.register("iron_golem_spawn_egg",
            () -> new SpawnEggItem(EntityType.IRON_GOLEM, 0xCBCAC5, 0x1AB61C, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<SpawnEggItem> SNOW_GOLEM_SPAWN_EGG = ITEMS.register("snow_golem_spawn_egg",
            () -> new SpawnEggItem(EntityType.SNOW_GOLEM, 0xFFFFFF, 0xD4A81E, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<SpawnEggItem> ENDER_DRAGON_SPAWN_EGG = ITEMS.register("ender_dragon_spawn_egg",
            () -> new SpawnEggItem(EntityType.ENDER_DRAGON, 0x151102, 0x07179F, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<SpawnEggItem> WITHER_SPAWN_EGG = ITEMS.register("wither_spawn_egg",
            () -> new SpawnEggItem(EntityType.WITHER, 0x110D0D, 0x383333, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<SpawnEggItem> ILLUSIONER_SPAWN_EGG = ITEMS.register("illusioner_spawn_egg",
            () -> new SpawnEggItem(EntityType.ILLUSIONER, 0x46BAF1, 0x7A6B4E, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<SpawnEggItem> GIANT_SPAWN_EGG = ITEMS.register("giant_spawn_egg",
            () -> new SpawnEggItem(EntityType.GIANT, 0x1280EE, 0x0CAE18, new Item.Properties().group(ItemGroup.MATERIALS)));
}
