package net.bytem0use.marvel.animation;

import net.bytem0use.marvel.animation.helpers.AnimationHelper;
import net.bytem0use.marvel.custom_events.RenderPlayerHandEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class Animation {
    private String id;
    private int minFrame;
    private int maxFrame;
    private int duration;

    public Animation(String name, int minFrame, int maxFrame, int duration){
        this.id = name;
        this.minFrame = minFrame;
        this.maxFrame = maxFrame;
        this.duration = duration;
    }

    public String getId(){
        return this.getId();
    }

    public int getMinFrame(){
        return this.getMinFrame();
    }

    public int getMaxFrame(){
        return this.getMaxFrame();
    }

    public int getDuration(){
        return this.getDuration();
    }

    public boolean animationIsActive(Player player){
        return AnimationHelper.isInAnimation(player) && AnimationHelper.getActiveAnimation(player).equals(this.name) && (AnimationHelper.getAnimationTick(player) < AnimationHelper.getMaxTick(player) - 2.0F || AnimationHelper.isResuming(player));
    }


    @OnlyIn(Dist.CLIENT)
    public void setupAnimation(SetupAnimation event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderPlayerPre(RenderPlayerEvent.Pre event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderPlayerPost(RenderPlayerEvent.Post event) {
    }

    @OnlyIn(Dist.CLIENT)
    public void renderPlayerHandPost(RenderPlayerHandEvent.Post event) {
    }
}
