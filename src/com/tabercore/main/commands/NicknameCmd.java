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
			
				if(args.length == 0) {
					
					player.sendMessage(ChatColor.RED + "Needs NICKNAME");
					
				}else if(args.length == 1) {
					
					
					String nickname = ChatColor.translateAlternateColorCodes('&', args[0]) + ChatColor.RESET;
					player.setPlayerListName(nickname);
					player.setDisplayName(nickname);
					player.sendMessage(ChatColor.GREEN + "My friend, you have set your name of nick");
				}
			}
			
		}
		
		return false;
	}

}
