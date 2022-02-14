package com.b1n4ry;

import org.bukkit.plugin.java.JavaPlugin;

public final class Alchemy extends JavaPlugin{

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListeners(), this);
        getLogger().info("Plugin has been started! Plugin version: 0.0.1a");
        Items.serializeItems();
    }

}
