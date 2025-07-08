package com.redwoodsteve.pocketlogistics;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(PocketLogistics.MODID)
public class PocketLogistics {

    public static final String MODID = "pocketlogistics";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public PocketLogistics(FMLJavaModLoadingContext context) {
        REGISTRATE.registerEventListeners(context.getModEventBus());

        PLBlocks.register();
        PLBlockEntityTypes.register();
    }
}
