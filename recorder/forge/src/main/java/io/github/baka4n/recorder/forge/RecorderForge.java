package io.github.baka4n.recorder.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.recorder.Recorder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Recorder.MOD_ID)
public class RecorderForge {
    public RecorderForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Recorder.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Recorder.init();
    }
}