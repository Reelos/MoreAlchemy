package de.reelos.alchemy;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MoreAlchemy extends JavaPlugin {
	private final Path path = Paths.get("./plugins/MoreAlchemy/");

	@Override
	public void onLoad() {
		getLogger().log(Level.INFO, "Trying to Load MoreAlchemy Plugin...");
		try (DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
			// TODO Read PlayerFile / Create Player Object
		} catch (IOException e) {
			getLogger().log(Level.WARNING, "Could not read " + path, e);
		}
	}

	@Override
	public void onEnable() {

	}

	@Override
	public void onDisable() {

	}

	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event) {
		String uuid = event.getPlayer().getUniqueId().toString();
		String name = event.getPlayer().getName();
		try (DirectoryStream<Path> ds = Files.newDirectoryStream(path.resolve(name))) {
			
		} catch (IOException e) {
			getLogger().log(Level.WARNING, "Could not read " + path, e);
		}
	}
}
