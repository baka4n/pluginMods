package io.github.baka4n.banall.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.banall.Banall;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Banall.MOD_ID)
public class BanallForge {
    public BanallForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Banall.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Banall.init();
    }
}