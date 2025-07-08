package com.redwoodsteve.pocketlogistics;

import com.redwoodsteve.pocketlogistics.blocks.uploader.UploaderBlock;
import com.simibubi.create.api.stress.BlockStressValues;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.foundation.data.TagGen;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.material.MapColor;

public class PLBlocks {
    /*private static final DeferredRegister<Block> BLOCKS = PocketLogistics.BLOCKS;

    public static final RegistryObject<Block> UPLOADER = BLOCKS.register("uploader",
            () -> new UploaderBlock(BlockBehaviour.Properties.copy(com.simibubi.create.AllBlocks.ANDESITE_CASING.get())));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }*/

    private static final CreateRegistrate REGISTRATE = PocketLogistics.REGISTRATE;

    public static final BlockEntry<UploaderBlock> UPLOADER = REGISTRATE.block("uploader", UploaderBlock::new)
            .initialProperties(SharedProperties::wooden)
            .properties(p -> p.mapColor(MapColor.COLOR_BROWN))
            .transform(TagGen.axeOrPickaxe())
            .item()
            .build()
            .onRegister((block) -> BlockStressValues.IMPACTS.register(block, () -> 8.0))
            .register();

    public static void register() {}
}
