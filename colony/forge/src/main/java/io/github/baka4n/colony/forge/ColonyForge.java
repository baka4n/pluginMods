package io.github.baka4n.colony.forge;

import io.github.baka4n.colony.Colony;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Colony.MOD_ID)
public class ColonyForge {
    public ColonyForge() {
        Colony.init();
    }
}