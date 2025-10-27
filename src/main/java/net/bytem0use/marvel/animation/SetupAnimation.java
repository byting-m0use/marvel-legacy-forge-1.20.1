package net.bytem0use.marvel.animation;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class SetupAnimation extends PlayerEvent {
    private final PlayerModel playerModel;
    private final float limbSwing;
    private final float limbSwingAmount;
    private final float ageInTicks;
    private final float netHeadYaw;
    private final float headPitch;
    private final float partialTicks;

    public SetupAnimation(AbstractClientPlayer playerEntity, PlayerModel playerModel, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super(playerEntity);
        this.playerModel = playerModel;
        this.limbSwing = limbSwing;
        this.limbSwingAmount = limbSwingAmount;
        this.ageInTicks = ageInTicks;
        this.netHeadYaw = netHeadYaw;
        this.headPitch = headPitch;
        this.partialTicks = Minecraft.getInstance().getPartialTick();
    }

    public AbstractClientPlayer getPlayer() {
        return (AbstractClientPlayer)super.getEntity();
    }

    public PlayerModel getPlayerModel() {
        return this.playerModel;
    }

    public float getLimbSwing() {
        return this.limbSwing;
    }

    public float getLimbSwingAmount() {
        return this.limbSwingAmount;
    }

    public float getAgeInTicks() {
        return this.ageInTicks;
    }

    public float getNetHeadYaw() {
        return this.netHeadYaw;
    }

    public float getHeadPitch() {
        return this.headPitch;
    }

    public float getPartialTicks() {
        return this.partialTicks;
    }
}
