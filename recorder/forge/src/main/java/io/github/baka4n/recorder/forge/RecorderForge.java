package io.github.baka4n.recorder.forge;

import io.github.baka4n.recorder.Recorder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Recorder.MOD_ID)
public class RecorderForge {
    public RecorderForge() {
        Recorder.init();
    }
}