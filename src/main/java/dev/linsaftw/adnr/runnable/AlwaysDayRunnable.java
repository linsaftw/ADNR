package dev.linsaftw.adnr.runnable;

import org.bukkit.Server;
import org.bukkit.World;

public class AlwaysDayRunnable implements Runnable {
    private final Server server;

    public AlwaysDayRunnable(final Server server) {
        this.server = server;
    }

    public void run() {
        for (final World world : server.getWorlds()) {
            world.setTime(6000L);
        }
    }
}
