package io.github.baka4n.gateway.forge;

import io.github.baka4n.gateway.Gateway;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Gateway.MOD_ID)
public class GatewayForge {
    public GatewayForge() {
        Gateway.init();
    }
}