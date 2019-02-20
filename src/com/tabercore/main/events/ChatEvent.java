package com.tabercore.main.events;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener{

	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		File f = new File("plugins/TaberCore/addons/PlayerData/" + p.getUniqueId() + ".yml");
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
		e.setCancelled(true);
		String name = yml.getString("DisplayName");
		String message = e.getMessage();

		
			
			Bukkit.broadcastMessage(name + message);
			
		
		
	}
	
}
