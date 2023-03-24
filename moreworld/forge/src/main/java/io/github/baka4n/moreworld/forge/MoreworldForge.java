package io.github.baka4n.moreworld.forge;

import io.github.baka4n.moreworld.Moreworld;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Moreworld.MOD_ID)
public class MoreworldForge {
    public MoreworldForge() {
        Moreworld.init();
    }
}