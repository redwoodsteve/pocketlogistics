package com.redwoodsteve.pocketlogistics.client;

import com.redwoodsteve.pocketlogistics.PocketLogistics;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.minecraft.resources.ResourceLocation;

public class PLPartials {
    public static final PartialModel UPLOADER_SHAFT = block("uploader_shaft");

    private static PartialModel block(String path) {
        return PartialModel.of(new ResourceLocation(PocketLogistics.MODID, "block/" + path));
    }
    public static void initialize() {}
}
