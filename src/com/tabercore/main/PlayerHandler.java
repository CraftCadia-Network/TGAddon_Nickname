package com.tabercore.main;


import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class PlayerHandler {
	
	public void SetupPlayer(Player p) {
		
		File f = new File("plugins/TaberCore/PlayerData/" + p.getName() + ".yml");
		if(!f.exists()) {
			
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
		yml.addDefault("Username", p.getName());
		yml.addDefault("DisplayName", p.getDisplayName());
		yml.options().copyDefaults(true);
		try {
			yml.save(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
public int getDisplayName(Player p) {
		
		File f = new File("plugins/TaberCore/PlayerData/" + p.getName() + ".yml");
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
		return yml.getInt("DisplayName");
	}
	
}
