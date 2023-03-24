package io.github.baka4n.normandyloginer.fabric;

import io.github.baka4n.normandyloginer.Normandyloginer;
import net.fabricmc.api.ModInitializer;

public class NormandyloginerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Normandyloginer.init();
    }
}