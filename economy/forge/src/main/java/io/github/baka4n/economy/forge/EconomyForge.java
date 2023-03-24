package io.github.baka4n.economy.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.economy.Economy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Economy.MOD_ID)
public class EconomyForge {
    public EconomyForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Economy.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Economy.init();
    }
}