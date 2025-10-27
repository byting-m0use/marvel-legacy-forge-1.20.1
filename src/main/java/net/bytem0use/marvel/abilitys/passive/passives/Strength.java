package net.bytem0use.marvel.abilitys.passive.passives;

import net.bytem0use.marvel.abilitys.passive.MarvelLegacyPassives;
import net.bytem0use.marvel.enums.PowerType;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class Strength extends MarvelLegacyPassives {

    public Strength(String id, MobEffectCategory category, PowerType type) {
        super(id, category, type);
    }

    @Override
    public double getAttributeModifierValues(int amplifier, AttributeModifier modifier) {
        return (double)amplifier + (double)10.0F;
    }


}
