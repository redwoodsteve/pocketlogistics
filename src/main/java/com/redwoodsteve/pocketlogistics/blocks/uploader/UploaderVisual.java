package com.redwoodsteve.pocketlogistics.blocks.uploader;

import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.kinetics.base.SingleAxisRotatingVisual;
import dev.engine_room.flywheel.api.visualization.VisualizationContext;
import dev.engine_room.flywheel.lib.model.Models;

public class UploaderVisual extends SingleAxisRotatingVisual<UploaderBlockEntity> {
    public UploaderVisual(VisualizationContext context, UploaderBlockEntity be, float partialTick) {
        super(context, be, partialTick, Models.partial(AllPartialModels.SHAFT_HALF));
    }
}
