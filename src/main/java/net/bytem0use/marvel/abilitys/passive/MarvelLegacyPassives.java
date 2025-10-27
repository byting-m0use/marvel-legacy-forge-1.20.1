package net.bytem0use.marvel.abilitys.passive;

import net.bytem0use.marvel.custom_events.BlockCollisionEvent;
import net.bytem0use.marvel.enums.PowerType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.event.entity.living.*;

public class MarvelLegacyPassives extends MobEffect {
    private String id;
    private PowerType type;

    protected MarvelLegacyPassives(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    public MarvelLegacyPassives(String name, MobEffectCategory category, PowerType type){
        super(category, -1);
        this.id = "Marvel Legacy: " + name;
        this.type = type;
    }

    public double getAttributeModifierValues(int amplifier, AttributeModifier modifier) {
        return (double)amplifier;
    }

    public boolean shouldRenderIcon(){
        return true;
    }

    public MarvelLegacyPassives addAttributeModifier(Attribute pAttribute, String pUuid, double pAmount, AttributeModifier.Operation pOperation){
        super.addAttributeModifier(pAttribute, pUuid, pAmount, pOperation);
        return this;
    }

    public void onPlayerHurt(LivingHurtEvent event){
    }

    public void onPlayerAttack(LivingAttackEvent event){
    }

    public void onBlockCollision(BlockCollisionEvent event){
    }

    public void onPlayerDeath(LivingDeathEvent event){
    }

    public void onPlayerHeal(LivingHealEvent event){
    }

    public void onPlayerJump(LivingEvent.LivingJumpEvent event){
    }

    public void onPlayerFall(LivingEvent.LivingJumpEvent event){
    }

    public boolean isIgnoringGravity(LivingEntity entity){
        return false;
    }


}
