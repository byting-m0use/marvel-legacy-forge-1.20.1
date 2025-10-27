package net.bytem0use.marvel.animation.helpers;

import net.bytem0use.marvel.animation.Animation;
import net.bytem0use.marvel.animation.AnimationRegistry;
import net.bytem0use.marvel.interfaces.IMarvelPlayer;
import net.minecraft.world.entity.player.Player;

public class AnimationHelper {

    public static Animation getAnimationFromID(String id) {
        for(Animation animation : AnimationRegistry.ANIMATIONS.values()) {
            if (animation.getId().equals(id)) {
                return animation;
            }
        }

        return null;
    }

    public static boolean isInAnimation(Player player){
        return (Boolean)player.getCapability(LegendsPlayerProvider.CAPABILITY).map(IMarvelPlayer::isAnimationActive).orElse(false);
    }
}
