package com.arcticwolf.score;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SCoreV implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("SCoreV")) { 
			Player p = (Player) sender;
			p.sendMessage ("�c************************************************************************");
			p.sendMessage ("�c[SCore]�f ������ �������:�e 1.0Beta");
			p.sendMessage ("�c[SCore]�f ������ ��������� � ������ ����������. �c������ ������ �l�� ���������!");
			p.sendMessage ("�c[SCore]�f ����� �������: �eSiempre");
			p.sendMessage ("�c[SCore]�f ����������� ���������� ��� ������� �eArcticWolf.ru");
			p.sendMessage ("�c************************************************************************");
			return true;
		}
		return false;
	}

}
