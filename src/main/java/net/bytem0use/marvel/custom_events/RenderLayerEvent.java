package net.bytem0use.marvel.custom_events;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

public abstract class RenderLayerEvent<T extends LivingEntity, M extends HumanoidModel<T>> extends Event {
    protected final T livingEntity;
    protected final LivingEntityRenderer<T, M> renderer;
    protected final PoseStack matrixStack;
    protected final MultiBufferSource bufferIn;
    protected final int packedLightIn;
    protected float limbSwing;
    protected float limbSwingAmount;
    protected float partialTicks;
    protected float ageInTicks;
    protected float netHeadYaw;
    protected float headPitch;

    public RenderLayerEvent(LivingEntityRenderer<T, M> renderer, T livingEntity, PoseStack matrixStack, MultiBufferSource bufferIn, int packedLightIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        this.livingEntity = livingEntity;
        this.renderer = renderer;
        this.matrixStack = matrixStack;
        this.bufferIn = bufferIn;
        this.packedLightIn = packedLightIn;
        this.limbSwing = limbSwing;
        this.limbSwingAmount = limbSwingAmount;
        this.partialTicks = partialTicks;
        this.ageInTicks = ageInTicks;
        this.netHeadYaw = netHeadYaw;
        this.headPitch = headPitch;
    }

    public T getLivingEntity() {
        return this.livingEntity;
    }

    public LivingEntityRenderer<T, M> getRenderer() {
        return this.renderer;
    }

    public PoseStack getPoseStack() {
        return this.matrixStack;
    }

    public MultiBufferSource getMultiBufferSource() {
        return this.bufferIn;
    }

    public int getPackedLight() {
        return this.packedLightIn;
    }

    public float getLimbSwing() {
        return this.limbSwing;
    }

    public float getLimbSwingAmount() {
        return this.limbSwingAmount;
    }

    public float getPartialTicks() {
        return this.partialTicks;
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

    public static class Player extends RenderLayerEvent<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {
        private final EntityRendererProvider.Context context;

        public Player(EntityRendererProvider.Context context, PlayerRenderer renderer, AbstractClientPlayer player, PoseStack matrixStack, MultiBufferSource bufferIn, int packedLightIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            super(renderer, player, matrixStack, bufferIn, packedLightIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch);
            this.context = context;
        }

        public EntityRendererProvider.Context getContext() {
            return this.context;
        }

        public PlayerRenderer getRenderer() {
            return (PlayerRenderer) this.renderer;
        }

        public AbstractClientPlayer getPlayer() {
            return this.livingEntity;
        }
    }

    public static class Armor<T extends LivingEntity> extends RenderLayerEvent<T, HumanoidModel<T>> {
        public Armor(LivingEntityRenderer renderer, T livingEntity, PoseStack matrixStack, MultiBufferSource bufferIn, int packedLightIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            super(renderer, livingEntity, matrixStack, bufferIn, packedLightIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch);
        }

        @Cancelable
        public static class Pre extends Armor {
            public Pre(LivingEntityRenderer renderer, LivingEntity livingEntity, PoseStack matrixStack, MultiBufferSource bufferIn, int packedLightIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
                super(renderer, livingEntity, matrixStack, bufferIn, packedLightIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch);
            }
        }

        public static class Post extends Armor {
            public Post(LivingEntityRenderer renderer, LivingEntity livingEntity, PoseStack matrixStack, MultiBufferSource bufferIn, int packedLightIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
                super(renderer, livingEntity, matrixStack, bufferIn, packedLightIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch);
            }
        }

        public static class ArmorVisibility extends Event {
            private final HumanoidModel armorModel;
            private final EquipmentSlot slot;

            public ArmorVisibility(HumanoidModel modelIn, EquipmentSlot slotIn) {
                this.armorModel = modelIn;
                this.slot = slotIn;
            }

            public HumanoidModel getArmorModel() {
                return this.armorModel;
            }

            public EquipmentSlot getSlot() {
                return this.slot;
            }
        }
    }
}
