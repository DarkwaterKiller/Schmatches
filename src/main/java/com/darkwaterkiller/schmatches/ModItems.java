package com.darkwaterkiller.schmatches;

import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Schmatches.MOD_ID);
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> MATCH = ITEMS.register("match",
            () ->
                    new Match(new Item.Properties()
                            .group(ItemGroup.TOOLS)
                            .maxStackSize(1)
                            .rarity(Rarity.COMMON)
                    )
    );

    public static final RegistryObject<Item> MATCHBOOK = ITEMS.register("matchbook",
            () ->
                    new Matchbook(new Item.Properties()
                            .group(ItemGroup.TOOLS)
                            .maxDamage(8)
                            .rarity(Rarity.COMMON)
                    )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}