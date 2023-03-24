package io.github.baka4n.normandyloginer.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.normandyloginer.Normandyloginer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Normandyloginer.MOD_ID)
public class NormandyloginerForge {
    public NormandyloginerForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Normandyloginer.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Normandyloginer.init();
    }
}