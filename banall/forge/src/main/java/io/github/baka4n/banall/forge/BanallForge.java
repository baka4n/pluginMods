package io.github.baka4n.banall.forge;

import io.github.baka4n.banall.Banall;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Banall.MOD_ID)
public class BanallForge {
    public BanallForge() {
        Banall.init();
    }
}