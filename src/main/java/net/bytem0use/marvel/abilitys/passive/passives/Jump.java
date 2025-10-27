package net.bytem0use.marvel.abilitys.passive.passives;

import net.bytem0use.marvel.abilitys.passive.MarvelLegacyPassives;
import net.bytem0use.marvel.enums.PowerType;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class Jump extends MarvelLegacyPassives {
    public Jump(String name, MobEffectCategory category, PowerType type) {
        super(name, category, type);
    }

    @Override
    public double getAttributeModifierValue(int amplifier, AttributeModifier modifier) {
        return super.getAttributeModifierValue(amplifier, modifier);
    }
}
