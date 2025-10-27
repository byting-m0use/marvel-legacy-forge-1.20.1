package net.bytem0use.marvel.items;

import net.bytem0use.marvel.MarvelLegacy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LegacyItems {
    public static final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarvelLegacy.MODID);



    public static void registerItems(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
