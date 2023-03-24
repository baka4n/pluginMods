package io.github.baka4n.group.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.baka4n.group.Group;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Group.MOD_ID)
public class GroupForge {
    public GroupForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Group.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Group.init();
    }
}