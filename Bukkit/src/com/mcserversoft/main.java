package com.mcserversoft;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	@Override
	public void onEnable() {

		getServer().getConsoleSender().sendMessage("This server has fully started. You can ignore this message. (verification: ccdbbe0a-32d7-4d40-935e-fabb12ee4aa8)");

	}

}
