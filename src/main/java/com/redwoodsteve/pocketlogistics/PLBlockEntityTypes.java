package com.redwoodsteve.pocketlogistics;

import com.redwoodsteve.pocketlogistics.blocks.uploader.UploaderBlockEntity;
import com.redwoodsteve.pocketlogistics.blocks.uploader.UploaderRenderer;
import com.redwoodsteve.pocketlogistics.blocks.uploader.UploaderVisual;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class PLBlockEntityTypes {
    private static final CreateRegistrate REGISTRATE = PocketLogistics.REGISTRATE;

    public static final BlockEntityEntry<UploaderBlockEntity> UPLOADER = REGISTRATE.blockEntity("uploader", UploaderBlockEntity::new)
            .visual(() -> UploaderVisual::new)
            //.renderer(() -> UploaderRenderer::new)
            .validBlocks(PLBlocks.UPLOADER)
            .register();

    public static void register() {}
}
