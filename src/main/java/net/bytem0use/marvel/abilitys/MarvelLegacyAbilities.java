package net.bytem0use.marvel.abilitys;

import net.bytem0use.marvel.animation.SetupAnimation;
import net.bytem0use.marvel.custom_events.BlockCollisionEvent;
import net.bytem0use.marvel.enums.AbilityCategory;
import net.bytem0use.marvel.enums.PowerType;
import net.bytem0use.marvel.custom_events.RenderLayerEvent;
import net.bytem0use.marvel.custom_events.RenderPlayerHandEvent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

import java.util.Map;

public abstract class MarvelLegacyAbilities extends MobEffect {
    private String id;
    private PowerType type;
    private AbilityCategory category;

    protected MarvelLegacyAbilities(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    public MarvelLegacyAbilities(String name, MobEffectCategory category, PowerType type, AbilityCategory pCategory){
        super(category, -1);
        this.id = "Marvel Legacy: " + name;
        this.type = type;
        this.category = pCategory;
    }

    public double addAttributeModifierValue(int amplifier, AttributeModifier modifier) {
        return (double)amplifier;
    }

    public MarvelLegacyAbilities addAttributeModifier(Attribute pAttribute, String pUuid, double pAmount, AttributeModifier.Operation pOperation) {
        super.addAttributeModifier(pAttribute, pUuid, pAmount, pOperation);
        return this;
    }

    public String getAbilityID() {
        return this.id;
    }

    public AbilityCategory getCategoryType() {
        return this.category;
    }

    public boolean shouldRenderIcon() {
        return false;
    }

    @OnlyIn(Dist.CLIENT)
    public void playClientSound(LocalPlayer localPlayer, float pitch, boolean isEndingSound) {
    }

    public int getKeyMapping(LivingEntity player) {
        return -1;
    }

    public void onKeyInput(Player player, Map<Integer, Boolean> map) {
    }

    public void tick(TickEvent.PlayerTickEvent event) {
    }

    public void onJump(LivingEvent.LivingJumpEvent event) {
    }

    public void onFall(LivingFallEvent event) {
    }

    public void onHurt(LivingHurtEvent event) {
    }

    public void onPlayerAttack(AttackEntityEvent event) {
    }

    public void onBlockCollision(BlockCollisionEvent event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void setupAnimation(SetupAnimation event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderPlayerBefore(RenderPlayerEvent.Pre event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderPlayerAfter(RenderPlayerEvent.Post event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderArmorLayerBefore(RenderLayerEvent.Armor.Pre event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderArmorLayerAfter(RenderLayerEvent.Armor.Post event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderHand(RenderHandEvent event, Player player) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderPlayerHandBefore(RenderPlayerHandEvent.Pre event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderPlayerHandAfter(RenderPlayerHandEvent.Post event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void HUDModifier(ComputeFovModifierEvent event) {
    }

    public boolean isIgnoringGravity(LivingEntity living) {
        return false;
    }


}
