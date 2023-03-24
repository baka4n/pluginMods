package io.github.baka4n.sqlite.fabric;

import io.github.baka4n.sqlite.Sqlite;
import net.fabricmc.api.ModInitializer;

public class SqliteFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Sqlite.init();
    }
}