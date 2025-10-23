package net.bytem0use.marvel.abilitys;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class MarvelLegacyPassives extends MobEffect {
    private String id;

    protected MarvelLegacyPassives(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    public void onPlayerHurt(LivingHurtEvent event){
    }
}
