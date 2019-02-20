package com.tabercore.main;

import java.io.File;

public class FileHandler {

	String Path = "plugins/TaberCore";
	
	public void Setup() {	
		File MainDirectory = new File(Path);
		if(!MainDirectory.exists()) {
			MainDirectory.mkdir();	
		}
		File PlayerData = new File(Path + "/addons" + "/playerdata");
		if(!PlayerData.exists()) {
			
			PlayerData.mkdir();
			
		}
	}
	
}
