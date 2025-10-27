package net.bytem0use.marvel.interfaces;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.jline.keymap.KeyMap;

import java.util.ArrayList;

public interface IMarvelPlayer {
    float getLogInTicks();

    void setLogInTicks(float var1);

    boolean isFirstLogIn();

    float getTickSpeed();

    void setTickSpeed(float var1);

    float getAnimationTicks(float var1);

    float getAnimationTick();

    float getMaxTick();

    float getSuspendedTick();

    boolean isResumingAnimation();

    void setAnimationTicks(float var1, float var2, float var3, float var4, boolean var5);

    boolean isAnimationActive();

    void updateAnimationTicks();

    void setCurrentTagToAnimate(String var1);

    String getCurrentAnimationTag();

    float getAttackTime();

    void updateAttackTime();

    boolean hasHealthChanged();

    void setHealthChanged(boolean var1);

    float getTransitionedHealth();

    void setTransitionedHealth(float var1);

    int getCharacterTicks();

    void setCharacterTicks(int var1);

    void updateCharacterTicks();

    int getJumpTriggerTime();

    void setJumpTriggerTime(int var1);

    void updateTriggerTicks();

    float getFlightAmount(float var1);

    boolean isInFlightMode();

    void setFlightMode(boolean var1);

    void updateFlyAmount();

    float getStartingFlightTicks();

    void setStartingFlightTicks(float var1);

    void updateFlightTicks();

    int getFlightAnimationType();

    void setFlightAnimationType(int var1);

    void setFlyBoost(int var1);

    int getFlightBoost();

    float getGlidingAmount(float var1);

    void setGlidingAmount(float var1);

    boolean isInGlidingMode();

    void setGlidingMode(boolean var1);

    void updateGlideAmount();

    float getStartingGlidingTicks();

    void setStartingGlidingTicks(float var1);

    float getGlidingFlipTicks();

    void setGlidingFlipTicks(float var1);

    void updateGlidingTicks();

    Vec3 getPrevPos();

    boolean isMoving();

    int getWaterMovingTicks();

    void setWaterMovingTicks(int var1);

    void updateMovingTicks();

    int getOffhandRenderTicks();

    void setOffhandRenderTicks(int var1);

    int getOffHandSwingTime();

    void swingOffHand();

    boolean isIntangible();

    void setIntangible(boolean var1);

    int getSpeedVisualOverrideTicks();

    void setSpeedVisualOverrideTicks(int var1);

    void refreshDisplayName(int var1);

    boolean areEyesGlowing();

    void setEyesGlowing(boolean var1);

    int getSideLeapCooldown();

    void setSideLeapCooldown(int var1);

    void updateSideLeapCooldown();

    int getSlideCooldown();

    void setSlideCooldown(int var1);

    void updateSlideCooldown();

    int getSlideDuration();

    void setSlideDuration(int var1);

    void updateSlideDuration();

    long getSprintStartTime();

    void setSprintStartTime(long var1);

    int getShiftHoldDuration();

    void setShiftHoldDuration(int var1);

    void incrementHoldShiftDuration();

    long getLastLeapTime();

    void setLastLeapTime(long var1);

    int getSmoothCameraTimer();

    boolean getSmoothCameraState();

    void setSmoothCamera(int var1, boolean var2);

    int getWallClimbingTicks();

    void setWallClimbingTicks(int var1);

    int getCeilingClimbingTicks();

    void setCeilingClimbingTicks(int var1);

    Direction getWallClimbingState();

    void setWallClimbingState(Direction var1);

    float getClimbingDistance();

    void setClimbingDistance(float var1);

    boolean isWallRunning();

    void setWallRunning(boolean var1);

    int getWallCrawlHoldDuration();

    void setWallCrawlHoldDuration(int var1);

    void incrementWallCrawlHoldDuration();

    ArrayList<String> unlockedAlts();

    void onKeyInput(KeyMap var1);

    void onLogIn();

    void openItemGui(ItemStack var1, InteractionHand var2);

    String getActiveRadialMenuID();

    void setActiveRadialMenu(String var1);

    IMarvelPlayer copy(IMarvelPlayer var1);

    IMarvelPlayer sync();

    IMarvelPlayer syncToAll();
}
