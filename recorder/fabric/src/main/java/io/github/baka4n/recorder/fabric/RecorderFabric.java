package io.github.baka4n.recorder.fabric;

import io.github.baka4n.recorder.Recorder;
import net.fabricmc.api.ModInitializer;

public class RecorderFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Recorder.init();
    }
}