package net.bytem0use.marvel.custom_events;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Cancelable;

public abstract class RenderPlayerHandEvent extends PlayerEvent {
    private final PlayerRenderer renderer;
    private final HumanoidArm side;
    private final PoseStack stack;
    private final MultiBufferSource buffers;
    private final int light;
    private final AbstractClientPlayer player;

    public RenderPlayerHandEvent(AbstractClientPlayer player, PlayerRenderer renderer, PoseStack stack, MultiBufferSource buffers, int light, HumanoidArm side) {
        super(player);
        this.player = player;
        this.renderer = renderer;
        this.stack = stack;
        this.buffers = buffers;
        this.light = light;
        this.side = side;
    }

    public PlayerRenderer getRenderer() {
        return this.renderer;
    }

    public AbstractClientPlayer getPlayer() {
        return this.player;
    }

    public HumanoidArm getSide() {
        return this.side;
    }

    public PoseStack getPoseStack() {
        return this.stack;
    }

    public MultiBufferSource getMultiBufferSource() {
        return this.buffers;
    }

    public int getPackedLight() {
        return this.light;
    }

    @Cancelable
    public static class Pre extends RenderPlayerHandEvent {
        public Pre(AbstractClientPlayer player, PlayerRenderer renderer, PoseStack stack, MultiBufferSource buffers, int light, HumanoidArm side) {
            super(player, renderer, stack, buffers, light, side);
        }
    }

    public static class Post extends RenderPlayerHandEvent {
        public Post(AbstractClientPlayer player, PlayerRenderer renderer, PoseStack stack, MultiBufferSource buffers, int light, HumanoidArm side) {
            super(player, renderer, stack, buffers, light, side);
        }
    }
}
