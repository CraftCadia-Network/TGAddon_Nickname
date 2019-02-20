package com.tabercore.main.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.tabercore.main.PlayerHandler;

public class JoinEvent implements Listener{

	PlayerHandler PlayerHandler;
	public void Events(PlayerHandler _PlayerHandler) {
		
		PlayerHandler = _PlayerHandler;
		
	}
	
	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		PlayerHandler.SetupPlayer(p);
	}
	
}
