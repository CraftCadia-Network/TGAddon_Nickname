package com.tabercore.main;


import org.bukkit.plugin.java.JavaPlugin;

import com.samtaber.base.Base;

public class Nickname extends JavaPlugin{

	@Override
	public void onEnable() {
		
		System.out.println(Base.serverName + " addon `Nicknasme` has been enabled for server version " + Base.serverVersion + " and " + Base.serverType);
		
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("Nickname unloaded.");
		
	}
	
}
