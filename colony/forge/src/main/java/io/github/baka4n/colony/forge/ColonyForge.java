package io.github.baka4n.colony.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.colony.Colony;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Colony.MOD_ID)
public class ColonyForge {
    public ColonyForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Colony.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Colony.init();
    }
}