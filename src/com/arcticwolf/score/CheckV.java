package com.arcticwolf.score;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CheckV implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("CheckSCore")) {
			Player p = (Player) sender;
			p.sendMessage("§c[SCore]§f Идёт поиск обновлений...");
			//TODO
			p.sendMessage("§c[SCore]§f Обновления не могут быть получены, поскольку отсутствует соединение с сервером.");
		}
		return false;
	}

}
