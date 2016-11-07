package de.reelos.alchemy;

import java.util.logging.Level;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MoreAlchemy extends JavaPlugin {
	private final String path = "./plugins/MoreAlchemy/";
	private final String file = "players.save";
	
	@Override
	public void onLoad() {
		getLogger().log(Level.INFO, "Trying to Load MoreAlchemy Plugin...");
	}
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event) {
		
	}
}
