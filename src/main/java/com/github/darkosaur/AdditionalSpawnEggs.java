package com.github.darkosaur;

import com.github.darkosaur.item.AdditionalSpawnEggsItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AdditionalSpawnEggs.MOD_ID)
public class AdditionalSpawnEggs {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ase";

    public AdditionalSpawnEggs() {
        final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        modBus.addListener(this::setup);

        AdditionalSpawnEggsItemRegistry.ITEMS.register(modBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }
}
