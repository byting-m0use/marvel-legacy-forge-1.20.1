package net.bytem0use.marvel.animation;

import com.google.common.collect.Maps;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class AnimationRegistry {
    public static final Map<String, Animation> ANIMATIONS = Maps.newHashMap();
    public static final HashMap<ResourceLocation, KeyframeAnimation> ANIMATION_MAP = new HashMap();
}
