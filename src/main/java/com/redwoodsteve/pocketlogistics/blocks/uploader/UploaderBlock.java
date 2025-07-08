package com.redwoodsteve.pocketlogistics.blocks.uploader;

import com.redwoodsteve.pocketlogistics.PLBlockEntityTypes;
import com.simibubi.create.content.kinetics.base.HorizontalKineticBlock;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class UploaderBlock extends HorizontalKineticBlock implements IBE<UploaderBlockEntity>{
    public UploaderBlock(Properties properties) {
        super(properties);
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return state.getValue(HORIZONTAL_FACING).getAxis();
    }

    @Override
    public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
        return face == state.getValue(HORIZONTAL_FACING);
    }

    @Override
    public Class<UploaderBlockEntity> getBlockEntityClass() {
        return UploaderBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends UploaderBlockEntity> getBlockEntityType() {
        return PLBlockEntityTypes.UPLOADER.get();
    }

    @Override
    public SpeedLevel getMinimumRequiredSpeedLevel() {
        return SpeedLevel.MEDIUM;
    }
}
