package com.tabercore.main.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.tabercore.main.PlayerHandler;

public class JoinEvent implements Listener{

	PlayerHandler PlayerHandler;

	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		PlayerHandler.SetupPlayer(p);
	}
	
}
