package com.tabercore.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.samtaber.base.Base;

public class NicknameCmd implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player player = (Player) sender;
	if(sender instanceof Player) {
		if(label.equalsIgnoreCase("nickname") || label.equalsIgnoreCase("nick")) {
			
			
			if(player.hasPermission("tabercore.nickname")) {
			
				if(args.length == 0) {
					
					player.sendMessage(Base.globalPrefix + "Illegal Argument. Command requires variable $nickname.");
					player.sendMessage(Base.globalPrefix + "Usage: /nickname <nickname> [player]");
					
				}else if(args.length == 1) {
					
					
					String nickname = ChatColor.translateAlternateColorCodes('&', args[0]) + ChatColor.RESET;
					player.setPlayerListName(nickname);
					player.setDisplayName(nickname);
					player.sendMessage(Base.globalPrefix + "Configuring variable $nickname..");
					player.sendMessage(Base.globalPrefix + "Configured variable $nickname to value " + nickname + ChatColor.GRAY + ChatColor.ITALIC + " (Completed in 0.054 ms)");
				}else if(args.length == 2) {
					String nickname = ChatColor.translateAlternateColorCodes('&', args[0]) + ChatColor.RESET;
					Player targetPlayer = player.getServer().getPlayer(args[1]);
					targetPlayer.setPlayerListName(nickname);
					targetPlayer.setDisplayName(nickname);
					player.sendMessage(Base.globalPrefix + "Configuring variable $nickname..");
					player.sendMessage(Base.globalPrefix + "Configured variable $nickname to value " + nickname + ChatColor.GRAY + " for $username " + targetPlayer.getName() + ChatColor.GRAY + ChatColor.ITALIC + " (Completed in 0.054 ms)");
				}
			}
			
		}
	}
		return false;
	}

}
