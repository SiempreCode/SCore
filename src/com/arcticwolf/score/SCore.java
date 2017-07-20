package com.arcticwolf.score;

import org.bukkit.plugin.java.JavaPlugin;

public class SCore extends JavaPlugin
{
	public void onEnable()
	{	
		getServer().getPluginCommand("SCore").setExecutor(new CommandSCore());
		getServer().getPluginCommand("SCoreV").setExecutor(new SCoreV());
		getServer().getPluginCommand("checkscore").setExecutor(new CheckV());
	}
	public void onDisable() 
	{
		
	}
}
