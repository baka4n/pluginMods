package io.github.baka4n.colony.fabric;

import io.github.baka4n.colony.Colony;
import net.fabricmc.api.ModInitializer;

public class ColonyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Colony.init();
    }
}