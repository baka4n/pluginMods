package io.github.baka4n.group.forge;

import io.github.baka4n.group.Group;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Group.MOD_ID)
public class GroupForge {
    public GroupForge() {
        Group.init();
    }
}