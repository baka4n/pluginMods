package io.github.baka4n.gateway.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.gateway.Gateway;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Gateway.MOD_ID)
public class GatewayForge {
    public GatewayForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Gateway.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Gateway.init();
    }
}