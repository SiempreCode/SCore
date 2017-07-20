package com.arcticwolf.score;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SCoreV implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("SCoreV")) { 
			Player p = (Player) sender;
			p.sendMessage ("§c************************************************************************");
			p.sendMessage ("§c[SCore]§f Версия плагина:§e 1.0Beta");
			p.sendMessage ("§c[SCore]§f Плагин находится в стадии разработки. §cДанная версия §lне стабильна!");
			p.sendMessage ("§c[SCore]§f Автор плагина: §eSiempre");
			p.sendMessage ("§c[SCore]§f Разработано специально для проекта §eArcticWolf.ru");
			p.sendMessage ("§c************************************************************************");
			return true;
		}
		return false;
	}

}
