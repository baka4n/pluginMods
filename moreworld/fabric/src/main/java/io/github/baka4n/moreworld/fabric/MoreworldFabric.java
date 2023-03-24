package io.github.baka4n.moreworld.fabric;

import io.github.baka4n.moreworld.Moreworld;
import net.fabricmc.api.ModInitializer;

public class MoreworldFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Moreworld.init();
    }
}