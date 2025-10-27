package net.bytem0use.marvel.custom_events;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;

public class BlockCollisionEvent extends BlockEvent {
    private final Entity entity;

    public BlockCollisionEvent(LevelAccessor level, BlockPos pos, BlockState state, Entity entity) {
        super(level, pos, state);
        this.entity = entity;
    }

    public Entity getEntity(){
        return this.entity;
    }
}
