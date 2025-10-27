package net.bytem0use.marvel.abilitys.passive;

import com.google.common.collect.Maps;
import net.bytem0use.marvel.MarvelLegacy;
import net.bytem0use.marvel.abilitys.passive.passives.Jump;
import net.bytem0use.marvel.abilitys.passive.passives.Speed;
import net.bytem0use.marvel.abilitys.passive.passives.Strength;
import net.bytem0use.marvel.enums.PowerType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class PassiveAbilityRegistry {
    public static final DeferredRegister<MobEffect> LEGACYPASSIVEEFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MarvelLegacy.MODID);

    public static final RegistryObject<MarvelLegacyPassives> STRENGTH = LEGACYPASSIVEEFFECTS.register("strength",
            () -> (new Strength("strength", MobEffectCategory.BENEFICIAL, PowerType.COMMON)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE, "39933411-78b4-49a2-a01f-6a49f9ca965d",
                            1.0f, AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<MarvelLegacyPassives> JUMP = LEGACYPASSIVEEFFECTS.register("jump",
            () -> (new Jump("strength", MobEffectCategory.BENEFICIAL, PowerType.COMMON)
                    .addAttributeModifier(Attributes.JUMP_STRENGTH, "39933411-78b4-49a2-a01f-6a49f9ca965d",
                            1.0f, AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<MarvelLegacyPassives> SPEED = LEGACYPASSIVEEFFECTS.register("speed",
            () -> (new Speed("speed", MobEffectCategory.BENEFICIAL, PowerType.COMMON)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED, "39933411-78b4-49a2-a01f-6a49f9ca965d",
                            1.0f, AttributeModifier.Operation.ADDITION)));

    public static void registerEffects(IEventBus eventBus) {
        LEGACYPASSIVEEFFECTS.register(eventBus);
    }

    public static LinkedHashMap<ResourceLocation, MarvelLegacyPassives> getActivePassiveAbilities(LivingEntity entity) {
        LinkedHashMap<ResourceLocation, MarvelLegacyPassives> map = Maps.newLinkedHashMap();

        for(MobEffect effect : entity.getActiveEffectsMap().keySet()) {
            if (effect instanceof MarvelLegacyPassives ability) {
            }
        }

        return map;
    }
}
