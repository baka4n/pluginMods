package io.github.baka4n.sqlite.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.sqlite.Sqlite;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Sqlite.MOD_ID)
public class SqliteForge {
    public SqliteForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Sqlite.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Sqlite.init();
    }
}