package io.github.rgoonie.helloworldplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldPlugIn extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("HelloWorldPlugIn has been Enabled!");
    }

    @Override
    public void onDisable(){
        getLogger().info("HelloWorldPlugIn has been Disabled!");
    }

}
