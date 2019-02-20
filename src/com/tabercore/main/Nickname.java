package com.tabercore.main;


import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.samtaber.base.Base;
import com.tabercore.main.commands.NicknameCmd;
import com.tabercore.main.events.ChatEvent;
import com.tabercore.main.events.JoinEvent;

public class Nickname extends JavaPlugin implements Listener{

	public static Nickname instance;
	
	FileHandler FileHandler = new FileHandler();
	
	@Override
	public void onEnable() {
		instance = this;
		this.getCommand("nickname").setExecutor((CommandExecutor)new NicknameCmd());
		
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("Nickname unloaded.");
		
	}
	
}
