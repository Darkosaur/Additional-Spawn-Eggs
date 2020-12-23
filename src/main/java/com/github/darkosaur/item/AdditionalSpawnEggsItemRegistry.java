package com.github.darkosaur.item;

import com.github.darkosaur.AdditionalSpawnEggs;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AdditionalSpawnEggsItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalSpawnEggs.MOD_ID);

    // Spawn Eggs
    public static final RegistryObject<SpawnEggItem> IRON_GOLEM_SPAWN_EGG = ITEMS.register("iron_golem_spawn_egg",
            () -> new SpawnEggItem(EntityType.IRON_GOLEM, 0xCBCAC5, 0x1AB61C, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<SpawnEggItem> SNOW_GOLEM_SPAWN_EGG = ITEMS.register("snow_golem_spawn_egg",
            () -> new SpawnEggItem(EntityType.SNOW_GOLEM, 0xFFFFFF, 0xD4A81E, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<SpawnEggItem> ENDER_DRAGON_SPAWN_EGG = ITEMS.register("ender_dragon_spawn_egg",
            () -> new SpawnEggItem(EntityType.ENDER_DRAGON, 0x151102, 0x07179F, new Item.Properties().group(ItemGroup.MATERIALS)));
}
