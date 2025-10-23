package net.bytem0use.marvel.sounds;

import net.bytem0use.marvel.MarvelLegacy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundsRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MarvelLegacy.MODID);

    public static final RegistryObject<SoundEvent> BULLET_RICOCHET = registerSoundEvents("bullet_ricochet");
    public static final RegistryObject<SoundEvent> THUNDER_CLAP = registerSoundEvents("thunder_clap");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENT.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(MarvelLegacy.MODID, name)));
    }

    public static void registerSoundEvents(IEventBus eventBus) {
        SOUND_EVENT.register(eventBus);
    }
}
