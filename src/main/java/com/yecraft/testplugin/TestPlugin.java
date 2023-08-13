package com.yecraft.testplugin;

import com.yecraft.configuration.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Optional;

public final class TestPlugin extends JavaPlugin {

    private Configuration configuration;

    public TestPlugin() {
        this.configuration = new MainConfiguration("1.1", new File(getDataFolder(), "config.yml"));
    }

    @Override
    public void onEnable() {
        configuration.initialize();
        Optional<String> version = configuration.getString("version");
        version.ifPresent(System.out::println);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
