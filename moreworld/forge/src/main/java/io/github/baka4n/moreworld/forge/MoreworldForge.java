package io.github.baka4n.moreworld.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.moreworld.Moreworld;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Moreworld.MOD_ID)
public class MoreworldForge {
    public MoreworldForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Moreworld.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Moreworld.init();
    }
}