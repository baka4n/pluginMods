package io.github.baka4n.sqlite.forge;

import io.github.baka4n.sqlite.Sqlite;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Sqlite.MOD_ID)
public class SqliteForge {
    public SqliteForge() {
        Sqlite.init();
    }
}