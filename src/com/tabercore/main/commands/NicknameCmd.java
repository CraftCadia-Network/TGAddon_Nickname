package com.tabercore.main.commands;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class NicknameCmd implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if(player.hasPermission("tabercore.nickname")) {
			
			if(label.equalsIgnoreCase("nickname")) {
				
				File f = new File("plugins/TaberCore/addons/PlayerData/" + player.getUniqueId() + ".yml");
				YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
				if(args.length == 0) {
					
					player.sendMessage(ChatColor.RED + "Needs NICKNAME");
					
				}else if(args.length == 1) {
					
					yml.set("DisplayName", args[0]);
					player.setDisplayName(yml.getString("DisplayName"));
				}
			}
			
		}
		
		return false;
	}

}
