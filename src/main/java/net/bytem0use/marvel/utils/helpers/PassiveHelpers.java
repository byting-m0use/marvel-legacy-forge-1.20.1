package net.bytem0use.marvel.utils.helpers;

import net.bytem0use.marvel.abilitys.passive.MarvelLegacyPassives;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class PassiveHelpers {
    public static MobEffectInstance getPassiveInstance(LivingEntity entity, MobEffect effect) {
        return entity.getEffect(effect);
    }

    @Nullable
    public static MarvelLegacyPassives getPassive(LivingEntity entity, MobEffect effect) {
        return getPassiveInstance(entity, effect) != null && getPassiveInstance(entity, effect).getEffect() instanceof MarvelLegacyPassives ? (MarvelLegacyPassives) getPassiveInstance(entity, effect).getEffect() : null;
    }

    public static boolean hasPassive(LivingEntity entity, MobEffect effect) {
        for(MobEffectInstance instance : entity.getActiveEffects()) {
            if (instance.getEffect().getClass().isInstance(effect.getClass())) {
                return true;
            }
        }

        return entity.hasEffect(effect);
    }

    public static double getMeleeDamage(LivingEntity entity) {
        return entity.getAttribute(Attributes.ATTACK_DAMAGE) != null ? ((AttributeInstance) Objects.requireNonNull(entity.getAttribute(Attributes.ATTACK_DAMAGE))).getValue() : (double)0.0F;
    }

    public static double getSpeed(LivingEntity entity) {
        return entity.getAttribute(Attributes.MOVEMENT_SPEED) != null ? ((AttributeInstance)Objects.requireNonNull(entity.getAttribute(Attributes.MOVEMENT_SPEED))).getValue() : (double)0.0F;
    }
}
