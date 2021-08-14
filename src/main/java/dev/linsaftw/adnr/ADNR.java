package dev.linsaftw.adnr;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

import dev.linsaftw.adnr.listeners.WeatherChangeListener;
import dev.linsaftw.adnr.runnable.AlwaysDayRunnable;

public class ADNR extends JavaPlugin {
  public void onEnable() {
    final Server server = getServer();

    server.getPluginManager().registerEvents(new WeatherChangeListener(), this);
    server.getScheduler().scheduleSyncRepeatingTask(this, new AlwaysDayRunnable(server), 20L, 20L);
  }
}
