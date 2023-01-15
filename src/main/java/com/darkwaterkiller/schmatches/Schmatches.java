package com.darkwaterkiller.schmatches;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Schmatches.MOD_ID)
public class Schmatches {
    public static final String MOD_ID = "schmatches";

    public Schmatches() {
        // get the event bus for the mod
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // register items and blocks in event bus
        ModItems.register(eventBus);
    }
}
