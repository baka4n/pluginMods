package io.github.baka4n.economy.forge;

import io.github.baka4n.economy.Economy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Economy.MOD_ID)
public class EconomyForge {
    public EconomyForge() {
        Economy.init();
    }
}