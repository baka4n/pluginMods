package io.github.baka4n.group.fabric;

import io.github.baka4n.group.Group;
import net.fabricmc.api.ModInitializer;

public class GroupFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Group.init();
    }
}