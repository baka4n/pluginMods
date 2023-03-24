package io.github.baka4n.banall.fabric;

import io.github.baka4n.banall.Banall;
import net.fabricmc.api.ModInitializer;

public class BanallFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Banall.init();
    }
}