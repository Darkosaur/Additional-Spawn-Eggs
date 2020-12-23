package com.github.darkosaur.item;

import com.github.darkosaur.AdditionalSpawnEggs;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AdditionalSpawnEggsItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalSpawnEggs.MOD_ID);

    // Spawn Eggs
    public static final RegistryObject<ModSpawnEggItem> IRON_GOLEM_SPAWN_EGG = ITEMS.register("iron_golem_spawn_egg",
            () -> new ModSpawnEggItem(EntityType.IRON_GOLEM, 0xCBCAC5, 0x1AB61C, new Item.Properties().group(ItemGroup.MATERIALS)));
}