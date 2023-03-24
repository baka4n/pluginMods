package io.github.baka4n.gateway.fabric;

import io.github.baka4n.gateway.Gateway;
import net.fabricmc.api.ModInitializer;

public class GatewayFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Gateway.init();
    }
}