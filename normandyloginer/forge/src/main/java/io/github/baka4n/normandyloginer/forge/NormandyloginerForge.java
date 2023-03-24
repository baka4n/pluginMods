package io.github.baka4n.normandyloginer.forge;

import io.github.baka4n.normandyloginer.Normandyloginer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Normandyloginer.MOD_ID)
public class NormandyloginerForge {
    public NormandyloginerForge() {
        Normandyloginer.init();
    }
}