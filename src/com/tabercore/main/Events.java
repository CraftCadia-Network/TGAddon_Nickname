package com.tabercore.main;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;



public class Events {
	PlayerHandler PlayerHandler;
	public Events(PlayerHandler _PlayerHandler) {
		
		PlayerHandler = _PlayerHandler;
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		PlayerHandler.SetupPlayer(p);
	}
	//Chat Handler
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		File f = new File("plugins/TaberCore/addons/PlayerData/" + p.getUniqueId() + ".yml");
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
		e.setCancelled(true);
		String name = p.getDisplayName();
		String message = e.getMessage();

		
			
			Bukkit.broadcastMessage(name + message);
			
		
		
	}
}
