package io.github.baka4n.economy.fabric;

import io.github.baka4n.economy.Economy;
import net.fabricmc.api.ModInitializer;

public class EconomyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Economy.init();
    }
}